import java.util.HashMap;

public class Part2 {

    HashMap<String, String> map = new HashMap<>();
    public String brigiFuggveny(String s) {

        return s.replace("one", "one1one")
                .replace("two", "two2two")
                .replace("three", "three3three")
                .replace("four", "four4four")
                .replace("five","five5five")
                .replace("six","six6six")
                .replace("seven", "seven7seven")
                .replace("eight","eight8eight")
                .replace("nine","nine9nine");

    }
}
