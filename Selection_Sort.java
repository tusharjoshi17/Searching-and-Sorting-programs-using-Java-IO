import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) throws Exception {
        File fis = new File("G:\\Unique.txt");
        File f = new File("G:\\Unique_Sorted_Selection_Sort_new.txt");
        long start2 = System.currentTimeMillis();
        ArrayList<Integer> s = new ArrayList<Integer>();
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            int num = Integer.parseInt(sc.nextLine());
            s.add(num);
        }
        int[] arr = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            arr[i] = s.get(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int k : arr) {
            System.out.println(k);
        }
        if (f.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File already exists");
        }
        FileWriter fw = new FileWriter(f.getAbsolutePath());
        for (int j : arr) {
            fw.write((j) + "\n ");
        }
        fw.close();
        sc.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken to sort file in Selection Sort: "+(end2-start2));

    }
}
