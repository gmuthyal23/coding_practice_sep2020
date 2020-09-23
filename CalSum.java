import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class CalSum {
    public static int calc(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        //System.out.println(sum);
        return sum;
    }

    public static int mul(int s)
    {
        int sum1=1;
        for(int j=1;j<=10;j++)
        {
            sum1=s*j;
            System.out.println(s +"*"+ j+"="+sum1);

        }return 33;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Option calc 1 , Mul 2, Exit 3");
        int b;
        //int d=1;
       // boolean re=true;
        do {
            b=sc.nextInt();
            switch (b) {
            case 1:
                System.out.println("U Entered CAlc");
                System.out.println("Enter ur Number:");
                int g = sc.nextInt();
                System.out.println("total is : "+calc(g));

                //b=sc.nextInt();
                break;

            case 2:
                System.out.println("U Entered Mul");
                System.out.println("Enter ur Number:");
                int h = sc.nextInt();
                System.out.println(mul(h));
                //System.out.println("Enter your Option calc 1 , Mul 2, Exit 3");
                //b=sc.nextInt();
               break;
            case 3:
                 break;
            } System.out.println("Enter your Option calc 1 , Mul 2, Exit 3");
            //re=false;


        }  while (b<4);
        System.out.println("Program Ended");



        //System.out.println(calc(b));
        //System.out.println(mul(b));
    }
}
