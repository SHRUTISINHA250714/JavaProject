#  Airline Management System

An Airline Management System is a software application developed to streamline and manage the complete operations of an airline. It handles tasks such as flight scheduling, ticket bookings, flight cancellations, customer assistance, and staff coordination. Additionally, the system provides easy access to daily flight updates, enhancing overall efficiency and user experience.

## Technologies Used

- **Programming Language**: Core Java (Swing & AWT)
- **Database**: MySQL
- **IDE**: NetBeans

## Features

- Flight scheduling and daily updates
- Air ticket reservation system
- Flight booking cancellations
- Customer management
- User-friendly graphical interface

## How to Run

1. Clone or download the repository.
2. Open the project in NetBeans IDE.
3. Make sure your MySQL Server is running.
4. Set up the database by executing the provided `TableCreation.sql` script.
5. Update the database connection settings inside `Conn.java`.
6. Run the `Home.java` file to start the application.

## Project Structure

- **AddCustomer.java** – Add and manage customer details
- **BookFlight.java** – Flight booking interface
- **BoardingPass.java** – Boarding pass generation
- **Cancel.java** – Flight booking cancellation module
- **FlightInfo.java** – Manage and display flight information
- **JourneyDetails.java** – Capture journey-specific information
- **Login.java** – User authentication system
- **Home.java** – Main dashboard for navigation
- **Conn.java** – Handles database connectivity

## External Libraries Used

- **jcalendar-tz-1.3.3-4.jar** – Calendar and date-picker component
- **mysql-connector-java-8.0.28.jar** – MySQL-Java database connector
- **rs2xml.jar** – To display SQL ResultSet into JTable
