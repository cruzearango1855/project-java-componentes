🚗 Proyecto Java: Modelado de Componentes Vehiculares

Este proyecto implementa el modelado de diez componentes principales y sistemas de un vehículo utilizando el paradigma de Programación Orientada a Objetos (POO) en Java.

El objetivo fue crear una clase por cada componente, incluyendo atributos encapsulados, un constructor y al menos un método de negocio, siguiendo un proceso de desarrollo incremental con control de versiones.

🏗️ Diagrama de Clases UML

El siguiente diagrama visualiza las 10 clases implementadas y sus relaciones (aunque las relaciones no se implementaron formalmente, el diagrama muestra la estructura conceptual).

🛠️ Clases Implementadas (10)

| Grupo | Clase | Descripción |
| Componentes Base | Vehiculo | Identificación, marca, modelo y año de fabricación. |
|  | Motor | Tipo de motor, cilindrada y potencia (HP). |
|  | Transmision | Tipo, número de marchas y tipo de tracción. |
|  | Chasis | Tipo de estructura, longitud y peso base. |
|  | Neumatico | Marca, tamaño, presión y estado de desgaste. |
| Sistemas | SistemaElectrico | Voltaje de batería, consumo y características de iluminación. |
|  | SistemaFrenos | Tipo de freno, si tiene ABS y estado de pastillas. |
| Gestión y Monitoreo | RegistroVehicular | Datos legales como matrícula y propietario. |
|  | Mantenimiento | Historial y programación de servicios (ej: kilometraje actual). |
|  | Sensor | Tipo de sensor, unidad de medida y lectura de valor actual. |# project-java-componentes.

⚙️ Evidencia de Ejecución

La clase principal ComponentesVehiculares.java incluye un método main que instancia todas las clases y llama a sus respectivos métodos de negocio para demostrar su funcionalidad.

A continuación, se muestra el resultado de la ejecución del programa, confirmando que todos los métodos se ejecutan correctamente:

=================================================
= Ejecutando demostración de Componentes Vehiculares (v4.0) =
=================================================
--- Información del Vehículo ---
ID: VIN12345
Marca: Toyota
Modelo: Supra
Año: 2024

--- 2. Componentes Principales ---
Motor de tipo Gasolina Turbo encendido. Potencia: 250 HP.
Transmisión Automática en marcha 3.
Chasis tipo Monocasco. Peso base: 1200.5 kg.
Presión adecuada (35.0 PSI) en neumático Michelin.

--- 3. Sistemas Secundarios ---
Sistema Eléctrico: Luces encendidas. Consumo total: 300W.
Sistema de Frenos: Aplicando frenado de tipo Disco Ventilado con ABS activado. Estado de pastillas: Medio.

--- 4. Componentes de Gestión y Monitoreo ---
Registro Vehicular: Matrícula ABC-123. Propietario actual: Juan Pérez
Mantenimiento: Último servicio en 2024-10-01. Próximo: Cambio de aceite y filtros.
ALERTA: Es recomendable revisar el vehículo pronto.
Sensor de Temperatura Aceite leyendo: 95.5 °C.
Sensor de Velocidad leyendo: 85.0 km/h.

=================================================
= Reto de Modelado POO COMPLETADO (10 Clases) =
=================================================

🌳 Historial de Commits

Este proyecto fue desarrollado siguiendo el flujo de trabajo de Git incremental con mensajes descriptivos:

feat: creación del repositorio base para proyecto de componentes vehiculares

feat: implementación de clase Vehiculo con atributos y métodos

feat: implementación de clase Motor y Transmision

feat: implementación de clases Chasis y Neumatico

feat: implementación de clases SistemaElectrico y SistemaFrenos

feat: implementación de clases RegistroVehicular, Mantenimiento y Sensor

docs: actualización del README con descripción del proyecto y captura de ejecución