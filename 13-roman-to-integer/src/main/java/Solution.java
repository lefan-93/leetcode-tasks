import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, Integer> dictionary = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public int romanToInt(String s) {

        String[] chars = s.split("");
        var result = 0;

        for (var i = 0; i < chars.length; ) {
            if (i != chars.length - 1) {
                switch (chars[i]) {
                    case "I": {
                        if (chars[i + 1].equals("V")) {
                            result += dictionary.get("V") - 1;
                            i = i + 2;
                            break;
                        }
                        if (chars[i + 1].equals("X")) {
                            result += dictionary.get("X") - 1;
                            i = i + 2;
                            break;
                        } else {
                            result += dictionary.get("I");
                            i++;
                            break;
                        }
                    }
                    case "V": {
                        result += dictionary.get("V");
                        i++;
                        break;
                    }
                    case "X": {
                        if (chars[i + 1].equals("L")) {
                            result += dictionary.get("L") - dictionary.get("X");
                            i = i + 2;
                            break;
                        }
                        if (chars[i + 1].equals("C")) {
                            result += dictionary.get("C") - dictionary.get("X");
                            i = i + 2;
                            break;
                        } else {
                            result += dictionary.get("X");
                            i++;
                            break;
                        }
                    }
                    case "L": {
                        result += dictionary.get("L");
                        i++;
                        break;
                    }
                    case "C": {
                        if (chars[i + 1].equals("D")) {
                            result += dictionary.get("D") - dictionary.get("C");
                            i = i + 2;
                            break;
                        }
                        if (chars[i + 1].equals("M")) {
                            result += dictionary.get("M") - dictionary.get("C");
                            i = i + 2;
                            break;
                        } else {
                            result += dictionary.get("C");
                            i++;
                            break;
                        }
                    }
                    case "D": {
                        result += dictionary.get("D");
                        i++;
                        break;
                    }
                    case "M": {
                        result += dictionary.get("M");
                        i++;
                        break;
                    }
                    default:
                        break;
                }
            } else {
                result += dictionary.get(chars[i]);
                i++;
            }
        }
        return result;
    }
}
