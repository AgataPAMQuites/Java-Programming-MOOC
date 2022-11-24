
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
 
      
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared){
        int thisPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        
        if(thisPrice > comparedPrice){
            return thisPrice - comparedPrice;
        } else {
            return comparedPrice - thisPrice;
        }    
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        
        if(thisPrice > comparedPrice){
            return true;
        } else {
            return false;
        }     
    }
    
}
