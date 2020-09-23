import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        int sum=1;
  Scanner sc= new Scanner(System.in);
//        System.out.println("Enter ur Factorial Number:");
//        int a=sc.nextInt();
//        for(int i=1;i< a;i++ )
//        {
//            for(int j=1;j<i;j++)
//            {
//                //sum+=j*i;
//                sum+=sum*j;
//            }
//        }
//        System.out.println("Total Factorial Sum is:"+ sum);
        System.out.println("Enter UR Number");
int R= sc.nextInt();
        int fact=1;
        for(int j=1;j<=R;j++)
        {
            fact=fact*j;
        }

        System.out.println("Total Factorial  is:" + fact);

    }
}
