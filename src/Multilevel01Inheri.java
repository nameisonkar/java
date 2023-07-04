import java.awt.*;
import java.util.Scanner;

 class Student {
     int rno;
     String Sname,Sclass;
     Scanner sc = new Scanner(System.in);
     void accept()
     {
          System.out.println("Enter Rno:");
          rno = sc.nextInt();
          System.out.println("Enter Student Name:");
          Sname = sc.next();
          System.out.println("Enter Class:");
          Sclass = sc.next();
     }
}
class Exam extends Student
{
     int m[]= new int [6];
     void accept_marks()
     {
          System.out.println("Enter Subject Marks:");
          for(int i=0; i<6; i++) {
               m[i] = sc.nextInt();
          }
     }
}
class results extends Exam
{
     int total=0;
     float p;
     void calculate()
     {
          for(int i=0; i<6; i++) {
               total += m[i];
          }
          p=total/6;
     }
     void display()
     {
          System.out.println("Roll No:"+rno);
          System.out.println("Student Name:"+Sname);
          System.out.println("Student Class:"+Sclass);
          System.out.println("Total Marks:"+total);
          System.out.println("Percentage:"+p);
     }
     public  static void main(String[] args)
     {
          results ob = new results();
          ob.accept();
          ob.accept_marks();
          ob.calculate();
          ob.display();
     }
}
