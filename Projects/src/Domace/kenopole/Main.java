package Domace.kenopole;

public class Main {
    public static void main(String[] args) {
        int[] keno = new int[20];
        int randomNum;
        randomNum = 1 + (int)(Math.random() * 80);
        int i;
        int j;
        for(i=0;i<20;i++){
            if(i>0){
                for(j = i;j>=0;j--){
                    if(randomNum==keno[j]){
                        randomNum = 1 + (int)(Math.random() * 80);
                    }
                    else{
                        keno[i]=randomNum;
                    }
                }
            }
            System.out.print(keno[i] + " ");
        }
    }
}
