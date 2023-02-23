public class Main {
    public static void main(String[] args) {

        // insa
        Matematika matematika = new Matematika();
        Matematika persegi = new Persegi();
        Matematika persegiPanjang = new PersegiPanjang();
        Matematika segitiga = new Segitiga();
        Matematika lingkaran = new Lingkaran();



        matematika.Rumus();
        System.out.println("\n");
        persegiPanjang.Rumus();
        System.out.println("\n\n");
        persegi.Rumus();
        System.out.println("\n\n");
        segitiga.Rumus();
        System.out.println("\n\n");
        lingkaran.Rumus();
    }
}
