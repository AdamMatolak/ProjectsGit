package Domace.stringcutter;

public class Main {
    public static void main(String[] args) {
        String text = "SKOLA";
        char[] pole = text.toCharArray();
        int len = pole.length;
        int i;
        int j;
        for(i=0;i<len;i++){
            for(j=i;j<len;j++){
                System.out.print(pole[j]);
            }
            System.out.println();
        }
    }
}
