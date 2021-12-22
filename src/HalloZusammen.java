public class HalloZusammen {

    public static void sayHello(String[] names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Archer", "Kirk", "Picard", "Sisko", "Janeway"};
        sayHello(names);
    }
}
