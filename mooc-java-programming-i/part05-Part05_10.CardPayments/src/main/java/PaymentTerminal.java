
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.5) {
            return payment;
        } else {
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
            
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment       
    }

    public boolean eatAffordably(PaymentCard card) {
        if(card.takeMoney(2.5)){
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(card.takeMoney(4.3)){
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }        
    }
     
    public double eatHeartily(double payment) {
         if (payment < 4.3) {
            return payment;
        } else {
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment        
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
