package model;
import java.util.ArrayList;

import Entity.entity_Hewan;
import Entity.entity_Petugas;
public class model_hewan {
    public static ArrayList<entity_Petugas> daftarPetugas = new ArrayList<>();
    public static ArrayList<entity_Hewan> daftarHewan = new ArrayList<>();


    public static void initialpetugas() {
        daftarPetugas.add(new entity_Petugas("Wildan", "aktif", "11111", 34, "1234"));
        daftarPetugas.add(new entity_Petugas("Jefri", "aktif", "22222", 27, "9876"));

    }

    public static void initalhewan() {
        daftarHewan.add(new entity_Hewan("Panda", 7, "Sehat"));
        daftarHewan.add(new entity_Hewan("Kucing", 9, "Sakit"));
        daftarHewan.add(new entity_Hewan("Gajah", 15, "Sehat"));
        daftarHewan.add(new entity_Hewan("Elang", 6, "Sakit"));
        daftarHewan.add(new entity_Hewan("Hiu", 17, "Sehat"));
        daftarHewan.add(new entity_Hewan("Ular", 12, "Sakit"));
    }

    public static int banyakData(){
        return daftarHewan.size();
    }
    public static void lihatData(){
        for(entity_Hewan hewan : daftarHewan){
            System.out.println("-------------------------------");
            System.out.println("Jenis Hewan   : " + hewan.getJenis());
            System.out.println("Umur Hewan    : " + hewan.getUmur());
            System.out.println("Status Hewan  : " + hewan.getStatus());
            System.out.println("-------------------------------");
        }
    }
    public static void tambahData(String jenis, int umur, String status){
        entity_Hewan hwn = new entity_Hewan(jenis,umur,status);
        daftarHewan.add(hwn);
    }
    public static entity_Hewan cariData(String jenis){
        for (entity_Hewan hewan : daftarHewan){
            if (hewan.getJenis().equals(jenis)){
                return hewan;
            }
        }
        return null;
    }
    public static int indexData(entity_Hewan hwn){
        int index = daftarHewan.indexOf(hwn);
        return index;
    }
    public static void editData(String jenis, int umurBaru, String statusBaru){
        entity_Hewan hwnCari = cariData(jenis);

        if(hwnCari != null){
            int index = indexData(hwnCari);
            daftarHewan.get(index).setUmur(umurBaru);
            daftarHewan.get(index).setStatus(statusBaru);
        }
    }
    public static void hapusData(String jenis) {
        entity_Hewan hwnCari = cariData(jenis);

        if (hwnCari != null) {
            daftarHewan.remove(hwnCari);
        }
    }
}