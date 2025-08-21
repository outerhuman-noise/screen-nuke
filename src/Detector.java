public class Detector {
    private static String os;

    public Detector() {
        os = System.getProperty("os.name").toLowerCase();
    }

    public String getOS() {
        return os;
    }
}