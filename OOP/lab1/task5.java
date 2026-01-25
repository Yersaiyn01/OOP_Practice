import java.util.Scanner;

public class task5{
    public static void main(String[] arge){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your a: ");
        double a = input.nextInt();
        System.out.print("Interest percent: ");
        double b = input.nextInt();
        System.out.println();
        double interestadded = a * b/100; 
        double newbalance = interestadded + a;
        System.out.println("your Initial balance: " + a);
        System.out.println("Interest rate: " + b + "%");
        System.out.println("Interest added:" + interestadded);
        System.out.println("your new balance: " + newbalance);



    }
}