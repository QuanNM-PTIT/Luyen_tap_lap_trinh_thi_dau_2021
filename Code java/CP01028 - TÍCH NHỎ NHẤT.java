// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    static long MAX(long a, long b)
    {
        if(a > b) return a;
        return b;
    }

    static long MIN(long a, long b)
    {
        if(a > b) return b;
        return a;
    }

    static long calc(long a, long b, long x, long y, long n)
    {
        if(a - x <= n)
        {
            n -= (a - x);
            a = x;
            b = MAX(y,b - n);
        }
        else a -= n;
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long a, b, x, y, n;
        while(t-- > 0)
        {
            a = sc.nextLong();
            b = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            n = sc.nextLong();
            System.out.println(MIN(calc(a, b, x, y, n), calc(b, a, y, x, n)));
        }
    }
}