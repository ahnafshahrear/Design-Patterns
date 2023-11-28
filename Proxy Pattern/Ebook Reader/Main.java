public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String[] fileNames = { "X", "Q", "Z", "A", "O" };

        for (String name : fileNames) {
            library.add(new EbookProxy(name));
        }

        library.openEbook("X");
    }
}