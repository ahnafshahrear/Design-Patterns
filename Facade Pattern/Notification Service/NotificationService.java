public class NotificationService {
    String appID, key;

    public NotificationService(String appID, String key) {
        this.appID = appID;
        this.key = key;
    }

    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate(appID, key);
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}