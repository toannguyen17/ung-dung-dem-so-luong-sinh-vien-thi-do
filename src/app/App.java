package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int size;
        Scanner scanner = new Scanner(System.in);
        // Nhập độ dài mảng
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
            System.out.println("Size should not exceed 30");
        } while (size > 30);
        
        // Nhập danh sách điểm
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {   
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // print
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
