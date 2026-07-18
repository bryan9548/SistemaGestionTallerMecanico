

CREATE DATABASE BD_Sistema_de_Gestion_Taller_Mecanico;
GO
USE BD_Sistema_de_Gestion_Taller_Mecanico;
GO

-------------------------------------------------
-- TABLA PERSONA
-------------------------------------------------
CREATE TABLE Persona(

    PersonaID INT IDENTITY(1,1) PRIMARY KEY,

    Nombre NVARCHAR(100) NOT NULL,

    Apellido NVARCHAR(100) NOT NULL,

    NumeroDocumento NVARCHAR(20) UNIQUE NOT NULL,

    TipoDocumento NVARCHAR(20) NOT NULL,

    Telefono NVARCHAR(20),

    Email NVARCHAR(100),

    Estado BIT NOT NULL DEFAULT 1

);

-------------------------------------------------
-- TABLA CLIENTE
-------------------------------------------------
CREATE TABLE Cliente(

    ClienteID INT IDENTITY(1,1) PRIMARY KEY,

    PersonaID INT NOT NULL,

    RazonSocial NVARCHAR(150),

    TipoCliente NVARCHAR(30) DEFAULT 'Natural',

    FechaRegistro DATETIME DEFAULT GETDATE(),

    Estado BIT DEFAULT 1,

    CONSTRAINT FK_Cliente_Persona
    FOREIGN KEY(PersonaID)
    REFERENCES Persona(PersonaID)

);

-------------------------------------------------
-- TABLA EMPLEADO
-------------------------------------------------
CREATE TABLE Empleado(

    EmpleadoID INT IDENTITY(1,1) PRIMARY KEY,

    PersonaID INT NOT NULL,

    Cargo NVARCHAR(50) NOT NULL,

    Sueldo DECIMAL(10,2),

    FechaIngreso DATETIME DEFAULT GETDATE(),

    Estado BIT DEFAULT 1,

    CONSTRAINT FK_Empleado_Persona
    FOREIGN KEY(PersonaID)
    REFERENCES Persona(PersonaID)

);

-------------------------------------------------
-- TABLA ADMINISTRADOR
-------------------------------------------------
CREATE TABLE Administrador(

    AdministradorID INT IDENTITY(1,1) PRIMARY KEY,

    EmpleadoID INT NOT NULL,

    Area NVARCHAR(80),

    CONSTRAINT FK_Administrador_Empleado
    FOREIGN KEY(EmpleadoID)
    REFERENCES Empleado(EmpleadoID)

);

-------------------------------------------------
-- TABLA MECANICO
-------------------------------------------------
CREATE TABLE Mecanico(

    MecanicoID INT IDENTITY(1,1) PRIMARY KEY,

    EmpleadoID INT NOT NULL,

    Especialidad NVARCHAR(80),

    Estado BIT DEFAULT 1,

    CONSTRAINT FK_Mecanico_Empleado
    FOREIGN KEY(EmpleadoID)
    REFERENCES Empleado(EmpleadoID)

);

-------------------------------------------------
-- TABLA MARCA VEHICULO
-------------------------------------------------

CREATE TABLE MarcaVehiculo(

    MarcaID INT IDENTITY(1,1) PRIMARY KEY,

    NombreMarca NVARCHAR(50) NOT NULL,

    Pais NVARCHAR(50),

    Estado BIT DEFAULT 1

);

-------------------------------------------------
-- TABLA VEHICULO
-------------------------------------------------

CREATE TABLE Vehiculo(

    VehiculoID INT IDENTITY(1,1) PRIMARY KEY,

    ClienteID INT NOT NULL,

    MarcaID INT NOT NULL,

    Modelo NVARCHAR(100) NOT NULL,

    Año INT NOT NULL,

    Placa NVARCHAR(20) NOT NULL UNIQUE,

    Estado BIT DEFAULT 1,

    CONSTRAINT FK_Vehiculo_Cliente
    FOREIGN KEY(ClienteID)
    REFERENCES Cliente(ClienteID),

    CONSTRAINT FK_Vehiculo_Marca
    FOREIGN KEY(MarcaID)
    REFERENCES MarcaVehiculo(MarcaID)

);

-------------------------------------------------
-- TABLA REPUESTO
-------------------------------------------------

CREATE TABLE Repuesto(

    RepuestoID INT IDENTITY(1,1) PRIMARY KEY,

    Codigo NVARCHAR(20) UNIQUE NOT NULL,

    Nombre NVARCHAR(120) NOT NULL,

    Precio DECIMAL(10,2) NOT NULL,

    Stock INT NOT NULL,

    Estado BIT DEFAULT 1

);

-------------------------------------------------
-- TABLA ORDEN DE TRABAJO
-------------------------------------------------

CREATE TABLE OrdenTrabajo(

    OrdenTrabajoID INT IDENTITY(1,1) PRIMARY KEY,

    VehiculoID INT NOT NULL,

    MecanicoID INT NOT NULL,

    FechaIngreso DATETIME DEFAULT GETDATE(),

    FechaSalida DATETIME NULL,

    Diagnostico NVARCHAR(300),

    Estado NVARCHAR(30),

    Total DECIMAL(10,2) DEFAULT 0,

    CONSTRAINT FK_OrdenTrabajo_Vehiculo
    FOREIGN KEY(VehiculoID)
    REFERENCES Vehiculo(VehiculoID),

    CONSTRAINT FK_OrdenTrabajo_Mecanico
    FOREIGN KEY(MecanicoID)
    REFERENCES Mecanico(MecanicoID)

);

-------------------------------------------------
-- TABLA DETALLE ORDEN
-------------------------------------------------

CREATE TABLE DetalleOrden(

    DetalleID INT IDENTITY(1,1) PRIMARY KEY,

    OrdenTrabajoID INT NOT NULL,

    RepuestoID INT NOT NULL,

    Cantidad INT NOT NULL,

    PrecioUnitario DECIMAL(10,2) NOT NULL,

    SubTotal DECIMAL(10,2) NOT NULL,

    CONSTRAINT FK_Detalle_Orden
    FOREIGN KEY(OrdenTrabajoID)
    REFERENCES OrdenTrabajo(OrdenTrabajoID),

    CONSTRAINT FK_Detalle_Repuesto
    FOREIGN KEY(RepuestoID)
    REFERENCES Repuesto(RepuestoID)

);

