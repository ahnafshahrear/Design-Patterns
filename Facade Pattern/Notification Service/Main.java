public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService("ID", "X");
        service.send("Hello World!", "101.67.01.124");
    }
}