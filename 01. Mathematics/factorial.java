package miscellaneous;
import java.util.*;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to calculate the factorial");
        int n = sc.nextInt();
        int fact = 1;
        int a ;
        for(int i = 0; i<n;i++){
            a = (n-i);
            fact = fact*a;
        }
        System.out.println("Fatorial is: " + fact);
    }
}
