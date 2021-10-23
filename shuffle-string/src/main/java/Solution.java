import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public  String restoreString(String s, int[] indices) {

        Map<Integer, String> dictionary = new HashMap();
        String[] splitString = s.split("");

        for(var i = 0; i<splitString.length; i++){
            dictionary.put(indices[i], splitString[i]);
        }

        Arrays.sort(indices);
        var output = new StringBuilder();

        for (int index : indices) {
            output.append(dictionary.get(index));
        }

        return output.toString();
    }
}
