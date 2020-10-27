package Domace.tictactoe.tictactoeforthree;

import java.util.Scanner;

public class TicTacToeForThree {
    private static int[][] gameTable = new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    public static int playerNow = 3;

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
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 5;j++){
                System.out.print(gameTable[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkGame(){
        int c = 0;
        boolean check;
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < 5;j++){
                if(gameTable[i][j]==1||gameTable[i][j]==2||gameTable[i][j]==3){
                    c++;
                }
            }
        }
        if(c == 25){
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
        int player3 = 3;
        int switchedPlayer = 3;
        if(playerNow==player3){
            switchedPlayer=player1;
        }
        else if(playerNow==player1){
            switchedPlayer=player2;
        }
        else if(playerNow==player2){
            switchedPlayer=player3;
        }
        playerNow=switchedPlayer;
    }
    public static void makeTurn() {
        int chosenLine = 0;
        int chosenColumn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Player number " + playerNow + ", choose the line:");
        int enteredValue1 = sc.nextInt();
        if (enteredValue1 < 1 || enteredValue1 > 5) {
            System.out.print("Wrong input, try again: ");
            enteredValue1 = sc.nextInt();
        } else {
            chosenLine = enteredValue1 - 1;
        }
        System.out.print("Player number " + playerNow + ", choose the column: ");
        int enteredValue2 = sc.nextInt();
        if (enteredValue2 < 1 || enteredValue2 > 5) {
            System.out.print("Wrong input, try again: ");
            enteredValue2 = sc.nextInt();
        } else {
            chosenColumn = enteredValue2 - 1;
        }
        gameTable[chosenLine][chosenColumn] = playerNow;
    }
    public static int checkWinner(){
        int winner=4;
        for(int i = 0;i < 5;i++){
            if(gameTable[i][0]==1&&gameTable[i][1]==1&&gameTable[i][2]==1&&gameTable[i][3]==1&&gameTable[i][4]==1){
                winner = 1;
                break;
            }
            else if(gameTable[0][i]==1&&gameTable[1][i]==1&&gameTable[2][i]==1&&gameTable[3][i]==1&&gameTable[4][i]==1){
                winner = 1;
                break;
            }
            else if(gameTable[i][0]==2&&gameTable[i][1]==2&&gameTable[i][2]==2&&gameTable[i][3]==2&&gameTable[i][4]==2){
                winner = 2;
                break;
            }
            else if(gameTable[0][i]==2&&gameTable[1][i]==2&&gameTable[2][i]==2&&gameTable[3][i]==2&&gameTable[4][i]==2){
                winner = 2;
                break;
            }
            else if(gameTable[i][0]==3&&gameTable[i][1]==3&&gameTable[i][2]==3&&gameTable[i][3]==3&&gameTable[i][4]==3){
                winner = 3;
                break;
            }
            else if(gameTable[0][i]==3&&gameTable[1][i]==3&&gameTable[2][i]==3&&gameTable[3][i]==3&&gameTable[4][i]==3){
                winner = 3;
                break;
            }
        }
        if(winner==4){
            if(gameTable[0][0]==1&&gameTable[1][1]==1&&gameTable[2][2]==1&&gameTable[3][3]==1&&gameTable[4][4]==1){
                winner = 1;
            }
            else if(gameTable[0][4]==1&&gameTable[1][3]==1&&gameTable[2][2]==1&&gameTable[3][1]==1&&gameTable[4][0]==1){
                winner = 1;
            }
            else if(gameTable[0][0]==2&&gameTable[1][1]==2&&gameTable[2][2]==2&&gameTable[3][3]==2&&gameTable[4][4]==2){
                winner = 2;
            }
            else if(gameTable[0][4]==2&&gameTable[1][3]==2&&gameTable[2][2]==2&&gameTable[3][1]==2&&gameTable[4][0]==2){
                winner = 2;
            }
            else if(gameTable[0][0]==3&&gameTable[1][1]==3&&gameTable[2][2]==3&&gameTable[3][3]==3&&gameTable[4][4]==3){
                winner = 3;
            }
            else if(gameTable[0][4]==3&&gameTable[1][3]==3&&gameTable[2][2]==3&&gameTable[3][1]==3&&gameTable[4][0]==3){
                winner = 3;
            }
            else{
                winner = 4;
            }
        }
        if(winner == 1){
            System.out.println("Congrats, player 1 won!");
        }
        else if(winner == 2){
            System.out.println("Congrats, player 2 won!");
        }
        else if(winner == 3){
            System.out.println("Congrats, player 3 won!");
        }


        return winner;
    }
}
