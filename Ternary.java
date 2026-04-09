import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter A = ");
       int a = sc.nextInt();
       System.out.print("Enter B = ");
       int b = sc.nextInt();
       
       //Using ternary operator:

       String result = (a > b) ? "A is the Max" : "B is the Max";
       System.out.print(result);
    }
}
