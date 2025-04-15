public class Main {
    public static void main(String[] args) {
        ReminderUtils reminderObj = new ReminderUtils();
        Reminder reminder = new Reminder(101,"hello");
        reminderObj.addReminder(reminder);
        PrintReminder pr = new PrintReminder();
        pr.printList();
        reminderObj.removeReminder(0);
        pr.printList();
        System.out.println("done");
    }
}