import java.util.Arrays;
//Performs deep copy, 
// when the original array changes, 
// the copied array doesn't change
public class deepCopy {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};

        int startingIndex = 1;
        int endingIndex = 4;
        int copyOfNumbers[] = Arrays.copyOfRange(numbers,startingIndex,endingIndex);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        
    }
}
