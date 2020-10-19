package Domace.textanalyzer;

public class Main {
    public static void main(String[] args) {
        textAnalyser("Yesterday i was eating PIROHY. They were AMAZING!");

    }
    public static void textAnalyser(String text){

        int smallLetters = 0;
        int bigLetters = 0;
        int numbers = 0;
        int spaces = 0;
        int sentences = 0;

        char[] array = text.toCharArray();
        int len = array.length;
        for(int i = 0;i < len;i++){
            if((char)array[i]>=65&&(char)array[i]<=90){
                bigLetters++;
            }
            else if((char)array[i]>=97&&(char)array[i]<=122){
                smallLetters++;
            }
            else if((char)array[i]>=48&&(char)array[i]<=57){
                numbers++;
            }
            else if((char) array[i] == 32){
                spaces++;
            }
            else if((char)array[i]==46||(char)array[i]==33||(char)array[i]==63){
                sentences++;
            }
        }
        System.out.println("Number of big letters: " + bigLetters);
        System.out.println("Number of small letters: " + smallLetters);
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Number of words: " + (spaces+1));
        System.out.println("Number of sentences: " + sentences);
    }
}
