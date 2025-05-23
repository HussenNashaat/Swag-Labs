# 🚀 Swag Labs Automation Testing Framework 

This project is a complete UI automation testing framework for the [Swag Labs](https://www.saucedemo.com/) web application.

It is built using:
- Java 23
- Selenium WebDriver 4.31.0
- TestNG 7.10.2
- Maven
- Page Object Model (POM)
- Allure Reports
- JSON for external test data

---

## 📁 Project Structure

├── src/main/java/pages # Page classes (LoginPage, HomePage, etc.)
├── src/test/java/tests # TestNG test classes
├── read.json # External test data (credentials, user info)
├── pom.xml # Maven configuration
├── Testng.xml # Test suite
├── README.md # Project documentation

---

## ✅ How to Run Tests

1. Make sure Java & Maven are installed.
2. Run the full suite using:

```bash
mvn test


📊 Generate Allure Report
After running the tests with mvn test, generate the report using:

allure serve target/allure-results


📄 Test Data (read.json)

{
  "username": "standard_user",
  "password": "secret_sauce",
  "invalidUserName": "wrong_username",
  "invalidPassword": "wrong_password",
  "firstName": "Hussen",
  "lastName": "Nashaat",
  "postalCode": "11765"
}


🙋 Author
Hussen Nashaat
GitHub: @HussenNashaat
