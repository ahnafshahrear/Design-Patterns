public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }    
}