package Message;

import org.junit.jupiter.api.Test;
import seminar4.Message.MessageService;
import seminar4.Message.NotificationService;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    @Test
            void setNotificationServiceTest() {
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        messageService.sendMessage("Hi", "John");
        verify(messageService, times(1)).sendMessage("Hi", "John");
    }
}
