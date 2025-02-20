package core_programming.string.level1_problems;

public class NullPointerDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
