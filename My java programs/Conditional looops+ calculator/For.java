import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            int n=in.nextInt();
            // for(int Num=1;Num <=n;Num++){
            //     System.out.println(Num+"");
            int Num=1;
            while(Num<=n){
                System.out.println(Num+ "");
                Num+=1;

            }

            
        }finally{
            in.close();
        }
    }
}
// print numbers from 1 to n? 