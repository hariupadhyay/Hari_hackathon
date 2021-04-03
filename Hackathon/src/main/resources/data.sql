CREATE TABLE ORDER (
  order_id INT AUTO_INCREMENT  PRIMARY KEY,
  stock_id INT,
  stock_name VARCHAR(250) NOT NULL,
  order_quantity INT NOT NULL,
  order_type VARCHAR(250) NOT NULL,
  price
  order_status VARCHAR(250) NOT NULL,
  order_date DATE NOT NULL,
);

CREATE TABLE STOCK (
  stock_id  INT AUTO_INCREMENT  PRIMARY KEY,
  stock_name VARCHAR(250) NOT NULL,
);

CREATE TABLE ORDER_EXECUTION (
  execution_id  INT AUTO_INCREMENT  PRIMARY KEY,
  stock_id INT NOT NULL,
  stock_name VARCHAR(250) NOT NULL,
  execution_quantity INT NOT NULL,
  execution_price INT NOT NULL,
  execution_date DATE NOT NULL,
);

CREATE TABLE MARKET (
  market_status VARCHAR(250) NOT NULL,
);




