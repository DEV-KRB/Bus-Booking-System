-- Create the database
CREATE DATABASE bus_booking_system;

-- Use the database
USE bus_booking_system;

-- Table for Admins
CREATE TABLE admins (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Table for Users (Passengers)
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Table for Bus Operators
CREATE TABLE operators (
    operator_id INT AUTO_INCREMENT PRIMARY KEY,
    operator_name VARCHAR(255) NOT NULL,
    contact_number VARCHAR(15) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Table for Buses
CREATE TABLE buses (
    bus_id INT AUTO_INCREMENT PRIMARY KEY,
    operator_id INT NOT NULL,
    bus_name VARCHAR(255) NOT NULL,
    source_location VARCHAR(255) NOT NULL,
    destination_location VARCHAR(255) NOT NULL,
    departure_datetime DATETIME NOT NULL,
    arrival_datetime DATETIME NOT NULL,
    total_seats INT NOT NULL,
    available_seats INT NOT NULL,
    fare DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (operator_id) REFERENCES operators (operator_id)
);

-- Table for Ticket Bookings
CREATE TABLE bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    bus_id INT NOT NULL,
    booking_datetime DATETIME NOT NULL,
    num_tickets INT NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (bus_id) REFERENCES buses (bus_id)
);
