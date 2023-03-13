package bank.applicn;

public interface BankInter {

    public int  checkBalanace(String Password);
    public String addMoney(int money);
    public String withDrawn(int money,String password);
    public String changePassword(String oldPass,String newPass);
    public double calculateTotalInterest(int years);


}
