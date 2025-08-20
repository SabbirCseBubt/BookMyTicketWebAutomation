

```
# MakeMyTrip Automation Framework 🎟️

Selenium automation framework for the **MakeMyTrip** website using **Java, TestNG, POM, and Page Factory**.  
Automates round-trip flight search with dynamic date selection, reporting, and screenshot capture.

---

## Features
- Round-trip flight search automation  
- Dynamic departure & return date selection  
- Reusable utilities (XPath, screenshots, property file handling)  
- Detailed HTML reports via ExtentReports  
- Modular & scalable structure using POM & Page Factory

---

## Tech Stack
- Java | Selenium WebDriver | TestNG | Maven  
- ExtentReports | Apache Commons IO  
- Eclipse (or any Java IDE)

---

## Project Structure

MakeMyTrip-Test-Framework/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/makemytrip/
│   │           ├── base/
│   │           │   └── BaseTest.java
│   │           ├── pages/
│   │           │   ├── Homepage.java
│   │           │   └── LoginPage.java
│   │           └── util/
│   │               └── TestUtil.java
│   ├── test/
│   │   └── java/
│   │       └── com/makemytrip/
│   │           ├── testcases/
│   │           │   ├── FlightSearchTest.java
│   │           │   ├── LoginTest.java
│   │           │   └── TestSetup.java
│   │           └── listener/
│   │               └── CustomListener.java
│   └── resources/
│       ├── config.properties
│       └── screenshots/
├── pom.xml
├── testng.xml
└── make-my-trip-report.html


````

---

## Setup
1. Install **Java JDK 11+**, **Maven**, **Eclipse**, and **ChromeDriver**.  
2. Clone repo:
```bash
git clone https://github.com/yourusername/MakeMyTrip-Test-Framework.git
cd MakeMyTrip-Test-Framework
````

3. Add dependencies in `pom.xml` and run:

```bash
mvn clean install
```

4. Configure `src/test/resources/config.properties`:

```properties
url=https://www.makemytrip.com
from=Delhi, India
to=Chennai, India
trip=round trip
pageLoadTime=30
implicitWait=20
numberOfDays=3
```

---

## Running Tests

* **Eclipse:** Right-click `testng.xml` → Run As → TestNG Suite
* **Maven:** `mvn test`

---

## Reporting

* HTML report: `make-my-trip-report.html`
* Screenshots for failed tests: `src/test/resources/screenshots/`

---


