class BitwiseOperator
{
    public static void main(String[] args)
    {
        int p = 9, q = 10;
        System.out.println("P AND Q: " + (p & q));//8
        System.out.println("P OR Q : " + (p | q));//11
        System.out.println("P XOR Q: " + (p ^ q));//3

        System.out.println("P << 1 : " + (p << 1));//18
        System.out.println("P << 2 : " + (p << 2));//36
        System.out.println("P >> 1 : " + (p >> 1));//4
        System.out.println("P >> 2 : " + (p >> 2));//2
    }
}