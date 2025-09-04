import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int n = z.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = z.nextInt();
        }

        int val = n / 2;
        Map<Integer, Integer> freq = new HashMap<>();

        int max = 0, idx = -1;
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (freq.get(num) > max) {
                max = freq.get(num);
                idx = num;
            }
        }

        if (max > val) {
            System.out.println(idx);
        } else {
            System.out.println("No Majority Element");
        }

        z.close();
    }
}
