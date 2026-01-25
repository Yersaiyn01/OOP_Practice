import java.util.Locale;
import java.util.Scanner;
public class task3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter your grade: ");
        double a= input.nextDouble();
        if(100>a && 94.5<=a){
            System.out.println("A");
        }
        else if(94.4>=a && 89.5<=a){
            System.out.println("A-");
        }
        else if(89.4>=a && 84.5<=a){
            System.out.println("B+");
        }
        else if(84.4>=a && 79.5<=a){
            System.out.println("B");
        }
        else if(79.4>=a && 74.5<=a){
            System.out.println("B-");
        }
        else if(74.4>=a && 69.5<a){
            System.out.println("C+");
        }
        else if(69.4>=a && 64.5<a){
            System.out.println("C");
        }
        else if (a >=59.5 ) {
            System.out.println("C-");
        } 
        else if (a >= 54.5) {
            System.out.println("D+");
        } 
        else if (a >= 49.5) {
            System.out.println("D");
        } 
        else {
            System.out.println("F");
        }


    }
}

