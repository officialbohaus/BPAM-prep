

public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.Fruit, "n/a");
        Ingredient sugar = new Ingredient("Sugar", 0, IngredientType.Baking, "n.a");
        
        System.out.println(apple);
        System.out.println(sugar);

        PantryStorage myPantry = new PantryStorage();

        myPantry.add(apple);

        myPantry.add(apple, 5);

        myPantry.remove(apple, 2);

        myPantry.add(sugar, 200);

        System.out.println(myPantry.contains(sugar));

        System.out.println(myPantry);
        System.out.println(IIDGenerator.genIID());
    }
}