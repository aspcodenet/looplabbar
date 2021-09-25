package se.systementor;

public class Lab4 {
    public void Execute(){

        int summa = 0;
        
        for(int i =0; i < 10; i++){
            System.out.printf("Ange tal %d:\n",i+1);
            int tal1 = Integer.parseInt(System.console().readLine());

            summa += tal1;
        }

        System.out.printf("Summan av alla tal blev %d:\n",summa);
    
    }
}
