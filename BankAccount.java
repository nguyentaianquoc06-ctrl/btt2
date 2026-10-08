class BankAccount {
    private final String accountNumber;

    private double balance;

    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            System.out.println("Lỗi: Số dư không được âm!");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Nạp tiền thành công: " + amount);
        } else {
            System.out.println("Lỗi: Số tiền nạp phải > 0!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }
}

public class b1 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("001", "Nguyen Van A");

        account.deposit(1000);

        account.deposit(-500);

        boolean result1 = account.withdraw(2000);
        System.out.println("Rút 2000: " + result1);

        boolean result2 = account.withdraw(300);
        System.out.println("Rút 300: " + result2);

        System.out.println("Số dư hiện tại: " + account.getBalance());
    }
}

