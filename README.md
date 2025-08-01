# JDBC Employee Database Project

This project demonstrates how to connect a Java program to a MySQL database using **JDBC**.  
It performs **Insert** and **Select** operations on an `Employeee` table.

---

## 📂 Project Structure
```
JDBC/
│── JDBC.java                  # Main Java program
│── employee.sql               # SQL file to create database and table
│── mysql-connector-j-x.x.xx.jar  # MySQL JDBC driver (add manually)
│── README.md                  # Documentation
```

---

## ⚙️ Prerequisites
- Java 8 or higher  
- MySQL Server (running on `localhost:3306`)  
- MySQL Connector/J (JAR file)  
- Visual Studio Code with **Extension Pack for Java**

---

## 🛠️ Database Setup

Run the following commands in **MySQL Command Line** or **Workbench**:

```sql
CREATE DATABASE jdbc;
USE jdbc;

CREATE TABLE Employeee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10,2)
);

SELECT * FROM Employeee;
```

---

## 📥 Add MySQL Connector

1️⃣ Download MySQL Connector/J → https://dev.mysql.com/downloads/connector/j/  
2️⃣ Place the JAR file in your project folder.  
3️⃣ In VS Code, **add the JAR to Referenced Libraries**:  
   - Open **Java Projects** (bottom-left panel).  
   - Right-click **Referenced Libraries → Add External JARs**.  
   - Select the MySQL Connector JAR file.  

---

## ▶️ How to Run in VS Code

### 1️⃣ Open Your Project in VS Code
* Open the folder where you saved:
  * `JDBC.java`
  * `employee.sql`
  * MySQL Connector JAR file

### 2️⃣ Install Required Extensions
* Install these VS Code extensions:
  ✅ **Extension Pack for Java** (by Microsoft)  
  ✅ **MySQL** (optional, for managing the database inside VS Code)

### 3️⃣ Add MySQL Connector to the Project
1. In VS Code, go to **Java Projects** (bottom-left panel).  
2. Under your project, **right-click Referenced Libraries → Add External JARs**.  
3. Select your downloaded **mysql-connector-j-x.x.xx.jar** file.

### 4️⃣ Create Database and Table
* Open MySQL Workbench or MySQL Command Line.  
* Run the commands from `employee.sql`:

```sql
CREATE DATABASE jdbc;
USE jdbc;
CREATE TABLE Employeee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10,2)
);
```

### 5️⃣ Run the Program
1. Open `JDBC.java` in VS Code.  
2. At the top right, click the **▶ Run** button.  
3. VS Code will compile and run the program automatically.

### 6️⃣ Check Output
✅ The terminal in VS Code will display:
* Messages for inserted rows.  
* A table of all employees.

---

## 📜 Sample Output

```
EXECUTING INSERT OPERATION
1 row(s) inserted successfully.
1 row(s) inserted successfully.
1 row(s) inserted successfully.
1 row(s) inserted successfully.

---EXECUTING SELECT OPERATION---
EMPLOYEE DATA
--------
ID: 1, NAME: Rohini, SALARY: $50000.00
ID: 2, NAME: Rohi, SALARY: $70000.00
ID: 3, NAME: Kavya, SALARY: $80000.00
ID: 4, NAME: Deepika, SALARY: $90000.00
```

---

## 🚀 Features Used
- ✅ JDBC `DriverManager` for database connection  
- ✅ `PreparedStatement` for secure parameterized queries  
- ✅ `try-with-resources` for automatic resource closing  
- ✅ Prevents SQL Injection  


