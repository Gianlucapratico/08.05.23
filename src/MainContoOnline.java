
public class MainContoOnline {
    public static void main(String[] args) {
        ContoOnLine contoOnline = new ContoOnLine("Mario Rossi", 1000.0, 500.0);

        try {
            contoOnline.preleva(700.0);
        } catch (BancaException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        contoOnline.stampaSaldo();
    }
}

