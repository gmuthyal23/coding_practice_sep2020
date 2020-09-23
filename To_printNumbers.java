import java.util.Scanner;

public class To_printNumbers {

    public static void  printnum(int a)
    {
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int b= sc.nextInt();
        printnum(b);
    }
}
