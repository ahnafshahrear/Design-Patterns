public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();

        var sheet = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet);
        dataSource.addObserver(chart);

        dataSource.setValue(01);
    }
}