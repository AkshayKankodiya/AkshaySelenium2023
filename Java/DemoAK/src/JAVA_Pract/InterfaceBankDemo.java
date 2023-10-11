package JAVA_Pract;

public interface InterfaceBankDemo {

    public void deposit(int amount);

    public void cashWithdraw(int amount);

    public int currentBalance();

}

class CheckBalance implements InterfaceBankDemo{
    int deposit;
    int caswith;
    int Balance;
    public int currentBalance() {
        this.Balance = Balance;
        System.out.println("Your Current Balance is   :"+Balance);
        System.out.println();
        return Balance;


    }

    public void deposit(int deposit) {

        Balance = Balance + deposit;
        System.out.println("Your Deposit Amount  is   :"+deposit);
        System.out.println("Your Current Balance is   :"+Balance);
        System.out.println();

    }

    public void cashWithdraw(int caswith) {
        if(caswith>Balance){
            throw new IllegalArgumentException("Insufficient funds");
        }

        Balance = Balance - caswith;
        System.out.println("You Withdraw Cash is      :"+caswith);
        System.out.println("Your Current Balance is   :"+Balance);
        System.out.println();

    }


}

class BankMain {
    public static void main(String[] args) {
        CheckBalance user1 = new CheckBalance();
        user1.currentBalance();
        user1.deposit(5000);
        user1.cashWithdraw(5000);
        user1.cashWithdraw(50);
    }
    
}




