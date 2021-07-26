import java.io.*;
import java.util.*;

/* Создать и заполнить файл случайными целыми числами.
Отсортировать содержимое файла по возрастанию.*/

public class RandomNumbers {
    static File file = new File("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/Numbers.txt");

    public static void createFileWithRandomNumbers() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Random random = new Random();
        String line;
        int min = 1;
        int max = 100;
        int countOfLines = 0;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (countOfLines <= 20) {
                line = String.valueOf(random.nextInt(max - min + 1));
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line += Integer.parseInt(line) + min;
                countOfLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sort() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            ArrayList<Integer> listOfNumbers = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listOfNumbers.add(Integer.parseInt(line));
                System.out.println(line);
            }
            Collections.sort(listOfNumbers);
            System.out.println(listOfNumbers);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(String.valueOf(listOfNumbers));
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
