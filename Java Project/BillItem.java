public class BillItem {
    private int sequenceNumber;
    private Menu menu;
    private int quantity;
    private int total;

    public int getTotal() {
        return total;
    }

    public BillItem(int sequenceNumber, int menuId, int quantity) {
        this.sequenceNumber = sequenceNumber;
        Menu[] menuItems = Menu.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i].getId() == menuId) {
                this.menu = menuItems[i];
            }
        }
        this.quantity = quantity;
        this.total = menu.getPrice() * quantity;
    }

    public void display() {

        System.out
                .println(sequenceNumber + " " + menu.getName() + " " + menu.getPrice() + " " + quantity + " " + total);
    }

    public static void main(String[] args) {
        BillItem bilItem = new BillItem(1, 1, 3);
        bilItem.display();
    }

}
