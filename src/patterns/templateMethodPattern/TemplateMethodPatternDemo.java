package patterns.templateMethodPattern;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        // Example for text file processing using example path
        FileProcessor textProcessor = new TextFileProcessor();
        textProcessor.processFile("input.txt", "output.txt");
    }
}
