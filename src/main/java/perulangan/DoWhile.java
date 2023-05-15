package perulangan;

//Perulangan Do While

public class DoWhile {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;
        
        System.out.println("Isi Gelas Sekarang = " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh = " + penuh + "ml");
        
        do {
            isiGelas++;
            System.out.println("Sedang Mengisi Gelas. . .");
            System.out.println("Isi Gelas Sekarang = " + isiGelas + "ml");
        } while (isiGelas != penuh);
        
        System.out.println("Final = Isi Gelas Sekarang = " + isiGelas + "ml");
    }
}
