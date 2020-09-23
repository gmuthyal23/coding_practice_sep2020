import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter ur String:");

        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String res="";

        for ( int i= 1;i<=s.length();i++)
        {
            res=res + s.charAt(s.length() - i );
        }
        System.out.println( res);

    }

}
