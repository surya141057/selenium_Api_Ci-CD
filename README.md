# 🥗 Meal Calorie Count Automation

Automation framework for testing the Meal Calorie Count application using **Selenium**, **TestNG**, and **RestAssured**, with CI/CD integration via **GitHub Actions**.

---

## 🚀 Tech Stack

| Area         | Tool/Library               |
|--------------|----------------------------|
| UI Testing   | Selenium WebDriver + TestNG |
| API Testing  | RestAssured                |
| Build Tool   | Maven                      |
| Reporting    | ExtentReports (or Allure)  |
| CI/CD        | GitHub Actions             |
| Language     | Java                       |

---

## 📁 Project Structure

meal-calorie-automation/
├── src/
│ ├── main/java/
│ │ ├── pages/ # Page Object classes
│ │ └── utils/ # DriverFactory
│ ├── test/java/
│ │ ├── uiTests/ # Selenium UI tests
│ │ └── apiTests/ # RestAssured API tests
├── testng.xml # TestNG test suite
├── .github/workflows/ci.yml # GitHub Actions workflow
├── .env.example # Example .env config
├── pom.xml # Maven dependency config
└── README.md # You're here


---

## ✅ Features Tested

### 🔸 API Tests (`/auth` + `/get-calories`)
- `POST /auth/register` – Register user
- `POST /auth/login` – Login user
- `POST /get-calories` – Get calorie breakdown of a dish

### 🔸 UI Tests
- Login page (valid login)
- (Extendable for registration & calorie lookup UI tests)

---

## 🧪 How to Run Tests Locally

### 🛠 Prerequisites
- Java 17
- Maven
- Chrome browser
- Clone the frontend/backend apps running on localhost

### 🔧 Setup

1. **Clone this repository**
```bash
git clone https://github.com/your-username/meal-calorie-automation.git
cd meal-calorie-automation

## 🔧 Configure Environment

1. Copy the `.env.example` file to `.env`:
```bash
cp .env.example .env

Update .env:
BASE_URL=http://localhost:8000
USDA_API_KEY=your-usda-api-key

Install Dependencies
mvn clean install
Run All Tests
mvn test
