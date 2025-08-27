import java.util.Arrays;
import java.util.Scanner;

public class TwoSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите массив чисел через пробел (можно несортированный):");
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Массив пустой.");
            return;
        }

        String[] parts = line.split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Введите целевую сумму:");
        String targetLine = sc.nextLine().trim();
        int target = Integer.parseInt(targetLine);
     
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break; // если нужно найти все пары — убрать break
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("Пара не найдена.");
        }
    }
}
