import java.util.ArrayList;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt(); 
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n;i++){
            int key = arr[i];
            int count = 0;
            for(int j = 0; j< n; j++){
                if(arr[j]==key){
                    count++;
                }
            }
            if(count > 1){
                boolean flag = true;
                for(int k = 0;k<al.size();k++){
                    if (al.get(k) == key) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.println("repeated key is "+key);
                    al.add(key);
                }
                
            }
        }

    }
}
