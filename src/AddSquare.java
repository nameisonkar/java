public class AddSquare {
    void add(int a,int b)
    {
        int c = a + b;
        System.out.println("Addtion ="+c);
    }
    void square(int n)
    {
        int s=n*n;
        System.out.println("Square ="+s);

    }
   public static void main(String args[])
   {
      AddSquare ob;
      ob =new AddSquare();

      ob.add(1,44);
      ob.square(5);

   }
}
