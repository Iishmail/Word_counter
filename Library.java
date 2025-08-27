import java.util.Scanner;

public class Library {
    static String[] books = new String[100];
    static int[] ids = new int[100];
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Добавить книгу");
            System.out.println("2 - Список книг");
            System.out.println("3 - Найти книгу по ID");
            System.out.println("4 - Удалить книгу");
            System.out.println("0 - Выход");

            int choice = sc.nextInt();
            sc.nextLine(); // убрать \n

            if (choice == 1) {
                System.out.println("Введите название книги:");
                String title = sc.nextLine();
                books[size] = title;
                ids[size] = size + 1;
                size++;
                System.out.println("Книга добавлена с ID = " + size);
            } else if (choice == 2) {
                if (size == 0) {
                    System.out.println("Библиотека пуста");
                } else {
                    for (int i = 0; i < size; i++) {
                        System.out.println("ID: " + ids[i] + ", Title: " + books[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.println("Введите ID книги:");
                int id = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (ids[i] == id) {
                        System.out.println("ID: " + ids[i] + ", Title: " + books[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Книга не найдена");
                }
            } else if (choice == 4) {
                System.out.println("Введите ID книги для удаления:");
                int id = sc.nextInt();
                boolean deleted = false;
                for (int i = 0; i < size; i++) {
                    if (ids[i] == id) {
                        // сдвигаем массив
                        for (int j = i; j < size - 1; j++) {
                            books[j] = books[j + 1];
                            ids[j] = ids[j + 1];
                        }
                        size--;
                        deleted = true;
                        System.out.println("Книга удалена");
                        break;
                    }
                }
                if (!deleted) {
                    System.out.println("Книга не найдена");
                }
            } else if (choice == 0) {
                System.out.println("Выход...");
                break;
            } else {
                System.out.println("Неверный выбор");
            }
        }
    }
}
