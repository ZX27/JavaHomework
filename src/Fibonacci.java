import java.util.Scanner;

public class Fibonacci
{
    public static void printFibonacciSequence(long length)
    {
        long i = 0;
        long j = 1;
        long sum = 0;

        for (long k = 1; k <= length; k++)
        {
            if (k == 1)
            {
                System.out.print(1 + " ");
            }
            else
            {
                sum = i + j;
                i = j;
                j = sum;
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入想要输出的Fibonacci数列的长度：");
        long length = in.nextLong();

        printFibonacciSequence(length);
    }
}
