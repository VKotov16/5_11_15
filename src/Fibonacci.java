

public class Fibonacci {

    public static long[] cache = new long[51];

    public static void main(String[] args) {
        System.out.println(fib1(50));
        //System.out.println(sum(11426));//11426 не валится, 11427 валится

    }



    public static long fib1(int num)
    {
        if(cache[num] !=0 )
        {
            return cache[num];
        }
        else if(num == 0 || num == 1)
        {
         cache[num] = 1;
            return 1;
        }
        else {
            long res = fib(num - 2) + fib(num - 1);
            cache[num] = res;
            return res;
        }
    }

    public static long fib(long num)
    {
        if(num == 0 || num == 1)
            return 1;
        else
        {
            return fib(num - 2) + fib(num - 1);
        }
    }

    public static long sum(long peek)
    {
        if(peek == 1)
        {
            return 1;
        }
        else {
            return peek + sum(peek - 1);
        }

    }
}
