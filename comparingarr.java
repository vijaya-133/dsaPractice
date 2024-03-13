import java.util.Arrays;
public class comparingarr {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        System.out.println("we can't compare two arrays by using == comparon operator.");
        System.out.println(numbers == copyOfNumbers);
        // the ==, comparing operaotr doesn't work here
        System.out.println("-----------------");
        System.out.println("understanding for loop");
        for (int number = 1 ; number <= 10; number++){
            System.out.print(number + " ");
        }
        //for(initialization ; condition ; update){
        //loop body
        //}
        int numbers2[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int index = 0; index < numbers2.length ; index++){
            sum += numbers2[index];
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("-----------------");
        System.out.println("5 table");
        int number = 5;
        for(int multplier = 1; multplier < 10; multplier++){
            System.out.printf("%d X %d = %d \n", number,multplier,number*multplier);
        }
        
        
        

    }
}
