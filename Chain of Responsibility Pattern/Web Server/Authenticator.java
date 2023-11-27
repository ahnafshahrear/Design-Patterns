public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = request.getUsername() == "admin" && request.getPassword() == "12345";
        System.out.println("Authentication");
        return !isValid; 
    }
}