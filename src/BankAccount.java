public class BankAccount {
    private String accountNumber;

    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("011087193387000",100,"Josh","josh@gmail.com","+2547022222567");
        System.out.println("Empty constructor");
    }

    public BankAccount(String accountNumber,double accountBalance,String customerName,String email,String phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        email=email;
        phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("011076762",250.50,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double depositAmount) {
        accountBalance +=depositAmount;
        System.out.println(customerName + " has deposited Ksh"+ depositAmount + " to Account Number " +accountNumber+".New Bank Balance is Ksh" +accountBalance);
        return accountBalance;
    }

    public void withdrawFunds(double withdrawAmount) {
        if(withdrawAmount>accountBalance) {
            System.out.println("Insufficient bank balance.Please try a lower amount");
        } else {
            accountBalance-= withdrawAmount;
            System.out.println(customerName+" has withdrawn Ksh"+withdrawAmount + " from Account Number " +accountNumber +".New balance is Ksh"+accountBalance);

        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
