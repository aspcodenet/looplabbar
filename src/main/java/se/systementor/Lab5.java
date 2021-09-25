package se.systementor;

public class Lab5 {
    public void Execute(){
        System.out.print("Ange tal:");
        int tal1 = Integer.parseInt(System.console().readLine());
        for(int i = tal1-1; i >0; i--){
            System.out.println(i);
        }

    }
}
