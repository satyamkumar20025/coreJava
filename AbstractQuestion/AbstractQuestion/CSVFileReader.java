package AbstractDemo;

public class CSVFileReader extends FileReader {
    @Override
    void readfile(String path) {
        System.out.println("CSVFileReader path: " + path);
    }

    public static void main(String[] args) {
        CSVFileReader reader = new CSVFileReader();
        reader.readfile("Satyam dom");
    }
}