package course7.final_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("Война и мир", "Лев Николаевич Толстой");
        books.put("Капитанская дочка", "Александр Сергеевич Пушкин");
        books.put("Бойцовский клуб", "Чак Паланик");

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : books.entrySet()) {
            String elem = "\"" + entry.getKey() + "\" " + entry.getValue();
            result.add(elem);
            System.out.println(elem);
        }


    }
}
