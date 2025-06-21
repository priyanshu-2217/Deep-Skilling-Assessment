package Sorting_Custormer_Order;

public class SortOrders {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {
        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Ravi", 1500.50),
                new Order(102, "Anita", 700.00),
                new Order(103, "Rohit", 2500.75),
                new Order(104, "Meena", 1200.00)
        };

        System.out.println("🔵 Orders (Unsorted):");
        printOrders(orders);

        System.out.println("\n🔶 Orders Sorted by Bubble Sort:");
        bubbleSort(orders);
        printOrders(orders);

        Order[] orders2 = {
                new Order(101, "Ravi", 1500.50),
                new Order(102, "Anita", 700.00),
                new Order(103, "Rohit", 2500.75),
                new Order(104, "Meena", 1200.00)
        };

        System.out.println("\n🟢 Orders Sorted by Quick Sort:");
        quickSort(orders2, 0, orders2.length - 1);
        printOrders(orders2);
    }
}

