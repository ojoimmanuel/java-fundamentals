package classActivities;

public class ConstructorsMain {


    public static void main(String[] args) {

        ConstructorsStudent student1 = new ConstructorsStudent(1, "Sam");
        ConstructorsStudent student2 = new ConstructorsStudent(2, "Sammy");
        ConstructorsStudent student3 = new ConstructorsStudent(3, "Samuel");

        student1.display();
        student2.display();
        student3.display();

    }

}
