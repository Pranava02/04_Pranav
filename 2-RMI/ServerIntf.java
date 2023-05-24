import java.rmi.*;

interface ServerIntf extends Remote{
    public float Addition(float num1, float num2) throws RemoteException;
    public float Multiplication(float num1, float num2) throws RemoteException;
    public float Subtraction(float num1, float num2) throws RemoteException;
    public float Division(float num1, float num2) throws RemoteException;
}