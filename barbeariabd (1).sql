-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 29-Nov-2022 às 05:01
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `barbeariabd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbladm`
--

CREATE TABLE `tbladm` (
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbladm`
--

INSERT INTO `tbladm` (`usuario`, `senha`) VALUES
('administrador', 'adm123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblagendamento`
--

CREATE TABLE `tblagendamento` (
  `cod_cliente` int(4) NOT NULL,
  `barbeiro` varchar(10) NOT NULL,
  `corte` text NOT NULL,
  `data` varchar(10) NOT NULL,
  `horario` varchar(5) NOT NULL,
  `valor` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tblagendamento`
--

INSERT INTO `tblagendamento` (`cod_cliente`, `barbeiro`, `corte`, `data`, `horario`, `valor`) VALUES
(1, 'Henrique', 'Blowout', '30/11/2022', '13:30', ''),
(2, 'Danilo', 'Comb Over', '02/12/2022', '10:00', ''),
(3, 'Jo?o', 'Bowl Cut', '30/11/2022', '18:00', ''),
(4, 'Jo?o', 'Comb Over', '05/12/2022', '09:30', ''),
(5, 'Jo?o', 'Comb Over', '29/11/2022', '17:30', ''),
(6, 'Joao', 'Crew Cut', '29/11/2022', '10:00', ''),
(7, 'Lucas', 'Bowl Cut', '29/11/2022', '09:00', '25,00'),
(8, 'Joao', 'Blowout', '29/11/2022', '08:00', '40,00'),
(9, 'Henrique', 'Blowout', '28/11/2022', '09:00', '40,00'),
(10, 'Joao', 'Bowl Cut', '29/11/2022', '08:30', '25,00'),
(11, 'Joao', 'Comb Over', '29/11/2022', '09:00', '20,00'),
(12, 'Henrique', 'Bowl Cut', '29/11/2022', '09:00', '25,00'),
(13, 'Henrique', 'Blowout', '03/12/2022', '10:30', '40,00'),
(14, 'Joao', 'Blowout', '30/11/2022', '08:30', '40,00'),
(15, 'Victor', 'Comb Over', '12/12/2022', '12:00', '20,00'),
(16, 'Joao', 'Comb Over', '30/11/2022', '08:30', '20,00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblcliente`
--

CREATE TABLE `tblcliente` (
  `cod_cliente` int(4) NOT NULL,
  `nome` text NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `email` varchar(35) NOT NULL,
  `dat_Nasc` varchar(10) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tblcliente`
--

INSERT INTO `tblcliente` (`cod_cliente`, `nome`, `telefone`, `email`, `dat_Nasc`, `cpf`, `rg`) VALUES
(15, 'Lucas', '11111111111', 'lucas@gmail.com', '11/11/1111', '11111111111', '11111111'),
(16, 'Lucas Pereira Carvalho', '11111111', 'lucas@gmail.com', '3423', '4254543', '6364464'),
(17, '', '', '', '', '', ''),
(18, '', '', '', '', '', ''),
(19, '', '', '', '', '', ''),
(20, '', '', '', '', '', ''),
(21, '', '', '', '', '', ''),
(22, '', '', '', '', '', ''),
(23, '', '', '', '', '', ''),
(24, '', '', '', '', '', ''),
(25, '', '', '', '', '', ''),
(26, '', '', '', '', '', ''),
(27, '', '', '', '', '', ''),
(28, '', '', '', '', '', ''),
(29, '', '', '', '', '', ''),
(30, '', '', '', '', '', ''),
(31, 'Eduardo', '1111111111', 'eduardocaralho@gmil.com', '02/11/1969', '45805582864', '53011060');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblusuario`
--

CREATE TABLE `tblusuario` (
  `cod_cliente` int(4) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tblusuario`
--

INSERT INTO `tblusuario` (`cod_cliente`, `usuario`, `senha`) VALUES
(8, 'lucas1', '12345'),
(9, 'tamiris', '123'),
(10, 'luquinhas', 'luquinhas123'),
(13, 'luqueta123', '123456'),
(14, 'oi', '1234'),
(15, 't', 'tchau'),
(16, 'tttttttttttt', 'tchauu'),
(17, 'usuario', 'senha'),
(18, 'l', 'l123'),
(19, 'lucas12345', 'lucas12345'),
(20, 'a', '123');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbladm`
--
ALTER TABLE `tbladm`
  ADD PRIMARY KEY (`usuario`);

--
-- Índices para tabela `tblagendamento`
--
ALTER TABLE `tblagendamento`
  ADD PRIMARY KEY (`cod_cliente`);

--
-- Índices para tabela `tblcliente`
--
ALTER TABLE `tblcliente`
  ADD PRIMARY KEY (`cod_cliente`);

--
-- Índices para tabela `tblusuario`
--
ALTER TABLE `tblusuario`
  ADD PRIMARY KEY (`cod_cliente`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tblagendamento`
--
ALTER TABLE `tblagendamento`
  MODIFY `cod_cliente` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `tblcliente`
--
ALTER TABLE `tblcliente`
  MODIFY `cod_cliente` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de tabela `tblusuario`
--
ALTER TABLE `tblusuario`
  MODIFY `cod_cliente` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
