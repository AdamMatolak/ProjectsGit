package Domace.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static int[][] gameTable = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
    public static int playerNow;

    public static void main(String[] args) {
        printGameTable();
        switchPlayer();
        makeTurn();
        printGameTable();
        checkGame();
        while(checkGame() == false){
            switchPlayer();
            makeTurn();
            printGameTable();
            checkGame();
            checkWinner();
            if(checkWinner()<3){
                break;
            }
        }
    }
    public static void printGameTable(){
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(gameTable[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkGame(){
        int c = 0;
        boolean check;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                if(gameTable[i][j]==1||gameTable[i][j]==2){
                    c++;
                }
            }
        }
        if(c == 9){
            check = true;
        }
        else{
            check = false;
        }
        return check;
    }
    public static void switchPlayer(){
        int player1 = 1;
        int player2 = 2;
        int switchedPlayer = 2;
        if(switchedPlayer==player2){
            switchedPlayer--;
        }
        else{
            switchedPlayer++;
        }
        playerNow=switchedPlayer;
    }
    public static void makeTurn() {
        int chosenLine = 0;
        int chosenColumn = 0;
        int playerOnTurn =playerNow;
        Scanner sc = new Scanner(System.in);
        System.out.print("Player number " + playerOnTurn + ", choose the line:");
        int enteredValue1 = sc.nextInt();
        if (enteredValue1 < 1 || enteredValue1 > 3) {
            System.out.print("Wrong input, try again: ");
            enteredValue1 = sc.nextInt();
        } else {
            chosenLine = enteredValue1 - 1;
        }
        System.out.print("Player number " + playerOnTurn + ", choose the column: ");
        int enteredValue2 = sc.nextInt();
        if (enteredValue2 < 1 || enteredValue2 > 3) {
            System.out.print("Wrong input, try again: ");
            enteredValue2 = sc.nextInt();
        } else {
            chosenColumn = enteredValue2 - 1;
        }
        gameTable[chosenLine][chosenColumn] = playerOnTurn;
    }
    public static int checkWinner(){
        int winner=3;
        for(int i = 0;i < 3;i++){
            if(gameTable[i][0]==1&&gameTable[i][1]==1&&gameTable[i][2]==1){
                winner = 1;
                break;
            }
            else if(gameTable[0][i]==1&&gameTable[1][i]==1&&gameTable[2][i]==1){
                winner = 1;
                break;
            }
            else if(gameTable[i][0]==2&&gameTable[i][1]==2&&gameTable[i][2]==2){
                winner = 2;
                break;
            }
            else if(gameTable[0][i]==2&&gameTable[1][i]==2&&gameTable[2][i]==2){
                winner = 2;
                break;
            }
        }
        if(winner==3){
            if(gameTable[0][0]==1&&gameTable[1][1]==1&&gameTable[2][2]==1){
                winner = 1;
            }
            else if(gameTable[0][2]==1&&gameTable[1][1]==1&&gameTable[2][0]==1){
                winner = 1;
            }
            else if(gameTable[0][0]==2&&gameTable[1][1]==2&&gameTable[2][2]==2){
                winner = 2;
            }
            else if(gameTable[0][2]==2&&gameTable[1][1]==2&&gameTable[2][0]==2){
                winner = 2;
            }
            else{
                winner = 3;
            }
        }
        if(winner == 1){
            System.out.println("Congrats, player 1 won!");
        }
        else if(winner == 2){
            System.out.println("Congrats, player 2 won!");
        }


        return winner;
    }
}
