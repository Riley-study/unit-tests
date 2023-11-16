package seminar5.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public List<Integer> generate(int length) {
        List <Integer> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(new Random().nextInt(100));
        }
        return result;
    }
}
