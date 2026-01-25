import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        int a= input.nextInt();
        System.out.println();
        System.out.print("Enter b:");
        int b= input.nextInt();
        System.out.println();
        System.out.print("Enter c:");
        int c= input.nextInt();
        System.out.println();

        Double discr = Math.pow(b,2) - 4*a*c;
        if(discr < 0){
            System.out.println("Error");
        }
        else{
        Double mop = Math.sqrt(discr);
        Double x1 = (-b+mop)/2*a;
        Double x2 = (-b-mop)/2*a;
        System.out.println("x1 =" + x1);
        System.out.println("x2 =" + x2);

}
}
}