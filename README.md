# 🧪 Swag Labs Test Automation Project

An end-to-end automated testing framework for the **[Swag Labs (SauceDemo)](https://www.saucedemo.com/)** e-commerce web application, designed and developed using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.

---

## 📊 Live Execution Report

You can view the full interactive **Allure Report** for the latest test execution online:
👉 **[View Live Allure Report](https://nada15122.github.io/swag-labs-automation/allure-report/)**

---
## ✨ Features & Automated Test Scenarios

The framework covers critical user journeys and features, including:

* 🔑 **Authentication & User Login (`LoginTest`):**
  * Valid login with standard credentials.
  * Invalid login assertions (locked-out user, empty fields, wrong password).
  * Asserting correct error messages on failed login attempts.

* 🛒 **Product Catalog & Cart Management (`InventoryTest`):**
  * Verifying product inventory display and details.
  * Adding single and multiple products to the shopping cart.
  * Removing items from the cart.
  * Asserting dynamic updates to the shopping cart badge count.

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
