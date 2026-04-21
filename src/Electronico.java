public class Electronico extends Producto {
    private String garantia;

    public Electronico(String nombre, int precio, int cantidad, String garantia) {
        super(nombre, precio, cantidad);
        this.garantia = garantia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantia: " + garantia);
    }

    public String getGarantia() {
        return garantia;
    }
}
