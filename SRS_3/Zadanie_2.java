import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie_2 {
    public static void main(String[] args) {
        ArrayList<Integer> ArList_1 = new ArrayList<>(Arrays.asList(1, 6, 3, 5, 7));
        ArrayList<Integer> ArList_2 = new ArrayList<>(Arrays.asList(1, 3, 3, 5, 7, 5));
        int num = 3;
        if (OccursCompareNumber(ArList_1, ArList_2,num) == true) {
            System.out.println("Число num встречается в обоих массивах одинаковое кол-во раз");
        } else {
            System.out.println("Число num встречается в обоих массивах не одинаковое кол-во раз");
        }

    }
    public static boolean OccursCompareNumber(ArrayList<Integer> ArrList_1, ArrayList<Integer> ArrList_2, int num) {
        int count_1 = 0;
        int count_2 = 0;
        for (int element : ArrList_1) {
            if (element == num) {
                count_1++;
            }
        }
        for (int element : ArrList_2) {
            if (element == num) {
                count_2++;
            }
        }
        if (count_1 == count_2) {
            return true;
        } else {
            return false;
        }
    }
}
