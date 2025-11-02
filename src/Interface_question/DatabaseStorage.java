package Interface_question;
//Database Storage Implementation
class DatabaseStorage implements Storage {
 private String databaseData;

 @Override
 public void save(String data) {
     databaseData = data;
     System.out.println("Data saved in Database: " + data);
 }

 @Override
 public String load() {
     return "Data loaded from Database: " + databaseData;
 }
}
