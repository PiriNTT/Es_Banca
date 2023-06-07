public class Banca {
    private String nome;
    private double saldo;
    public Banca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void aggiungiSaldo(double i) {
        saldo += i;
    }
    public void prelevaSaldo(double i) {
        if(saldo > i) {
            saldo -= i;
        } else {
            System.out.println("Il saldo diventerebbe negativo. Non prelevo niente");
        }
    }
    public void effettuaTransazione(double importo, boolean prelievo) {
        if(prelievo) {
            prelevaSaldo(importo);
        } else {
            aggiungiSaldo(importo);
        }
    }
    public void mostraSaldo() {
        System.out.println(this.saldo);
    }

}
