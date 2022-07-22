import java.util.Scanner;

public class Roll {
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("Enter the roll no:");
            int roll=in.nextInt();
            System.out.println("your roll no is:" + roll);
        } finally{
            in.close();
        }
        
    }
    
}
