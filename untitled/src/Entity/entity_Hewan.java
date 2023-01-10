package Entity;

public class entity_Hewan extends entity_Biodata{
    private String jenis;
    public entity_Hewan( String jenis, int umur, String status)
    {
        super(umur, status);
        this.jenis = jenis;
    }
    public void cetak()
    {
        System.out.println("Jenis           : "+this.jenis);
        System.out.println("Umur            : "+this.umur);
        System.out.println("Status          : "+this.status);
        System.out.println("--------------------------------");
    }
    public int setUmur(int umur){
        this.umur = umur;
        return umur;
    }
    public int getUmur(){
        return umur;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}