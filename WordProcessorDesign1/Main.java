public class Main {
    public static void main(String [] args) {
//        Character character=new Character('A',"times_new_roman",5);
        WordProcessor word=new WordProcessor('A',"times_new_roman",5);

        Character character1=word.createWord();
        character1.display(1,2);

        Character character2=word.createWord();
        character2.display(3,4);

    }
}
