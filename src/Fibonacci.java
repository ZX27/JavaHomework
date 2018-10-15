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
        printFibonacciSequence(10);
    }
}
