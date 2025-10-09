import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    void testEmailNotificationSend() {
        Notification email = new EmailNotification("anna@example.com", "Meeting Reminder");
        email.send();
        assertTrue(outContent.toString().contains(
            "Sending EMAIL to anna@example.com with subject: Meeting Reminder"));
    }

    @Test
    void testSMSNotificationSend() {
        Notification sms = new SMSNotification("John", "+34600111222");
        sms.send();
        assertTrue(outContent.toString().contains(
            "Sending SMS to John at phone number: +34600111222"));
    }

    @Test
    void testPushNotificationSend() {
        Notification push = new PushNotification("user123");
        push.send();
        assertTrue(outContent.toString().contains(
            "Sending PUSH notification to user123"));
    }

    @Test
    void testPolymorphism() {
        Notification email = new EmailNotification("eva@test.com", "Polymorphism Test");
        Notification sms = new SMSNotification("Carlos", "+34600999888");
        Notification push = new PushNotification("student001");

        email.send();
        sms.send();
        push.send();

        String result = outContent.toString();
        assertTrue(result.contains("Sending EMAIL to eva@test.com with subject: Polymorphism Test"));
        assertTrue(result.contains("Sending SMS to Carlos at phone number: +34600999888"));
        assertTrue(result.contains("Sending PUSH notification to student001"));
    }
}
