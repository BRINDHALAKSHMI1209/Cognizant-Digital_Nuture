public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton Pattern!");
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.displayMessage();

        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("Both objects refer to the same instance.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}