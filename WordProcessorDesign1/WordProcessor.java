import java.util.HashMap;

public class WordProcessor extends Character{

    WordProcessor(char c, String font, int size) {
        super(c, font, size);
    }
    HashMap<java.lang.Character,Character> characterCache=new HashMap<java.lang.Character, Character>();
    public Character createWord() {
        if(characterCache.containsKey(c)) {
            return characterCache.get(c);
        }
        else {
            Character newCharacter=new Character(c,font,size);
            characterCache.put(c,newCharacter);
            return newCharacter;
        }
    }
}
