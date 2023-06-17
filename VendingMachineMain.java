import java.util.ArrayList;
import java.util.Scanner;
//KEIRA KAYLA AQILA 225150607111021 (PERBAIKAN UAP)

public class VendingMachineMain {
    public static Scanner input = new Scanner(System.in); //Digunakan untuk inputan
    public static ArrayList<Album> boyBand = new ArrayList<Album>(); //Menyimpan arrayGroup Boyband
    public static ArrayList<Album> girlBand = new ArrayList<Album>(); //Menyimpan arrayGroup Girlband
    public static Album pilihanAlbum; //Menyimpan objek Album yang dipilih oleh user
    public static String nama = null; 
    //Untuk menyimpan nama dari user, dibuat null untuk filter bila user tidak memilih untuk menampilkan nama
    public static void main(String[] args) {
        addAlbum();//Memanggil method untuk mengisi ArrayList
        System.out.println("==============================================");
        System.out.println("SELAMAT DATANG DI VENDING MACHINE ALBUM K-POP");
        System.out.println("==============================================");
        System.out.print("TEKAN ENTER UNTUK MENGGUNAKAN..."); input.nextLine();
        System.out.println("==============================================");
        System.out.print("PILIH JENIS ALBUM :\n1. Boy Band\n2. Girl Band\nPilihan : ");//Memilih jenis Album boy/girl band
        int pilihan = input.nextInt();
        System.out.println("==============================================");
        switch (pilihan) {
            case 1:
                System.out.println("PILIH ALBUM BOY BAND YANG ANDA INGINKAN : ");//Memilih album dari boyband
                for (int i = 0; i < boyBand.size(); i++) {
                    System.out.printf("%s. %s\n", i + 1, boyBand.get(i).getNamaGroup());
                }
                System.out.print("Pilihan Album : "); pilihanAlbum = boyBand.get(input.nextInt() - 1);
                break;
            case 2:
                System.out.println("PILIH ALBUM GIRL BAND YANG ANDA INGINKAN : ");//Memilih album dari girlband
                for (int i = 0; i < girlBand.size(); i++) {
                    System.out.printf("%s. %s\n", i + 1, girlBand.get(i).getNamaGroup());
                }
                System.out.print("Pilihan Album : "); pilihanAlbum = girlBand.get(input.nextInt() - 1);
                break;        
            default:
                break;
        }
        input.nextLine();
        System.out.println("==============================================");
        System.out.print(">>>TEKAN ENTER UNTUK LANJUT..."); input.nextLine();
        System.out.println("==============================================");
        System.out.println("APAKAH ANDA INGIN MENULISKAN NAMA ANDA PADA ALBUM?");//Memilih akan menulis nama atau tidak
        System.out.print("1 untuk YA, 0 untuk TIDAK : "); int tulisNama = input.nextInt(); input.nextLine();
        if (tulisNama == 1) {
            System.out.print("MASUKKAN NAMA ANDA : "); nama = input.nextLine();   
        }
        if (nama == null) {
            albumTanpaNama();
        } else {
            albumDenganNama(nama);
        }
    }

    public static void addAlbum(){//Method untuk mengisi ArrayList
        boyBand.add(new BoyBand("EXO", "Love Shot", "Monster", "Kokobop"));
        boyBand.add(new BoyBand("BTS", "Spring Day", "We Are Bulletproof : The Eternal", "Mikrokosmos"));
        boyBand.add(new BoyBand("SEVENTEEN", "Home", "Don't Wanna Cry", "Ready to Love"));
        boyBand.add(new BoyBand("NCT", "BOSS", "My Everything", "Life is Still Going On"));
        boyBand.add(new BoyBand("TXT", "Run Away", "Fairy of Shampoo", "20cm"));
        boyBand.add(new BoyBand("X1", "FLASH", "Pretty Girl", "MOVE"));
        boyBand.add(new BoyBand("DAY6", "You Make Me", "Love Me or Leave Me", "Zombie"));
        boyBand.add(new BoyBand("STRAYKIDS", "Taste", "Chill", "Maniac"));
        boyBand.add(new BoyBand("ENHYPEN", "Future Perfect", "Shout Out", "Polaroid Love"));
        boyBand.add(new BoyBand("The Boyz", "Thrill Ride", "ROAR", "The Stealer"));

        girlBand.add(new GirlBand("BLACKPINK", "Kill This Love", "FLOWER", "All Eyes On Me"));
        girlBand.add(new GirlBand("TWICE", "TT", "Pop", "Likey"));
        girlBand.add(new GirlBand("AESPA", "Girls", "Life's Too Short", "Illusion"));
        girlBand.add(new GirlBand("IVE", "Blue Blood", "I Am", "Heroine"));
        girlBand.add(new GirlBand("G(I)-DLE", "Nxde", "Tomboy", "My Bag"));
        girlBand.add(new GirlBand("RED VELVET", "Birthday", "Celebrate", "Feel My Rhythm"));
        girlBand.add(new GirlBand("SNSD", "FOREVER 1", "Lucky Like That", "Seventeen"));
        girlBand.add(new GirlBand("NEW JEANS", "OMG", "Ditto", "Zero"));
        girlBand.add(new GirlBand("LE SSERAFIM", "FEARLESS", "Blue Flame", "Antifragile"));
        girlBand.add(new GirlBand("SECRET NUMBER", "TAP", "SLAM", "Fire Saturday"));
        
    }

    public static void albumDenganNama(String nama) {//Digunakan untuk menampilkan Album dengan Nama
        System.out.println("==============================================");
        if (pilihanAlbum instanceof BoyBand) {
            ((BoyBand)pilihanAlbum).infoAlbum();
        }
        else if (pilihanAlbum instanceof GirlBand) {
            ((GirlBand)pilihanAlbum).infoAlbum();
        }
        System.out.printf("%46s\n", nama);
        System.out.println("==============================================");
    }

    public static void albumTanpaNama(){//Digunakan untuk menampilkan Album tanpa Nama
        System.out.println("==============================================");
        if (pilihanAlbum instanceof BoyBand) {
            ((BoyBand)pilihanAlbum).infoAlbum();
        }
        else if (pilihanAlbum instanceof GirlBand) {
            ((GirlBand)pilihanAlbum).infoAlbum();
        }
        System.out.println("==============================================");
    }
}