import java.util.Scanner;

public class np2 {
        public static void main (String[] args){
            Scanner scn = new Scanner(System.in);
            int v1 = scn.nextInt(); //公克
            System.out.println(Math.round((v1/600f)*10)/10f);


        
    }
}
