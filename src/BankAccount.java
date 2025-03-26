public class BankAccount{
    private String accountNumber;
    private String customerName;
    private String email;
    private double accountBalance;
    private String phoneNumber;

    public BankAccount() {
        this("011243567890","Nancy","nancy@gmail.com",
                234500,"0703429561");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber,String customerName, String customerEmail, double accountBalance,
                       String customerNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        phoneNumber = customerNumber;
        email = customerEmail;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("0110897865432",customerName,email,
                0.0,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Ksh "+ depositAmount + " deposited to Account "+ accountNumber +"" +
                ". Your new Account balance is Ksh "+accountBalance);
    }

    public void withdraw( double withdrawAmount) {
        if(withdrawAmount > accountBalance) {
            System.out.println("You have insufficient balance . Please try a lower amount");
        } else{
            accountBalance -=withdrawAmount;
            System.out.println("Ksh "+withdrawAmount + " withdrawn from account "+accountNumber+
                    ".New account balance is Ksh "+accountBalance);
        }
    }
}