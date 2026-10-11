# FitBite API

Base URL: `http://localhost:8080/api`

Interactive documentation: `http://localhost:8080/swagger-ui.html`

## Authentication

- `POST /auth/register` — create a USER account.
- `POST /auth/login` — returns a JWT.
- Send the token as `Authorization: Bearer <token>` for protected routes.

## Recipes

- `GET /recipes` — paginated search/filter.
- `GET /recipes/search` — search alias.
- `GET /recipes/filter` — filter alias.
- `GET /recipes/{id}` — recipe details.
- `POST /recipes` — ADMIN only.
- `PUT /recipes/{id}` — ADMIN only.
- `DELETE /recipes/{id}` — ADMIN only.
- `POST /recipes/{id}/view` — authenticated history event.

## Personalization

- `GET /profile`
- `PUT /profile`
- `GET /favorites`
- `POST /favorites/{recipeId}`
- `DELETE /favorites/{recipeId}`
- `GET /recommendations`
- `POST /recommendations`
- `POST /recommendations/ingredients`
- `POST /ingredients/recommend`
- `GET /recipes/recent`

## Health and metadata

- `GET /health-goals`
- `GET /categories`
- `GET /ingredients?q=rice`

ADMIN taxonomy endpoints:

- `POST/PUT/DELETE /admin/categories`
- `POST/PUT/DELETE /admin/health-goals`
- `GET /admin/stats`
- `GET /admin/users`

## AI

`POST /ai/chat` with `{ "message": "I have eggs and spinach..." }`.

The backend first retrieves relevant recipes from `RecipeRetriever`. If `LLM_BASE_URL`, `LLM_API_KEY`, and `LLM_MODEL` are configured, it sends grounded context to an OpenAI-compatible chat-completions endpoint. Without an LLM configuration, it still returns retrieved FitBite context rather than a fabricated external answer.

The assistant must not diagnose disease or prescribe treatment.
