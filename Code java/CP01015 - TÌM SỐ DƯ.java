// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            int n = 0;
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); ++i)
            {
                n *= 10;
                n += s.charAt(i) - '0';
                n %= 4;
            }
            if(n > 0) System.out.println(0);
            else System.out.println(4);
        }
        System.gc();
    }
}