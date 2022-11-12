package course2.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    public static void chessboard() {
        List<List<String>> biDemArrList = new ArrayList<>();
        String white = "◯";
        String black = "●";
        String element;
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    element = white;
                }
                else {
                    element = black;
                }
                biDemArrList.get(i).add(j, element);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
