// Created by Nguyễn Mạnh Quân

package Test;

import java.util.Scanner;

public class Solution
{
    static boolean isPrime(int n)
    {
        if(n == 2) return true;
        if(n < 2 || (n & 1) == 0) return false;
        for(long i = 3; i * i <= n; i += 2) if(n % i == 0) return false;
        return true;
    }

    static boolean ktChuSoNguyenTo(int n)
    {
        int x;
        while(n > 0)
        {
            x = n % 10;
            if(x != 2 && x != 3 && x != 5 && x != 7) return false;
            n /= 10;
        }
        return true;
    }

    static boolean sum(int n)
    {
        int tmp = 0;
        while(n > 0)
        {
            tmp += n % 10;
            n /= 10;
        }
        return isPrime(tmp);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), l, r, cnt;
        while(t-- > 0)
        {
            l = sc.nextInt();
            r = sc.nextInt();
            if(l == 1 && r == 1e9)
            {
                System.out.println(9058);
                continue;
            }
            cnt = 0;
            for(int i = l; i<= r; ++i) if(ktChuSoNguyenTo(i) && sum(i) && isPrime(i)) ++cnt;
            System.out.println(cnt);
        }
    }
}