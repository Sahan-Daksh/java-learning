package Recursion;

public class RecursionMain {

    public static int sum(int number){
        if(number>0){
            return number+sum(number-1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int total= sum(10);
        System.out.println("Results is :"+total);
    }
}
