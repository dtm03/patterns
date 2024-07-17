package templateMethodPattern;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FileProcessor {
    protected BufferedReader reader;
    protected BufferedWriter writer;

    // Template method
    public final void processFile(String inputFilePath, String outputFilePath) {
        try {
            openFile(inputFilePath, outputFilePath);
            readFile();
            processContents();
            writeFile();
        } finally {
            closeFile();
        }
    }

    // Concrete methods
    private void openFile(String inputFilePath, String outputFilePath) {
        try {
            reader = new BufferedReader(new FileReader(inputFilePath));
            writer = new BufferedWriter(new FileWriter(outputFilePath));
            System.out.println("Files opened successfully.");
        } catch (IOException e) {
            System.err.println("Error opening files: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private void closeFile() {
        try {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
            System.out.println("Files closed successfully.");
        } catch (IOException e) {
            System.err.println("Error closing files: " + e.getMessage());
        }
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void readFile();
    protected abstract void processContents();
    protected abstract void writeFile();
}
