import java.util.Scanner;
public class task1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String name;
        name = input.next();
        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
        System.out.printf("|"+name+"|");
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");

    }
}
