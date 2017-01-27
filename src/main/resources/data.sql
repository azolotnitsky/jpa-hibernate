GRANT ALL ON TABLE drivers TO root 
GRANT ALL ON TABLE orders TO root 

INSERT INTO drivers (id, fio) VALUES ('1', 'Ivanov Ivan Ivanovich');
INSERT INTO drivers (id, fio) VALUES ('2', 'Petrov Petr Petrovich');
INSERT INTO drivers (id, fio) VALUES ('3', 'Sidorov Sidor Sidorovich');

INSERT INTO orders (id, address, status, driver_id) VALUES ('1', 'Sovetskaya 11/47', '0', '1');
INSERT INTO orders (id, address, status, driver_id) VALUES ('2', 'Michurina 55/61', '0', '1');
INSERT INTO orders (id, address, status, driver_id) VALUES ('3', 'Radisheva 19', '0', '1');
INSERT INTO orders (id, address, status, driver_id) VALUES ('4', 'Komsomolskaya 3', '0', '2');
INSERT INTO orders (id, address, status, driver_id) VALUES ('5', 'Lunnaya 13', '0', '2');


