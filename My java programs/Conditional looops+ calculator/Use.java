import java.util.Scanner;

public class Use {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
            int salary=in.nextInt();
            if (salary>10000){
                 salary=salary+2000;
           }
            else if(salary>20000){
                 salary=salary+3000;
            }
            else{
                 salary=salary+1000;
            }
            System.out.println(salary);
        
    } finally{
        in.close();
    }
        
    
        
    }

}