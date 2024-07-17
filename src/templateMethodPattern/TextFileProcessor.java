package templateMethodPattern;

import java.io.IOException;

public class TextFileProcessor extends FileProcessor {
    private StringBuilder contents = new StringBuilder();

    @Override
    protected void readFile() {
        System.out.println("Reading text file");
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                contents.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    @Override
    protected void processContents() {
        System.out.println("Processing text file contents");
        // Example processing: converting to uppercase
        String processedContents = contents.toString().toUpperCase();
        contents = new StringBuilder(processedContents);
    }

    @Override
    protected void writeFile() {
        System.out.println("Writing processed contents to text file");
        try {
            writer.write(contents.toString());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}

