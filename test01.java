import java.util.Arrays;
import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
        int a=0;

        do {
            switch(a)
            {
                case 0:
                    System.out.println(" Please Enter ur Options : 1 ,2 3 : \n");
                    a= sc.nextInt();
                    continue;

                case 1:
                    System.out.println(" Entered Addition Option: 1");
                    int b= sc.nextInt();
                    int c= sc.nextInt();
                    int d= b+c;
                    System.out.println("Total is:" + d);
                    a=0;
                    continue;


                case 2:
                    System.out.println("Entered Option Subtraction: 2");
                    int x= sc.nextInt();
                    int y= sc.nextInt();
                    int z= x-y;
                    System.out.println(" subtraction :" + z);
                    a=0;
                    continue;

                case 3:
                    System.out.println("Exit");
                    System.exit(0);

            }
break;


        } while(true);


//        System.out.println("my first Project");
    }
}

