class Add_A
{
    Add_A(int x, int y)
    {
        System.out.println("Addition:"+(x+y));
    }
}
class Add_B extends Add_A{
    Add_B(int x, int y)
    {
        super(x, y);
        System.out.println("Addition2:"+(x+y));
    }
}



