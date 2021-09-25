package se.systementor;
import java.util.Random;

public class Lab6 {
    public void Execute(){

        var rnd = new Random();
        while(true){

            System.out.println("Rolling the dices...");
            System.out.println("The values are...");
            int tal1 = rnd.nextInt(5)+1;
            System.out.println(tal1);
            int tal2 = rnd.nextInt(5)+1;
            System.out.println(tal2);

            System.out.println("Vill du fortsätta J/N?");
            String cont = System.console().readLine();
            if(cont.charAt(0) != 'Y' && cont.charAt(0) != 'y')
                break;
        }

    }


}
