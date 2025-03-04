import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
//import java.util.*;

class QueryStringFormatter
{
    private StringBuilder query;
    private String engine;

    public QueryStringFormatter(String searchEngine)
    {
        this.engine = searchEngine;
        this.query = new StringBuilder();
    }

    public void addQuery(String key, String value)
    {
        if (query.length() > 0)
        {
            query.append("&");
        }
        query.append(URLEncoder.encode(key, StandardCharsets.UTF_8)).append("=")
             .append(URLEncoder.encode(value, StandardCharsets.UTF_8));
    }

    public String getQueryString()
    {
        return query.toString();
    }

    public String getEngine()
    {
        return engine;
    }
}

class TextBasedSearchEngine
{
    private String searchEngine;

    public TextBasedSearchEngine(String searchEngine)
    {
        this.searchEngine = searchEngine;
    }

    public void doSearch(String queryString)
    {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL(searchEngine + "?" + queryString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = input.readLine()) != null) {
                System.out.println(inputLine);
            }
            input.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        QueryStringFormatter formatter = new QueryStringFormatter("https://search.yahoo.com/search");
        formatter.addQuery("newwindow", "1");
        formatter.addQuery("q", "Xingchen Chu & Rajkumar Buyya");

        TextBasedSearchEngine search = new TextBasedSearchEngine(formatter.getEngine());
        search.doSearch(formatter.getQueryString());
    }
}
