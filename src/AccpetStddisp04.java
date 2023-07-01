import javax.print.DocFlavor;
import java.util.*;
import java.lang.*;

public class AccpetStddisp04 {
     int rno ;
     String Name;
     Float percentage;
     void Accept()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Roll:");
         rno =  sc.nextInt();
         System.out.println("Enter Student Name:");
         Name = sc.next();
         System.out.println("Enter Percentage:");
         percentage = sc.nextFloat();
     }
     void disp()
     {
         System.out.println("Roll No :"+ rno);
         System.out.println("Name :"+ Name);
         System.out.println("Percentage :"+ percentage);
     }
     public static void main(String[] args)
     {
         AccpetStddisp04 ob = new AccpetStddisp04();
         ob.Accept();
         ob.disp();
     }
}
