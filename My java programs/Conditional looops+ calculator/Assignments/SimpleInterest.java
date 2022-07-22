import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try {
            System.out.println("enter principle:");
            int prin= in.nextInt();
            System.out.println("Enter rate of interest:");
            int rate=in.nextInt();
            System.out.println("time:");
            int time=in.nextInt();
            int Si= prin*rate*time;
            System.out.println(Si);
            
        } finally{
            in.close();
        }
    }
    
}
