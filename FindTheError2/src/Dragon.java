
public class Dragon {

    private String name;
    private int level;
    private boolean canBreatheFire;

    public Dragon(String dragonName, int dragonLevel) {
        name = dragonName;
        level = dragonLevel;

        // Use level value to determine state of canBreatheFire
        if (level >= 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }

    // ~~~  Accessor method ~~~ //
    public String getName() {
        return name;
    }

    // ~~~ Mutator method ~~~ //
    public void setLevel(int lev) {
        level = lev;
        if (level >= 70) {
            canBreatheFire = true;
            System.out.println(name + " can breathe fire.🔥");
        } else {
            canBreatheFire = false;
            System.out.println(name + " can't breathe fire.💨");
        }
    }

    // ~~~ Other methods ~~~ //
    public void attack() {
        // Choose whether to print fire (>) or smoke (~)
        String charToPrint = "";
        if (canBreatheFire) {
            charToPrint = "f";
        } else {
            charToPrint = "s";
        }

        // Print all possible complete rows
        int numRows = level / 10;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(charToPrint);
            }
            System.out.println();
        }

        // Print the incomplete row(s)
        int leftover = level % numRows;
        for (int j = 0; j < leftover; j++) {
            System.out.print(charToPrint);
        }
        System.out.println();
    }

    public int getDefenseRating() {
        // if it can breathe fire, it gets a 30 point boost
        int rating = 0;
        if (canBreatheFire) {
            rating += 30;
        }
        // compute and add default rating
        rating += 3 * level;
        return rating;
    }

    // String representation of the object
    public String toString() {
        return "Dragon " + name + " is at level " + level;
    }
}
