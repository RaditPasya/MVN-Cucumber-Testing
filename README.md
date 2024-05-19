# Web Automation Testing

Project automation testing untuk menguji fitur Login dan Logout pada aplikasi web [Swag Labs](https://www.saucedemo.com/). Project ini dikembangkan dengan bahasa Java untuk kode program dan pembuatan script test dan Maven sebagai build tools.

## Build With
Automation Testing pada project ini menggunakan dua buah library.
 <ul>
    <li>JUnit</li>
    <li>Cucumber</li>
    <li>Selenium</li>
    <li>WebDriverManager</li>
 </ul>
 
# Getting Started
## Pre-requisites
Sebelum menjalankan project ini, perlu disiapkan environment yang sesuai.
<ul>
  <li>Java 17+</li>
  <li>Apache Maven 3.8.0+</li>
  <li>Web Browser</li>
</ul>

## Struture Project Test
Berikut ini merupakan struktur kode
```
📦mvn-cucumber-a10
 ┣ 📂src
 ┃ ┃
 ┃ ┗ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂a10
 ┃ ┃ ┃ ┃ ┃ ┣ 📂helper
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜A10WebDriverManager.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂pagefactory
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HomePageFactory.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginPageFactory.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂steps
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginSteps.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LogoutSteps.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📂tests
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TestRunner.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┗ 📂a10
 ┃ ┃ ┃ ┃ ┣ 📜login.feature
 ┃ ┃ ┃ ┃ ┗ 📜logout.feature
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂a10
 ┃ ┃ ┃ ┃ ┣ 📂helper
 ┃ ┃ ┃ ┃ ┃ ┗ 📜A10WebDriverManager.class
 ┃ ┃ ┃ ┃ ┣ 📂pagefactory
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HomePageFactory.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginPageFactory.class
 ┃ ┃ ┃ ┃ ┣ 📂steps
 ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginSteps.class
 ┃ ┃ ┃ ┃ ┃ ┗ 📜LogoutSteps.class
 ┃ ┃ ┃ ┃ ┗ 📂tests
 ┃ ┃ ┃ ┃ ┃ ┗ 📜TestRunner.class
 ┃ ┗ 📜cucumber-reports.html
 ┣ 📜pom.xml
 ┣ 📜README.md
```

## Run Automation Test
1. Clone repository dengan git
   ```
   git clone https://https://github.com/RaditPasya/MVN-Cucumber-Testing.git
   ```
2. Jalankan perintah berikut untuk masuk ke folder project
   ```bat
   cd mvn-**
   ```
3. Jalankan perintah berikut untuk menginstall artifak yang didefinisikan
   ```
   mvn clean install
   ```
4. Jalankan perintah berikut pada terminal untuk menjalankan semua test
   ```
   mvn surefire-report:report
   ```
5. Jalankan perintah berikut pada terminal untuk melihat report
   ```bat
   start target\site\surefire-report.html
   ```

## Test Cases
Pembuatan test case meliputi test positif dan negatif untuk fitur Login dan Logout.

#### Login
```
[T0.0.1] - Login successful with valid credentials
[T0.0.2] - Login with wrong username
[T0.0.3] - Login with wrong password
[T0.0.4] - Login with no password
[T0.0.5] - Login with no username
[T0.0.6] - Login with nothing

```

#### Logout
```
[T0.1.1] - Positive logout
```

## Author
[Hanri Fajar Ramadhan](https://github.com/HanriFR) (211524012)

[Raditya Pasya Heryandi](https://github.com/RaditPasya) (211524021)

[Azis Surohman](https://github.com/zis4215) (201524037)

_Mahasiswa D4 Teknik Informatika Politeknik Negeri Bandung_