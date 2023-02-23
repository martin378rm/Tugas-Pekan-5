public class Segitiga extends Matematika {
    @Override
    public void Rumus() {
        System.out.println("==== Rumus keliling dan luas segitiga ====");

        int keliling = 8 + 10 + 9; //( sisi A + sisi B + sisi C)
        System.out.println("keliling segitiga adalah " + keliling);

        double luas = 0.5 * 10 * 7; // (1/2 * alas * tinggi)
        System.out.println("luas segita adalah " + luas);
    }
}
