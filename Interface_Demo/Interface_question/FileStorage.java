package Interface_question;


//File Storage Implementation
class FileStorage implements Storage {
private String fileData;

@Override
public void save(String data) {
   fileData = data;
   System.out.println("Data saved in File: " + data);
}

@Override
public String load() {
   return "Data loaded from File: " + fileData;
}
}
