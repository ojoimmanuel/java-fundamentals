package classActivities;

public class ConstructorsStudent {
    private int id;
    private String name;

    public ConstructorsStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(id + " " + name);
    }
}
