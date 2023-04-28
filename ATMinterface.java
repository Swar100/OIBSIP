import java.util.Scanner;
public class AtmInterface {
    public static void main(String[] args) {
        int balance = 2000000, wd, dep, pt=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("********* ATM MACHINE ********** ");
            System.out.println("Choose 1 for Deposit Money");
            System.out.println("Choose 2 for Withdraw Money");
            System.out.println("Choose 3 for Account statement");
            System.out.println("Choose 4 for Previous Transaction");
            System.out.println("Choose 5 for QUIT");
        while(true)
        {
            
            System.out.println("Choose the operation you want to perform: ");

            int ch= sc.nextInt();
            switch (ch)
            {
                case 2:
                    System.out.print("Enter money to be withdrawn: ");
                    wd = sc.nextInt();
                    if (balance >= wd)
                    {
                        balance = balance - wd;
                        pt=-wd;
                        System.out.println("Please collect your money: ");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 1:
                    System.out.println("Enter money to be deposite: ");
                    dep = sc.nextInt();
                    balance = balance+dep;
                    pt=dep;
                    System.out.println("\nYour money has been successfully deposited");
                    break;

                case 3:
                    System.out.println("Total balance in your account: "+balance);
                    break;

                case 4:
                    if(pt>0){
                        System.out.println("Deposited:"+pt);
                    }
                    else if(pt<0){
                        System.out.println("Withdrawn:"+pt);
                    }
                    else{
                        System.out.println("NO TRANSACTION");
                    }
                    
                case 5:    
                    System.exit(0);

            }

        }
    }
}