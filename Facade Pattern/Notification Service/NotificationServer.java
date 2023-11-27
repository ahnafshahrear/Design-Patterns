public class NotificationServer {
    //... connect() -> Connection
    //... authenticate(appID, key) -> AuthToken
    //... sent(authToken, message, target)
    //... connection.disconnet()

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Message sent");
    }
}