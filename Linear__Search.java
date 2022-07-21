import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Linear__Search {
    public static void main(String[] args) throws Exception {
        long start2 = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int input = scanner.nextInt();
        FileInputStream fis = null;
        fis = new FileInputStream("I:\\test5.txt");
        byte[] bytes = fis.readAllBytes();
        String numberString = new String(bytes, StandardCharsets.UTF_8);
        String[] numberSplit = numberString.split("\\r?\\n ");
        boolean flag = false;
        int count = 0;
        int index = 0;
        for(int i=0;i<numberSplit.length;i++)
        {
            if(input==Integer.parseInt(numberSplit[i]))
            {
                flag = true;
                count++;
                index = i;
            }
            else if(input<Integer.parseInt(numberSplit[i]))
            {
                break;
            }
            }
        if(flag)
        {
            System.out.println("Number exists "+count+" times");
            System.out.println("Index of first occurrence: "+(index-count+1));
            System.out.println("Index of last occurrence: "+index);
        }
        else
        {
            System.out.println("Number doesn't exist in file");
        }
        fis.close();
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken to execute Linear Search: "+(end2-start2));
    }
}
