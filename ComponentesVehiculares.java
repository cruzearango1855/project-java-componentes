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
class Motor {
    // Atributos
    private String tipo; // Ejemplo: Gasolina, Diesel, Eléctrico
    private double cilindradaLitros;
    private int potenciaHP;

    // Constructor
    public Motor(String tipo, double cilindradaLitros, int potenciaHP) {
        this.tipo = tipo;
        this.cilindradaLitros = cilindradaLitros;
        this.potenciaHP = potenciaHP;
    }

    // Método de Negocio: Simula el encendido
    public void encender() {
        System.out.println("Motor de tipo " + tipo + " encendido. Potencia: " + potenciaHP + " HP.");
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCilindradaLitros() {
        return cilindradaLitros;
    }

    public void setCilindradaLitros(double cilindradaLitros) {
        this.cilindradaLitros = cilindradaLitros;
    }

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }
}

/**
 * Clase Transmision: Describe el sistema de transmisión del vehículo.
 */
class Transmision {
    // Atributos
    private String tipo; // Ejemplo: Automática, Manual, CVT
    private int numeroMarchas;
    private String traccion; // Ejemplo: FWD, RWD, AWD

    // Constructor
    public Transmision(String tipo, int numeroMarchas, String traccion) {
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
        this.traccion = traccion;
    }

    // Método de Negocio: Simula un cambio de marcha
    public void cambiarMarcha(int marcha) {
        if (marcha > 0 && marcha <= numeroMarchas) {
            System.out.println("Transmisión " + tipo + " en marcha " + marcha + ".");
        } else {
            System.out.println("Marcha inválida.");
        }
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}

// Clase principal para la demostración
public class ComponentesVehiculares {
    public static void main(String[] args) {
        System.out.println("Ejecutando demostración de Componentes Vehiculares (v1.0)...");
                    
        // Creamos un objeto Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("VIN12345", "Toyota", "Supra", 2024);
        vehiculo1.mostrarInfoVehiculo();
        
        // Creamos un objeto Motor
        Motor motor1 = new Motor("Gasolina Turbo", 2.0, 250);
        motor1.encender();

        // Creamos un objeto Transmision
        Transmision trans1 = new Transmision("Automática", 8, "AWD");
        trans1.cambiarMarcha(3);

        
        System.out.println("--- Fin de la demostración v1.0 ---");
    }
} 
