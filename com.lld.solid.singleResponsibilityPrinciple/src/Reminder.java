import java.util.ArrayList;
import java.util.List;


public class Reminder {
    private int id;
    private String note;
    private static List<Reminder> reminderList = new ArrayList<>();

    Reminder(){

    }

    Reminder(int id,String note){
        this.id = id;
        this.note = note;
    }

    public static List getReminderList(){
        return reminderList;
    }

    public int getId(){
        return this.id;
    }

    public String getNote(){
        return this.note;
    }

}
