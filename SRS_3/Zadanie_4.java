import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Zadanie_4 {
    public static void main(String[] args) {
        ArrayList<Integer> ArList = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));
        Iterator<Integer> iterat = ArList.iterator();
        while (iterat.hasNext()) {
            if (iterat.next() % 2 == 0) {
                iterat.remove();
            }
        }
        for (int i = 0; i < ArList.size(); i++) {
            System.out.print(ArList.get(i) + " ");
        }
    }
}
