import java.util.*;
import java.util.Arrays;

public class Soal4 {
    public static void countFreq(int arr[], int n)
    {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};

        Map<Integer, Integer> mp = new HashMap<>();
        int count_dis=0;

        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
    }
}
