# Email Assistant AI 🚀

A powerful browser extension that uses AI to generate intelligent, context-aware replies to your emails, helping you manage your inbox faster and more efficiently.

---

## ✨ Key Features

-   **AI-Powered Replies:** Automatically generates email drafts based on the original message's context.
-   **Customizable Tones:** Instantly select from various tones like *Professional*, *Casual*, *Friendly*, and more.
-   **Seamless Integration:** Works directly within your email client's interface for a smooth workflow.
-   **Saves Time:** Drastically reduces the time spent on writing repetitive or standard emails.

## 🛠️ Technologies Used

-   **Frontend:** React
-   **Backend:** Java, Spring Boot
-   **Extension:** Core JavaScript, HTML/CSS
-   **API:** Google Gemini

## 📂 Project Structure

This repository is a monorepo containing the three main components of the project:

-   `/frontend`: The React application that serves as the extension's user interface (popup).
-   `/backend`: The Spring Boot server that handles all API logic and communication with the AI model.
-   `/extension`: The core browser extension files, including the `manifest.json` and content scripts that inject the UI into the web page.

## 🚀 Getting Started

Follow these instructions to set up and run the project on your local machine for development and testing.

### Prerequisites

* Java 17 (or newer) & Apache Maven
* Node.js v18 (or newer) & npm
* A modern browser like Google Chrome or Microsoft Edge

### 1. Backend Setup (Spring Boot)

```bash
# Navigate to the backend directory from the project root
cd backend

# Install dependencies and build the project
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run