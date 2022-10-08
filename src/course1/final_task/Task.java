package course1.final_task;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"abc", "dsa", "abc", "shtfsf", "abc", "ashdahk"};
        System.out.println(removeDuplicates(arr));
    }

    private static String removeDuplicates(String[] elems) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String elem : elems) {
            if (!map.containsKey(elem)) {
                map.put(elem, 1);
            }
        }

        String total = "";
        for (String elem : map.keySet()) {
            total += elem;
        }

        return total;
    }
}
