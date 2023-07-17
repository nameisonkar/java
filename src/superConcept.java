 class A {
    int x = 10;

}
class B extends A {
    int x = 20;

    void show() {
        System.out.println("Value 1:" + x);
        System.out.println("Value 2:" + super.x);
        super.x = 55;
        System.out.println("Value 3:" + x);
        System.out.println("Value 4:" + super.x);
    }

    public static void main(String[] args)
    {
        B ob = new B();
        ob.show();
    }
}


