package Domace.pripocitavac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b;
        System.out.print("pripocitaj cislo: ");
        b = sc.nextInt();
        if(b==0){
            System.out.println(a);
        }
        else{
            a = a + b;
            System.out.println(a);
            while(b!=0){
                System.out.print("pripocitaj cislo: ");
                b = sc.nextInt();
                a = a + b;
                System.out.println(a);
            }

        }
    }
}
