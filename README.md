# Shopping E-Commerce API

This project is a **Spring Boot REST API** that provides an e-commerce shopping experience. The API includes different shopping platforms like **Amazon, Flipkart, Meesho, and Myntra**, offering various operations using **@RequestMapping** and **@RequestMethod** for handling different HTTP methods.

## 📂 Project Structure

```
ShoppingECommerceAPI/
│-- src/main/java/com/shopping/
│   ├── main/
│   │   ├── Amazon.java
│   │   ├── Flipkart.java
│   │   ├── Meesho.java
│   │   ├── Myntra.java
│   │   ├── ShoppingECommerceApplication.java
│-- pom.xml
```

## 🛠 Technologies Used

- **Java**
- **Spring Boot**
- **Spring Web**
- **Postman** (for API testing)
- **Maven** (for dependency management)

## 📌 API Implementation

### **Handling Operations Using `@RequestMapping` and `@RequestMethod`**
Spring Boot allows us to map different HTTP methods to specific API endpoints using `@RequestMapping` along with `@RequestMethod`.



### **Alternative Approach: Using Shortcut Annotations**
Instead of `@RequestMapping`, we can use specific annotations for each HTTP method:

| Old Method Using `@RequestMapping` | New Alternative |
|------------------------------------|----------------|
| `@RequestMapping(value = "/products", method = RequestMethod.GET)` | `@GetMapping("/products")` |
| `@RequestMapping(value = "/add", method = RequestMethod.POST)` | `@PostMapping("/add")` |
| `@RequestMapping(value = "/update", method = RequestMethod.PUT)` | `@PutMapping("/update")` |
| `@RequestMapping(value = "/delete", method = RequestMethod.DELETE)` | `@DeleteMapping("/delete")` |

---


## 📌 pom.xml Dependencies



## 📌 API Endpoints

| HTTP Method | Description |
|------------|----------------
| **GET** | Get all products |
| **POST** | Add a new product |
| **PUT** |  Update an existing product |
| **DELETE** |  Delete a product |

## 📌 Testing with Postman

1️⃣ Open **Postman**.
2️⃣ Use the API .
3️⃣ Send requests and verify responses.





