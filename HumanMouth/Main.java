public class Main {
    public static void main(String [] args) {
        Teeth teeth=new Teeth(32);
        teeth.brush();
        Lips lips=new Lips();
        lips.open();
        Mouth mouth=new MouthServiceImpl(10);
        mouth.OpenMouth();
        mouth.ChewFood(8);
        mouth.DrinkWater();
        lips.close();
    }
}
