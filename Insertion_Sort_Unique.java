import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Insertion_Sort_Unique {
    public Insertion_Sort_Unique() throws FileNotFoundException {
    }

    public static void main(String[] args) throws Exception {
        long start2 = System.currentTimeMillis();
        File fis = new File("G:\\Unique.txt");
        File  f = new File("G:\\Unique_Insertion_Sort_new.txt");
    ArrayList<Integer> s = new ArrayList<Integer>();
Scanner sc = new Scanner(fis);
while(sc.hasNextLine()){
    int num = Integer.parseInt(sc.nextLine());
    s.add(num);
}
        System.out.println(s);
    int[] arr = new int[s.size()];
    for(int i=0;i<s.size();i++){
        arr[i] = s.get(i);
    }
    for (int  i = 0; i < arr.length; i++) {
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]=key;
    }
        for (int k : arr) {
            System.out.println(k);
        }
    if (f.createNewFile()){
        System.out.println("File Created");
    }
    else{
        System.out.println("File already exists");
    }
    FileWriter fw = new FileWriter(f.getAbsolutePath());
        for (int j : arr) {
            fw.write((j) + "\n ");
        }

    fw.close();
    sc.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken to sort file in Insertion Sort: "+(end2-start2));
    }
}








