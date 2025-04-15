import java.util.List;

public class PrintReminder {
    public void printList(){
        List<Reminder> reminderList = Reminder.getReminderList();
        reminderList.forEach(reminder -> {
            System.out.println(toString(reminder));
        });
    }

        private String toString(Reminder reminder) {
        return "converted";
    }
}
