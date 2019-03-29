package strategyCreditCard;

public class Test {
    public static void main(String[] args) {
        ShoppingCard card=new ShoppingCard();
        Item item1=new Item("123",10);
        Item item2=new Item("456",40);
        card.addItem(item1);
        card.addItem(item2);
        card.pay(new PaypalStrategy("email@emaple.pl","my_password"));
        card.pay(new CreditCardStrategy("KUrname","534534","455","2019"));

    }
}
