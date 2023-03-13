package bank.applicn;

import java.util.UUID;

public class SBI implements BankInter{

    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static double rateOfInterest;

    public SBI(int balance, String password, String name) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalanace(String Password) {
        if(password == this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance = balance + money;
        String mess = money+" has been added to account "+accountNo+" "+"total balance is now "+balance;
        return mess;
    }

    @Override
    public String withDrawn(int money, String password) {
        if(password== this.password){
            if(money>balance){
                return "Insufficient Balance";
            }else{
                balance = balance-money;
                return "Money withdrwan successfully. Reamin Balanace is "+balance;
            }
        }
        else{
            return "wrong password";
        }
    }

    @Override
    public String changePassword(String oldPass, String newPass) {
        if(this.password.equals(oldPass)){
            this.password = newPass;
            return "Password Change Success";
        }else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateTotalInterest(int years) {

        double interest = (balance*rateOfInterest*years)/100;
        return interest;
    }
}
