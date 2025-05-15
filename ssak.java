class Ssak extends Zwierze {
    private String futro;

    public Ssak(String nazwa, int wiek, String futro) {
        super(nazwa, wiek);
        this.futro = futro;
    }

    public String getFutro() {
        return futro;
    }

    public String wydajDzwiek() {
        return "Ryk ssaka";
    }

    public String poruszSie() {
        return "Biega na czterech nogach";
    }

    public void ssakowaMetoda() {
        System.out.println("To jest metoda tylko dla ssaka.");
    }
}