package classActivities;

public class Methods {

    //    Static Method
    public static String joinNames(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    //  Non-static method
    public String joinNames2(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        //calling static method
        String fullName = joinNames("Emmanuel", "Ojo");
        {
            System.out.println(fullName);
        }

        //calling non-static
        Methods name = new Methods();
        String fullName2 = name.joinNames2("Emmanuel", "Ojo");
        System.out.println(fullName2);
    }

}
