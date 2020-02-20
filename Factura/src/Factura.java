/**
 * Clase definida como elemento básico a la hora de crear las distintas facturas
 *
 * @author Agustín de la Morena Fernández
 */
public class Factura implements IFactura
{
    public int num;
    public float base;
    public float tipoIva;
    protected Estados estado;

    /**
     * Constructor de la clase Factura. Se crea un objeto Factura incorporando los distintos parámetros
     *
     * @param num
     * @param base
     * @param tipoIva
     * @param estado
     */
    public Factura(int num, float base, float tipoIva, Estados estado)
    {
        this.num = num;
        this.base = base;
        this.tipoIva = tipoIva;
        this.estado = estado;
    }

    /**
     * Método de la clase factura para cambiar el estado de la factura. Los estados estan especificádos en el tipo
     * enumerado Estados.java
     *
     * @see Estados
     * @param estado
     */
    @Override
    public void cambiarEstado(Estados estado)
    {

    }

    /**
     * Método de la clase factura para obtener el resultado de la factura
     *
     * @return 0
     */
    @Override
    public float getTotal()
    {
        return 0;
    }

    /**
     * Método de la clase factura para obtener la cantidad de iva de una factura
     *
     * @return 0
     */
    @Override
    public float getCantidadIva()
    {
        return 0;
    }


}
