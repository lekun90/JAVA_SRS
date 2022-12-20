import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Zadanie_3 {
    public static void main(String[] args) {
        ArrayList<Integer> ArList = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));
        SortEvenNumber(ArList);
        for (int i = 0; i < ArList.size(); i++) {
            System.out.print(ArList.get(i) + " ");
        }
    }
    public static void SortEvenNumber(ArrayList<Integer> ArrList) {
        ArrayList<Integer> ArListEven = new ArrayList<>();
        for (int element : ArrList) {
            if (element % 2 == 0) {
                ArListEven.add(element);
            }
        }
        Collections.sort(ArListEven);
        int ind = 0;
        for (int i = 0; i < ArrList.size(); i++) {
            if (ArrList.get(i) % 2 == 0) {
                ArrList.set(i, ArListEven.get(ind));
                ind++;
            }
        }
    }
}
