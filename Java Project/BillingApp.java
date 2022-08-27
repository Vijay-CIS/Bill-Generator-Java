import java.util.Scanner;

public class BillingApp {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("====");
        Menu[] menuItems = Menu.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            menuItems[i].display();

        }
        System.out.println("====");

        boolean itemsAvailable = true;
        Scanner input = new Scanner(System.in);
        Bill bill = new Bill("26-July-2022");
        do {
            System.out.println("Enter Menu Id:");
            int menuId = input.nextInt();
            System.out.println("Quantity:");
            int quantity = input.nextInt();
            bill.addItem(menuId, quantity);
            System.out.println("More items Available? (Y/N)");
            itemsAvailable = input.next().charAt(0) == 'y';
        } while (itemsAvailable);
        bill.display();
    }

}