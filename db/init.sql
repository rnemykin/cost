CREATE TABLE category
(
  id INTEGER PRIMARY KEY,
  type TEXT NOT NULL UNIQUE ,
  tags TEXT
);
CREATE TABLE cost
(
  id INTEGER PRIMARY KEY,
  description TEXT,
  date DATETIME NOT NULL,
  amount REAL NOT NULL,
  id_category INTEGER NOT NULL,
  FOREIGN KEY (id_category) REFERENCES category(id) on delete CASCADE
);

CREATE TABLE income
(
  id INTEGER PRIMARY KEY,
  date DATETIME NOT NULL,
  amount REAL NOT NULL,
  description TEXT NULL,
  id_category INTEGER NOT NULL,
  FOREIGN KEY (id_category) REFERENCES category(id) on delete CASCADE
);

-- data
insert into category (type, tags) values('CLOTHES', 'Одежда');
insert into category (type, tags) values('PUBLIC_SERVICE', 'Коммунальные услуги');
insert into category (type, tags) values('FOOD', 'Еда');
insert into category (type, tags) values('ENTERTAINMENT', 'Развлечение, отдых');
insert into category (type, tags) values('CAR', 'Авто, машина, бензин, автострахование');
insert into category (type, tags) values('HOUSEHOLD_CHEMICALS', 'Бытовая химия, шампунь, зубная паста');