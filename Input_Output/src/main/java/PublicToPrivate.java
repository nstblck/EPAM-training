import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Прочитать текст Java-программы и все слова public в объявлении атрибутов
 и методов класса заменить на слово private.*/

public class PublicToPrivate {
    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";

    public void replacePublicToPrivate() throws IOException {
        File file = new File("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/before_replacing.txt");
        File result = new File("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/after_replacing.txt");

        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(result))) {
                String line;
               while ((line =bufferedReader.readLine())!=null) {
                    bufferedWriter.append(line.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                }
            }
        }
    }
}
