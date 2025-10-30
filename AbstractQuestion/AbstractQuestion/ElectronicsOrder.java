package AbstractQuestion;

public class ElectronicsOrder extends Online {

    String custname;
    String ordertype;

    public ElectronicsOrder(String custname, String ordertype) {
        this.custname = custname;
        this.ordertype = ordertype;
    }

    @Override
    public void ProcessOrder() {
        System.out.println("Processing electronics order for " + custname);
    }

    @Override
    public void ShipOrder() {
        System.out.println("Shipping electronics order to " + custname);
    }

    @Override
    public void display() {
        System.out.println("Customer name is " + custname);
    }
}