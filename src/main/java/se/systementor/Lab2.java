package se.systementor;

public class Lab2 {
    public void Execute(){

        System.out.println("Ange tal 1:");
        int tal1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ange tal 2:");
        int tal2 = Integer.parseInt(System.console().readLine());

        if(tal2 > tal1)
            for(int i = tal1; i <= tal2; i++){
                System.out.println(i);
            }
        else
            for(int i = tal2; i >= tal1; i--){
                System.out.println(i);
            }


        if(tal2 > tal1){
            int i = tal1;
            while(i <= tal2){
                System.out.println(i);
                i++;
            }
        }
        else{
            int i = tal2;
            while(i >= tal1){
                System.out.println(i);
                i--;
            }
        }




    }
    
}
