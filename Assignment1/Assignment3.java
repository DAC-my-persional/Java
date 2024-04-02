import java.util.Scanner;

public class Assignment3 {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int choice;
      int quantity;
      double totalbill = 0.0;
      double Dosa = 50.50;
      double Samosa = 20.40;
      double idli = 35.90;
      double burger = 60.10;
      double pizza = 100.00;

      do {
      System.out.println("welcome to Food mart");
      System.out.println("1. Dosa");
      System.out.println("2. Samosa");
      System.out.println("3. Idli");
      System.out.println("4. burger");
      System.out.println("5. Pizza");
      System.out.println("6. generate bill");
      System.out.println("Enter your Choice");

      choice = sc.nextInt();

      switch (choice) {
            case 0:
                 System.out.println("thankyou for visiting out food mart");
            case 1:
                  System.out.println("How much dosa you want?");
                  quantity = sc.nextInt();
                  totalbill += Dosa * quantity;
                  break;
            case 2:
                  System.out.println("How much samosa you want?");
                  quantity = sc.nextInt();
                  totalbill += Samosa * quantity;
                  break;
            case 3:
                  System.out.println("How much idli you want?");
                  quantity = sc.nextInt();
                  totalbill += idli * quantity;
                  break;
            case 4:
                  System.out.println("How much burger you want?");
                  quantity = sc.nextInt();
                  totalbill += burger * quantity;
                  break;
            case 5:
                  System.out.println("How much Pizza you want?");
                  quantity = sc.nextInt();
                  totalbill += pizza * quantity;
                  break;
            case 6:
                  System.out.println("Your total amount is :"+ totalbill);
                  break;

                  default: System.out.println("invalid choice"); 
            }
            
      } while (choice != 0);
      sc.close();
} 
}