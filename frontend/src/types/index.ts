export type ApiResponse<T>={success:boolean;message:string;data:T|null;errorCode?:string|null};
export type Recipe={id:number;name:string;description:string;category:string;cuisine:string;mealType:string;calories:number;protein:number;carbohydrates:number;fat:number;fiber:number;sodium:number;totalTime:number;servings:number;difficulty:string;dietaryTags:string;healthTags:string;imageUrl:string;favorite:boolean};
export type RecipeDetail=Recipe&{ingredients:{name:string;quantity:string}[];steps:string;preparationTime:number;cookingTime:number;nutritionSource:string;healthGoals:string[]};
export type Page<T>={content:T[];totalElements:number;totalPages:number;number:number;size:number;first:boolean;last:boolean};
export type Profile={id:number;name:string;email:string;role:string;dietaryType:string|null;healthGoal:string|null;maxCalories:number|null;minProtein:number|null;maxCookingTime:number|null};
export type HealthGoal={id:number;name:string;description:string;foodsToConsider:string;foodsCommonlyLimited:string};
export type IngredientMatch={recipeId:number;recipeName:string;matchPercentage:number;availableIngredients:string[];missingIngredients:string[];totalTime:number;calories:number;protein:number};
export type Scored={recipe:Recipe;score:number;reason:string};
