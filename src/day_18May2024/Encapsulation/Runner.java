package day_18May2024.Encapsulation;

public class Runner {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setAccountNo("ICICI123",true);
        System.out.println(b1.getAccountNo(true));
        Bank b2 = new Bank();
        b2.setAccountNo("SBI523",false);
        System.out.println(b2.getAccountNo(false));
    }
}

class Bank{
    private String accountNo;
    private long balance;
    private String nominee;

    public String getAccountNo(boolean isAuth) {
        if(isAuth) {
            return accountNo;
        }
        else return "Not Allowed";
    }

    public void setAccountNo(String accountNo, boolean isAuth) {
        if(isAuth) {
            this.accountNo = accountNo;
        }
        else System.out.println("Not allowed");
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }
}
