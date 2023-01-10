package view;
import java.util.Scanner;

import model.model_hewan;

public class view_hewan implements interrface{
    static Scanner scanner = new Scanner(System.in);

    public view_hewan() {
        Run();
    }

    public void Run() {
        String str = """
                ============== KEBUN BINATANG ================
                1. Daftar Hewan
                2. Tambah Hewan
                3. Edit Hewan
                4. Hapus Hewan
                0. Keluar
                ==============================================
                """;

        int menu = -1;

        do {
            System.out.print(str);
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    lihatData();
                    break;
                case 2:
                    tambahData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (menu != 0);
    }

    public void lihatData(){
        model_hewan.lihatData();
    }
    public void tambahData(){
        String jenis, status;
        int umur;
        System.out.println("=============== TAMBAH HEWAN ==============");

        System.out.print("Masukan Jenis Hewan    : ");
        jenis = scanner.nextLine();

        System.out.print("Masukan Status : ");
        status = scanner.nextLine();

        System.out.print("Masukan Umur   : ");
        umur = scanner.nextInt();
        model_hewan.tambahData(jenis,umur,status);
    }

    public void editData(){
        String jenis, status;
        int umur;
        System.out.println("=============== HEWAN YANG DI TANGANI ==============");
        System.out.print("Masukan Jenis Hewan    : ");
        jenis = scanner.nextLine();

        System.out.print("Masukan Status Baru : ");
        status = scanner.nextLine();

        System.out.print("Masukan Umur Baru  : ");
        umur = scanner.nextInt();
        model_hewan.editData(jenis,umur,status);
    }

    public void hapusData(){
        String jenis;
        System.out.println("=============== HAPUS DAFTAR HEWAN ==============");
        System.out.print("Masukan Jenis Hewan    : ");
        jenis = scanner.nextLine();
        model_hewan.hapusData(jenis);
    }
}