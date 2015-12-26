public class Jedi {
    private String characterName;
    private int childrenCharacter;
    private boolean isOnDarkSide;

    Jedi(String jediName, int childrenNumber, boolean isOnDarkSides){
      characterName = jediName;
      childrenCharacter = childrenNumber;
      isOnDarkSide = isOnDarkSides;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getChildrenCharacter() {
        return childrenCharacter;
    }

    public boolean getisOnDarkSide() {
        return isOnDarkSide;
    }
}
