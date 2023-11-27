public class Main {
    public static void main(String[] args) {
        storeInformation(new CloudStream());
        storeInformation(new EncryptedCloudStream(new CloudStream()));
        storeInformation(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
        storeInformation(new CompressedCloudStream(new CloudStream()));
    }

    public static void storeInformation(Stream stream) {
        stream.write("Hello Gang of 4...");
    }
}