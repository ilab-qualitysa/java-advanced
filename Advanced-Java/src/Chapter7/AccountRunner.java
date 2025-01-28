package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
    Account objAccount = new Account("David", "100123456", BankAccountType.Loan, "00520");
    //objAccount.setAccountNo("2002508090");
    //objAccount.setAccountType(BankAccountType.Loan);
    /*
    objAccount.setBalance(250000);
    objAccount.deposit(500);
    objAccount.withdrawal(250);
    */
    objAccount.display();
    Account target = new Account("Tumelo", "3603630060", BankAccountType.Credit, "250360");
    objAccount.tranfer(target, 500);
    objAccount.display();
    target.display();
    }
}
