public class EmailNotification extends Notification {
    private String subject;

    public EmailNotification(String recipient, String subject) {
        super(recipient);
        // TODO: assign subject
    }

    @Override
    public void send() {
        // TODO: print "Sending EMAIL to <recipient> with subject: <subject>"
    }
}
