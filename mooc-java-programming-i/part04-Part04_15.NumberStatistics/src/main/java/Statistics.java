
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){        
    }
    
    public void addNumber(int number){
        count++;
        sum += number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(count > 0){
            return (double)sum / count;
        } else {
            return 0.0;
        }    
    }
}
