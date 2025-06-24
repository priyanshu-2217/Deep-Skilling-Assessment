package Library_Management;

import java.util.Arrays;

public class Library {
    static Book[] books = new Book[5];

    public static void main(String[] args) {
        books[0] = new Book(1, "A Tale of Two Cities", "Charles Dickens");
        books[1] = new Book(2, "Harry Potter", "J.K. Rowling");
        books[2] = new Book(3, "The Hobbit", "J.R.R. Tolkien");
        books[3] = new Book(4, "War and Peace", "Leo Tolstoy");
        books[4] = new Book(5, "Pride and Prejudice", "Jane Austen");

        System.out.println("Linear Search for 'Harry Potter':");
        linearSearch("Harry Potter");

        // Sort books array by title before binary search
        Arrays.sort(books, (b1, b2) -> b1.title.compareToIgnoreCase(b2.title));

        System.out.println("\nBinary Search for 'War and Peace':");
        binarySearch("War and Peace");
    }

    public static void linearSearch(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + b);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void binarySearch(String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = title.compareToIgnoreCase(books[mid].title);
            if (result == 0) {
                System.out.println("Found: " + books[mid]);
                return;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Book not found.");
    }
}

