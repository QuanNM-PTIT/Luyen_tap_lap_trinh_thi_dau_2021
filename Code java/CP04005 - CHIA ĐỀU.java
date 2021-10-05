// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    static int cnt = 0;

    static int find(int a[], int x, int begin, int end, int k)
    {
        if (begin > end || k == 0) return 0;
        if (k == 1)
        {
            if (x == a[end] - a[begin - 1])
            {
                ++cnt;
                return 1;
            }
            else return 0;
        }
        else
        {
            int BG = begin;
            for(int i = begin; i <= end; ++i) if(a[i] - a[BG - 1] == x) find(a, x, i + 1, end, k - 1);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, k, tmp, label;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n + 1];
        a[0] = 0;
        for(int i = 1; i <= n; ++i)
        {
            tmp = sc.nextInt();
            a[i] = a[i - 1] + tmp;
        }
        if(k == 1) cnt = 1;
        else
        {
            for(int i = 1; i <= n; ++i)
            {
                label = a[i];
                find(a, label, i + 1, n, k - 1);
            }
        }
        System.out.print(cnt);
    }
}