package day04_foorLoop;

public class Loopexample {
    public static void main(String[] args) {
        // - Print out Cybertek's characters one by one

        String str="Cybertek";


        //                       0           //
        // for(int i =startingPoint;i<endingPoint;i=i+1) {} //syntax
        //                     i <= str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            System.out.println(i+1 +". ch = " + ch);
        }
    }
}
