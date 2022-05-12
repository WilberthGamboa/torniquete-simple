public class App {
    public static void main(String[] args) throws Exception {
        Torniquete torniquete = new Torniquete();
        System.out.println("Estado inicial: "+torniquete.isEstado());
        System.out.println("Insertar moneda");
        torniquete.setMoneda();
        System.out.println("Estado torniquete "+torniquete.isEstado());
        System.out.println("Pasa persona");
        torniquete.setPaso();
        System.out.println("Estado torniquete "+torniquete.isEstado());
    }
}
