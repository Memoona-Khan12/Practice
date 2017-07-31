package switchstatement;

/**
 * Created by memoona on 7/25/17.
 */
public class Week {
    Day day;
    public Week(){

    }
    public Week(Day day){
        this.day=day;

    }
    public void taskToDo(Day day){
        switch(day){

            case MONDAY:
                System.out.println("Homework");
             break;
            case TUESDAY:
                System.out.println("codelab");
                break;
            case WEDNESDAY:
                System.out.println("submit work");
                break;
            case THURSDAY:
                System.out.println("readings");
                break;
            case FRIDAY:
                System.out.println("Practice Git");
                break;
            case SATURDAY:
                System.out.println("review lecture");
                break;
            case SUNDAY:
                System.out.println("review lecture");
                break;
            default:
                System.out.println("Not a valid day");
                break;

        }
    }


}
