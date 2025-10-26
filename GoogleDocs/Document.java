public class Document {

    public Integer Id;
    public String Title,Description;
    public User user;
    public Document(Integer id, String title, String description,User user) {
        this.Id = id;
        this.Title = title;
        this.Description = description;
        this.user=user;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getDescription() {
        return this.Description;
    }
    public boolean OpenDocument() {
        if(this.user.getAccess()==null){
            System.out.println(user.getName()+" is not having read access");
            return false;
        }
        else if(this.user.getAccess().equals(Access.READ) || this.user.getAccess().equals(Access.WRITE)) {
            System.out.println("Document opened");
            System.out.println(this.getId()+" : "+this.getTitle()+" : "+this.getDescription());
        }
        return true;
    }
    public void UpdateDocument(String NewTitle,String NewDescription) {
        if(this.user.getAccess().equals(Access.WRITE)) {
            this.Description = NewDescription;
            this.Title = NewTitle;
            System.out.println("Document updated");
            System.out.println(this.getId() + " : " + this.getTitle() + " : " + this.getDescription());
        }
        else {
            System.out.println(this.user.getName()+" is not having write access");
        }
    }
    public void CloseDocument() {
        System.out.println(this.getTitle()+" Document Closed");
    }

}
