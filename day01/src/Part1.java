public class Part1 {

    protected String filterString(String inputString) {
        StringBuilder sb = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c + "");
            }
        }

        return sb.toString();
    }

    protected int getValue(String inputString) {
        int value = 0;
        String result = "";
        var array = inputString.toCharArray();
        result += array[0];
        result += array[array.length - 1];

        value = Integer.parseInt(result);

        return value;
    }

}
