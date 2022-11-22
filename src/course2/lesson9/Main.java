package course2.lesson9;

import java.util.*;

public class Main {
    private static final Map<String, Integer> map = new HashMap<>();

    private static Random random = new Random();

    public static void main(String[] args) {
        task5();
    }

    private static void task1() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNote("Иванов И", "79852738593");
        phoneBook.addNote("Петров О", "+79833748291");
        phoneBook.addNote("Галунов Б", "8(956)2749205");
        phoneBook.addNote("Васильев К", "7-999-214-57-43");
        phoneBook.addNote("Годунов В", "7 995 341 1245");
        phoneBook.addNote("Папахов Д", "+7-940-342 15 55");
        phoneBook.addNote("Ломов К", "+89340275821");
        phoneBook.addNote("Корягин М", "79053489502");
        phoneBook.addNote("Долотов Е", "+9034829194");
        phoneBook.addNote("Вагонов В", "83487291048");
        phoneBook.addNote("Залетов А", "+7(904)4347892792");
        phoneBook.addNote("Коновалов В", "34934908248");
        phoneBook.addNote("Красильников Н", "380248293048238");
        phoneBook.addNote("Забетов А", "4594095928092");
        phoneBook.addNote("Енисеев О", "52878592385");
        phoneBook.addNote("Лачугин З", "98352098529038592");
        phoneBook.addNote("Качков Х", "3290509237582");
        phoneBook.addNote("Работягин Д", "350372095328");
        phoneBook.addNote("Джугашвили И", "8397528573902");
        phoneBook.addNote("Ульянов В", "9039582805");
        phoneBook.printNotes();
    }

    private static void task2() {
        Recipe omlet = new Recipe("Омлет");

        omlet.addProduct(new Product("Яйцо", 60.0), 3);
        omlet.addProduct(new Product("Молоко", 70.0), null);
        System.out.println(omlet);
    }

    private static void task3() {
        addToMap("str1", 2);
        System.out.println(map);
        addToMap("str2", 1);
        System.out.println(map);
//        addToMap("str1", 2);
//        System.out.println(map);
        addToMap("str1", 5);
        System.out.println(map);
    }

    private static void addToMap(String str, int number) {
        if (Objects.equals(map.get(str), number)) {
            throw new IllegalArgumentException("Ключ с таким значением уже есть в словаре!");
        }

        map.put(str, number);
    }

    private static void task4() {
        Map<String, List<Integer>> map1 = new HashMap<>();
        String str = "";
        List<Integer> list;
        for (int i = 0; i < 5; i++) {
            str = "string" + (i + 1);
            list = new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
            map1.put(str, list);
        }
        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>();
        int sum;
        for (Map.Entry<String, List<Integer>> entry : map1.entrySet()) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += entry.getValue().get(i);
            }
            map2.put(entry.getKey(), sum);
        }
        System.out.println(map2);
    }

    private static void task5() {
        Map<Integer, String> map1 = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, "index " + i);
        }
        System.out.println(map1);
    }
}
