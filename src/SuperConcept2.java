class Base {
    Base(int x, int y)
    {
        System.out.println("Addtion="+(x+y));
    }
}
class Derived extends Base {
    Derived(int x, int y) {
        super(x, y);
        System.out.println("Addtion2=" + (x + y));
    }
        public static void main(String[] args)
        {
            Derived ob = new Derived(10, 20);

        }
}