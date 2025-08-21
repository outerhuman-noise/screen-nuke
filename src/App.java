
public class App {
    static Detector detect = new Detector();
    static String os;
    public static void main(String[] args) throws Exception {
        os = detect.getOS();

        System.out.println(os);
    }
}
