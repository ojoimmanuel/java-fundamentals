package classActivities;

public class PrintNumInReverse {
    public static void main(String[] args) {
//        for(int num = 10; num>-1; num--){
//            System.out.println(num);
//        }

//        for (int num = 0; num<=10; num++){
//            if((num%2) == 0){
//                System.out.println(num);
//            }
//        }
        int n = 5;
        int sum = 0;
        while ( n > 0){
            sum = sum + n;
            n--;
        }
        System.out.println(sum);


    }
}
