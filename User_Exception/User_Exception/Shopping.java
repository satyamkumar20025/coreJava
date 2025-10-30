package User_Exception;

public class Shopping {

    private int availableStock = 10;

    public Shopping(int availableStock) {
        this.availableStock = availableStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public void purchase(int quantity) throws InvalidQuatityException {
        if (quantity <= 0 || quantity > availableStock) {
            throw new InvalidQuatityException("Invalid quantity: " + quantity);
        } else {
            availableStock -= quantity;
            System.out.println("Purchase successful! Remaining stock: " + availableStock);
        }
    }

  
}