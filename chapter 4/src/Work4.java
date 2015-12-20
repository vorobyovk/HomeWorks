public class Work4 {
    public static void main(String[] args) {
        Jedi darth = new Jedi ("Darth Vader",2, true);
        Jedi obiVan = new Jedi ("Obi Van", 0, false);
        System.out.println(darth.getCharacterName() + " Имел количество детей равное = " + darth.getChildrenCharacter());
        System.out.println(obiVan.getCharacterName());
    }
}
