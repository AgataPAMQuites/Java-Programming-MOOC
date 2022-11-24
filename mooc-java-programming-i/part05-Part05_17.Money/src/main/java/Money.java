
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;
        
        Money newMoney = new Money(newEuros, newCents);  
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros() < compared.euros()){
            return true;
        } else if (this.euros() == compared.euros() && this.cents() < compared.cents()){
            return true;
        } else {
            return false;
        }   
    } 
    
    public Money minus(Money decreaser){
        int newEuros = euros - decreaser.euros;
        int newCents = cents - decreaser.cents;
        if(newCents < 0 && newEuros > 0){
            newEuros--;
            newCents += 100;
        } else if(newEuros < 0){
            newCents = 0;
            newEuros = 0;
        } else if(newCents <= 0 && newEuros <= 0){
            newCents = 0;
            newEuros = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);  
        
        return newMoney;
    }
    
}
     
           
        
    
    

