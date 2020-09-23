import java.util.Scanner;

public class Reverse01 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter ur String:");
        String s= sc.next();

       // for ( int i=0;i< s.length();i++)
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev + s.charAt(i);
        }

        System.out.println("Entered String is :" + rev);

    }
}
