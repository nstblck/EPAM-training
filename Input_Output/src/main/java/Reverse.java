import java.io.*;
import java.util.Scanner;

/* Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки
 */

public class Reverse {
    static File fileInput = new File("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/before_replacing.txt");
    static File reverse = new File("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/Reverse.txt");

    public void reverseCharsFromCode() throws IOException {
        try {
            fileInput.createNewFile();
            reverse.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (fileInput.exists()) {
            Scanner scanner = new Scanner(fileInput);
            PrintWriter printWriter = new PrintWriter(reverse);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuffer buffer = new StringBuffer(line);
                buffer = buffer.reverse();
                String reverseLine = buffer.toString();
                printWriter.println(reverseLine);
            }
            scanner.close();
            printWriter.close();
        }
    }
}