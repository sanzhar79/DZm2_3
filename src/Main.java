public class Main {
    public static void main(String[] args) {
BankAccount account= new BankAccount();
account.deposit(15000);
    try{
        while(true){
            account.withDraw(6000);
            System.out.println("снятие со счета 6000 сом.");
            System.out.println("текущий баланс: "+account.getAmount());
        }
    } catch (LimitException e) {
        System.out.println("исключение. оставшаяся сумма: "+ e.getRemainingAmount() );
        try {
            account.withDrawRemainingAmount();
            System.out.println("Снятие оставшейся суммы: "+ account.getAmount());
            System.out.println("текущий баланс: "+ account.getAmount());
        }catch (LimitException ex){
            System.out.println("исключение при выводе");
        }
    }
    }
}