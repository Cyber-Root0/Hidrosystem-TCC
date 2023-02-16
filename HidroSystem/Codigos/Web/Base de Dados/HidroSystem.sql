-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Tempo de geração: 30-Set-2021 às 16:34
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.3.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `id17157107_system`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alerta`
--

CREATE TABLE `alerta` (
  `id` int(5) NOT NULL,
  `arduino` int(6) NOT NULL,
  `mensagem` varchar(100) NOT NULL,
  `hora` varchar(8) NOT NULL,
  `data` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `alerta`
--

INSERT INTO `alerta` (`id`, `arduino`, `mensagem`, `hora`, `data`) VALUES
(12, 9090, 'A Temperatura Abaixo da Media, 4°C', '20:56', '20/09'),
(13, 9090, 'A Temperatura Abaixo da Media, 2°C', '23:31', '20/09'),
(14, 9090, 'pH  Abaixo da Media, 1 pH', '23:31', '20/09'),
(15, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:32', '20/09'),
(16, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:34', '20/09'),
(17, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:35', '20/09'),
(18, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:37', '20/09'),
(19, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:38', '20/09'),
(20, 9090, 'A Temperatura Abaixo da Media, 3°C', '23:38', '20/09'),
(21, 9090, 'A Temperatura Abaixo da Media, 2°C', '23:38', '20/09'),
(22, 9090, 'pH  Abaixo da Media, 2 pH', '23:38', '20/09'),
(23, 9090, 'A Temperatura Abaixo da Media, 2°C', '23:50', '20/09'),
(24, 9090, 'pH  Abaixo da Media, 2 pH', '23:50', '20/09'),
(25, 9090, 'A Temperatura Abaixo da Media, 2°C', '23:51', '20/09'),
(26, 9090, 'pH  Abaixo da Media, 2 pH', '23:51', '20/09'),
(27, 9090, 'A Temperatura Abaixo da Media, 2°C', '23:51', '20/09'),
(28, 9090, 'pH  Abaixo da Media, 2 pH', '23:51', '20/09'),
(29, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:05', '21/09'),
(30, 9090, 'pH  Abaixo da Media, 2 pH', '00:05', '21/09'),
(31, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:05', '21/09'),
(32, 9090, 'pH  Abaixo da Media, 2 pH', '00:05', '21/09'),
(33, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:06', '21/09'),
(34, 9090, 'pH  Abaixo da Media, 2 pH', '00:06', '21/09'),
(35, 900, 'A Temperatura Abaixo da Media, 2°C', '00:10', '21/09'),
(36, 900, 'pH  Abaixo da Media, 2 pH', '00:10', '21/09'),
(37, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:11', '21/09'),
(38, 9090, 'pH  Abaixo da Media, 2 pH', '00:11', '21/09'),
(39, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:11', '21/09'),
(40, 9090, 'pH  Abaixo da Media, 2 pH', '00:11', '21/09'),
(41, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:24', '21/09'),
(42, 9090, 'pH  Abaixo da Media, 2 pH', '00:24', '21/09'),
(43, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:24', '21/09'),
(44, 9090, 'pH  Abaixo da Media, 2 pH', '00:24', '21/09'),
(45, 9090, 'A Temperatura Abaixo da Media, 2°C', '00:25', '21/09'),
(46, 9090, 'pH  Abaixo da Media, 2 pH', '00:25', '21/09'),
(47, 900, 'A Temperatura Abaixo da Media, 2°C', '00:25', '21/09'),
(48, 900, 'pH  Abaixo da Media, 2 pH', '00:25', '21/09'),
(49, 9090, 'Temperatura Acima da Media, 27°C', '08:27', '21/09'),
(50, 9090, 'pH  Abaixo da Media, 2 pH', '08:27', '21/09'),
(51, 900, 'A Temperatura Abaixo da Media, 2°C', '12:39', '21/09'),
(52, 900, 'pH  Abaixo da Media, 2 pH', '12:39', '21/09'),
(53, 9090, 'Temperatura Acima da Media, 27°C', '21:00', '21/09'),
(54, 9090, 'pH  Abaixo da Media, 2 pH', '21:00', '21/09'),
(55, 9080, 'Temperatura Acima da Media, 27°C', '21:01', '21/09'),
(56, 9080, 'pH  Abaixo da Media, 2 pH', '21:01', '21/09'),
(57, 9191, 'Temperatura Acima da Media, 25°C', '19:16', '23/09'),
(58, 9191, 'Temperatura Acima da Media, 25°C', '19:40', '23/09'),
(59, 9191, 'Temperatura Acima da Media, 25°C', '19:49', '23/09'),
(60, 9191, 'Temperatura Acima da Media, 25°C', '19:49', '23/09'),
(61, 9191, 'Temperatura Acima da Media, 25°C', '19:49', '23/09'),
(62, 9191, 'Temperatura Acima da Media, 25°C', '19:56', '23/09'),
(63, 9191, 'Temperatura Acima da Media, 25°C', '19:57', '23/09'),
(64, 9191, 'Temperatura Acima da Media, 25°C', '20:41', '23/09'),
(65, 9191, 'Temperatura Acima da Media, 25°C', '20:41', '23/09'),
(66, 9191, 'Temperatura Acima da Media, 25°C', '20:42', '23/09'),
(67, 9191, 'Temperatura Acima da Media, 26°C', '20:42', '23/09'),
(68, 9191, 'Temperatura Acima da Media, 26°C', '20:43', '23/09'),
(69, 9191, 'Temperatura Acima da Media, 26°C', '20:45', '23/09'),
(70, 9191, 'Temperatura Acima da Media, 26°C', '20:45', '23/09'),
(71, 9191, 'Temperatura Acima da Media, 26°C', '20:47', '23/09'),
(72, 9191, 'Temperatura Acima da Media, 26°C', '20:49', '23/09'),
(73, 9191, 'Temperatura Acima da Media, 26°C', '20:53', '23/09'),
(74, 900, 'A Temperatura Abaixo da Media, 2°C', '14:11', '25/09'),
(75, 900, 'pH  Abaixo da Media, 2 pH', '14:11', '25/09'),
(76, 900, 'A Temperatura Abaixo da Media, 2°C', '08:03', '27/09'),
(77, 900, 'pH  Abaixo da Media, 2 pH', '08:03', '27/09'),
(78, 900, 'A Temperatura Abaixo da Media, 2°C', '20:21', '27/09'),
(79, 900, 'pH  Abaixo da Media, 2 pH', '20:21', '27/09'),
(80, 900, 'A Temperatura Abaixo da Media, 2°C', '23:31', '27/09'),
(81, 900, 'pH  Abaixo da Media, 2 pH', '23:31', '27/09'),
(82, 900, 'A Temperatura Abaixo da Media, 2°C', '08:18', '28/09'),
(83, 900, 'pH  Abaixo da Media, 2 pH', '08:18', '28/09'),
(84, 900, 'A Temperatura Abaixo da Media, 2°C', '13:52', '28/09'),
(85, 900, 'pH  Abaixo da Media, 2 pH', '13:52', '28/09'),
(86, 900, 'A Temperatura Abaixo da Media, 2°C', '22:11', '28/09'),
(87, 900, 'pH  Abaixo da Media, 2 pH', '22:11', '28/09'),
(88, 900, 'A Temperatura Abaixo da Media, 2°C', '15:13', '29/09'),
(89, 900, 'pH  Abaixo da Media, 2 pH', '15:13', '29/09'),
(90, 900, 'A Temperatura Abaixo da Media, 2°C', '22:40', '29/09'),
(91, 900, 'pH  Abaixo da Media, 2 pH', '22:40', '29/09');

-- --------------------------------------------------------

--
-- Estrutura da tabela `diaria`
--

CREATE TABLE `diaria` (
  `id` int(8) NOT NULL,
  `dia` int(4) NOT NULL,
  `arduino` varchar(8) NOT NULL,
  `hora` varchar(5) NOT NULL,
  `temperatura` int(5) NOT NULL,
  `ph` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `diaria`
--

INSERT INTO `diaria` (`id`, `dia`, `arduino`, `hora`, `temperatura`, `ph`) VALUES
(71, 21, '9090', '00:05', 2, 2),
(72, 21, '9090', '00:05', 2, 2),
(73, 21, '9090', '00:06', 2, 2),
(75, 21, '9090', '00:11', 2, 2),
(76, 21, '9090', '00:11', 2, 2),
(77, 21, '9090', '00:24', 2, 2),
(78, 21, '9090', '00:24', 2, 2),
(79, 21, '9090', '00:25', 2, 2),
(81, 21, '9090', '08:27', 27, 2),
(83, 21, '9090', '21:00', 27, 2),
(84, 21, '9080', '21:01', 27, 2),
(85, 23, '9191', '19:12', 24, 6),
(86, 23, '9191', '19:16', 25, 6),
(87, 23, '9191', '19:40', 25, 6),
(88, 23, '9191', '19:49', 25, 6),
(89, 23, '9191', '19:49', 25, 6),
(90, 23, '9191', '19:49', 25, 6),
(91, 23, '9191', '19:56', 25, 6),
(92, 23, '9191', '19:57', 25, 6),
(93, 23, '9191', '20:41', 25, 6),
(94, 23, '9191', '20:41', 25, 6),
(95, 23, '9191', '20:42', 25, 6),
(96, 23, '9191', '20:42', 26, 6),
(97, 23, '9191', '20:43', 26, 6),
(98, 23, '9191', '20:45', 26, 6),
(99, 23, '9191', '20:45', 26, 6),
(100, 23, '9191', '20:47', 26, 6),
(101, 23, '9191', '20:49', 26, 6),
(102, 23, '9191', '20:53', 26, 6),
(110, 29, '900', '15:13', 2, 2),
(111, 29, '900', '22:40', 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `full`
--

CREATE TABLE `full` (
  `id` int(5) NOT NULL,
  `data` date NOT NULL,
  `arduino` int(5) NOT NULL,
  `ph_minimo` int(5) NOT NULL,
  `ph_maximo` int(5) NOT NULL,
  `temp_minima` int(5) NOT NULL,
  `temp_maxima` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `full`
--

INSERT INTO `full` (`id`, `data`, `arduino`, `ph_minimo`, `ph_maximo`, `temp_minima`, `temp_maxima`) VALUES
(7, '2021-09-20', 9090, 1, 5, 2, 22),
(8, '2021-09-21', 9090, 2, 2, 2, 27),
(9, '2021-09-21', 900, 2, 2, 2, 2),
(10, '2021-09-21', 9080, 2, 2, 27, 27),
(11, '2021-09-23', 9191, 6, 6, 24, 26),
(12, '2021-09-25', 900, 2, 2, 2, 2),
(13, '2021-09-27', 900, 2, 2, 2, 2),
(14, '2021-09-28', 900, 2, 2, 2, 2),
(15, '2021-09-29', 900, 2, 2, 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `realtime`
--

CREATE TABLE `realtime` (
  `id` int(11) NOT NULL,
  `arduino` int(6) NOT NULL,
  `temperatura` varchar(5) NOT NULL,
  `ph` varchar(5) NOT NULL,
  `hora` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `realtime`
--

INSERT INTO `realtime` (`id`, `arduino`, `temperatura`, `ph`, `hora`) VALUES
(3, 9090, '27', '2', '21:00'),
(12, 9191, '0', '0', '00:00'),
(13, 1234, '0', '0', '00:00'),
(14, 1, '0', '0', '00:00'),
(15, 9876, '0', '0', '00:00'),
(16, 5678, '0', '0', '00:00'),
(17, 3658, '0', '0', '00:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tokens`
--

CREATE TABLE `tokens` (
  `id` int(3) NOT NULL,
  `token` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `validade` date NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `arduino` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `tokens`
--

INSERT INTO `tokens` (`id`, `token`, `validade`, `email`, `arduino`) VALUES
(6, '34f7549993c679752f6e2b88610ed104', '2021-10-25', 'boteistem@gmail.com', 9090);

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `arduino` int(5) NOT NULL,
  `token` varchar(32) NOT NULL,
  `token_status` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`id`, `nome`, `sobrenome`, `email`, `senha`, `celular`, `arduino`, `token`, `token_status`) VALUES
(1, 'Cyber', 'Root', 'boteistem@gmail.com', '9090Ab.', '18997479949', 9090, '67604ee959e8990ba1fe3938dc85e78a', 'true'),
(3, 'Thiago', 'Batista', 'thiago.chagas.batista@gmail.com', 'senha', '18996418170', 9191, '', ''),
(4, '<img src onerror=\"alert(ola);\">', '<h1>hacker</h1>', 'lgfranco22@live.com', 'root1234', '19996496681', 1234, '', ''),
(5, 'cris', 'nome', 'cristian.negrizolli@etec.sp.gov.br', '654321', '1899218748', 1, '', ''),
(6, 'Bruno', 'V.', 'contatocomercialcyber@gmail.com', 'abcd1234', '18997479949', 9876, '', ''),
(7, 'Bruno', 'V.', 'jpowejopd@gmail.com', '9090', '18997479949', 5678, '', ''),
(8, 'C6ber', 'Aaa', 'endrew.lucas.snap@gmail.com', 'jdjkdid', '18997479949', 3658, '', '');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `alerta`
--
ALTER TABLE `alerta`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `diaria`
--
ALTER TABLE `diaria`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `full`
--
ALTER TABLE `full`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `realtime`
--
ALTER TABLE `realtime`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tokens`
--
ALTER TABLE `tokens`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alerta`
--
ALTER TABLE `alerta`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT de tabela `diaria`
--
ALTER TABLE `diaria`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;

--
-- AUTO_INCREMENT de tabela `full`
--
ALTER TABLE `full`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `realtime`
--
ALTER TABLE `realtime`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `tokens`
--
ALTER TABLE `tokens`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
