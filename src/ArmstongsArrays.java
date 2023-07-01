import java.util.Scanner;

public class ArmstongsArrays {
   public static  void main(String[] args){
    int a[] = new int[100];
    int j=0;
    Scanner  sc =  new Scanner(System.in);
       System.out.println("Enter Limit:");
       int n = sc.nextInt();

       System.out.println("Enter N Number:");
       for (int i=0; i<n ;i++)
       {
           int num = sc.nextInt();
           int num1 = num;
           int s=0;
           while(num<0)
           {
               int d=num%10;
                  s=s+d*d*d;
                  num=num/10;
           }
           if(num1==s)
           {
               a[j++]=num1;
           }
           System.out.println("Aramstorng No:");
           for( i=0; i<n;i++)
           {
               System.out.println(a[i]);
           }
       }
   }
}