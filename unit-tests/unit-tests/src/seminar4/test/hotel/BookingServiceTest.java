package hotel;

import org.junit.jupiter.api.Test;
import seminar4.hotel.BookingService;
import seminar4.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingServiceTest {
    @Test
    void testService(){
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(hotelService.isRoomAvailable(anyInt())).thenReturn(false,true);
        assertEquals(false, bookingService.bookRoom(0));
        assertEquals(true, bookingService.bookRoom(1));
    }

    @Test
    void test2(){
        HotelService g = mock(HotelService.class);
        BookingService b = new BookingService(g);
        when(g.isRoomAvailable(anyInt()))
                .thenAnswer(inv->{
                    int roomNumber= inv.getArgument(0);
                    return roomNumber%2==0;
                });

        assertTrue(b.bookRoom(2));
        assertFalse(b.bookRoom(1));
    }
}
