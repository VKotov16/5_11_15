

public class Fibonacci {

    public static void main(String[] args) {
        //System.out.println(Fib(50));
        System.out.println(sum(11426));//11426 не валится, 11427 валится

    }

    public static long Fib(long num)
    {
        if(num == 1 || num == 2)
            return 1;
        else
        {
            return Fib(num - 2) + Fib(num-1);
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
