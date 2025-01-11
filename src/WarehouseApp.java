
import java.util.List;
//Modify WarehouseApp:
//
//    Complete the startDeliveryThread() method to start a thread with the
//    DeliveryManager instance.
//    DeliveryManager instance.
//    Update main() to use startDeliveryThread() instead of calling
//    sortShipment() and printInventory() directly.
public class WarehouseApp {

    private static DeliveryManager deliveryWarehouse1;

    /**
     * Main method that starts the application.
     * @param args not used.
     */
    public static void main(String [] args) {
        System.out.println("WarehouseApp thread started.");

        startDeliveryThread(DeliveryTruck.deliverPackages());

    }

    /**
     * Starts the delivery thread up. (Needs to be completed.)
     * @param packages Delivered packages.
     */
    public static void startDeliveryThread(List<WarehousePackage> packages) {

        // Create and start the delivery thread here.
        // Use the provided DeliveryManager class and its methods.
        // Ensure that the thread starts and runs concurrently with the main thread.
        // The thread should manage the incoming packages, sort them, and print their inventory.
        // You can use any synchronization mechanisms to ensure thread safety.
        //
        // Note: You may need to create additional classes and methods to implement this feature.
        //
        // Example:
        // DeliveryManager deliveryManager = new DeliveryManager(packages);
        // Thread deliveryThread = new Thread(deliveryManager);
        // deliveryThread.start();


    deliveryWarehouse1 = new DeliveryManager(packages);
    Thread deliveryThread = new Thread(deliveryWarehouse1);
    deliveryThread.start();


    }

    public DeliveryManager getDeliveryWarehouse1() {
        return deliveryWarehouse1;
    }
}
