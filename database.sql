create schema assignment;
set schema 'assignment';

CREATE TABLE animals (
                         animal_id INT PRIMARY KEY,
                         animal_regNum VARCHAR(20),
                         date DATE,
                         weight DECIMAL(10,2),
                         origin VARCHAR(50)
);

CREATE TABLE product (
                         product_id INT,
                         product_regNum VARCHAR(20),
                         animal_id INT,
                         FOREIGN KEY (animal_id) REFERENCES animals(animal_id)
);

INSERT INTO animals (animal_id, regNum, date, weight, origin)
VALUES
    (1, 'REG-001', '2022-03-01', 100.5, 'USA'),
    (2, 'REG-002', '2022-03-05', 80.2, 'Canada'),
    (3, 'REG-003', '2022-03-10', 120.3, 'Australia'),
    (4, 'REG-004', '2022-03-12', 90.1, 'USA'),
    (5, 'REG-005', '2022-03-15', 110.8, 'Canada');


INSERT INTO product (product_id, product_regNum, animal_id)
VALUES
    (1, 'PROD-001', 1),
    (1, 'PROD-001', 2),
    (2, 'PROD-002', 3),
    (2, 'PROD-002', 4),
    (2, 'PROD-002', 5),
    (3, 'PROD-003', 1),
    (3, 'PROD-003', 3),
    (4, 'PROD-004', 2),
    (4, 'PROD-004', 5),
    (5, 'PROD-005', 1);