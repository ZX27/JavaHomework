import java.util.Scanner;

public class PrimeNumber
{
    public static boolean isPrime(int n)
    {
        if (n == 1 || n == 0)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumList(int[] array)
    {
        System.out.println("1到" + array.length + "的素数为");
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void printArrayTable(int[] array)
    {
        System.out.println("数字\t\t是否为素数(0是，1否)");
        for (int i = 1; i < array.length; i++)
        {
            System.out.println(i + "\t\t" + array[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("要求1到n的素数，请输入n的值：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i < n + 1; i++)
        {
            if (isPrime(i))
            {
                array[i] = 0;
            }
            else
            {
                array[i] = 1;
            }
        }

        printArrayTable(array);
        printPrimeNumList(array);


    }
}
