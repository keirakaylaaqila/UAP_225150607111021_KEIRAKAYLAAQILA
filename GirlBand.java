import java.util.ArrayList;
//KEIRA KAYLA AQILA 225150607111021 (PERBAIKAN UAP)

public class GirlBand extends Album{ //Class untuk boyband, dimana class ini adalah anak dari class Album.
    public GirlBand(String nama, String lagu1, String lagu2, String lagu3){
        super(nama);
        setLagu(new ArrayList<>());
        getLagu().add(lagu1);
        getLagu().add(lagu2);
        getLagu().add(lagu3);
    }
 
    @Override
    public void tampilkanLagu() { //Method Override dari class Album
        for (int i = 0; i < getLagu().size(); i++) {
            System.out.println( (i+1) + "." + getLagu().get(i));
        }
    }

    public void infoAlbum(){ //Digunakan untuk menampilkan info dari Album" girlband ini
        System.out.println(getNamaGroup());
        System.out.println("TOP 3 PLAYED SONG :");
        for (int i = 0; i < getLagu().size(); i++) {
            System.out.printf("%s. %s\n", i + 1, getLagu().get(i));
        }
    }
}
