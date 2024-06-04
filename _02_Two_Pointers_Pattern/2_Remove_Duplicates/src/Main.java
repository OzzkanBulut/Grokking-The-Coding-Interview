import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 11};
//        System.out.println(getUniqueElementsWithSet(arr));
        System.out.println(removeDuplicates(arr));
    }

    // Solution by using Sets
    public static int getUniqueElementsWithSet(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        for (Integer num : arr) {
            mySet.add(num);
        }
        return mySet.size();
    }

    // Solution with two pointers
    public static int removeDuplicates(int[] arr) {
        // 2 3 3 11
        int nextNonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;


    }

}