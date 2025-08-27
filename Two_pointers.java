import java.util.Scanner;

public class TwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите массив чисел через пробел:");
        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int[] result = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyExists = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == result[j]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.print("Результат: [");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
