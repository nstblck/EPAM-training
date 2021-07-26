import java.io.*;

public class Directory {

    static String dirName = "/Users/user/IdeaProjects/EPAM_training/Aircompany";
    static File folder = new File("/Users/user/IdeaProjects/EPAM_training/Aircompany");

    public static String printDirectory(File folder) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder isn't a directory!");
        }
        int indentation = 0;
        StringBuilder stringBuild = new StringBuilder();
        printDirectory(folder, indentation, stringBuild);
        return stringBuild.toString();
    }

    private static void printDirectory(File folder, int indentation, StringBuilder stringBuild) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder isn't a directory!");
        }
        stringBuild.append(getIndentString(indentation));
        stringBuild.append("+--");
        stringBuild.append(folder.getName());
        stringBuild.append("/");
        stringBuild.append("\n");
        for (File fl : folder.listFiles()) {
            if (fl.isDirectory()) {
                printDirectory(fl, indentation + 1, stringBuild);
            } else {
                printFile(fl, indentation + 1, stringBuild);
            }
        }
    }

    private static void printFile(File folder, int indentation, StringBuilder stringBuild) {
        stringBuild.append(getIndentString(indentation));
        stringBuild.append("+--");
        stringBuild.append(folder.getName());
        stringBuild.append("\n");
    }

    private static String getIndentString(int indentation) {
        StringBuilder stringBuild = new StringBuilder();
        for (int i = 0; i < indentation; i++) {
            stringBuild.append("|  ");
        }
        return stringBuild.toString();
    }
}