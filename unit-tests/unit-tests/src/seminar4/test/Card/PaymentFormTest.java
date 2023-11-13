package Card;

import org.junit.jupiter.api.Test;
import seminar4.Card.CreditCard;
import seminar4.Card.PaymentForm;

import static org.mockito.Mockito.*;

public class PaymentFormTest {
/*
    Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы
    оплаты на сайте. Вместо реальной кредитной карты используйте мок-объект.
1. Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`,
            `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
            2. Создайте класс `PaymentForm` с методом `pay(double amount)`.
            3. В тестовом классе, создайте мок-объект для класса `CreditCard`.
            4. Определите поведение мок-объекта с помощью метода `when()`.
            5. Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
            6. Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()` */

    @Test
    void testPay(){
        CreditCard creditCard = mock(CreditCard.class);
        PaymentForm pf = new PaymentForm(creditCard);

        pf.pay(1200.00);
        verify(creditCard).charge(1200.00);

    }

}
