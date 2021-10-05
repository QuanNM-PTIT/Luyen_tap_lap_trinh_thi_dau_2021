// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n, k;
        while(t-- > 0)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            if(9 * k < n) System.out.print(-1);
            else
            {
                int d = n / 9, m = n % 9;
                if(m == 0)
                {
                    k = k - d + 1;
                    if(k > 1)
                    {
                        System.out.print(1);
                        int st = k - 1;
                        for(int i = 1; i < st; ++i) System.out.print(0);
                        System.out.print(8);
                    }
                    else System.out.print(9);
                    for(int i = 1; i < d; ++i) System.out.print(9);
                }
                else
                {
                    k -= d;
                    if(k > 1) System.out.print(1);
                    int st = k - 1;
                    for(int i = 1; i < st; ++i) System.out.print(0);
                    if(k > 1) System.out.print(m - 1);
                    else System.out.print(m);
                    for(int i = 1; i <= d; ++i) System.out.print(9);
                }
            }
            System.out.println();
        }
    }
}