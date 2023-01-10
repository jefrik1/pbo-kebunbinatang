package controller;

import model.model_hewan;
import view.view_hewan;
import model.Auth;
import java.util.Scanner;

public class controller_petugas {
    Scanner scanner = new Scanner(System.in);

    public controller_petugas() {
        run();
    }

    private void run() {
        String str = """
                ============== PETUGAS ==============
                1. Login
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
                    loginMenu();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println();
        } while (menu != 0);
    }

    public void loginMenu() {
        String id, pass;
        boolean status = false;
        System.out.println("\n-------------------- LOGIN -------------------");
        model_hewan.initialpetugas();
        System.out.print("ID       : ");
        id = scanner.nextLine();

        System.out.print("Password  : ");
        pass = scanner.nextLine();
        status = Auth.login(id, pass);
        if (status) {
            try {
                System.out.println("----------------------------------------------");
                System.out.println("                Berhasil Login.               ");
                System.out.println("----------------------------------------------");
                System.out.println();
                new view_hewan();
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            System.out.println("ID atau Password Salah");
        }
    }
}