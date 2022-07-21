import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Binary___Search {
    public static void main(String[] args) throws Exception {
        long start2 = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int input = scanner.nextInt();
        FileInputStream fis = null;
        fis = new FileInputStream("I:\\Non_Unique_Sorted_Selection_Sort.txt");
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        String numberString = new String(bytes, StandardCharsets.UTF_8);
        String[] numberSplit = numberString.split("\\r?\\n ");
        boolean flag = false;
        int count = 0;
        int first = 0;
        int last = numberSplit.length - 1;
        int mid;
        int index = 0;
        while (first <= last && !flag) {
            mid = (first+last)/2;
            if (input == Integer.parseInt((numberSplit[mid]))) {
                flag = true;
                count++;
                index = mid;
            } else if (input < Integer.parseInt((numberSplit[mid]))) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        if (flag) {
            System.out.println("Number exists " + count + " times");
            System.out.println("Element found at index: " + (index - count + 1));
//        System.out.println("Index of first occurrence: " + (index - count + 1));
//        System.out.println("Index of last occurrence: " + index);
        } else {
            System.out.println("Number doesn't exist in file");
        }
        fis.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken to execute Binary Search: " + ((end2 - start2)/1000 + " seconds"));
    }
}
