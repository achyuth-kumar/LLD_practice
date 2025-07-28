public abstract class UniversityFactory {
    public static int cutoff=100;
    public static University getUniversity(int c){
        if(c>cutoff) 
            return new Mit();
        else 
            return new Usc();
    }
    public abstract void getAdmitCard();
    public abstract void getFeeCalculator();
}