package headphone;

public class Hp{

    private String id;
    private String nama;
    private String merek;
    private String tipe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Hp(String id, String nama, String merek, String tipe) {
        this.id = id;
        this.nama = nama;
        this.merek = merek;
        this.tipe = tipe;
    }

    public boolean equals(Object object) {
        Hp temp = (Hp) object;
        return id.equals(temp.getId());
    }
}