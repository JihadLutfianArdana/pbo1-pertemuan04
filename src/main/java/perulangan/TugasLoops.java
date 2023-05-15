package perulangan;

public class TugasLoops {
    public static void main(String[] args) {
        int mulaiDownload = 0;
        int ukuran = 500;
        
        System.out.println("Start Download = " + mulaiDownload + "kb");
        System.out.println("Size File Sebesar = " + ukuran + "kb");
        
        while (mulaiDownload != ukuran){
            mulaiDownload++;
            System.out.println("Sedang Mendownload . . .");
            System.out.println("Size File Sekarang = " + mulaiDownload + "kb");
    }
        System.out.println("Final = Download Selesai = " + mulaiDownload + "kb");
    }
}
