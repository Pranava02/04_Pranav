import java.rmi.*;
import java.util.Scanner;

public class Client{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try{
                String serverURL = "rmi://localhost/Server";
                ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);

                System.out.println("Enter first number: ");
                float num1 = sc.nextFloat();
                System.out.println("Enter Second number: ");
                float num2 = sc.nextFloat();
                System.out.println("first number is "+ num1);
                System.out.println("second number is "+ num2);

                System.out.println("---------------results---------------------");

                System.out.println("Addition is "+ serverIntf.Addition(num1, num2));
                System.out.println("Subtraction is "+ serverIntf.Subtraction(num1, num2));
                System.out.println("Multiplication is "+ serverIntf.Multiplication(num1, num2));
                System.out.println("Division is "+ serverIntf.Division(num1, num2));


            }catch(Exception e){
                System.out.println("Exception at client: "+ e.getMessage());
            }
        }
    }
}