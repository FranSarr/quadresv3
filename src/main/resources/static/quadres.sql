-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 01-07-2020 a las 13:29:40
-- Versión del servidor: 5.7.30-0ubuntu0.18.04.1
-- Versión de PHP: 7.2.24-0ubuntu0.18.04.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quadres`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `picture`
--

CREATE TABLE `picture` (
  `id_pic` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `author` varchar(20) NOT NULL,
  `price` decimal(20,0) NOT NULL,
  `shop_id` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `picture`
--

INSERT INTO `picture` (`id_pic`, `name`, `author`, `price`, `shop_id`, `date`) VALUES
(13, 'Picture 3', 'Niche', '3001', 1, '2020-06-29'),
(14, 'Picture 4', 'Niche 4', '5001', 1, '2020-06-29'),
(15, 'Picture 5', 'Niche ujuj', '55001', 3, '2020-06-29'),
(16, 'Picture 11', 'Niche MAO', '551', 3, '2020-06-29'),
(20, 'Picture extra', 'pintamonas', '500221', 1, '2020-06-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `shop`
--

CREATE TABLE `shop` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `capacity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `shop`
--

INSERT INTO `shop` (`id`, `name`, `capacity`) VALUES
(1, 'tienda1', 10),
(2, 'tienda2', 20),
(3, 'Tienda5', 50),
(4, 'Tienda5', 50),
(5, 'Tienda5', 50),
(6, 'tienda3', 30),
(7, 'Tienda5', 50),
(8, 'tienda3', 30),
(9, 'Tienda5', 50),
(10, 'Tienda5', 50),
(11, 'Tienda5', 50),
(12, 'tienda20', 2000),
(13, 'tienda1000', 2000),
(14, 'tienda especial', 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `picture`
--
ALTER TABLE `picture`
  ADD PRIMARY KEY (`id_pic`),
  ADD KEY `shop_id` (`shop_id`);

--
-- Indices de la tabla `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `picture`
--
ALTER TABLE `picture`
  MODIFY `id_pic` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `shop`
--
ALTER TABLE `shop`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `picture`
--
ALTER TABLE `picture`
  ADD CONSTRAINT `picture_ibfk_1` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
