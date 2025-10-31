public class Person {
    public Integer id;
    public String name;
    ElevatorImpl elevator;
    public Person(Integer id, String name,ElevatorImpl elevator) {
        this.id = id;
        this.name = name;
        this.elevator=elevator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void CheckIn() {
        elevator.CheckIn();
    }
    public void CheckOut(){
        elevator.CheckOut();
    }


}
