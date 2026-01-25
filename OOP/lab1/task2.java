import java.util.Scanner;

public class task2{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int a;
    System.out.print("Enter yoour number: ");
    a = input.nextInt();
    double s = Math.pow(a, 2);
    System.out.println("Area = "+s);
    int p = a*4;
    System.out.println("Perimeter = "+p);
    double d = a * Math.sqrt(2);
    System.out.println("diagonal = "+d);
    }
}