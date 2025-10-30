package AbstractQuestion;

public class ClothingOrder extends Online {

    String custname;
    String ordertype;

    public ClothingOrder(String custname, String ordertype) {
        this.custname = custname;
        this.ordertype = ordertype;
    }

    @Override
    public void ProcessOrder() {
        System.out.println("Processing clothing order for " + custname);
    }

    @Override
    public void ShipOrder() {
        System.out.println("Shipping clothing order to " + custname);
    }

    @Override
    public void display() {
        System.out.println("Customer name is " + custname);
    }

    public static void main(String[] args) {
        ClothingOrder vvv = new ClothingOrder("Satyam", "ClothingOrder");
        vvv.display();
        vvv.ProcessOrder();
        vvv.ShipOrder();

        ElectronicsOrder www = new ElectronicsOrder("Satyam", "ElectronicsOrder");
        www.display();
        www.ProcessOrder();
        www.ShipOrder();
    }
}