-- FitBite logical MySQL schema. Hibernate creates/updates these tables from the JPA entities in development.
CREATE DATABASE IF NOT EXISTS fitbite CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE fitbite;
-- Tables: users, roles, user_roles, recipes, ingredients, recipe_ingredients, nutrition,
-- categories, health_goals, recipe_health_goals, favorites, user_preferences,
-- recipe_history, recommendations, chat_history.
-- For production, prefer Flyway/Liquibase migrations instead of ddl-auto=update.
