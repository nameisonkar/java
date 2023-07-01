import  java.lang.*;
import java.util.Scanner;

public class evnaddprime03 {
    void EvenOdd(int n)
    {
        if (n<0)
            System.out.println("NO are negative");
       else if(n%2==0)
            System.out.println("Even.." + n);
         else
            System.out.println("odd.." + n);
    }
    void posNegitive(int n)
    {
        if(n>0)
            System.out.println("Positive.." + n);
        else
            System.out.println("Negative.." + n);
    }
    void prime(int n)
    {
        if(n%2==1)
            System.out.println("Prime.." + n);
        else
            System.out.println("Not prime.." + n);
    }
    public static void main(String[] args)
    {
        evnaddprime03 ob = new evnaddprime03();
        System.out.println("Enter No:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ob.EvenOdd( n);
        ob.prime(n);
        ob.posNegitive(n);
    }
}
