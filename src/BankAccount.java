public class BankAccount {
    double amount;
    public void deposit(double sum){
        amount+=sum;
    }


    public void withDraw(int sum) throws LimitException{
        if(sum>amount){
            throw  new LimitException("Сумма превышает баланс счета", amount);
        }
        amount-=sum;
    }


    public double getAmount() {
        return amount;
    }
    public void withDrawRemainingAmount()throws LimitException {
        withDraw((int) amount);
    }

}


