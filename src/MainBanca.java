
public class MainBanca {

    public static void main(String[] args) {
        try {
            // codice che può sollevare una BancaException
            throw new BancaException("Saldo insufficiente per completare la transazione");
        } catch (BancaException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

