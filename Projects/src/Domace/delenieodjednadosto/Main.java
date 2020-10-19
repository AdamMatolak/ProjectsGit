package Domace.delenieodjednadosto;

public class Main {
    public static void main(String[] args) {
        int i;
        int b = 0;
        for(i=1;i<=100;i++){
            System.out.print("1" + "/" + i);
            if(i<100){
                System.out.print("+");
            }
            b=b+(1/i);
        }
        System.out.println(" = " + b);
    }
}
