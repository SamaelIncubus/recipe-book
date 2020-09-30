drop database if exists recipe_book ;
create database recipe_book;
use recipe_book;

SET GLOBAL time_zone = '+1:00';

CREATE TABLE `cheft` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL DEFAULT 'Anónimo',
  `prestige` varchar(45) NOT NULL DEFAULT 'Desconocido',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `ingredient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `cheft` int(11) NOT NULL,
  `category` int(11) NOT NULL,
  `ingredient_1` int(11) NOT NULL,
  `ingredient_2` int(11) NOT NULL,
  `ingredient_3` int(11) NOT NULL,
  `ingredient_4` int(11) NOT NULL,
  `ingredient_5` int(11) NOT NULL,
  `ingredient_6` int(11) NOT NULL,
  `ingredient_7` int(11) NOT NULL,
  `ingredient_8` int(11) NOT NULL,
  `ingredient_9` int(11) NOT NULL,
  `step_1` varchar(100) NOT NULL,
  `step_2` varchar(100) NOT NULL,
  `step_3` varchar(100) DEFAULT NULL,
  `step_4` varchar(100) DEFAULT NULL,
  `step_5` varchar(100) DEFAULT NULL,
  `step_6` varchar(100) DEFAULT NULL,
  `step_7` varchar(100) DEFAULT NULL,
  `step_8` varchar(100) DEFAULT NULL,
  `step_9` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cheft_idx` (`cheft`),
  KEY `category_idx` (`category`),
  KEY `ingredient_1_idx` (`ingredient_1`),
  KEY `ingredient_2_idx` (`ingredient_2`),
  KEY `ingredient_3_idx` (`ingredient_3`),
  KEY `ingredient_4_idx` (`ingredient_4`),
  KEY `ingredient_5_idx` (`ingredient_5`),
  KEY `ingredient_6_idx` (`ingredient_6`),
  KEY `ingredient_7_idx` (`ingredient_7`),
  KEY `ingredient_8_idx` (`ingredient_8`),
  KEY `ingredient_9_idx` (`ingredient_9`),
  CONSTRAINT `cheft` FOREIGN KEY (`cheft`) REFERENCES `cheft` (`id`),
  CONSTRAINT `category` FOREIGN KEY (`category`) REFERENCES `category` (`id`),
  CONSTRAINT `ingredient_1` FOREIGN KEY (`ingredient_1`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_2` FOREIGN KEY (`ingredient_2`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_3` FOREIGN KEY (`ingredient_3`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_4` FOREIGN KEY (`ingredient_4`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_5` FOREIGN KEY (`ingredient_5`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_6` FOREIGN KEY (`ingredient_6`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_7` FOREIGN KEY (`ingredient_7`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_8` FOREIGN KEY (`ingredient_8`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_9` FOREIGN KEY (`ingredient_9`) REFERENCES `ingredient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into cheft values (null, 'Abuela', 'Ama de casa');
insert into cheft values (null, 'Joel Robuchon ', '32 estrellas Michelin');

insert into ingredient values (null, '');
insert into ingredient values (null, 'Manzana');
insert into ingredient values (null, 'Azucar');
insert into ingredient values (null, 'Café');
insert into ingredient values (null, 'Leche');
insert into ingredient values (null, 'Arroz');
insert into ingredient values (null, 'Mango');
insert into ingredient values (null, 'Limón');
insert into ingredient values (null, 'Filete de pollo');
insert into ingredient values (null, 'Pan rallado');
insert into ingredient values (null, 'Huevo');


insert into category values (null, 'Principal');
insert into category values (null, 'Acompañante');
insert into category values (null, 'Postre');
insert into category values (null, 'Bebida');

insert into recipe values (null, 'Tacos de manzana caramelizados', 1, 3, 2, 3, 1, 1, 1, 1, 1, 1, 1, 'Pelamos la manzana y la cortamos en tacos', 'Rebozamos los tacos en azucar', 'Lo cocemos al baño Maria durante 2 horas', 'Servimos y dejamos reposar unos 2 minutos', null, null, null, null, null);
insert into recipe values (null, 'Cortado', 1, 4, 4, 5, 3, 1, 1, 1, 1, 1, 1,'Calentamos la leche y el café en cazo', 'Lo servimos en un vaso y azucaramos al gusto', null, null, null, null, null, null, null);
insert into recipe values (null, 'Arroz de mango', 2, 2, 7, 5, 8, 3, 1, 1, 1, 1, 1,'Pelamos 40g de mango, 3g de limón', 'Vertimos en cazo 200g de leche, 20g azucar, el mango y el limón y trituramos con una minipimer', 'Añadimos el arroz al cazo y cocemos ha fuego lento durante 1 hora', 'Reposamos el arroz durante 20 minutos', 'Colamos el arroz y servimos', null, null, null, null);
insert into recipe values (null, 'Filete empanados', 1, 1, 9, 10, 11, 8, 1, 1, 1, 1, 1, 'Cogemos el filete y lo bañamos en huevo, después en pan rallado', 'Freimos los filetes empanado en una sarten ha fuego medio hasta dorar el empanado', 'Servimos y añadimos un chorro de limón por encima', null, null, null, null, null, null);

select * from cheft;
select * from ingredient;
select * from category;
select * from recipe;