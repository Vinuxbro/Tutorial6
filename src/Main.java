import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc1= new Account("John",23654,"Current",600);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Account Holder's Name : ");
        String AccName = input1.nextLine();
        acc1.setHolderName(AccName);


        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int AccNumber = input2.nextInt();
        acc1.setAccountNumber(AccNumber);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter account initial Balance : ");
        double Accbalance = input3.nextDouble();
        acc1.setCurrentBalence(Accbalance);

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Account type : ");
        String AccType= input4.nextLine();
        acc1.setAccountType(AccType);

        System.out.println("Creating "+AccName+"'s Account....." );






    }
}
