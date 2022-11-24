import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
    //  int[] array = {3, 1, 5, 99, 3, 12};
        
    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
    MainProgram.sort(numbers);    
    
    }

    
    public static int smallest(int [] array){
        int smallest = 0;
        boolean isfirst = true;
        for(int theInt: array){
            if(isfirst == true){
                smallest = theInt;
                isfirst = false;
            } else {
                if(theInt < smallest){
                    smallest = theInt;
                }
            }            
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int [] array){
        int smallest = 0;
        int indexOfsmallest = 0;
        int count = 0;
        boolean isfirst = true;
        
        for(int theInt: array){
            if(isfirst == true){
                smallest = theInt;
                isfirst = false;
            } else {
                if(theInt < smallest){
                    smallest = theInt;
                    count++;
                    indexOfsmallest = count;                    
                } else {
                    count++;
                }
            }            
        }
        return indexOfsmallest;
    }
    
    public static int indexOfSmallestFrom(int [] array, int startIndex){
        int smallest = 0;
        int indexOfsmallestFrom = 0;
        int count = 0;
        
        boolean isfirst = true;    
        
        
        for(int theInt: array){
            if(count >= startIndex){            
                if(isfirst == true){
                    smallest = theInt;
                    isfirst = false;
                    indexOfsmallestFrom = count;
                    count++;
                } else {
                    if(theInt < smallest){
                        smallest = theInt;                        
                        indexOfsmallestFrom = count;     
                        count++;
                    } else {
                        count++;
                    }
                }            
            } else {
                count++;                                        
            }
        }    
        return indexOfsmallestFrom;
    }    
    
    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];
        
        array[index1] = number2;
        array[index2] = number1;
    }

    public static void sort(int [] array){
        int i = 0;
        
        while (i < array.length) {            
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
            i++;
        }
    }
    

}
