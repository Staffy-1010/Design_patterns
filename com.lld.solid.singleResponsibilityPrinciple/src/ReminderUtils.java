import java.util.List;

public class ReminderUtils {

    public void addReminder(Reminder reminder){
        boolean isValid = ValidateReminder.validateReminder(reminder);
        List reminderList = Reminder.getReminderList();
        if(isValid) {
            reminderList.add(reminder);
        }
        else
        throw new RuntimeException("not right");
    }

    public void removeReminder(int idx){
        List reminderList = Reminder.getReminderList();
        if(idx >= reminderList.size())return;
        reminderList.remove(idx);
    }
}
