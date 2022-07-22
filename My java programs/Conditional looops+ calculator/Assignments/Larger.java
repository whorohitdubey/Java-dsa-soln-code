import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
            int a=in.nextInt();
            int b=in.nextInt();
            int max=a;
            if(b>max){
                max=b;
            }
            System.out.println(max);

           
            

        }finally{
            in.close();
        }
    }
    
}
