public class Main {
    public static void main(String[] args) {
        HandleCSV fileImport = new HandleCSV();

        try {
            fileImport.readFile("../interview-master/orders.csv");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}