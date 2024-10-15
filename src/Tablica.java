import java.util.Arrays;
import java.util.Random;

public class Tablica {

    private int[] tablica;
    private int rozmiar;

    public Tablica(int rozmiar) {
        this.rozmiar = rozmiar;
        tablica = new int[rozmiar];
    }

    public void wypelnij(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = random.nextInt(max - min + 1) + min;
        }
    }
    public void wyswietl(){
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();
    }

    public int maxymalnaWartosc() {
        int max = tablica[0];
        for (int liczba : tablica) {
            if (liczba > max) {
                max = liczba;
            }
        }
        return max;
    }

    public int minymalnaWartosc() {
        int min = tablica[0];
        for (int liczba : tablica) {
            if (liczba < min) {
                min = liczba;
            }
        }
        return min;
    }

    public int znajdzDrugaMax() {
        int drugaMax = 0;

        int max = tablica[0];
        for (int liczba : tablica) {
            if (liczba > max) {
                max = liczba;
            }
        }

        for (int liczba : tablica) {
            if (liczba > max) {
                drugaMax = max;
                max = liczba;
            } else if (liczba > drugaMax && liczba != max) {
                drugaMax = liczba;
            }
        }
        return drugaMax;
    }
}
