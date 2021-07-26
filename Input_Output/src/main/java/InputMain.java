import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class InputMain {
    private static List<File> files = new ArrayList<>();
    static File folder = new File("/Users/user/IdeaProjects/EPAM_training/Aircompany");

    public static void main(String[] args) throws IOException {
        String dirName = "/Users/user/IdeaProjects/EPAM_training/Aircompany";
        File file = new File(dirName);

        // task main, Tree/F
        Directory directory = new Directory();
        FileWriter writer = new FileWriter("/Users/user/IdeaProjects/EPAM_training/Input_Output/Data/directory_tree.txt");
        directory.printDirectory(new File(dirName));
        writer.write(directory.printDirectory(folder));
        writer.close();

        List<File> myFiles = listingFromFiles(file);
        myFiles.forEach(System.out::println);
        Directory.printDirectory(file);

        // task replace public to private
        PublicToPrivate publicToPrivate = new PublicToPrivate();
        publicToPrivate.replacePublicToPrivate();

        // task заполнение и сортировка рандомных чисел в файле
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.createFileWithRandomNumbers();
        randomNumbers.sort();

        //task reverse
        Reverse reverse = new Reverse();
        reverse.reverseCharsFromCode();
    }

    public static List<File> listingFromFiles(File file) {
        File[] fileList = file.listFiles();
        for (File fl : fileList) {
            if (fl.isFile()) {
                files.add(fl);
            } else if (fl.isDirectory()) {
                files.add(fl);
                listingFromFiles(fl);
            }
        }
        return files;
    }
}