package Conditionals;

/**
 * Created by memoona on 7/25/17.
 */
public class UseConditionalStatement {
    public static void main(String[] args) {
        int value1= 58;
        int value2=59;
        if(value1>value2) {
            System.out.println("value1 is greater than value2");
            if (value1%2==0) {
                System.out.println("value1 is even");
            }else{
                System.out.println("value1 is odd");
            }
        }else{
            System.out.println("value2 is greater than value1");
            if (value2%2==0) {
                System.out.println("value2 is even");
            }else{
                System.out.println("value2 is odd");
            }
        }

    }




}



