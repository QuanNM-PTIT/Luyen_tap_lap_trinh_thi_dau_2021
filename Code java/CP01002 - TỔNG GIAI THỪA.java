// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[25];
        a[1] = 1;
        int n = sc.nextInt();
        long sum = 1;
        for(int i = 2; i <= n; ++i)
        {
            a[i] = (long) i * a[i - 1];
            sum += a[i];
        }
        System.out.print(sum);
    }
}