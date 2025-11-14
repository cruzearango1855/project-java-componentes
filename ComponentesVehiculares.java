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
/**
 * Clase SistemaElectrico: Describe el sistema eléctrico (batería, luces, sensores).
 */
class SistemaElectrico {
    // Atributos
    private double voltajeBateria; // En voltios
    private int consumoWatts;
    private boolean tieneLucesAutomaticas;

    // Constructor
    public SistemaElectrico(double voltajeBateria, int consumoWatts, boolean tieneLucesAutomaticas) {
        this.voltajeBateria = voltajeBateria;
        this.consumoWatts = consumoWatts;
        this.tieneLucesAutomaticas = tieneLucesAutomaticas;
    }

    // Método de Negocio: Simula la activación de luces
    public void activarLuces(boolean encender) {
        if (encender) {
            System.out.println("Sistema Eléctrico: Luces encendidas. Consumo total: " + consumoWatts + "W.");
        } else {
            System.out.println("Sistema Eléctrico: Luces apagadas.");
        }
    }

    // Getters y Setters
    public double getVoltajeBateria() {
        return voltajeBateria;
    }

    public void setVoltajeBateria(double voltajeBateria) {
        this.voltajeBateria = voltajeBateria;
    }

    public int getConsumoWatts() {
        return consumoWatts;
    }

    public void setConsumoWatts(int consumoWatts) {
        this.consumoWatts = consumoWatts;
    }

    public boolean isTieneLucesAutomaticas() {
        return tieneLucesAutomaticas;
    }

    public void setTieneLucesAutomaticas(boolean tieneLucesAutomaticas) {
        this.tieneLucesAutomaticas = tieneLucesAutomaticas;
    }
}

/**
 * Clase SistemaFrenos: Información sobre frenos (tipo, discos, ABS, estado).
 */
class SistemaFrenos {
    // Atributos
    private String tipoFreno; // Ejemplo: "Disco Ventilado", "Tambor"
    private boolean tieneABS;
    private String estadoPastillas; // Ejemplo: "Nuevo", "Medio", "Bajo"

    // Constructor
    public SistemaFrenos(String tipoFreno, boolean tieneABS, String estadoPastillas) {
        this.tipoFreno = tipoFreno;
        this.tieneABS = tieneABS;
        this.estadoPastillas = estadoPastillas;
    }

    // Método de Negocio: Simula la acción de frenado
    public void frenar() {
        String absStatus = tieneABS ? " con ABS activado" : "";
        System.out.println("Sistema de Frenos: Aplicando frenado de tipo " + tipoFreno + absStatus + ". Estado de pastillas: " + estadoPastillas + ".");
    }

    // Getters y Setters
    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getEstadoPastillas() {
        return estadoPastillas;
    }

    public void setEstadoPastillas(String estadoPastillas) {
        this.estadoPastillas = estadoPastillas;
    }
}
class RegistroVehicular {
    // Atributos
    private String matricula;
    private String propietario;
    private String fechaRegistro; // Se usa String para simplificar, idealmente usar Date/LocalDate

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Método de Negocio: Muestra el estado legal
    public void mostrarEstadoLegal() {
        System.out.println("Registro Vehicular: Matrícula " + matricula + ". Propietario actual: " + propietario);
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

/**
 * Clase Mantenimiento: Historial y programación de mantenimientos.
 */
class Mantenimiento {
    // Atributos
    private String fechaUltimoServicio;
    private int kilometrajeActual;
    private String proximoServicioRecomendado;

    // Constructor
    public Mantenimiento(String fechaUltimoServicio, int kilometrajeActual, String proximoServicioRecomendado) {
        this.fechaUltimoServicio = fechaUltimoServicio;
        this.kilometrajeActual = kilometrajeActual;
        this.proximoServicioRecomendado = proximoServicioRecomendado;
    }

    // Método de Negocio: Verifica si es tiempo de mantenimiento
    public void verificarMantenimiento() {
        System.out.println("Mantenimiento: Último servicio en " + fechaUltimoServicio + ". Próximo: " + proximoServicioRecomendado + ".");
        if (kilometrajeActual >= 15000) {
             System.out.println("ALERTA: Es recomendable revisar el vehículo pronto.");
        }
    }

    // Getters y Setters
    public String getFechaUltimoServicio() {
        return fechaUltimoServicio;
    }

    public void setFechaUltimoServicio(String fechaUltimoServicio) {
        this.fechaUltimoServicio = fechaUltimoServicio;
    }

    public int getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(int kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public String getProximoServicioRecomendado() {
        return proximoServicioRecomendado;
    }

    public void setProximoServicioRecomendado(String proximoServicioRecomendado) {
        this.proximoServicioRecomendado = proximoServicioRecomendado;
    }
}

/**
 * Clase Sensor: Modela un sensor individual del vehículo.
 */
class Sensor {
    // Atributos
    private String tipo; // Ejemplo: Velocidad, Temperatura, Presión
    private String unidad; // Ejemplo: km/h, °C, PSI
    private double valorActual;

    // Constructor
    public Sensor(String tipo, String unidad, double valorActual) {
        this.tipo = tipo;
        this.unidad = unidad;
        this.valorActual = valorActual;
    }

    // Método de Negocio: Reporta la lectura del sensor
    public double obtenerLectura() {
        System.out.println("Sensor de " + tipo + " leyendo: " + valorActual + " " + unidad + ".");
        return valorActual;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
}
// Clase principal para la demostración
public class ComponentesVehiculares {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("= Ejecutando demostración de Componentes Vehiculares (v4.0) =");
        System.out.println("=================================================");
        
        // 1. VEHÍCULO BASE
        Vehiculo vehiculo1 = new Vehiculo("VIN12345", "Toyota", "Supra", 2024);
        vehiculo1.mostrarInfoVehiculo();
        
        // 2. COMPONENTES PRINCIPALES
        System.out.println("\n--- 2. Componentes Principales ---");
        Motor motor1 = new Motor("Gasolina Turbo", 2.0, 250);
        motor1.encender();

        Transmision trans1 = new Transmision("Automática", 8, "AWD");
        trans1.cambiarMarcha(3);
        
        Chasis chasis1 = new Chasis("Monocasco", 4.5, 1200.5);
        chasis1.getPesoTotal();
        
        Neumatico neumaticoDelantero = new Neumatico("Michelin", "245/40 R18", 35.0, true);
        neumaticoDelantero.verificarPresion();

        // 3. SISTEMAS
        System.out.println("\n--- 3. Sistemas Secundarios ---");
        
        SistemaElectrico sistemaE = new SistemaElectrico(12.5, 300, true);
        sistemaE.activarLuces(true);

        SistemaFrenos sistemaF = new SistemaFrenos("Disco Ventilado", true, "Medio");
        sistemaF.frenar();

        // 4. NUEVOS COMPONENTES (v4.0 - Registro, Mantenimiento, Sensor)
        System.out.println("\n--- 4. Componentes de Gestión y Monitoreo ---");

        RegistroVehicular reg1 = new RegistroVehicular("ABC-123", "Juan Pérez", "2024-01-15");
        reg1.mostrarEstadoLegal();
        
        Mantenimiento mant1 = new Mantenimiento("2024-10-01", 16000, "Cambio de aceite y filtros");
        mant1.verificarMantenimiento(); // Esto debe generar una alerta.
        
        Sensor sensorTemp = new Sensor("Temperatura Aceite", "°C", 95.5);
        Sensor sensorVel = new Sensor("Velocidad", "km/h", 85.0);
        
        sensorTemp.obtenerLectura();
        sensorVel.obtenerLectura();
        
        System.out.println("\n=================================================");
        System.out.println("= Reto de Modelado POR COMPLETADO (10 Clases) =");
        System.out.println("=================================================");
    }
}