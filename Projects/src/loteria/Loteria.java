package loteria;

import java.util.Scanner;

public class Loteria {
    private int[] tip = new int[5];
    private int[] zreb = new int[10];
    private double bet;

    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        //zadavanie
        loteria.inputNumbers();
        //zrebovanie
        loteria.drawNumbers();
        //overovanie
        loteria.confirmNumbers();
        //speňaženie
        loteria.prize();
    }

    public void inputNumbers() {
        int i = 0;
        int in;
        double yourBet;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            System.out.print("Enter " + (i + 1) + ". number : ");
            in = sc.nextInt();
            if (in > 0 && in < 21 && checkArray(i, in)) {
                tip[i] = in;
                i++;
            } else {
                System.out.println("Wrong input! Try again!");
            }
        }
        System.out.println("Your tips: ");
        for (i = 0; i < 5; i++) {
            System.out.print(tip[i] + " ");
        }
        System.out.println();
        System.out.print("Enter your bet: ");
        yourBet = sc.nextDouble();
        int zbytocnaPremenna = 0;
        while (zbytocnaPremenna == 0) {
            if (yourBet < 0) {
                System.out.print("Wrong input, try again: ");
                yourBet = sc.nextDouble();
            } else {
                bet = yourBet;
                System.out.println();
                zbytocnaPremenna++;
            }
        }
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
    public void prize(){
        int match = 0;
        for(int i = 0;i<10;i++){
            for(int j = 0;j < 5;j++){
                if(tip[j]==zreb[i]){
                    match++;
                }
            }
        }
        double won = 0;
        if(match == 2){
            won = 2 * bet;
        }
        else if(match == 3){
            won = 15 * bet;
        }
        else if(match == 4){
            won = 500*bet;
        }
        else if(match == 5){
            won = 10000 * bet;
        }
        System.out.println("Congratulations! You won " + won + " €!");
    }
}
