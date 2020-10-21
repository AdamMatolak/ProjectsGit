package password;

import java.util.Random;

public class Password {
    public static void main(String[] args) {
        randomPassword();
    }

    public static String randomCapitalPassword(){
        String pass="";
        Random rnd = new Random();


        for(int i = 0;i < 8;i++){
            char z = (char) (rnd.nextInt(90-65+1)+65);
            pass += z;
        }
        //System.out.println(pass);
        return pass;
    }

    public static String randomPassword(){
        String pass = "";
        Random rnd = new Random();
        for(int i = 0;i < 10;i++){
            int x = (rnd.nextInt(2-0+1)+0);
            if(x==0){
                char z = (char) (rnd.nextInt(57-48+1)+48);
                pass += z;
            }
            else if(x==1){
                char z = (char) (rnd.nextInt(122-97+1)+97);
                pass += z;
            }
            else if(x==2){
                char z = (char) (rnd.nextInt(90-65+1)+65);
                pass += z;
            }
        }
        System.out.println(pass);
        return pass;
    }
}
