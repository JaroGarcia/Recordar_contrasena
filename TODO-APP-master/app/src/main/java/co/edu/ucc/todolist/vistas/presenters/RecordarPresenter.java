package co.edu.ucc.todolist.vistas.presenters;

import co.edu.ucc.todolist.dominio.CallBackInteractor;
import co.edu.ucc.todolist.dominio.ILUsuario;
import co.edu.ucc.todolist.dominio.LUsuario;
import co.edu.ucc.todolist.vistas.fragmentos.IRecordarFragmentView;

/**
 * Created by jarog on 25/10/2017.
 */

public class RecordarPresenter implements IRecordarPresenter {
    private IRecordarFragmentView view;
    private ILUsuario lUsuario;

    public RecordarPresenter(IRecordarFragmentView view) {
        this.view = view;
        lUsuario = new LUsuario();
    }

    @Override
    public void Recordar(String email) {
        view.deshabilitarVistas();
        view.irALogin();

        try {
            lUsuario.RecordarUser(email, new CallBackInteractor<String>() {
                @Override
                public void success(String data) {
                    view.habilitarVistas();

                }

                @Override
                public void error(String error) {
                    view.habilitarVistas();

                }
            });
        } catch (Exception e) {
            view.habilitarVistas();
            view.mostrarError(e.getMessage());
        }

    }
}
