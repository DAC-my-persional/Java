import java.util.Scanner;
public class Assignment2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two Double numbers :");

            if(sc.hasNextDouble()) {
                  double num1 = sc.nextDouble();
                  double num2 = sc.nextDouble();
                  System.out.println("The average of two numbers is :"+ (num1+num2)/2);
            }
            else {
                  System.out.println("the given value is not double");
            }
            sc.close();
      }
}
