package Chapter7;

/**
 * Class to hold attributes and functions related to bank account
 */
enum BankAccountType {
    Savings, Cheque, Loan, Credit;
}
public class Account {
    private String accountNo, accountHolder, branchCode, bankName;
    private double balance;
    private BankAccountType accountType;

    /**
     * Constructor to create a bank account object with initial values
     * @param accountHolder Account holder's name
     * @param accountNo Account number
     * @param accountType Bank account Type
     * @param branchCode Account Branch code
     */
    public Account(String accountHolder, String accountNo, BankAccountType accountType, String branchCode) {
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.branchCode = branchCode;
        setNewBalance(accountType);
        this.bankName = "ABC Bank";
    }

    /**
     * Set the account number
     * @param accountNo new account number
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * Get account number
     * @return the current account number
     */
    public String getAccountNo() {return this.accountNo;}

    /**
     * Get account holder's name
     * @return the name of the account holder
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Change the name of the account holder
     * @param accountHolder new account holder's name
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * Get the Branch code
     * @return the branch code of the bank
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Change the branch code
     * @param branchCode set the new branch code
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    /**
     * Get the balance
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Change balance
     * @param balance set new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get the type of account
     * @return the account type being used
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Change account type
     * @param accountType set the new account type
     */
    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * method to facilitate withdrawal functionality
     * @param amount Amount to be withdrawn from current balance
     */
    public void withdrawal(double amount){
        this.balance = this.balance - amount;
    }

    /**
     * Method to facilitate the deposit functionality
     * @param amount Amount to be deposited into the account
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * Create a method that will assign the initial balance based on account type:
     * Loan: 25000
     * Savings = 0
     * Credit = 7500
     * Cheque = 0
     */
    public void setNewBalance(BankAccountType accountType){
        switch (accountType){
            case Loan -> setBalance(25000);
            case Credit -> setBalance(7500);
            default -> setBalance(0);
        }
    }

    /**
     * Method to transfer an amount to another account
     * @param target target bank account
     * @param amount the amount being sent to another account
     */
    public void tranfer(Account target, double amount) {
        this.withdrawal(amount);
        target.deposit(amount);
    }

    /**
     * Display Bank account details
     */
    public void display(){
        System.out.println("\n============" + this.bankName + "===============");
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Account Type: " + this.accountType.name());
        System.out.println("Balance: " + this.balance);
        System.out.println("Branch Code: " + this.branchCode);
    }
}
