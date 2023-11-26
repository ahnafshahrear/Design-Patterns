public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("The SpreadSheet value updated. Value = " + value);
    }
}