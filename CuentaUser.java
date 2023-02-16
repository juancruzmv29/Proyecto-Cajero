package ProyectosPropios.Cajero;


// CUENTA BANCARIA DEL USUARIO
public class CuentaUser {

    int dinero_disp; int key;

    public CuentaUser(int dinero, int key) {
        this.dinero_disp = dinero;
        this.key = key;
    }


    public double getDinero() {
        return dinero_disp;
    }
}
