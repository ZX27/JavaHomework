import java.util.Scanner;

public class DigitSum
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("输入一个整数： ");
        int num = in.nextInt();

        while (num / 10 != 0)
        {
            sum += num % 10;
            num /= 10;
        }

        sum += num;

        System.out.println("各位数字之和为：" + sum);
    }


}
