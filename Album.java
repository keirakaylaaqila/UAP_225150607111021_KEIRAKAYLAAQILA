import java.util.ArrayList;
//KEIRA KAYLA AQILA 225150607111021 (PERBAIKAN UAP)

public abstract class Album { 
    //Class ini digunakan sebagai superclass untuk class Boyband dan Girlband
    // di sini ada 1 method abstract yang digunakan untuk menampilkan lagu
   
    private String namaGroup; //Untuk nama group
    private ArrayList<String> lagu; //Arraylist untuk menampung lagu
    
    public String getNamaGroup() {
        return namaGroup;
    } 

    public void setNamaGroup(String namaGroup) {
        this.namaGroup = namaGroup;
    }

    public ArrayList<String> getLagu() {
        return lagu;
    }

    public void setLagu(ArrayList<String> lagu) {
        this.lagu = lagu;
    }

    public Album(String nama){
        this.namaGroup = nama;
    }

    public abstract void tampilkanLagu(); //method abstract
}