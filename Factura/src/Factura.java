public class Factura implements IFactura
{
    public int num;
    public float base;
    public float tipoIva;
    protected Estados estado;


    @Override
    public void cambiarEstado(Estados estado) {

    }

    @Override
    public float getTotal() {
        return 0;
    }

    @Override
    public float getCantidadIva() {
        return 0;
    }
}
