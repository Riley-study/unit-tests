import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    @Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
        // Act
        String result = iteratorMock.next() + " " + iteratorMock.next();
        // Assert
        assertEquals("Hello World", result);

    }
}
