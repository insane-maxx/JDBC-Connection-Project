CREATE DATABASE IF NOT EXISTS scholarship_db;
USE scholarship_db;

CREATE TABLE IF NOT EXISTS applications (
    app_id      INT PRIMARY KEY AUTO_INCREMENT,
    student     VARCHAR(100),
    percentage  DECIMAL(5,2),
    income      INT,
    eligible    BOOLEAN,
    status      ENUM('pending', 'approved', 'rejected') DEFAULT 'pending',
    applied_on  DATE DEFAULT (CURRENT_DATE)
);