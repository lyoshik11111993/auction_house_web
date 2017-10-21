
CREATE TABLE `bid` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `size` int(11) NOT NULL,
  `product_id` int(11) unsigned DEFAULT NULL,
  `buyer_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_bid_product_idx_idx` (`product_id`),
  KEY `fk_bid_buyer_idx_idx` (`buyer_id`),
  CONSTRAINT `fk_bid_buyer_idx` FOREIGN KEY (`buyer_id`) REFERENCES `Buyer` (`id`),
  CONSTRAINT `fk_bid_product_idx` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

CREATE TABLE `Buyer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

CREATE TABLE `product` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `seller_id` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_product_seller_idx_idx` (`seller_id`),
  CONSTRAINT `fk_product_seller_idx` FOREIGN KEY (`seller_id`) REFERENCES `Seller` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

CREATE TABLE `Seller` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

INSERT INTO `bid` VALUES (1,1000,1,3),(2,250,2,2),(3,400,3,1),(4,500,4,4),(5,2500,5,6),(6,600,6,8),(7,150,7,7),(8,170,8,5),(9,2000,9,10),(10,1650,10,10);
INSERT INTO `Buyer` VALUES (1,'Felicia'),(2,'Mark'),(3,'Tremor'),(4,'Abigail'),(5,'Jeck'),(6,'Sem'),(7,'Rob'),(8,'Maks'),(9,'Luis'),(10,'Jully');
INSERT INTO `product` VALUES (1,'dress',2),(2,'glasses',2),(3,'sword',4),(4,'book',3),(5,'shoes',5),(6,'hat',1),(7,'ring',3),(8,'table',4),(9,'cup',4),(10,'bottle',1);
INSERT INTO `Seller` VALUES (1,'Rob'),(2,'Stiv'),(3,'Frenk'),(4,'John'),(5,'Brendon');

