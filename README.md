# 🧾 G&R Solutions Inventory System

This project is an **Inventory and Sales Management System** developed for a PC hardware and peripherals store.  
It is built primarily with **Java Swing**, using **MySQL** as the database, **JPA (Java Persistence API)** as the ORM, and **JasperSoft / JasperReports** for generating and viewing PDF reports.

---

## 🚀 Main Features

### 🛒 Product Management
- Register, edit, and delete products easily.  
- Generate detailed reports in **PDF** or **Excel** format.

### 💰 Sales Module
- Complete sales interface to manage all types of products.  
- Apply discounts, search for existing customers, or register new ones directly from the sales window.

### 📊 Sales Overview
- Review all recorded sales with **filters by date or invoice number**.  
- Generate full or individual reports for each sale.

### 📈 Metrics Dashboard
- Visualize key company metrics such as:  
  - Total products registered  
  - Total and daily sales  
  - Top-performing employees  
  - Most sold products ranking  

---

## ⚙️ Configuration Guide

### 🧩 Requirements
- **Java 15 or higher**
- **MySQL Database**
- **NetBeans IDE** (recommended)
- **Maven** for dependency management

---

### 🪛 Setup Instructions

1. **Reload Maven Dependencies**  
   After cloning the project, reload the `pom.xml` file to ensure all dependencies are downloaded.

2. **Database Connection**  
   - Create your MySQL database and note the connection credentials.  
   - Configure the persistence settings in `persistence.xml` with your database information.

   
   ![cap 1](https://github.com/user-attachments/assets/caa9b305-1280-4a8c-ba79-a21cc7ebff05)
   ![cap 2](https://github.com/user-attachments/assets/dbac6385-3eea-4693-9bca-226f28f89f33)
<img width="238" height="129" alt="cap 4" src="https://github.com/user-attachments/assets/5958a18e-3a78-4922-8b01-691b422109ee" />


4. **JDBC Driver Setup**  
   - In NetBeans, select the **MySQL JDBC driver** for your connection.  
   - You can find the connector path inside the project dependencies (e.g., `mysql-connector-java-x.x.x.jar`).  
   - Test the connection to ensure it works properly before saving.

  
  
![cap 3](https://github.com/user-attachments/assets/1f24b28f-fa0f-4b3c-b69c-d2fb0af89759)


6. **Run the Application**  
   Once the connection is established, run the project from NetBeans.  
   The main window of the inventory system should appear.

---

## 🧠 Technologies Used

| Component | Technology |
|------------|-------------|
| Programming Language | Java (Swing) |
| Database | MySQL |
| ORM | JPA|
| Reporting | JasperSoft & JasperReports |
| Build Tool | Maven |

---

## 📸 Screenshots 


<img width="1918" height="1044" alt="cap 5" src="https://github.com/user-attachments/assets/bd7369d9-df6e-4cad-8adf-610ef08e8d06" />
<img width="1920" height="1037" alt="cap 6" src="https://github.com/user-attachments/assets/6ff4c6e1-e6ed-4394-a78e-6b1e27f0b5c6" />
<img width="1919" height="958" alt="cap 7" src="https://github.com/user-attachments/assets/58f28c3d-b63f-4478-9a2b-a58c5da22ab8" />
<img width="1427" height="717" alt="cap 8" src="https://github.com/user-attachments/assets/dc3b5949-f24a-40a1-aa52-b65da8850881" />
<img width="1529" height="839" alt="cap9" src="https://github.com/user-attachments/assets/5656bd02-c37e-4bf7-9bbb-f2637495eeab" />


---

## 👨‍💻 Author

**Developed by:** Sergio Ramirez  
**Project:** G&R Solutions Inventory and Sales System

---

## 📄 License

This project is released for educational and professional use.  
Please cite or credit the author if used or modified.

---

