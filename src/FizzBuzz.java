import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {

    static List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> results = new ArrayList<>();
        while (i <= n) {
            results.add(i % 15 == 0 ? "FizzBuzz" : (i % 3 == 0 ? "Fizz" : (i % 5 == 0 ?  "Buzz" : String.valueOf(i))));
            ++i;
        }
        return results;
    }

    public static void main(String[] args) {
        FizzBuzz.fizzBuzz(1);
    }

}

