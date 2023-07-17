import java.util.Scanner;

public class palimdormeString {

    public static void main(String[] args)
    {
        System.out.println("Enter String:");
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String rev = "";
        int length = S1.length();
       for(int i =length-1; i>=0; i--)
        rev = rev + S1.charAt(i);
        if (S1.equals(rev))
        {
            System.out.println(S1+"String is palindrome");
        }
        else {
            System.out.println(S1+"String is not palindrome");
        }

    }
}
