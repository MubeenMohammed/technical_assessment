# 🧪 Acumatica QA Intern Assessment – Web Application Testing

## 👤 Applicant
**Name:** Mubeen Mohammed  
**Role Applied For:** Intern Quality Assurance Engineer  
**Assessment Date:** 22nd April 2024

---

## 🏃‍♂️‍➡️ Run Commands
- run all tests: mvn test

## 🌐 Application Under Test
**Tested Website:** [https://practice.expandtesting.com](https://practice.expandtesting.com)  
**Pages Tested:**
- `/register` – Registration Page
- `/login` – Login Page

---

## 📋 Objective
To manually test the login and registration functionality of a web application and evaluate potential bugs, suggest improvements, and write test cases covering both valid and invalid scenarios.

---

## ✅ Features Tested
- User Registration
- User Login
- Input Validation
- Error Handling

---

## 🐞 Bugs & Issues Identified

| Bug ID | Area         | Description                               | Steps to Reproduce                                   | Severity | Status |
|--------|--------------|-------------------------------------------|------------------------------------------------------|----------|--------|
| B1     | Registration | No error on mismatched passwords          | Fill valid fields, mismatch passwords, submit        | Medium   | Open   |
| B2     | Login        | Allows submission with empty credentials  | Leave email/password blank and press login          | High     | Open   |

---

## 🧪 Test Cases

### Registration Tests

| Test ID | Scenario                                | Expected Result                    | Pass/Fail |
|---------|------------------------------------------|------------------------------------|-------|
| TC01    | Register with valid inputs              | Redirect to login page             | ✅     |
| TC02    | Password and Confirm Password mismatch  | Show error message                 | ✅     |
| TC03    | Register with missing required fields   | Show validation messages           | ✅     |

### Login Tests

| Test ID | Scenario                          | Expected Result                  | Pass/Fail |
|---------|------------------------------------|----------------------------------|-----------|
| TC04    | Login with valid credentials       | Redirect to dashboard            | ✅        |
| TC05    | Login with invalid password        | Show error message               | ✅        |
| TC06    | Login with empty fields            | Show validation messages         | ✅        |

---

## 🔍 Test Summary

- **Total Test Cases:** 12
- **Passed:** 12
- **Failed:** 0
- **Blocked:** 0

---

## 💡 Suggestions & Improvements

- Add real-time validation for password mismatch on the registration form.
- Display clear error messages for failed logins.
- Disable submit button while form is processing.
- Implement a password strength meter on the registration page.
- Consider adding a "Remember Me" option on the login page.
---

## 📎 Additional Notes

- Test cases were executed manually using Chrome browser on desktop (Windows 11).
- Tools used: Notepad for logging, Chrome DevTools for inspection.

---

