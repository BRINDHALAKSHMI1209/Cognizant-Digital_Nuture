public class UserService {

    public String getUserName() {
        return "Alice";   // Stubbed value
    }

    public static void main(String[] args) {
        UserService mockService = new UserService();

        System.out.println("Mocking and Stubbing Example");
        System.out.println("User Name: " + mockService.getUserName());
    }
}