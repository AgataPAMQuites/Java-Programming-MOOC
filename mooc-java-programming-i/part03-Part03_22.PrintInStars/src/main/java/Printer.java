
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int i = 0;
        
        if(array.length > 0){
            while (true) {
                int number = array[i];
                int x = number;

                while(true){
                    System.out.print("*");
                    x--;
                    if(x == 0){
                        break;
                    }
                }
                i++;
                System.out.println();
                if(i == array.length){
                    break;
                }
            }
        }
    }

}
