package day_25May2024.exception_handling;

public class Bank {
    String currency;
    Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

//    public Integer add(Bank other) throws Exception {
//        if(!other.currency.equalsIgnoreCase("INR")){
//            throw new Exception("Currency is not matching");
//        }
//        Integer sum = this.amount+other.amount;
//        return sum;
//    }

    public Integer add(Bank other) {
        try{
            if(!other.currency.equalsIgnoreCase("INR")){
                throw new Exception("Currency is not matching");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Integer sum = this.amount+other.amount;
        return sum;
    }
}
