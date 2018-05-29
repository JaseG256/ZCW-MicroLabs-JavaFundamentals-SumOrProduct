/**
 * Created by iyasuwatts on 10/17/17.
 */
 import java.util.Scanner;

public class Main {

    public static void main(String[] args){
      System.out.println("Sum or Product?");
      Scanner scan = new Scanner();
      String choice = scan.next();

      if (choice.equalsIgnoreCase("Sum")) {
        System.out.println("Enter a number")
        int n = scan.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
          x += n;
          System.out.println("The sum is " + x);
        }
      } else if (choice.equalsIgnoreCase("Product")) {
        System.out.println("Enter a number")
        int n = scan.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
          x *= n;
          System.out.println("The product is " + x)
      } else {
        System.out.println("Please enter a valid command")
      }


    }
}
