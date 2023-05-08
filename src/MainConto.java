
public class MainConto {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Mario Rossi", 1000.0);
        try {
            conto.preleva(1500.0);
        } catch (BancaException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        System.out.println("Saldo: " + conto.restituisciSaldo());
    }
}
