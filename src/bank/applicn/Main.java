package bank.applicn;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFCBank.rateOfInterest = 6;

        SBI ac1 = new SBI(100000,"123","DEV");
        SBI ac2 = new SBI(150000,"456","Rakshit");
        HDFCBank ac3 = new HDFCBank(150000,"789","Mehran");

        int bal = ac1.checkBalanace("124");
        System.out.println("the bal for ac1 is "+bal);

        int balC = ac1.checkBalanace("123");
        System.out.println("the bal for ac1 is "+balC);

        String bnkMess = ac2.addMoney(50000);
        System.out.println(bnkMess);

        String message = ac3.withDrawn(50000,"1234");
        System.out.println(message);

        String message1 = ac3.withDrawn(50000,"789");
        System.out.println(message1);

        double interest = ac1.calculateTotalInterest(20);
        System.out.println("the total interest you will get "+interest);

        double interest1 = ac3.calculateTotalInterest(20);
        System.out.println("the total interest you will get "+interest1);
    }
}