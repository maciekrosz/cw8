class Gad extends Zwierze {
    private boolean jadowity;

    public Gad(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public boolean isJadowity() {
        return jadowity;
    }

    public String wydajDzwiek() {
        return "Syczący dźwięk";
    }

    public String poruszSie() {
        return "Pełza po ziemi";
    }

    public void gadziaMetoda() {
        System.out.println("To jest metoda tylko dla gada.");
    }
}