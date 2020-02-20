/**
 *Interfaz implementada por la clase factura que contiene los siguientes métodos:
 * void cambiarEstado(Estados estado);
 * float getTotal();
 * float getCantidadIva();
 *
 * @author Agustín de la Morena Fernández
 */
public interface IFactura
{
    void cambiarEstado(Estados estado);
    float getTotal();
    float getCantidadIva();
}