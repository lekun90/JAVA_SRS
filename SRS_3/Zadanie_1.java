import java.util.ArrayList;
import java.util.Arrays;
public class Zadanie_1 {
    public static void main(String[] args) {
        ArrayList<Integer> ArList_1 = new ArrayList<>(Arrays.asList(1, 6, 3, 5, 7));
        ArrayList<Integer> ArList_2 = new ArrayList<>(Arrays.asList(1, 3, 3, 5, 7, 8));
        if (CompareArraysList(ArList_1, ArList_2) == true) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }
    }

    public static boolean CompareArraysList(ArrayList<Integer> ArrList_1, ArrayList<Integer> ArrList_2) {
        if (ArrList_1 == ArrList_2) {
            return true;
        }

        if (ArrList_1 == ArrList_2 || ArrList_1.size() != ArrList_1.size()) {
            return false;
        }

        for (int i = 0; i < ArrList_1.size(); i++) {
            if (ArrList_1.get(i) != ArrList_2.get(i)) {
                return false;
            }
        }

        return true;
    }
}
