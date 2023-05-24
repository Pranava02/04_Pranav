import java.util.*;

public class TokenRing{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //input number of nodes
            System.out.print("Enter total number of nodes in the Ring: ");
            int n = sc.nextInt();
            //ring formation
            System.out.println("Ring Formed is as follows:");
            for(int i = 0; i<n; i++){
                System.out.print(i + " ");
            }
            System.out.println(0);
            int token = 0;
            int choice = 0;
            do{
                System.out.println("Enter Sender: ");
                int sender = sc.nextInt();

                System.out.println("Enter Reciever: ");
                int reciever = sc.nextInt();

                System.out.println("Enter Data: ");
                int data = sc.nextInt();

                //int token = 0;
                System.out.println("Token passing ...");
                // n=6   0 1 2 3 4 5    token=4; send=1; receive=5;
                //4->5->0->1
                for(int i = token; i!=sender; i=(i+1)%n){
                    System.out.print(" " + i + "->");
                }
                System.out.print(" "+ sender + "\n");

                System.out.println("Sender " + sender + " is sending data to reciever "+ reciever);

                for(int i = sender; i!=reciever; i = (i+1)%n){
                    System.out.println("Data "+data+" forwarded by node "+ i + " to next node");
                }
                System.out.println("Reciever "+reciever+" recieved data "+ data);
                token = sender;
                System.out.println("Token is now held by "+ sender);

                System.out.println("Do you want to Send Data Again? If YES, Enter 1. \n If NO, Enter 0");
                choice = sc.nextInt();
            }while(choice == 1);
        } catch(Exception e){
            System.out.println("Exception caught : "+ e);
        }
    }
} 