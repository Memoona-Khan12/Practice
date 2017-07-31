package array;

import java.util.Scanner;

/**
 * Created by memoona on 7/31/17.
 */
public class UseArray {
    public static void main(String[] args) {
        BuildArray build=new BuildArray();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your array limit: ");
        int limit=sc.nextInt();
        int [] array=build.setArray(limit);
        build.retreiveArray(array);
        try{
            if(sc!=null) {
                sc.close();
            }
            }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
