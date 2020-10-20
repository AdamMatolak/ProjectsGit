package ascii;

public class Main {
    public static void main(String[] args) {
        int i;
        for(i=65;i<=90;i++){
            System.out.println(i + " : " + (char)i);
        }
        String r = "kosice2021";
        char[] pole = r.toCharArray();
        int len = pole.length;
        for(i=0;i<len;i++){
            pole[i]=(char)(pole[i]+5);
        }
        String newR = String.valueOf(pole);
        System.out.println(newR);

    }
}
