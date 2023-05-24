import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{

    public ServerImpl() throws RemoteException{

    }

    public float Addition(float num1, float num2) throws RemoteException{
        return num1+num2;
    }

    public float Multiplication(float num1, float num2) throws RemoteException{
        return num1*num2;
    }

    public float Subtraction(float num1, float num2) throws RemoteException{
        return num2-num1;
    }

    public float Division(float num1, float num2) throws RemoteException{
        if(num2 != 0){
            return num1/num2;
        }
        else{
            System.out.println("Cannot divide by 0");
        }
        return num1/num2;
  
    }
}

