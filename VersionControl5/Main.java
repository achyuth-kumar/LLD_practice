public class Main {
    public static void main(String [] args) {
        VersionControl versionControl=new VersionControlServiceImpl();
        versionControl.put(1,"Apple");
        versionControl.put(1,"Mango");
        versionControl.put(1,"Banana");
        versionControl.get(1,2);
//        versionControl.view();

        versionControl.put(2,"Belgaum");
        versionControl.put(2,"Bangalore");
        versionControl.put(2,"Gangavathi");
        versionControl.get(2,2);
//        versionControl.view();


    }
}
