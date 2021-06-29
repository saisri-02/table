import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            int c;
            c=n*i;
            System.out.println(n+" x "+i+" = "+c);
        }
    }
}
