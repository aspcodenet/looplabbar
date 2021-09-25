package se.systementor;

public class Lab3 {
    public void Execute(){

        while(true){
            System.out.println("Ange tal 1:");
            int tal1 = Integer.parseInt(System.console().readLine());
            
            System.out.println("Ange tal 2:");
            int tal2 = Integer.parseInt(System.console().readLine());

            System.out.printf("Summan är %d",tal1+tal2);

            System.out.println("Vill du fortsätta J/N?");
            String cont = System.console().readLine();
            if(cont.charAt(0) == 'N')
                break;
        }

    }
}
