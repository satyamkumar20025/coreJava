package Interface_question;


public class StorageDemo {
    public static void main(String[] args) {
        Storage dbStorage = new DatabaseStorage();
        dbStorage.save("User Info");
        System.out.println(dbStorage.load());

        Storage fileStorage = new FileStorage();
        fileStorage.save("Document Data");
        System.out.println(fileStorage.load());
    }
}