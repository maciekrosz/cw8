public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Ssak("Lew", 5, "Gęste");
        Zwierze orzel = new Ptak("Orzeł", 3, 2.4);
        Zwierze wez = new Gad("Wąż", 2, true);

        Zwierze[] zwierzeta = { lew, orzel, wez };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println(" ");
        }
    }
}