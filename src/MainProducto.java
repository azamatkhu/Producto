//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProducto {
    public static void main(String[] args) {
        Producto a1 = new Alimento("Patata",40,20,"26/03/1039");
        Producto e1 = new Electronico("Movil",99,1,"01/01/0000");

        a1.mostrarInformacion();
        e1.mostrarInformacion();
    }
}