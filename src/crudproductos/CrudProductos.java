package crudproductos;

public class CrudProductos {
    public static void main(String[] args) {
        // Esta línea obliga a Java a mostrar la ventana en la pantalla
        java.awt.EventQueue.invokeLater(() -> {
            new FrmProductos().setVisible(true);
        });
    }
}
