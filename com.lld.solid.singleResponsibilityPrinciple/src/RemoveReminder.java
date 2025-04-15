import java.util.List;

public class RemoveReminder {
    public void removeReminder(int idx){
        List reminderList = Reminder.getReminderList();
        if(idx >= reminderList.size())return;
        reminderList.remove(idx);
    }
}
