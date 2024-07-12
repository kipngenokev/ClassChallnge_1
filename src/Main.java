public class Main {
    public static void main(String[] args) {

       //BankAccount bankAccount= new BankAccount("011087193387",10000,"KIPNGENO","kipngeno@gmail.com","0702922234");
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAccountBalance());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getAccountNumber());
//        System.out.println("customer name:"+bankAccount.getCustomerName());
//        System.out.println("Account Balance:"+bankAccount.getAccountBalance());
//        System.out.println("Account number:"+bankAccount.getAccountNumber());
//        System.out.println("Email:"+bankAccount.getEmail());
//        System.out.println("Phone Number:"+bankAccount.getPhoneNumber());

        BankAccount joya = new BankAccount("Joya","joya@gmail.com","0721987789");
        System.out.println("customer Name: "+ joya.getCustomerName() + " Account Number:"+joya.getAccountNumber()+ " Account Balance:"+joya.getAccountBalance()+ " Email "+joya.getEmail()+" Phone Number:"+joya.getPhoneNumber());

        bankAccount.withdrawFunds(500);
        bankAccount.depositFunds(5000);
        bankAccount.withdrawFunds(2000);
        bankAccount.withdrawFunds(3000);

        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(450.55);

        bankAccount.withdrawFunds(549.46);
        bankAccount.withdrawFunds(549.45);

    }
}