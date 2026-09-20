
public class App {
    public static void main(String[] args) throws Exception {
        String[] nombres = {
            "Alfaro Salcedo, José Antonio",
            "Borja Zegarra, Ronal Wilian",
            "Contreras Montes, Giancarlo Diego Lorenzo",
            "Leonardo Rojas, Cesar Nilver"
        };

        String[] codigos = {
            "N00568937",
            "N00054847",
            "N00069440",
            "N00372810"
        };

        System.out.println("Presentado por:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("- %-45s (%s)%n", nombres[i], codigos[i]);
        }
    }
}
