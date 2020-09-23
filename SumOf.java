import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number:");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if (i % 3==0 || i % 5 ==0)
            {
                sum+=i;
            }
        }
        System.out.println("Total is : " + sum);

    }
}
