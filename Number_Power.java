//http://www.beginwithjava.com/java/loops/questions.html

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Number_Power {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int a;
        int b;
        int c=1;
     System.out.println("Enter your Number for the Power:");
        a= console.nextInt();
       System.out.println("Enter your Power Number:");
 b= console.nextInt();

      for(int d= 1;d<=b;d++)
       {
         c*=a;
       }
      System.out.println("Power Value is:" + c);


//        int base;
//        int power;
//        int result = 1;
//
//        System.out.print("Enter the base number ");
//        base = console.nextInt();
//
//        System.out.print("Enter the power ");
//        power = console.nextInt();
//
//        for(int i = 1; i <= power; i++)
//        {
//            result *= base;
//        }
//
//        System.out.println("Result: "+ result);
    }
}

