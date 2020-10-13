package Domace.convertor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number, you want to convert: ");
        int x = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Choose the type of numerical expresion: ");
        int n = sc2.nextInt();
        int a = 0;
        int x1 = x;
        int x0 = 0;

        if(n==2){
            while(x1%2==0){
                x0 = x0 + 1;
                x1 = x1 / 2;
            }
            int p = 1;
            while(x1>0){
                a = (int) (a + ((x1%2)*Math.pow(10, p)));
                p++;
                if(x1%2!=0){
                    x1=(x1-1)/2;
                }
                else{
                    x1=x1/2;
                }
            }
            a = a / 10;

            if(x0>0){
                for(int i = 0;i<x0;i++){
                    a = a * 10;
                }
            }
            System.out.println("Your number in binary expresion is: " + a);
        }
        else if(n==8){
            while(x1%8==0){
                x0 = x0 + 1;
                x1 = x1 / 8;
            }
            int p = 1;
            while(x1>0){
                a = (int) (a + ((x1%8)*Math.pow(10, p)));
                p++;
                if(x1%8!=0){
                    x1=(x1-1)/8;
                }
                else{
                    x1=x1/8;
                }
            }
            a = a / 10;

            if(x0>0){
                for(int i = 0;i<x0;i++){
                    a = a * 10;
                }
            }
            System.out.println("Your number in octadecimal expresion is: " + a);
        }
        else if(n==16){
            String h = "";

            while(x1>0){
                int z = x1%16;
                if(z==10){
                    h = "A" + h;
                }
                else if(z == 11){
                    h = "B" + h;
                }
                else if(z == 12){
                    h = "C" + h;
                }
                else if(z == 13){
                    h = "D" + h;
                }
                else if(z == 14){
                    h = "E" + h;
                }
                else if(z == 15){
                    h = "F" + h;
                }
                else{
                    h = z + h;
                }
                if(z!=0){
                    x1=(x1-1)/16;
                }
                else{
                    x1=x1/16;
                }
            }
            System.out.println("Your number in hexadecimal expresion is: " + h);
        }
    }
}