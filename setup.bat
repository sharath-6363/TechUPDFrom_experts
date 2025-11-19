@echo off
echo ========================================
echo    Tech Updates - Setup Script
echo ========================================
echo.

echo [1/4] Setting up Backend (Spring Boot)...
cd "TechnologyUbyE"
echo Installing Maven dependencies...
call mvn clean install
if %errorlevel% neq 0 (
    echo ERROR: Maven build failed!
    pause
    exit /b 1
)
echo Backend setup completed!
echo.

echo [2/4] Setting up Frontend (React)...
cd "..\Tech UPD Expert"
echo Installing npm dependencies...
call npm install
if %errorlevel% neq 0 (
    echo ERROR: npm install failed!
    pause
    exit /b 1
)
echo Frontend setup completed!
echo.

echo [3/4] Setup completed successfully!
echo.
echo [4/4] To start the application:
echo 1. Start Backend: cd TechnologyUbyE && mvn spring-boot:run
echo 2. Start Frontend: cd "Tech UPD Expert" && npm start
echo 3. Open browser: http://localhost:3000
echo.
echo ========================================
echo     Setup Complete! Happy Coding!
echo ========================================
pause