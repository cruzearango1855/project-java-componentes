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
class Chasis {
    // Atributos
    private String tipoEstructura; // Ejemplo: Monocasco, Bastidor (Body-on-frame)
    private double longitudMetros;
    private double pesoKg;

    // Constructor
    public Chasis(String tipoEstructura, double longitudMetros, double pesoKg) {
        this.tipoEstructura = tipoEstructura;
        this.longitudMetros = longitudMetros;
        this.pesoKg = pesoKg;
    }

    // Método de Negocio: Reporta el peso total
    public double getPesoTotal() {
        System.out.println("Chasis tipo " + tipoEstructura + ". Peso base: " + pesoKg + " kg.");
        return pesoKg;
    }

    // Getters y Setters
    public String getTipoEstructura() {
        return tipoEstructura;
    }

    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public double getLongitudMetros() {
        return longitudMetros;
    }

    public void setLongitudMetros(double longitudMetros) {
        this.longitudMetros = longitudMetros;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
}

/**
 * Clase Neumatico: Representa una llanta (marca, tamaño, presión).
 */
class Neumatico {
    // Atributos
    private String marca;
    private String tamano; // Ejemplo: 205/55 R16
    private double presionPSI;
    private boolean estadoDesgaste; // true si está en buen estado

    // Constructor
    public Neumatico(String marca, String tamano, double presionPSI, boolean estadoDesgaste) {
        this.marca = marca;
        this.tamano = tamano;
        this.presionPSI = presionPSI;
        this.estadoDesgaste = estadoDesgaste;
    }

    // Método de Negocio: Verifica si la presión es adecuada (ejemplo simple)
    public void verificarPresion() {
        if (presionPSI < 30.0) {
            System.out.println("ADVERTENCIA: Baja presión en el neumático " + tamano + ". Presión actual: " + presionPSI + " PSI.");
        } else {
            System.out.println("Presión adecuada (" + presionPSI + " PSI) en neumático " + marca + ".");
        }
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPresionPSI() {
        return presionPSI;
    }

    public void setPresionPSI(double presionPSI) {
        this.presionPSI = presionPSI;
    }

    public boolean isEstadoDesgaste() {
        return estadoDesgaste;
    }

    public void setEstadoDesgaste(boolean estadoDesgaste) {
        this.estadoDesgaste = estadoDesgaste;
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
        // Creamos un objeto chasis
        Chasis chasis1 = new Chasis("Monocasco", 4.5, 1200.5);
        chasis1.getPesoTotal();
        // Creamos un objeto neumatico
        Neumatico neumaticoDelantero = new Neumatico("Michelin", "245/40 R18", 35.0, true);
        neumaticoDelantero.verificarPresion();
        
        System.out.println("--- Fin de la demostración v1.0 ---");
    }
} 
