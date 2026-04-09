import java.util.Scanner;
class Max {
    public static int max(int n1, int n2) {
        // Write code here
        if(n1 > n2){
            return n1;
        }
        else{
            return n2;
        }
        
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Value : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Value : ");
        int b = sc.nextInt();

        int result = max(a,b);

        System.out.print(result + " is bigger");
    }
}
