# Deployment

## Local Docker

1. Copy `.env.example` to `.env` and replace all secrets.
2. Run `docker compose up --build`.
3. Open the frontend at `http://localhost:5173`.
4. Open API docs at `http://localhost:8080/swagger-ui.html`.

## Free Render backend, Aiven MySQL, and Vercel frontend

The repository includes a Render Blueprint at `render.yaml` for a free Spring Boot web service. Use it with Aiven's free MySQL service; Render's own MySQL container needs a paid private service and persistent disk. The Aiven free plan is limited to 1 GB storage and may be powered off after extended inactivity. Render's free web service sleeps after 15 minutes without requests, so the first API call after idle can take about a minute. This setup is for a small demo, not production traffic.

1. Create an Aiven for MySQL service on its Free plan. From its connection details, copy the host, port, database name, username, and password. Aiven's default database is `defaultdb`.
2. Push the repository to GitHub.
3. In Render, create a Blueprint from this repository and choose the Free plan. When prompted, enter the Aiven values for `DB_HOST`, `DB_PORT`, `DB_USERNAME`, and `DB_PASSWORD`. `DB_SSL_MODE` is already set to `REQUIRED`; Render generates `JWT_SECRET`.
4. After deployment, copy the backend's public `onrender.com` URL and check `<backend-url>/actuator/health` for `{"status":"UP"}`.
5. In the Vercel project settings, add `VITE_API_BASE_URL` with the value `<backend-url>/api` (include `https://`) and redeploy the frontend.

The backend allows requests from `https://fit-bite-eta.vercel.app`. If the Vercel domain changes, update `CORS_ALLOWED_ORIGINS` on Render to the exact frontend origin, then redeploy the backend. Demo/admin seed accounts are disabled; recipe and health-goal data are seeded automatically.

For production, replace `ddl-auto=update` with a migration system such as Flyway/Liquibase and configure regular database backups.
