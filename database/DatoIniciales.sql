
USE BD_Sistema_de_Gestion_Taller_Mecanico;
GO
INSERT INTO Persona (Nombre,Apellido,NumeroDocumento,TipoDocumento,Telefono,Email)
VALUES
('Bryan','Huarcaya','70000001','DNI','987654321','bryan@gmail.com'),
('Carlos','Pérez','70000002','DNI','987654322','carlos@gmail.com'),
('Luis','Gómez','70000003','DNI','987654323','luis@gmail.com'),
('Pedro','Ramirez','70000004','DNI','987654324','pedro@gmail.com'),
('Ana','Torres','70000005','DNI','987654325','ana@gmail.com'),
('María','Soto','70000006','DNI','987654326','maria@gmail.com'),
('José','Rojas','70000007','DNI','987654327','jose@gmail.com'),
('Jorge','Flores','70000008','DNI','987654328','jorge@gmail.com'),
('Miguel','Castro','70000009','DNI','987654329','miguel@gmail.com'),
('Lucía','Quispe','70000010','DNI','987654330','lucia@gmail.com'),
('Ricardo','Vega','70000011','DNI','987654331','ricardo@gmail.com'),
('Fernando','Salas','70000012','DNI','987654332','fernando@gmail.com'),
('Kevin','Lopez','70000013','DNI','987654333','kevin@gmail.com'),
('Marco','Diaz','70000014','DNI','987654334','marco@gmail.com'),
('Rosa','Mendoza','70000015','DNI','987654335','rosa@gmail.com');

INSERT INTO Cliente(PersonaID,RazonSocial,TipoCliente)
VALUES
(1,'Bryan Huarcaya','Natural'),
(2,'Carlos Pérez','Natural'),
(3,'Luis Gómez','Natural'),
(4,'Pedro Ramirez','Natural'),
(5,'Ana Torres','Natural'),
(6,'María Soto','Natural'),
(7,'José Rojas','Natural'),
(8,'Jorge Flores','Natural'),
(9,'Miguel Castro','Natural'),
(10,'Lucía Quispe','Natural');

INSERT INTO Empleado(PersonaID,Cargo,Sueldo)
VALUES
(11,'Administrador',3500),
(12,'Mecánico',2500),
(13,'Mecánico',2400),
(14,'Mecánico',2600),
(15,'Mecánico',2550);

INSERT INTO Administrador(EmpleadoID,Area)
VALUES
(1,'Administración');

INSERT INTO Mecanico(EmpleadoID,Especialidad)
VALUES
(2,'Motor'),
(3,'Electricidad'),
(4,'Suspensión'),
(5,'Frenos');


INSERT INTO Vehiculo
(ClienteID,MarcaID,Modelo,Año,Placa)
VALUES
(1,1,'Corolla',2022,'ABC123'),
(2,2,'Sentra',2021,'DEF456'),
(3,3,'Civic',2020,'GHI789'),
(4,4,'Accent',2019,'JKL321'),
(5,5,'Rio',2018,'MNO654'),
(6,6,'Mazda 3',2022,'PQR987'),
(7,7,'Onix',2021,'STU741'),
(8,8,'Focus',2020,'VWX852'),
(9,9,'Golf',2019,'YZA963'),
(10,10,'Serie 3',2023,'BCD159');

INSERT INTO MarcaVehiculo (NombreMarca,Pais)
VALUES
('Toyota','Japón'),
('Nissan','Japón'),
('Honda','Japón'),
('Hyundai','Corea'),
('Kia','Corea'),
('Mazda','Japón'),
('Chevrolet','Estados Unidos'),
('Ford','Estados Unidos'),
('Volkswagen','Alemania'),
('BMW','Alemania');

INSERT INTO Repuesto
(Codigo,Nombre,Precio,Stock)
VALUES
('REP001','Filtro de aceite',35,20),
('REP002','Filtro de aire',45,15),
('REP003','Pastillas de freno',120,25),
('REP004','Disco de freno',180,12),
('REP005','Bujía',25,50),
('REP006','Batería',350,10),
('REP007','Radiador',420,5),
('REP008','Amortiguador',280,8),
('REP009','Aceite 20W50',90,30),
('REP010','Correa de distribución',220,10);

INSERT INTO OrdenTrabajo
(VehiculoID,MecanicoID,Diagnostico,Estado,Total)
VALUES
(1,1,'Cambio de aceite','En proceso',125),
(2,2,'Cambio de frenos','Finalizado',300),
(3,3,'Afinamiento','En proceso',180),
(4,4,'Cambio de batería','Pendiente',350),
(5,1,'Revisión general','Finalizado',150);


INSERT INTO DetalleOrden
(OrdenTrabajoID,RepuestoID,Cantidad,PrecioUnitario,SubTotal)
VALUES
(1,9,1,90,90),
(1,1,1,35,35),
(2,3,2,120,240),
(3,5,4,25,100),
(4,6,1,350,350),
(5,2,1,45,45);


