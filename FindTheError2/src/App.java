
public class App {

    public static void main(String[] args) throws Exception {
        // Create new dragon object and print initial info
        Dragon pete = new Dragon("Pete", 60);
        System.out.println("Your dragons name is " + pete.getName());
        System.out.println(pete);
        // System.out.println("🔥");

        // Dragon attack without fire (level < 70)
        pete.attack();

        // Gain experience, putting level above 70
        pete.setLevel(75);

        // Print dragon object
        System.out.println(pete);

        // Dragon attack with fire (level > 70)
        pete.attack();

    }
}
