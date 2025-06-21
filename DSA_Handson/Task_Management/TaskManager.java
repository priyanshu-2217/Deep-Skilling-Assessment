package Task_Management;

public class TaskManager {
    static Task head = null;

    public static void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    public static void showTasks() {
        Task temp = head;
        System.out.println("\nAll Tasks:");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Found: " + temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    public static void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task current = head;
        Task previous = null;

        while (current != null && current.taskId != id) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            previous.next = current.next;
            System.out.println("Task deleted.");
        }
    }

    public static void main(String[] args) {
        addTask(1, "Design UI", "Pending");
        addTask(2, "Build Backend", "In Progress");
        addTask(3, "Test App", "Pending");

        showTasks();

        System.out.println("\nSearching for task 2:");
        searchTask(2);

        System.out.println("\nDeleting task 2:");
        deleteTask(2);

        showTasks();
    }
}

