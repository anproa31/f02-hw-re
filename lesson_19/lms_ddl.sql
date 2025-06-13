CREATE TABLE Member
(

    CardNo        VARCHAR(5)  NOT NULL,

    Surname       VARCHAR(15) NOT NULL,

    Name          VARCHAR(15) NOT NULL,

    Address       VARCHAR(50) NOT NULL,

    Birthday_Date DATE        NOT NULL,

    Gender        CHAR(1) CHECK (Gender IN ('M', 'F')),

    Phone_No      VARCHAR(15) NOT NULL,

    PRIMARY KEY (CardNo)

);

CREATE TABLE Employee
(

    Emp_Id        INT AUTO_INCREMENT PRIMARY KEY,

    Surname       VARCHAR(15) NOT NULL,

    Name          VARCHAR(15) NOT NULL,

    Birthday_Date DATE        NOT NULL,

    Emp_Date      timestamp

);

CREATE TABLE Publisher
(

    Pub_Id   INT AUTO_INCREMENT PRIMARY KEY,

    Name     VARCHAR(50) NOT NULL,

    City     VARCHAR(50) NOT NULL,

    Phone_No VARCHAR(15) NOT NULL

);

CREATE TABLE Book
(

    Book_Id VARCHAR(5)   NOT NULL,

    Type    VARCHAR(20) CHECK (Type IN ('novel', 'historical', 'for kids', 'poems', 'crime story', 'science fiction', 'science')),

    Price   DECIMAL(8, 3),

    Title   VARCHAR(255) NOT NULL,

    Pub_Id  INT          NOT NULL,

    PRIMARY KEY (Book_Id),

    FOREIGN KEY (Pub_Id) REFERENCES Publisher (Pub_Id)

);

CREATE TABLE Book_Invoice
(

    Invoice_No INT AUTO_INCREMENT PRIMARY KEY,

    Due_Date   timestamp,

    Date_Out   timestamp,

    Penalty    DECIMAL(8, 3) DEFAULT 0,

    CardNo     VARCHAR(5),

    Emp_Id     INT,

    Book_Id    VARCHAR(5) UNIQUE,

    FOREIGN KEY (CardNo) REFERENCES Member (CardNo),

    FOREIGN KEY (Emp_Id) REFERENCES Employee (Emp_Id),

    FOREIGN KEY (Book_Id) REFERENCES Book (Book_Id),

    CHECK (Date_Out < Due_Date)

);

INSERT INTO Member (CardNo, Surname, Name, Address, Birthday_Date, Gender, Phone_No)
VALUES ('M0001', 'Nguyen', 'Van A', '123 Main Street', '1990-01-15', 'M', '0123456789'),

       ('M0002', 'Tran', 'Thi B', '456 Oak Avenue', '1985-05-20', 'F', '0987654321'),

       ('M0003', 'Le', 'Van C', '789 Elm Lane', '1992-09-10', 'M', '0112233445'),

       ('M0004', 'Pham', 'Thi D', '987 Pine Road', '1988-03-25', 'F', '0765432109'),

       ('M0005', 'Hoang', 'Van E', '654 Cedar Street', '1995-07-12', 'M', '0345678901'),

       ('M0006', 'Do', 'Thi F', '321 Birch Blvd', '1983-11-05', 'F', '0556677889'),

       ('M0007', 'Truong', 'Van G', '876 Maple Ave', '1998-02-18', 'M', '0234567890'),

       ('M0008', 'Nguyen', 'Thi H', '234 Oak St', '1980-06-30', 'F', '0888777666'),

       ('M0009', 'Le', 'Van I', '543 Elm Lane', '1993-12-08', 'M', '0999888777'),

       ('M0010', 'Pham', 'Thi K', '765 Pine Road', '1987-04-22', 'F', '0444333222');

INSERT INTO Employee (Surname, Name, Birthday_Date, Emp_Date)
VALUES ('Tran', 'Van A', '1985-03-10', '2022-01-01 08:00:00'),

       ('Nguyen', 'Thi B', '1990-07-25', '2022-02-15 09:30:00'),

       ('Hoang', 'Van C', '1988-11-18', '2022-03-20 10:45:00'),

       ('Le', 'Thi D', '1993-05-02', '2022-04-10 11:15:00'),

       ('Do', 'Van E', '1980-09-14', '2022-05-05 12:30:00'),

       ('Pham', 'Thi F', '1995-01-28', '2022-06-22 13:45:00'),

       ('Truong', 'Van G', '1983-07-08', '2022-07-15 14:20:00'),

       ('Nguyen', 'Thi H', '1998-12-03', '2022-08-08 15:00:00'),

       ('Le', 'Van I', '1987-04-17', '2022-09-01 16:10:00'),

       ('Pham', 'Thi K', '1992-08-22', '2022-10-05 17:25:00');

INSERT INTO Publisher (Name, City, Phone_No)
VALUES ('ABC Publications', 'Hanoi', '0123456789'),

       ('XYZ Publishing', 'Ho Chi Minh City', '0987654321'),

       ('PQR Books', 'Da Nang', '0112233445'),

       ('LMN Press', 'Hue', '0765432109'),

       ('OPQ Printers', 'Can Tho', '0345678901'),

       ('RST Publishers', 'Nha Trang', '0556677889'),

       ('UVW Books', 'Vung Tau', '0234567890'),

       ('HIJ Press', 'Phan Thiet', '0888777666'),

       ('EFG Publishers', 'Bien Hoa', '0999888777'),

       ('KLM Printing', 'Long Xuyen', '0444333222');

INSERT INTO Book (Book_Id, Type, Price, Title, Pub_Id)
VALUES ('B0001', 'novel', 25.99, 'The Lost City', 1),

       ('B0002', 'historical', 19.95, 'Ancient Chronicles', 2),

       ('B0003', 'for kids', 12.50, 'Adventure in Wonderland', 3),

       ('B0004', 'poems', 15.75, 'Whispers of the Heart', 4),

       ('B0005', 'crime story', 30.50, 'Midnight Shadows', 5),

       ('B0006', 'science fiction', 22.99, 'Galactic Odyssey', 6),

       ('B0007', 'science', 18.75, 'The Quantum Universe', 3),

       ('B0008', 'novel', 27.50, 'Eternal Love', 8),

       ('B0009', 'historical', 21.95, 'The Silk Road', 9),

       ('B0010', 'for kids', 14.99, 'Magic Kingdom', 10),

       ('B0011', 'novel', 26.50, 'Beyond the Horizon', 1),

       ('B0012', 'poems', 14.25, 'Voices in the Wind', 3),

       ('B0013', 'science fiction', 23.75, 'Time Travelers', 3),

       ('B0014', 'crime story', 32.00, 'Underworld Secrets', 4),

       ('B0015', 'historical', 20.50, 'In the Shadows of Time', 5),

       ('B0016', 'novel', 28.75, 'Uncharted Destinies', 6),

       ('B0017', 'for kids', 16.99, 'Enchanted Forest', 2),

       ('B0018', 'science', 24.50, 'Exploring the Cosmos', 8),

       ('B0019', 'novel', 30.25, 'Infinite Dreams', 3),

       ('B0020', 'poems', 16.50, 'Silent Whispers', 6);

INSERT INTO Book_Invoice (Due_Date, Date_Out, CardNo, Emp_Id, Book_Id)
VALUES ('2023-01-15 17:00:00', '2023-01-05 14:30:00', 'M0001', 1, 'B0001'),

       ('2023-02-20 18:30:00', '2023-02-10 11:45:00', 'M0002', 2, 'B0002'),

       ('2023-03-10 15:15:00', '2023-03-01 10:00:00', 'M0003', 3, 'B0003'),

       ('2023-04-25 16:45:00', '2023-04-15 13:20:00', 'M0004', 4, 'B0004'),

       ('2023-07-12 12:00:00', '2023-07-02 09:30:00', 'M0005', 3, 'B0005'),

       ('2023-06-22 14:30:00', '2023-06-12 12:15:00', 'M0006', 6, 'B0006'),

       ('2023-08-18 16:15:00', '2023-08-08 15:45:00', 'M0007', 7, 'B0007'),

       ('2023-10-30 17:45:00', '2023-10-20 14:20:00', 'M0008', 3, 'B0008'),

       ('2023-12-25 20:00:00', '2023-12-15 18:30:00', 'M0009', 9, 'B0009'),

       ('2024-01-15 17:30:00', '2024-01-05 15:15:00', 'M0010', 10, 'B0010'),

       ('2024-02-18 18:45:00', '2024-02-08 11:30:00', 'M0001', 1, 'B0011'),

       ('2024-03-10 14:15:00', '2024-03-01 09:45:00', 'M0002', 2, 'B0012'),

       ('2024-04-25 16:30:00', '2024-04-15 13:00:00', 'M0003', 3, 'B0013'),

       ('2024-07-12 11:45:00', '2024-07-02 09:15:00', 'M0004', 2, 'B0014'),

       ('2024-06-22 14:00:00', '2024-06-12 11:30:00', 'M0005', 5, 'B0015'),

       ('2024-08-18 16:00:00', '2024-08-08 15:30:00', 'M0006', 6, 'B0016'),

       ('2024-10-30 17:15:00', '2024-10-20 13:45:00', 'M0007', 2, 'B0017'),

       ('2024-12-25 19:30:00', '2024-12-15 18:00:00', 'M0008', 8, 'B0018'),

       ('2025-01-15 17:15:00', '2025-01-05 14:45:00', 'M0009', 8, 'B0019'),

       ('2025-02-18 18:30:00', '2025-02-08 11:15:00', 'M0010', 3, 'B0020');

