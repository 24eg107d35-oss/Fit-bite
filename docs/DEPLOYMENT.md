# Deployment

## Local Docker

1. Copy `.env.example` to `.env` and replace all secrets.
2. Run `docker compose up --build`.
3. Open the frontend at `http://localhost:5173`.
4. Open API docs at `http://localhost:8080/swagger-ui.html`.

## Cloud pattern

Frontend can be deployed to Vercel/Netlify or another static React host. Backend can be deployed to a Spring Boot-compatible service such as Render/Railway or a managed VM. MySQL should use a managed database in production.

Set these backend variables in the hosting platform:

- DB_HOST
- DB_PORT
- DB_NAME
- DB_USERNAME
- DB_PASSWORD
- JWT_SECRET
- CORS_ALLOWED_ORIGINS
- LLM_BASE_URL
- LLM_API_KEY
- LLM_MODEL

Build frontend with `VITE_API_BASE_URL` pointing to the public backend `/api` URL.

For production, replace `ddl-auto=update` with a migration system such as Flyway/Liquibase and use a managed secret store.
