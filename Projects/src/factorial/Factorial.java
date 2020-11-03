package factorial;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int x = sc.nextInt();
        int result = fakt(x);
        System.out.println("Factorial is: " + result);
    }

    private static int fakt(int v){
        if(v==1){
            return 1;
        }
        else{
            return v*fakt(v-1);
        }
    }
}
