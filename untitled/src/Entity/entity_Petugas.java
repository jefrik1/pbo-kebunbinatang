package Entity;

public class entity_Petugas extends entity_Biodata{
    private String id;
    private String nama;
    private String pass;

    public entity_Petugas(String nama, String status,String id, int umur, String pass)
    {
        super(umur,status);
        this.nama = nama;
        this.id = id;
        this.pass = pass;
    }

    public void cetak()
    {
        System.out.println("nama      : "+this.nama);
        System.out.println("status    : "+this.status);
        System.out.println("ID        : "+this.id);
        System.out.println("umur      : "+this.umur);
        System.out.println("Pass      : "+this.pass);
        System.out.println("------------------------");
    }

    public String getId() {
        return id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
}