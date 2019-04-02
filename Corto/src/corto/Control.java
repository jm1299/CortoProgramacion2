package corto;

public class Control extends Ventana {

    Estudiante primero = new Estudiante();

    public void agregar() {
        model.addElement(primero);
        model.addElement((getTxtNombre()).getText());
        model.addElement((getTxtApellido()).getText());

    }

    public void buscar() {
        model.contains((getTxtNombre()).getText());
        model.contains((getTxtApellido()).getText());
    }

    public void editar() {
        model.addElement((getTxtNombre()).getText());
        model.addElement((getTxtApellido()).getText());
    }

    public void eliminar() {
        model.removeElement((getTxtNombre()).getText());
        model.removeElement((getTxtApellido()).getText());
    }

}
