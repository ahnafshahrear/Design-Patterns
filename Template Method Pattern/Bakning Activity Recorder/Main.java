public class Main {
    public static void main(String[] args) {
        TransferMoneyTask task1 = new TransferMoneyTask();
        task1.execute();
        GenerateReportTask task2 = new GenerateReportTask();
        task2.execute();
    }
}