package Domace.koeficientodrazu;

import java.util.Scanner;

public class Main {

    public static void koeficientOdrazu(){
        double koeficient = 0.9;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the ball: ");
        double a = sc.nextDouble();

        System.out.print(a + " ");
        do{
            a = a * koeficient;
            System.out.print(a + " ");
        }while(a>=100);
    }
    public static void main(String[] args) {

        koeficientOdrazu();



    }
}
