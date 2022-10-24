import java.util.Arrays;

public class Soal6 {
    public static void main(String[] args) {
        Integer[] input = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = 0;
        for (int i = 0; i < input.length; i++) {
            Integer[] inputSlice = Arrays.copyOfRange(input, i, i + k);

            int total = 0;
            for (int j = 0; j < inputSlice.length; j++) {
                if (inputSlice[j] != null) {
                    total += inputSlice[j];
                }
            }

            if (total > result) {
                result = total;
            }
        }

        System.out.println("Output : " + result);
    }
}
