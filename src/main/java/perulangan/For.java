package perulangan;

//Perulangan For

public class For {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;
        
        System.out.println("Isi Gelas Sekarang = " + isiGelas + "ml");
        System.out.println("Isi Gelas Ketika Penuh = " + penuh + "ml");
        
        for(isiGelas = 0; isiGelas <= penuh; isiGelas++){
            System.out.println("Sedang Mengisi Gelas. . .");
            System.out.println("Isi Gelas Sekarang = " + isiGelas + "ml");
        }
        System.out.println("Final = Isi Gelas Sekarang = " + isiGelas + "ml");
    }
}
