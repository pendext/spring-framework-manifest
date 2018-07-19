create table customer (
  `id`int(10) unsigned not null auto_increment,
  `first_name` VARCHAR(50) not null,
  `last_name` VARCHAR(50) not NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`first_name`, `last_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;