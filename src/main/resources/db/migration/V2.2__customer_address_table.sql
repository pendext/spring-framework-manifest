create table customer_address (
  `id`int(10) unsigned not null auto_increment,
  `customer_id` int(10) unsigned not null,
  `street` VARCHAR(50) not null,
  `city` VARCHAR(50) not null,
  `state` VARCHAR(2) not null,
  `zip` int(5) not NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`customer_id`),
  CONSTRAINT `fk_customer_address` FOREIGN KEY (`customer_id`) REFERENCES customer (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;