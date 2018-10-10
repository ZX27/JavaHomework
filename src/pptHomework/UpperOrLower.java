package pptHomework;

import java.util.Scanner;

public class UpperOrLower
{
    private char[] ch;

    public UpperOrLower(char[] string)
    {
        this.ch = string;
    }

    public void Lower(char[] ch)
    {
        for (int i = 0; i < ch.length; i++)
        {
            if ((int) ch[i] >= 'A' && (int) ch[i] <= 'Z')
            {
                ch[i] += 32;
            }
        }

        for (int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]);
        }
    }

    public void Upper(char[] ch)
    {
        for (int i = 0; i < ch.length; i++)
        {
            if ((int) ch[i] >= 'a' && (int) ch[i] <= 'z')
            {
                ch[i] -= 32;
            }
        }

        for (int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]);
        }
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input some words:");
        String string = in.next();
        char[] ch = string.toCharArray();

        UpperOrLower str = new UpperOrLower(ch);
        str.Upper(str.ch);
        System.out.println();
        str.Lower(str.ch);
    }

}