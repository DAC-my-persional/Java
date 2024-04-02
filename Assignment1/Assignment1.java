import java.util.Scanner;
public class Assignment1 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num1;
            System.out.println("Java test");
            
            System.out.println("Enter number :");
            num1 = sc.nextInt();

            System.out.println("the given number is :"+ num1 );
            System.out.println("The given number binary equivilant :"+ Integer.toBinaryString(num1));
            System.out.println("octal equivilant :"+ Integer.toOctalString(num1));
            System.out.println("in hexadecimal :"+ Integer.toHexString(num1));
            sc.close();
      }
}
