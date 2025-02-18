# BPAM-prep
Meal prep helper app

Meta Concepts:
- Ingredients are not represented directly by objects. 
- Rather, any ingredient can be boiled down to a string: the IID. (Ingredient IDentifier)
- The IID describes the granular specifics of any ingredient.
  - Example: Steamed Brocolli
    - Brocolli is a vegetable : Vg
    - This brocolli is steamed: Stm
    - The cut is florets: Fl
    - The name provided by the user: Brocolli
      - IID: Vg-Fl-Stm-Brocolli
  
- The IID is related to a counter variable in a "PantryNode" to quantify any ingredient.
- The PantryNode can be thought of as display box at a grocery store.
  - It is designated for only one ingredient
  - The quantity of that ingredient is within the box
    - For example, the watermelon box in the entryway of a grocery store in the summer.
  
- PantryNodes are them combined into a larger object, PantryStorage.
- The PantryStorage object could be analogized as the whole produce section. 
  - Many boxes, one for each ingredient. 

Overview of phase I:
- Ingredient.java 
  - represents the abstract idea of an ingredient.
  - This class is used to generate an ingredient ID (IID) string.
  - It is specified by the inputs to the constructor, and is not random.
    - The IID is not unique to the object, but rather the "abstract" ingredient.
    - Thus any two instances of an Ingredient object, if constructed with the same ingredient in mind, will have the same IID.
    - The IID is representative of the characteristics of the ingredient.
      - E.g. a spice will have "Sp" in the IID. This will grow more complex in latter phases.

- IngredientInterface.java
  - Used to specify how we need to interact with any ingredient, largely regarding its IID.

- PantryNode.java
  - This class represents an object that links an IID to a quantity.
  - One node relates just one IID and one counter variable, named quantity.
  - It is NOT a data structure composed of objects.
  - You can interact with the node directly in a few ways:
    - 1. Querying contents
      - get the IID related to the node
      - get the quantity value
    - 2. Changing quantity
      - add to the quantity
        - addQty() to add one
        - addQty(x) to add x 
      - remove from the quantity
        - removeQty() to remove one
        - removeQty(x) to remove x
        - *There are currently no safeguards in place to prevent a negative qty!*
    - 3. Compare node's ingredient to an ingredient passed in
      - e.g. thisNode.isIngredient(someIngredient)
        - true if thisNode's ingredient has the same IID as someIngredient
        - false otherwise

- PantryStorage.java
  - This class represents a collection of PantryNodes.
  - Node creation is handled within the object.
  - Ingredient transactions are done by passing an ingredient object that represents your ingredient to the appropriate method.
    - Thus, ingredient objects are added directly, NOT PantryNodes. 
  - Interaction is done via:
    - 1. Changing ingredient quantities
    - 2. Querying if there is any positive amount of an ingredient
    - 3. Querying exact quantity of an ingredient
    - 4. List total contents (via toString)

- IngredientRegistry.java
  - This is not yet implemented
  - This will hold previously generated IIDs. 
  - This is for a sort of IID memory per user. 



- **General Todo:**
  - add option to use IID anywhere and ingredient object is used. 
    - maybe eventually move away from instantiated ingredient objects, just use IID?