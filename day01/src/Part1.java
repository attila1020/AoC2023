public class Part1 {

    protected String filterString(String inputString) {
        return inputString.replaceAll("[^\\d]", "");
    }

    protected int getValue(String inputString) {
        int value;
        String result = "";
        var array = inputString.toCharArray();
        result += array[0];
        result += array[array.length - 1];

        value = Integer.parseInt(result);

        return value;
    }

}
