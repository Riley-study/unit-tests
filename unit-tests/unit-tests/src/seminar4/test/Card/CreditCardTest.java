package Card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar4.Card.CreditCard;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class CreditCardTest {

    CreditCard creditCard;

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard("123456789", "John Silver",
                "31.12.2023", "777");
    }

    @Test
    void testGetCardNumber(){
        assertEquals("123456789", creditCard.getCardNumber());
    }

    @Test
    void testGetCardHolder() {
        assertEquals("John Silver", creditCard.getCardHolder());
    }

    @Test
    void testGetCardExpiryDate() {
        assertEquals("31.12.2023", creditCard.getExpiryDate());
    }

    @Test
    void testGetCardCVV() {
        assertEquals("777", creditCard.getCvv());
    }

    @Test
    void testCharge(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        creditCard.charge(1200.00);

        assertEquals("Charged amount 1200.0 from the card: 123456789", output.toString().trim());
        System.setOut(null);
    }


}
