// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long c, m;
        while(t-- > 0)
        {
            c = sc.nextInt();
            m = sc.nextInt();
            if(c % (m + 1) == 0) System.out.println("Second");
            else System.out.println("First");
        }
    }
}