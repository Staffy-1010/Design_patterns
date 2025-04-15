public class ValidateReminder {
    public static boolean validateReminder(Reminder reminder) {
        int id = reminder.getId();
        String note = reminder.getNote();
        return id > 0 && !note.isBlank();
    }
}
