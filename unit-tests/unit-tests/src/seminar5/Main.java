package seminar5;


import seminar5.number.MaxNumberModule;
import seminar5.number.RandomNumberModule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomNumberModule randList = new RandomNumberModule();
        List<Integer> result = randList.generate(6);
        System.out.println("result = " + result);
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int max = maxNumberModule.findMax(result);
        System.out.println(max);
    }
}
