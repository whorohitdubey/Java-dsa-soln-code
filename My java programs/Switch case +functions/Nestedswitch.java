import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try{
            System.out.println("Enter empId:");

            int empId=in.nextInt();
            System.out.println("Enter department:");
            String department=in.next();
            
            switch(empId){
                case 1:
                System.out.println("Rohit Dubey");
                break;
                case 2:
                System.out.println("Ankita Banerjee");
                break;
                case 3:
                System.out.println("Employ no 3");
                switch(department){
                    case"IT":
                    System.out.println("Operation peeps");
                    break;
                    case "Management":
                    System.out.println("Management gurus");
                    break;
                    default:
                    System.out.println("Faltu HR's");

                
                }
                default:
                System.out.println("Does not exist in database");

            }


        }finally{
            in.close();
        }
    }
}
