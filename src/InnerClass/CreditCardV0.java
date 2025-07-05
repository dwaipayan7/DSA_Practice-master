package InnerClass;

public class CreditCardV0 implements Payment{

    private String creditCardNumber;

    @Override
    public void pay(double amount) {
        System.out.println("Paid: "+amount+" Credit Card Amount");
    }
}
