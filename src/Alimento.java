public class Alimento extends Producto {
    private String FechaCaducidad;

    public Alimento(String nombre, int precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.FechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("FechaCaducidad: " + FechaCaducidad);
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }
}
