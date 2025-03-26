public class Main{
    public static void main(String[] args) {
//        BankAccount kip = new BankAccount("01108719338700","Kev","kev@gmail.com",
//                200000,"0702922235");
        BankAccount kip = new BankAccount();
        System.out.println(kip.getAccountNumber());
        System.out.println(kip.getPhoneNumber());
//        kip.setAccountBalance(200000);
//        kip.setAccountNumber("0110871938700");
//        kip.setEmail("kip@gmail.com");
//        kip.setPhoneNumber("0702922235");
//        kip.setCustomerName("Kipngeno");
        kip.deposit(50000);
        kip.withdraw(150000);
        kip.deposit(35000);
        kip.withdraw(140000);
        kip.deposit(200000);
        kip.withdraw(335000);
        kip.deposit(100);
        kip.withdraw(54.55);
        kip.withdraw(45.46);
        kip.withdraw(45.45);

        System.out.println(kip.getAccountBalance());

        BankAccount simAcc = new BankAccount("Simon","sim@gmail.com","0716200518");
        System.out.println("Account Number:"+simAcc.getAccountNumber() + "; name :"+simAcc.getCustomerName());
    }
}

