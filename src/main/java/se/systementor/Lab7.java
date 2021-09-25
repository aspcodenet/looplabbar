package se.systementor;


public class Lab7 {
    public void Execute(){

        System.out.print("Enter height:");
        int height = Integer.parseInt(System.console().readLine());
        System.out.print("Enter width:");
        int width = Integer.parseInt(System.console().readLine());
        
        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                System.out.print("#");
            }
            System.out.println("");
        }


        System.out.println(tal2);
    }

    
}
