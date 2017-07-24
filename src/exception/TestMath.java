package exception;

/**
 * Created by memoona on 7/24/17.
 */
public class TestMath {
    public static void main(String[] args) {
        Math math = new Math();
        int result=0;
        try{
            result = math.division(10, 4);
            System.out.println(result);
        }catch(Exception ex){
        System.out.println("You are dividing a number by zero");
        ex.printStackTrace();
    }finally{
            System.out.println("Let's clean up the resources");
        }
}
}
