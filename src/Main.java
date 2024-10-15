//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tablica tab = new Tablica(5);
        tab.wypelnij(1,10);
        tab.wyswietl();
        System.out.println(tab.maxymalnaWartosc());
        System.out.println(tab.minymalnaWartosc());
        System.out.println(tab.znajdzDrugaMax());
    }
}