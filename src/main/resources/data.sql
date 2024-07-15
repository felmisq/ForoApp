CREATE TABLE USUARIOS(
    ID_USUARIO INT PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(100) NOT NULL,
    CORREO VARCHAR(100) NOT NULL,
    PASSWORD VARCHAR(100) NOT NULL
);

CREATE TABLE TEMAS(
    ID_TEMA INT PRIMARY KEY AUTO_INCREMENT,
    TITULO VARCHAR(100) NOT NULL,
    CONTENIDO VARCHAR(1000) NOT NULL,
    FECHA_DE_CREACION DATE NOT NULL,
    IDUSUARIO INT NOT NULL
);

INSERT INTO usuarios(nombre, correo, password) VALUES('Felma Salinas', 'felmi@gmail.com', 'abcde');
INSERT INTO usuarios(nombre, correo, password) VALUES('Diego Hernandez', 'darh@gmail.com', '12345');

INSERT INTO temas(titulo, contenido, fecha_De_Creacion, idusuario) VALUES('Springboot Initialzr', 'Tengo una duda con la forma en la que debo configurar mi Initializr', '2024-07-05', 2);
INSERT INTO temas(titulo, contenido, fecha_De_Creacion, idusuario) VALUES('Java JDBC', 'Necesito encontrar el enlace de descarga directo del JDBC', '2024-07-06', 1);
INSERT INTO temas(titulo, contenido, fecha_De_Creacion, idusuario) VALUES('MVC Structure', '¿Recomiendan la estructura MVC para un proyecto grande?', '2024-07-07', 1);