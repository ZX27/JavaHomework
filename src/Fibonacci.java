import java.util.Scanner;

public class Fibonacci
{
    public static void printFibonacciSequence(int length)
    {
        int i = 0;
        int j = 1;
        int sum = 0;

        for (int k = 1; k <= length; k++)
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
                System.out.print(sum + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入想要输出的Fibonacci数列的长度：");
        int length = in.nextInt();

        printFibonacciSequence(length);
    }
}
