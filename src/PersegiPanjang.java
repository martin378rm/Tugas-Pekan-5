public class PersegiPanjang extends Matematika {

    @Override
    public void Rumus() {
        System.out.println("==== Rumus keliling dan luas persegi panjang ====");

        int keliling = 2*(10+5); // (2 * (p + l))
        System.out.println("keliling persegi panjang adalah " + keliling);

        int luas = 10 * 5; // (p * l)
        System.out.println("luas persegi panjang adalah " + luas);
    }
}
