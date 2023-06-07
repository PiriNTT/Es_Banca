public class Main {
    public static void main(String[] args) {
        Banca banca1 = new Banca("Banca_XYZ");
        banca1.mostraSaldo();
        banca1.effettuaTransazione(1000,false);
        banca1.effettuaTransazione(500,true);
        banca1.mostraSaldo();

    }
}
