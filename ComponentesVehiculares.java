 class Vehiculo {
    // Atributos
    private String identificacion;
    private String marca;
    private String modelo;
    private int anioFabricacion;

    // Constructor
    public Vehiculo(String identificacion, String marca, String modelo, int anioFabricacion) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    // Método de Negocio: Muestra la información esencial del vehículo
    public void mostrarInfoVehiculo() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("ID: " + identificacion);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anioFabricacion);
    }

    // Getters y Setters
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
// Clase principal para la demostración
public class ComponentesVehiculares {
    public static void main(String[] args) {
        System.out.println("Ejecutando demostración de Componentes Vehiculares (v1.0)...");
                    
        // Creamos un objeto Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("VIN12345", "Toyota", "Supra", 2024);
        vehiculo1.mostrarInfoVehiculo();
        
        System.out.println("--- Fin de la demostración v1.0 ---");
    }
} 