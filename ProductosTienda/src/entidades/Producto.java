package entidades;

public class Producto {
    String  Tipo;
    int Cantidad;
    int PrecioUnitario;

    public Producto() {
    }

    public Producto(String tipo, int cantidad, int precioUnitario) {
        this.Tipo = tipo;
        this.Cantidad = cantidad;
        this.PrecioUnitario = precioUnitario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Tipo='" + Tipo + '\'' +
                ", Cantidad=" + Cantidad +
                ", PrecioUnitario=" + PrecioUnitario +
                '}';
    }
}
