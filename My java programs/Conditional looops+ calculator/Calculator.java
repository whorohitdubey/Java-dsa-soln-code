import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try{
            while(true){
                int ans=0;

               System.out.println("Enter the operator:");
               char op=in.next().trim().charAt(0);
               if(op=='+' || op=='-' || op=='*' || op =='/' || op=='%') {
                System.out.println("Enter two numbert:");
                int Num1=in.nextInt();
                int Num2=in.nextInt();
                 if (op=='+') {
                    ans= Num1+Num2;
                 }
                 if (op=='-') {
                    ans= Num1-Num2;
                 }
                 if (op=='*') {
                    ans= Num1*Num2;
                 }
                 if (op=='%') {
                    ans= Num1%Num2;
                 }
                 if (op=='/') {
                    if(Num2!=0){
                        ans= Num1/Num2;

                    }
                    
                 }
               }else if( op=='x' || op=='X'){
                break;

               }else{
                System.out.println("Invalid operations");
               }
               System.out.println(ans);
                
            }

        } finally{
            in.close();
        }

    }
    
}
