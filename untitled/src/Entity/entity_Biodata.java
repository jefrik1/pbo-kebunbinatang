package Entity;

public class entity_Biodata {
    int umur;
    String status;
    public entity_Biodata(int umur,String status)
    {
        this.umur = umur;
        this.status = status;
    }

    public int getNama() {
        return umur;
    }

    public String getStatus() {
        return status;
    }
}