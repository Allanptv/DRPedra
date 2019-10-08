import java.util.Random;
public class aciii{
    public static void main(String[]args){
        Random r = new Random();
        int i = 0;
        int n = 100;
        int x = 0, y = 0;
        y = r.nextInt(255);
        for(/**/; i < n ;i++){
            x = r.nextInt(2);
            if(x != 1){
                y = r.nextInt(255);
            }
            System.out.println("2 " + Integer.toHexString(y));
        }
    }
}