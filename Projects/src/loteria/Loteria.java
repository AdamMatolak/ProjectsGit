package loteria;

import java.util.Scanner;

public class Loteria {
    private int[] tip = new int[5];
    private int[] zreb = new int[10];

    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        //zadavanie
        loteria.inputNumbers();
        //zrebovanie
        loteria.drawNumbers();
        //overovanie
        loteria.confirmNumbers();
    }

    public void inputNumbers(){
        int i = 0;
        int in;
        Scanner sc = new Scanner(System.in);
        while(i<5){
            System.out.print("Enter " + (i + 1) + ". number : ");
            in = sc.nextInt();
            if(in>0 && in < 21 && checkArray(i, in)) {
                tip[i]=in;
                i++;
            }
            else{
                System.out.println("Wrong input! Try again!");
            }
        }
        System.out.println("Your tips: ");
        for(i = 0;i < 5;i++){
            System.out.print(tip[i] + " ");
        }
        System.out.println();
    }

    public boolean checkArray(int i, int in){
        if(i==0){
            return true;
        }
        for(int j = 0;j < i;j++){
            if(tip[j]==in){
                return false;
            }
        }
        return true;
    }

    public boolean checkArray2(int i, int draw){
        if(i==0){
            return true;
        }
        for(int j = 0;j < i;j++){
            if(zreb[j]==draw){
                return false;
            }
        }
        return true;
    }

    public void drawNumbers(){
        int i = 0;
        int draw;
        while(i<10){
            draw = 1 + (int)(Math.random() * 20);
            if(checkArray2(i, draw)){
                zreb[i] = draw;
                i++;
            }

        }
        System.out.println("Drawn numbers are: ");
        for(i = 0;i < 10;i++){
            System.out.print(zreb[i] + " ");
        }
        System.out.println();
    }

    public void confirmNumbers(){
        int match = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j < 5;j++){
                if(tip[j]==zreb[i]){
                    match++;
                }
            }
        }
        System.out.println(match + " of your numbers matched with drawn numbers.");
        System.out.println();
    }
}
