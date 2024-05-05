-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql.freedb.tech
-- Tiempo de generación: 05-05-2024 a las 17:35:33
-- Versión del servidor: 8.0.36-0ubuntu0.22.04.1
-- Versión de PHP: 8.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `freedb_Persian`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `idpeliculas` int NOT NULL,
  `peliculas` varchar(45) DEFAULT NULL,
  `categorias` varchar(100) DEFAULT NULL,
  `director` varchar(50) DEFAULT NULL,
  `estado` varchar(20) DEFAULT 'Disponible',
  `fechapublicacion` date DEFAULT NULL,
  `duracion` int DEFAULT NULL,
  `idregistro` int DEFAULT NULL
) ;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`idpeliculas`, `peliculas`, `categorias`, `director`, `estado`, `fechapublicacion`, `duracion`, `idregistro`) VALUES
(1, 'Spiderman 3', 'Accion', 'Sam Raimi', 'No disponible', '2007-05-04', 139, 4),
(2, 'Atrápame si puedes', 'Drama', 'Steven Spielberg', 'No disponible', '2002-12-25', 141, 1),
(3, 'Beau tiene miedo', 'Drama', 'Fede Alvarez', 'Disponible', '2022-08-19', 98, NULL),
(4, 'Cadena Perpetua', 'Drama', 'Frank Darabont', 'Disponible', '1994-10-14', 142, NULL),
(5, 'El cisne negro', 'Drama', 'Darren Aronofsky', 'Disponible', '2010-12-17', 108, NULL),
(6, 'Los odiosos 8', 'Drama', 'Quentin Tarantino', 'Disponible', '2015-12-25', 187, NULL),
(7, 'Venom', 'Accion', 'Ruben Fleischer', 'Disponible', '2018-10-05', 112, NULL),
(8, 'Origen', 'Drama', 'Christopher Nolan', 'Disponible', '2010-07-16', 148, NULL),
(9, 'Sharknado 6', 'Comedia', 'Anthony C. Ferrante', 'Disponible', '2018-08-19', 90, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `idregistro` int NOT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `contrasena` varchar(20) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`idregistro`, `usuario`, `contrasena`, `correo`) VALUES
(1, 'Jose', 'incorrecta', 'prueba@gmail.com'),
(2, 'Antonio', 'incorrecta2', 'prueba2@gmail.com'),
(3, '\"+nombre+\"', '\"+contraseña+\"', '\"+correo+\"'),
(4, 'Persian', 'incorrecta', 'persian@gmail.com'),
(5, 'a', 'a', 'a'),
(6, 'Moreno1', 'moreno3', 'moreno2@botate.com'),
(7, 'Tormenta', 'rayito12', 'truenotormenta12@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`idpeliculas`),
  ADD KEY `FK_idregistro` (`idregistro`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`idregistro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `idpeliculas` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `idregistro` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD CONSTRAINT `FK_idregistro` FOREIGN KEY (`idregistro`) REFERENCES `registro` (`idregistro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
