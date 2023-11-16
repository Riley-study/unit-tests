import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar5.number.MaxNumberModule;
import seminar5.number.RandomNumberModule;
import seminar5.order.OrderService;
import seminar5.order.PaymentService;
import seminar5.user.UserRepository;
import seminar5.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest5 {
    RandomNumberModule randList;
    MaxNumberModule maxNum;

    //5.1

    @BeforeEach
    void setUp(){
        randList = new RandomNumberModule();
        maxNum = new MaxNumberModule();

    }
    @Test
    void randomNumberTest(){
        List<Integer> result = randList.generate(6);

        assertThat(result.size()).isEqualTo(6);
    }

    @Test
    void maxNumberTest(){
        List <Integer> testList = new ArrayList<>(Arrays.asList(81,21,38,84,54,66));
        int max = maxNum.findMax(testList);

        assertThat(max).isEqualTo(84);
    }

    @Test
    void integrationTest(){
        List<Integer> result = randList.generate(6);

        assertThat(maxNum.findMax(result)).isEqualTo(Collections.max(result));
    }

    //5.2

    @Test
    void userServiceIntegrationTest(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        userService.getUserName(1);

        assertThat(userService.getUserName(1)).isEqualTo("User 1");

    };

    // 5.3

    @Test
    void orderServiceTest(){
        OrderService order = new OrderService(new PaymentService());

        assertThat(order.placeOrder("1",100.00)).isTrue();
    }
}
