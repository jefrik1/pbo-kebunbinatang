package model;
import Entity.entity_Petugas;
import model.model_hewan;


public class Auth {
    static entity_Petugas petugasLogged = null;

    public static entity_Petugas getPetugasLogged() {
        return petugasLogged;
    }

    public static boolean login(String id, String pass) {

        for (entity_Petugas petugas : model_hewan.daftarPetugas) {
            if ((petugas.getId().equals(id)) && (petugas.getPass().equals(pass))) {
                petugasLogged = petugas;
                return true;
            }
        }
        return false;
    }

    public static void logout() {
        petugasLogged = null;
    }
}
