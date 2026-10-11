-- Optional manual bootstrap data for a database where Hibernate has already created the tables.
-- The complete development seed (30 recipes, 50+ ingredients, 10 health goals, users and roles)
-- is implemented in backend/src/main/java/com/fitbite/config/SeedData.java so it is repeatable and
-- can resolve generated IDs safely. Do not run both this file and the Java seeder for duplicate content.
USE fitbite;
INSERT IGNORE INTO categories(name,description) VALUES
('Breakfast','Morning meals'),('Lunch','Midday meals'),('Dinner','Evening meals'),('Snacks','Light meals'),('Quick Meals','Short preparation recipes'),('Indian','Indian recipes'),('High Protein','Protein-forward recipes');
