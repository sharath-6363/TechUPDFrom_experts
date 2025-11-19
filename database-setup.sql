-- ========================================
-- Tech Updates Database Setup Script
-- ========================================

-- Create database
CREATE DATABASE IF NOT EXISTS TechUpdate;
USE TechUpdate;

-- Create user for the application (optional)
-- CREATE USER 'techuser'@'localhost' IDENTIFIED BY 'techpassword';
-- GRANT ALL PRIVILEGES ON TechUpdate.* TO 'techuser'@'localhost';
-- FLUSH PRIVILEGES;

-- Note: Tables will be auto-created by Spring Boot JPA
-- when you run the application for the first time

-- Sample data insertion (run after first application startup)
-- INSERT INTO admin_login (username, password) VALUES ('admin', 'admin123');
-- INSERT INTO update_category (category_name) VALUES 
--   ('Artificial Intelligence'),
--   ('Web Development'),
--   ('Mobile Development'),
--   ('Cloud Computing'),
--   ('Cybersecurity'),
--   ('Data Science'),
--   ('DevOps'),
--   ('Blockchain');

-- Verify database creation
SHOW DATABASES;
SELECT 'Database TechUpdate created successfully!' as Status;