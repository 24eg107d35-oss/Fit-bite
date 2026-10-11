# FitBite Architecture

```text
React + Vite
    |
    | Axios / JWT
    v
Spring Boot REST API
    |
    +--> Spring Security + JWT
    +--> Controllers -> Services -> Repositories -> JPA
    +--> RecommendationService (score-based)
    +--> RecipeRetriever -> optional LLM provider
    +--> Actuator / OpenAPI
    |
    v
MySQL
```

## RAG-ready flow

```text
User query
   -> query processing
   -> RecipeRetriever
   -> relevant recipe/nutrition context
   -> optional LLM
   -> grounded response
```

`RecipeRetriever` is deliberately isolated so it can later be replaced by an embedding/vector implementation such as pgvector, Pinecone or Chroma without changing the chat controller contract.

## Security

- BCrypt password hashing
- Stateless JWT authentication
- `ROLE_USER` / `ROLE_ADMIN`
- `@PreAuthorize` on admin mutations
- Environment variables for secrets
- Centralized validation/error handling
- CORS allow-list
- No LLM key in the frontend

## Data model

The JPA model contains users, roles, recipes, ingredients, recipe ingredients, nutrition, categories, health goals, recipe-health relationships, favorites, preferences, history, recommendations and chat history.
