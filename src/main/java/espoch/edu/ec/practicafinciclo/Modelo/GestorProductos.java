package espoch.edu.ec.practicafinciclo.Modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author and_j-Dominik
 */
public class GestorProductos {

    public GestorProductos(int contadorId) {
        this.contadorId = contadorId;
    }

    public List<Producto> productos;
    private int contadorId;

    public boolean agregarProductos(Producto productos) {
        Producto nuevoProductos = new Producto(contadorId++);
        Producto.add(nuevoProductos);
    }

    public disponibles listarProductos() {
        var disponibles = new ArrayList();
        for (Producto productos : productos) {
            if (!productos.agregarProducto()) {
                disponibles.add(productos);
            }
        }
        return disponibles;
    }
}
