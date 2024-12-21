https://inyat-gif.github.io/Email_Sender_API/
A RESTful API to send emails through various email services using Node.js and Nodemailer. It allows integration with other applications to send emails programmatically.
---
## 🚀 Features
- Send emails via SMTP or services like Gmail, SendGrid, etc.
- RESTful API to send HTML and plain-text emails.
- Supports custom email configurations.

---
## 🛠️ Technologies

- **Node.js**: Backend framework.
- **Express**: Web server framework.
- **Nodemailer**: Email sending module.
- **SMTP**: Email protocol for sending emails.

---
## ⚙️ Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/INYAT-gif/Email_Sender_API.git
   cd Email_Sender_API
   ```

2. Install dependencies:

   ```bash
   npm install
   ```

3. Configure email credentials in the `config.js` file.

4. Start the API server:

   ```bash
   node server.js
   ```

Access the API at: [http://localhost:5000](http://localhost:5000)

---

## 📚 API Documentation

- **POST /send-email**  
  Send an email with the provided subject, body, and recipient.

  **Request body:**
  ```json
  {
    "to": "recipient@example.com",
    "subject": "Subject of the email",
    "text": "Plain text or HTML content of the email"
  }
  ```

---

Made with ❤️ by [Inyat Nathani](https://www.linkedin.com/in/inyat/)
```
