package espoch.edu.ec.practicafinciclo.Controlador;

import espoch.edu.ec.practicafinciclo.Modelo.Modelo;
import espoch.edu.ec.practicafinciclo.Vista.Vista;

/**
 *
 * @author and_j
 */
public class Controlador {
    boolean productos;

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new Modelo();
    }

    public void agregarNuevoProducto() {
        String nombreProducto = vista.obtenerProducto("ingreaar  nombre producto: ");
        
        modelo.agregarProducto(nombreProducto);
        vista.mostrarMsg("producto agregado correctamente.");
    }

    public void listarProductos() {
        if (productos) {
            vista.mostrarMensaje("no hay productos en lista");
        } else {
            vista.mostrarMensaje("lista producto");
            for (String producto : productos) {
                vista.mostrarMensaje(producto);
            }
        }
    }

    public void Salir() {
        vista.mostrarMensaje("Salida");
        System.exit(00);
    }
}
