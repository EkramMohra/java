class Main
{
    static int countWays(int n)
    {
        if (n <= 1)
            return n;
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String args[])
    {
        int s = 5;
        System.out.println("Number of ways = " + countWays(s+1));
    }
}
