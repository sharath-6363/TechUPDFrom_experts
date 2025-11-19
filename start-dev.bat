@echo off
echo ========================================
echo   Starting Tech Updates Application
echo ========================================
echo.

echo Starting Backend Server (Spring Boot)...
start "Backend Server" cmd /k "cd TechnologyUbyE && mvn spring-boot:run"

timeout /t 3 /nobreak > nul

echo Starting Frontend Server (React)...
start "Frontend Server" cmd /k "cd \"Tech UPD Expert\" && npm start"

echo.
echo ========================================
echo Both servers are starting...
echo Backend: http://localhost:8080
echo Frontend: http://localhost:3000
echo ========================================
echo.
echo Press any key to exit...
pause > nul