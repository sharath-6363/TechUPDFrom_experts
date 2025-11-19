# 🚀 TechUPDFrom_experts

A comprehensive full-stack web application that connects technology experts with users seeking the latest tech updates and insights. This platform enables experts to share knowledge, users to access valuable information, and administrators to manage the entire ecosystem.

## 📋 Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [User Roles](#user-roles)
- [Screenshots](#screenshots)
- [Contributing](#contributing)

## ✨ Features

### 🔐 Multi-Role Authentication System
- **Visitors/Users**: Browse updates, register, login, comment on posts
- **Technology Experts**: Create and manage tech updates, respond to queries
- **Administrators**: Manage users, experts, categories, and content moderation

### 📱 Core Functionality
- **Technology Updates**: Rich text editor for creating detailed tech posts
- **Category Management**: Organized content by technology categories
- **Interactive Comments**: Real-time commenting and reply system
- **User Profiles**: Customizable profiles for all user types
- **Email Integration**: Automated email notifications using EmailJS
- **Responsive Design**: Mobile-first responsive UI with Bootstrap

### 🛠️ Advanced Features
- **Image Upload & Crop**: Advanced image handling with react-image-crop
- **Rich Text Editor**: Quill.js integration for formatted content
- **Real-time Updates**: Dynamic content loading with Axios
- **Search & Filter**: Advanced filtering by categories and experts
- **Admin Dashboard**: Comprehensive admin panel for system management

## 🛠️ Tech Stack

### Frontend
- **React 18.2.0** - Modern UI library
- **React Router DOM 6.22.0** - Client-side routing
- **Bootstrap 5.3.2** - Responsive CSS framework
- **React Bootstrap 2.10.0** - Bootstrap components for React
- **Axios 1.6.7** - HTTP client for API calls
- **React Quill 2.0.0** - Rich text editor
- **React Icons 5.0.1** - Icon library
- **EmailJS** - Email service integration

### Backend
- **Spring Boot 3.2.3** - Java framework
- **Spring Data JPA** - Database abstraction layer
- **MySQL** - Relational database
- **Maven** - Dependency management
- **Lombok** - Code generation library

### Database
- **MySQL 8.0+** - Primary database
- **JPA/Hibernate** - ORM framework

## 🏗️ Architecture

```
Tech_UPD/
├── Tech UPD Expert/          # React Frontend
│   ├── public/               # Static assets
│   ├── src/
│   │   ├── AdminComponent/   # Admin dashboard components
│   │   ├── TechnologyEx/     # Expert panel components
│   │   ├── VisitorComponent/ # User interface components
│   │   ├── AllCss/          # Styling files
│   │   ├── components/      # Reusable components
│   │   └── Image/           # Media assets
│   └── package.json
└── TechnologyUbyE/          # Spring Boot Backend
    ├── src/main/java/
    │   └── com/example/TechnologyUbyE/
    │       ├── Controllers/  # REST API endpoints
    │       ├── Entity/      # JPA entities
    │       └── Repository/  # Data access layer
    └── pom.xml
```

## 📋 Prerequisites

Before running this application, ensure you have:

- **Node.js** (v16.0 or higher)
- **npm** or **yarn**
- **Java JDK 17** or higher
- **Maven 3.6+**
- **MySQL 8.0+**
- **Git**

## 🚀 Installation

### 1. Clone the Repository
```bash
git clone https://github.com/sharath-6363/TechUPDFrom_experts.git
cd TechUPDFrom_experts
```

### 2. Database Setup
```sql
-- Create MySQL database
CREATE DATABASE TechUpdate;

-- Create user (optional)
CREATE USER 'techuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON TechUpdate.* TO 'techuser'@'localhost';
FLUSH PRIVILEGES;
```

### 3. Backend Setup (Spring Boot)
```bash
# Navigate to backend directory
cd TechnologyUbyE

# Install dependencies and run
mvn clean install
mvn spring-boot:run
```

The backend will start on `http://localhost:8080`

### 4. Frontend Setup (React)
```bash
# Navigate to frontend directory
cd "Tech UPD Expert"

# Install dependencies
npm install

# Start development server
npm start
```

The frontend will start on `http://localhost:3000`

## ⚙️ Configuration

### Backend Configuration
Edit `TechnologyUbyE/src/main/resources/application.properties`:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/TechUpdate
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Server Configuration
server.port=8080
```

### Frontend Configuration
The React app is configured to connect to the backend at `http://localhost:8080`. Update API endpoints in components if needed.

### Email Configuration
Configure EmailJS in your components for email functionality:
1. Create an account at [EmailJS](https://www.emailjs.com/)
2. Get your service ID, template ID, and public key
3. Update the email components with your credentials

## 🏃‍♂️ Running the Application

### Development Mode
1. **Start Backend**: `mvn spring-boot:run` (Port 8080)
2. **Start Frontend**: `npm start` (Port 3000)
3. **Access Application**: Open `http://localhost:3000`

### Production Build
```bash
# Build React app
cd "Tech UPD Expert"
npm run build

# The build folder can be served by any static file server
```

## 🔌 API Endpoints

### Authentication
- `POST /api/admin/login` - Admin login
- `POST /api/tech/login` - Expert login  
- `POST /api/visitor/login` - User login
- `POST /api/visitor/register` - User registration

### Technology Updates
- `GET /gettechUpd` - Get all tech updates
- `POST /api/tech/updates` - Create new update
- `PUT /api/tech/updates/{id}` - Update existing post
- `DELETE /api/tech/updates/{id}` - Delete update

### Comments & Interactions
- `GET /api/comments/{updateId}` - Get comments for update
- `POST /api/comments` - Add new comment
- `POST /api/comments/reply` - Reply to comment

### Categories
- `GET /api/categories` - Get all categories
- `POST /api/admin/categories` - Create category
- `PUT /api/admin/categories/{id}` - Update category

## 👥 User Roles

### 🏠 Visitors/Users
- Browse technology updates
- Register and create profiles
- Comment on posts and reply to discussions
- Send queries to experts
- View expert profiles and their contributions

### 👨‍💻 Technology Experts
- Create and publish technology updates
- Manage personal profile and expertise areas
- Respond to user queries and comments
- Update and edit their published content
- View analytics of their posts

### 🛡️ Administrators
- Manage all users and experts
- Create and manage technology categories
- Moderate content and comments
- View system analytics and reports
- Send system-wide notifications

## 📸 Screenshots

### Homepage
![Homepage](./screenshots/homepage.png)
*Modern landing page with latest tech updates*

### User Dashboard
![User Dashboard](./screenshots/user-dashboard.png)
*Personalized dashboard for registered users*

### Expert Panel
![Expert Panel](./screenshots/expert-panel.png)
*Content creation interface for technology experts*

### Admin Dashboard
![Admin Dashboard](./screenshots/admin-dashboard.png)
*Comprehensive admin panel for system management*

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🆘 Support

If you encounter any issues or have questions:

1. Check the [Issues](https://github.com/sharath-6363/TechUPDFrom_experts/issues) page
2. Create a new issue with detailed description
3. Contact the development team

## 🚀 Future Enhancements

- [ ] Real-time notifications using WebSocket
- [ ] Advanced search with Elasticsearch
- [ ] Mobile app development
- [ ] AI-powered content recommendations
- [ ] Multi-language support
- [ ] Advanced analytics dashboard
- [ ] Social media integration
- [ ] Video content support

---

**Built with ❤️ by the Tech Updates Team**

*Empowering knowledge sharing in the technology community*