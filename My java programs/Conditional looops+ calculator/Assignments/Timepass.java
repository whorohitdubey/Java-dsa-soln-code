import java.util.Scanner;


public class Timepass {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
            System.out.println("Enter your name?");
            String name=in.next();
            System.out.println( name + " She is fucking hot");


        } finally{
            in.close();
        }
    }
}
