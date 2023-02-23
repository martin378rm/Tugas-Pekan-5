public class Lingkaran extends Matematika {
    @Override
    public void Rumus() {
        System.out.println("==== Rumus keliling dan luas lingkaran");

        double keliling = 2 * Math.PI * 7; // (2 * pi * r)
        System.out.printf("keliling lingkaran adalah %.2f\n" , keliling );

        double luas = Math.PI * 7 * 7; // (pi * r * r)
        System.out.printf("luas lingkaran adalah %.2f\n" , luas);
    }
}
