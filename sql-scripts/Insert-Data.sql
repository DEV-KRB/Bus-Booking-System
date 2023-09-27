-- Insert data into the 'admins' table
INSERT INTO admins (username, password) VALUES
    ('Kavya Bansore', 'root@123'),
    ('Anshu Yadav', 'root@123');

-- Insert data into the 'users' table
INSERT INTO users (username, password) VALUES
    ('Manu Rama', 'root@123'),
    ('Hayat Noor', 'root@123');

-- Insert data into the 'operators' table
INSERT INTO operators (operator_name, contact_number, email) VALUES
    ('Aman Kumar', '923-456-7890', 'ak@gmail.com'),
    ('Rohit Aggrawal', '987-354-3210', 'ra@gmail.com');

-- Insert data into the 'buses' table
INSERT INTO buses (operator_id, bus_name, source_location, destination_location, departure_datetime, arrival_datetime, total_seats, available_seats, fare) VALUES
    (1, 'Shyam Travles', 'Banglore', 'Hyadrabad', '2023-09-28 10:00:00', '2023-09-28 14:00:00', 50, 25, 25.00),
    (2, 'Gopi Travels', 'Mumbai', 'Oune', '2023-09-28 12:00:00', '2023-09-28 16:00:00', 40, 30, 30.00);

-- Insert data into the 'bookings' table
INSERT INTO bookings (user_id, bus_id, booking_datetime, num_tickets, total_amount) VALUES
    (1, 1, '2023-09-28 09:30:00', 2, 50.00),
    (2, 2, '2023-09-28 11:30:00', 3, 90.00);
