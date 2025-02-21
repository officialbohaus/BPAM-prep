public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.Fruit, "n/a");
        System.out.println(apple);

        PantryStorage myPantry = new PantryStorage();

        myPantry.add(apple);

        myPantry.add(apple, 5);

        System.out.println(myPantry);
    }
}