# TransferService-API
A simple RESTful API for transferring money between accounts.

## 🔧 Features
- In-memory account storage 
- Basic validations (insufficient funds, invalid accounts, etc.)
- Simple unit tests

## 🚀 How to Run
mvnw spring-boot:run
 
The API will be available at : http://localhost:8080

## 📫 Example API Usage
Endpoint:
POST /api/transfer

Request Body:
json
{
  "sourceAccount": "80801215",
  "destinationAccount": "80811215",
  "amount": 100.0
}

Success Response:
Transfer successful.

## 🛠️ Technologies Used
- Java
- Spring Boot
- Maven
- HTML
- JavaScript 

