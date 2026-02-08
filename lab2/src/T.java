import java.util.Scanner;

public class T {
    private int width;
    
    public T(int width) {
        this.width = width;
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= width; i++) {
            for(int j = 1; j <= i; j++) {
                res.append("[*]");
            }
            if(i < width) {
                res.append("\n");
            }
        }
        return res.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle width: ");
        int width = scanner.nextInt();
        
        T triangle = new T(width);
        System.out.println(triangle);
        
        scanner.close();
    }
}