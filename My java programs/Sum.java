import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("enter first number:");
            int Num1= in.nextInt();
            System.out.println("Enter second number:");
            int Num2=in.nextInt();
            int sum= Num1 + Num2;
            System.out.println("sum:" +sum);
        } finally {
            in.close();
        }

        
            


    }
}
