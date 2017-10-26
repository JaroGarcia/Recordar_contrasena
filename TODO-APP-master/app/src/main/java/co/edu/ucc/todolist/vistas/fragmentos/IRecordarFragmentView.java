package co.edu.ucc.todolist.vistas.fragmentos;

/**
 * Created by jarog on 25/10/2017.
 */

public interface IRecordarFragmentView {
    void habilitarVistas();
    void deshabilitarVistas();
    void recordar();
    void irALogin();
    void mostrarError(String mensaje);
}
