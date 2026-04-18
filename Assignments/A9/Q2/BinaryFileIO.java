import java.io.*;

public class BinaryFileIO {
    public void writeWithBuffer() {
        DataOutputStream output = null;
        long startTime = 0;
        try {
            output =
                    new DataOutputStream(new BufferedOutputStream( new FileOutputStream(new File(
                            "data.bin"))));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                int randNum = (int)(Math.random() * 9);
                output.writeInt(randNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("With Buffer: " + (endTime - startTime) + "ms");
    }

    public void writeWithoutBuffer() {
        DataOutputStream output = null;
        long startTime = 0;
        try {
            output =
                    new DataOutputStream(new FileOutputStream(new File(
                            "data.bin")));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                int randNum = (int)(Math.random() * 9);
                output.writeInt(randNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("With Buffer: " + (endTime - startTime) + "ms");
    }
}
