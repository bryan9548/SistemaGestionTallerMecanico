# Sistema de Gestión de Taller Mecánico

## Descripción

El Sistema de Gestión de Taller Mecánico es una aplicación desarrollada en Java utilizando Programación Orientada a Objetos (POO), Java Swing, JDBC y SQL Server. El sistema permite gestionar clientes, vehículos, mecánicos, empleados, repuestos y órdenes de trabajo mediante una interfaz gráfica, almacenando toda la información en una base de datos SQL Server.

---

# Requisitos

Antes de ejecutar el proyecto es necesario tener instalado:

- Java JDK 24
- Apache NetBeans IDE
- SQL Server
- SQL Server Management Studio (SSMS)

---

# Instrucciones de ejecución

## 1. Configurar la base de datos

1. Abrir SQL Server Management Studio.
2. Ejecutar el archivo **01_EstructuraBD.sql**.
3. Ejecutar el archivo **02_DatosIniciales.sql**.

---

## 2. Configurar la conexión

Abrir la clase:

```
conexion/Conexion.java
```

Verificar que los siguientes datos correspondan a la configuración del servidor SQL Server donde se ejecutará el proyecto:

```java
private static final String SERVIDOR = "NombreServidor";
private static final String PUERTO = "1433";
private static final String BASE_DATOS = "NombreBaseDatos";
private static final String USUARIO = "UsuarioSQL";
private static final String PASSWORD = "Contraseña";
```

> **Importante:** Si el proyecto se ejecuta en otro equipo, estos valores deberán modificarse según la configuración del servidor SQL Server.

---

## 3. Abrir el proyecto

1. Abrir Apache NetBeans IDE.
2. Seleccionar **File → Open Project**.
3. Buscar la carpeta del proyecto.
4. Abrir el proyecto.

---

## 4. Ejecutar la aplicación

1. Esperar a que NetBeans cargue todas las dependencias de Maven.
2. Compilar el proyecto.
3. Ejecutar la clase principal.
4. Verificar que se muestre la ventana principal del sistema.

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Java Swing
- JDBC
- SQL Server
- Maven

---

# Estructura del repositorio

```
SistemaGestionTallerMecánico
│
├── base de datos
│   ├── 01_EstructuraBD.sql
│   └── 02_DatosIniciales.sql
│
├── src
│
├── pom.xml
│
└── README.md
```

---

# Observaciones

- Ejecutar primero **01_EstructuraBD.sql** y luego **02_DatosIniciales.sql**.
- Verificar que SQL Server esté en ejecución antes de iniciar la aplicación.
- Si el servidor SQL Server tiene un nombre diferente, actualizar la configuración en la clase `Conexion.java`.

---

# Autor

**Bryan Huarcaya Parra**

Universidad Tecnológica del Perú

Ingeniería de Sistemas
