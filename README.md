# Cheater Detector During Online Test

## 📋 Overview

**Cheater Detector During Online Test** is a Java-based online exam platform designed to help universities manage secure online tests and detect cheating attempts. It supports multiple teachers creating multiple tests for assigned students. The system prevents unauthorized account creation and uses AES encryption for data protection.

## 🔐 Security Features

- Uses **AES encryption** to securely store passwords and exam questions.
- Prevents plain-text storage or transmission of sensitive data.


### Teacher
- Creates and manages multiple tests.
- Sets and edits exam questions.
- Receives **notifications if a student changes or leaves the exam window**.
- Views **average marks** obtained by students in each test.

### Student
- Can only log in with an account created by the administrator.
- Takes assigned tests within the platform.
- Can view their individual test results.

## ✅ Key Features

- 🔐 AES encryption for secure password and question handling.
- 👨‍🏫 Multiple teachers can hold multiple tests simultaneously.
- 🧠 Real-time cheating detection via exam window monitoring.
- 📊 Teachers can view average marks of students.
- 🧾 Students can view results for each test they attempted.
- 📝 Teachers have full control over question creation and test setup.
- 
---
## 🚀 How to Run

1. **Extract the Project:**
   - Download and extract the `virtualinvigilator.zip` file.

2. **Open in NetBeans:**
   - Open NetBeans IDE.
   - Go to `File` > `Open Project` and select the extracted folder.

3. **Add MySQL Connector:**
   - Download the MySQL JDBC connector (`mysql-connector-java-x.x.xx.jar`).
   - Right-click the project in NetBeans.
   - Go to `Properties` > `Libraries` > `Add JAR/Folder` and add the connector JAR.

4. **Set Up Database:**
   - Start your local server using XAMPP or similar.
   - Open `phpMyAdmin` at [http://localhost/phpmyadmin](http://localhost/phpmyadmin).
   - Create a new database.
   - Import the provided `.sql` file to create necessary tables and data.

5. **Run the Project:**
   - Click the green run button in NetBeans to start the application.

---
## 🛠 Technologies Used

- **Java (Swing)** — For graphical user interface.
- **Java Socket Programming** — For communication between client and server.
- **MySQL** — For database storage.
- **AES Encryption** — For securing sensitive information.

## 🚀 Future Enhancements

- Assigns specific tests to selected students.
- Add performance analytics and trends for students.
- Integrate webcam or screen-sharing for advanced cheating detection.
- Enable email or SMS notifications for test activity.
- Create an admin dashboard for better test and user management.

---

> Developed as a secure and smart platform for managing online tests and promoting academic integrity in university environments.
