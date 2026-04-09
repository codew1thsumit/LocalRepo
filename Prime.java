import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        int i;
        int flag = 0;
        for(i = 2 ; i < n ; i++){
            if(n % i == 0){
                flag = 1;
            }
        }
        String result = (flag == 1) ? " is Not Prime" : " is Prime";
        System.out.print(n + result);
    }
}
