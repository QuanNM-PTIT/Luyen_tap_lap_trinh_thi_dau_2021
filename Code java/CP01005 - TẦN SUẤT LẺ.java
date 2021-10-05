// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n, x;
        while(t-- > 0)
        {
            n = sc.nextInt();
            int ans = 0;
            while(n-- > 0)
            {
                x = sc.nextInt();
                ans ^= x;
            }
            System.out.println(ans);
            System.gc();
        }
    }
}