import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
            System.out.println("Enter the fruit name:");
            String fruit=in.next();
            switch(fruit){
                case"Mango":
                System.out.println("kings of all fruit");
                break;
                case"Apple":
                System.out.println("A sweet red fruit");
                break;
                case"Orange":
                System.out.println("Round fruit");
                break;
                case"Graphes":
                System.out.println("small fruit");

                default:
                System.out.println("invalid fruit");
            }
        
            
            
            

        }finally{
            in.close();
        }
    }
    
}
