import java.io.*;
import java.time.LocalDate;

public class FileUtils {
    public long length(String path) {
        long size = 0;
        File file = new File(path);

        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                if (file.isFile()) {
                    return file.length();
                } else {
                    File[] files = file.listFiles();
                    for (File f : files) {
                        size += length(f.getAbsolutePath());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return size;
    }

    public String createRandomFile() throws IOException {
        StringBuilder sb = new StringBuilder();
        char randomChar;

        for (int i = 0; i < 15; i++) {
            int choice = (int)(Math.random() * 2);

            if (choice == 0) {
                // random lowercase letter
                randomChar = (char) ('a' + (int)(Math.random() * 26));
            } else {
                // random uppercase letter
                randomChar = (char) ('A' + (int)(Math.random() * 26));
            }

            sb.append(randomChar);
        }

        String fileName = sb.toString() + ".txt";

        File file = new File(fileName);
        file.createNewFile();

        return file.getAbsolutePath();
    }

    public void split(String fileName, int n) {
        BufferedReader input = null;
        PrintWriter output = null;
        boolean flag = true;

        try {
            input = new BufferedReader(new FileReader(fileName));

            int i = 0;
            while (flag) {
                try {
                    output =
                            new PrintWriter(new BufferedWriter(new FileWriter("fileName" + (i+1) + ".txt")));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for (int j = 0; j < n; j++) {
                    String line = input.readLine();
                    if (line == null) {
                        flag = false;
                        break;
                    }

                    output.println(line);
                }
                output.close();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createDirectories() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        String path = year + "/" + month + "/" + day;

        File file = new File(path);
        file.mkdirs();
    }
}
