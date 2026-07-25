# 🧪 Swag Labs Test Automation Project

An end-to-end automated testing framework for the **[Swag Labs (SauceDemo)](https://www.saucedemo.com/)** e-commerce web application, designed and developed using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.

---

## 📊 Live Execution Report

You can view the full interactive **Allure Report** for the latest test execution online:
👉 **[View Live Allure Report](https://nada15122.github.io/swag-labs-automation/allure-report/)**

---

## ✨ Features & Automated Test Scenarios

The framework covers critical end-to-end user journeys and features, including:

* 🔑 **Authentication & User Login:**
  * Valid login with standard credentials.
  * Invalid login assertions (locked-out user, empty fields, wrong password).
* 🛒 **Product Catalog & Cart Management:**
  * Sorting products by Name (A-Z, Z-A) and Price (low-to-high, high-to-low).
  * Adding and removing single or multiple products to/from the cart.
  * Verifying cart badge count dynamically.
* 💳 **Checkout Workflow:**
  * Completing buyer information details.
  * Validating item totals, tax calculations, and final order summary.
  * Finishing order execution and asserting the successful confirmation message.

---

## 🛠️ Tech Stack & Architecture

* **Language:** Java
* **Automation Library:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Management:** Maven
* **Reporting Tool:** Allure Reports
* **Design Pattern:** Page Object Model (POM) for maximum maintainability and clean code

---

## 🚀 How to Run Tests Locally

Clone the repository, navigate into the project folder, and run the test suite in one go:

git clone https://github.com/nada15122/swag-labs-automation.git
cd swag-labs-automation
mvn clean test
