package course2.lesson9;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phonebook = new HashMap<>();

    public void addNote(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public void printNotes() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            sb.append(entry.getKey()).append(" ---> ").append(entry.getValue()).append('\n');
        }
        System.out.println(sb);
    }
}
