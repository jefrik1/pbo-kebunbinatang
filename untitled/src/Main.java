import model.model_hewan;
import controller.controller_petugas;

public class Main {
    public static void main(String[] args) {
        model_hewan.initalhewan();
        model_hewan.initialpetugas();
        new controller_petugas();
    }
}