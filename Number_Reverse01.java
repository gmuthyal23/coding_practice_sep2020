import java.util.Scanner;

public class Number_Reverse01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        int temp;
        int reminder=0;
        int reverse=0;
        System.out.println("Enter Ur Number:");
        number=sc.nextInt();
        temp=number;

        while(temp>0)
        {
            reminder=temp%10;
            reverse=reverse*10+reminder;
            temp=temp/10;
        }
        System.out.println(reverse);
    }
}
