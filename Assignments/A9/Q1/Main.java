import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtils fileUtils = new FileUtils();

        long size = fileUtils.length("test.txt");
        System.out.println(size);

//        fileUtils.createRandomFile();

//        // Create a test file to split
//        PrintWriter pw = new PrintWriter("test.txt");
//        pw.println("line 1");
//        pw.println("line 2");
//        pw.println("line 3");
//        pw.println("line 4");
//        pw.println("line 5");
//        pw.close();
//
//    // Now test your split
//        FileUtils fu = new FileUtils();
//        fu.split("test.txt", 2);
//    // Should create test1.txt (lines 1-2), test2.txt (lines 3-4), test3.txt (line 5)

        fileUtils.createDirectories();
    }
}
