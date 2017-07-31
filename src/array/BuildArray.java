package array;
import java.util.Scanner;


/**
 * Created by memoona on 7/31/17.
 */
public class BuildArray {

        public  int[] setArray(int limit){

        int[] numberList = new int[limit];
        System.out.println("Please enter a number to add to the array.");
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < numberList.length; j++){
            numberList[j] = sc.nextInt();
    }
            try{
                if(sc!=null) {
                    sc.close();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        return numberList;
        }
        public void retreiveArray(int [] array){

        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);

    }

    }

