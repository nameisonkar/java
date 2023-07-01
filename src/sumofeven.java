import java.util.Scanner;

public class sumofeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n = sc.nextInt(n);
        System.out.println("Enter No :");
        int s=0;
        int i;
        i = 0;
        int a[] = new int[100];
        for ( i = 0; i < n; i++)
            int a[i] = sc.nextInt();
        for( i = 0; i < n; i++) {


            if(a[i]%2==0)
            {
                s=s+a[i];
            }
        }
        System.out.println(" Sum of Array :"+s);

    }
}
