public class Main {
    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        var request = new HttpRequest("admin", "12345");
        server.handle(request);
    }
}