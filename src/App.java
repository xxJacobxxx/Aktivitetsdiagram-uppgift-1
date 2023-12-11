import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        String name = tb.nextLine();
        String passcode = tb.nextLine();
        if(name.equalsIgnoreCase("root")&& passcode.equalsIgnoreCase("pass")){
            System.out.println("Ditt bankkonto har 0 kr");
        }
        else{
            System.out.println("Fel namn eller lösenord");
        }
        
        int tal = tb.nextInt();
        if(tal>10){
            System.out.println("Talet är större än tio");
        }
        else{
            System.out.println("Talet är mindre eller lika med tio");
        }
        



    }
}
