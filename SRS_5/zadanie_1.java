import java.util.HashMap;

public class zadanie_1 {
    public static void main(String[] args) {
        String[] str_1 = new String[]{"leetcode","is","amazing","as","is"};
        String[] str_2 = new String[]{"amazing","leetcode","is"};
        int res =  countWords(str_1, str_2);
        System.out.println(res);
    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, int[]> common = new HashMap<>();
        int count = 0;

        for(int i = 0; i < words1.length; i++) {
            String word = words1[i];
            int[] counter = common.getOrDefault(word, new int[]{0, 0});
            counter[0]++;
            common.put(word, counter);
        }

        for(int i = 0; i < words2.length; i++) {
            String word = words2[i];
            int[] counter = common.getOrDefault(word, null);
            if(counter != null) {
                if(counter[0] == 1 && counter[1] == 0) {
                    count++;
                } else if(counter[0] == 1 && counter[1] == 1) {
                    count--;
                }
                counter[1]++;
            }
        }

        return count;
    }


}
