# FitBite — Healthy Recipe Finder & Personalized Nutrition Recommendation Platform

FitBite is a complete academic-capstone-ready full-stack application built around the supplied project brief. It combines a React/Vite frontend, Spring Boot REST backend, MySQL persistence, JWT/Spring Security, recipe search/filtering, ingredient matching, score-based personalization, health-goal discovery, favorites/history, an AI assistant, RAG-ready retrieval, OpenAPI, tests, and Docker configuration.

## 1. Stack

- Frontend: React + TypeScript + Vite + React Router + Axios
- Backend: Java 21 + Spring Boot + Spring Security + JPA/Hibernate
- Database: MySQL 8.4
- Auth: JWT + BCrypt
- AI: configurable OpenAI-compatible chat endpoint, with FitBite retrieval fallback
- API docs: Springdoc OpenAPI
- Operations: Actuator, structured Spring logging, caching hooks, Docker

## 2. Requirements

- Node.js 20+ (Node 22 recommended)
- npm 10+
- JDK 21
- Maven 3.9+
- MySQL 8+
- Docker Desktop (optional)

## 3. Local setup

### Backend

```bash
cd backend
mvn clean test
mvn clean package
mvn spring-boot:run
```

The backend reads database/JWT/AI configuration from environment variables. For a local MySQL database, create `fitbite` and use the defaults in `application.yml`, or export the variables in `.env`/your shell.

### Frontend

```bash
cd frontend
npm install
npm run build
npm run dev
```

Copy `frontend/.env.example` to `frontend/.env` and set `VITE_API_BASE_URL=http://localhost:8080/api`.

## 4. Development accounts

The development seeder creates these only when the database has no users:

- Admin: `admin@fitbite.local` / `Admin@12345`
- Demo user: `demo@fitbite.local` / `Demo@12345`

Change/remove these before any real deployment.

## 5. Docker

From the repository root:

```bash
docker compose up --build
```

Then visit `http://localhost:5173`.

## 6. API documentation

Open `http://localhost:8080/swagger-ui.html` after the backend starts. See `docs/API.md` for a concise endpoint map.

## 7. Health disclaimer

FitBite is not a medical diagnosis or treatment system. Health categories are presented as general food-discovery guidance. Recipe nutrition is approximate unless a reliable source is specified, and individual dietary needs vary.

## 8. Project structure

```text
fitbite/
├── frontend/
├── backend/
├── database/
├── docs/
├── docker-compose.yml
├── .env.example
├── .gitignore
└── README.md
```

## 9. Syllabus mapping

The implementation covers the supplied Week 1–14 checklist: React/Vite foundations, REST/MVC, CRUD, forms/validation, JPA relations, JWT/Spring Security, AI/chat/RAG-ready retrieval, caching hooks, async support, logging/Actuator, testing, Docker and deployment documentation.

The source itself notes that the syllabus image says “10 Weeks” while the later checklist reaches Week 13–14; this project preserves those labels rather than silently changing them.

## 10. Verification note

The source environment used to assemble this deliverable has Node.js and JDK 21 available, but Maven and Docker executables are not installed in the execution environment. Therefore the project files were internally cross-checked for endpoint/import/route consistency, while `mvn clean test`, `mvn clean package`, and `docker compose build` must be run on a machine with Maven/Docker installed. `npm install` could not complete in the restricted build environment because package installation requires external registry access.
"# Fit-bite" 
"# Fit-bite" 
"# Fit-bite" 
"# Fit-bite" 
"# Fit-bite" 
"# Fit-bite" 
