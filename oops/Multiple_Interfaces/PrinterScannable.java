package Multiple_Interfaces;

//Implement both interfaces in a single class
class PrinterScanner implements Printable, Scannable {
 public void print() {
     System.out.println("Printing document...");
 }

 public void scan() {
     System.out.println("Scanning document...");
 }



}


