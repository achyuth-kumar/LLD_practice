public class Main {
    public static int score=200;
    public static void main(String [] args) {
        University universityFactory=UniversityFactory.getUniversity(score);
        universityFactory.Departments();
        universityFactory.Course();
        MitAdmitCard mitAdmitCard=new MitAdmitCard();
        mitAdmitCard.getAdmitCard();
        MitFeeCalculator mitFeeCalculator=new MitFeeCalculator();
        mitFeeCalculator.getFeeCalculator();
        System.out.println();
        
        score=80;
        universityFactory=UniversityFactory.getUniversity(score);
        universityFactory.Departments();
        universityFactory.Course();
        UscAdmitCard uscAdmitCard=new UscAdmitCard();
        uscAdmitCard.getAdmitCard();
        UscFeeCalculator useFeeCalculator=new UscFeeCalculator();
        useFeeCalculator.getFeeCalculator();
    }
}