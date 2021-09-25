package se.systementor;

public class Lab8 {
    public void Execute(){
        final int pin = 12234;            
        int tries = 0;
        while(true){
            System.out.print("Please enter pin:");
            int guess = Integer.parseInt(System.console().readLine());

            if(guess == pin){
                System.out.println("Correct, welcome back");
                break;
            }
            tries++;
            if(tries == 3){
                System.out.print("Sorry you have been locked out");
                break;
            }
            System.out.println("Incorrect, try again");




        }

    }
    
}
