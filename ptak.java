class Ptak extends Zwierze {
    private double rozpiętośćSkrzydeł;

    public Ptak(String nazwa, int wiek, double rozpiętośćSkrzydeł) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpiętośćSkrzydeł;
    }

    public double getRozpietoscSkrzydel() {
        return rozpiętośćSkrzydeł;
    }

    public String wydajDzwiek() {
        return "Ćwierkanie ptaka";
    }

    public String poruszSie() {
        return "Lata po niebie";
    }

    public void ptasiaMetoda() {
        System.out.println("To jest metoda tylko dla ptaka.");
    }
}
