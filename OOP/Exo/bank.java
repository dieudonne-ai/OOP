class Bank {

    String accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        
    }
}