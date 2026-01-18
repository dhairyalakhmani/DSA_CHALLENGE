package DSA_CHALLENGE.Recursion;

import java.util.ArrayList;

public class grayCode {
    public static ArrayList<String> gray(int n){
        ArrayList<String> list = new ArrayList<>();
        list = Answer(n);
        return list;
    }
    public static ArrayList<String> Answer(int n){
        if(n == 1){
            ArrayList<String> finalStep = new ArrayList<>();
            finalStep.add("0");
            finalStep.add("1");
            return finalStep;
        }
        ArrayList<String> previous = Answer(n - 1);
        ArrayList<String> answer = new ArrayList<>();
        for (String s : previous) {
            answer.add("0" + s);
        }
        for (String s : previous) {
            answer.add("1" + s);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(gray(3));
    }
 }
