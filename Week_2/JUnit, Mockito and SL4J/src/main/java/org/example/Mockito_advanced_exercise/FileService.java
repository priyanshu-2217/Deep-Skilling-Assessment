package src.main.java.org.example.Mockito_advanced_exercise;

public class FileService {
    private final FileReader reader;
    private final FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {
        String content = reader.read();
        writer.write("Processed " + content);
        return "Processed " + content;
    }
}
