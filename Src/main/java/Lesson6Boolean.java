package Src.main.java;

public class Lesson6Boolean {
    public static void main(String [] args){
        int i = 6;
        int j = 7;
        int d = i % 2;
        int y = j % 2;
        boolean evenNumber;
        if(d < 1){
            evenNumber = true;
        } else {
            evenNumber = false;
        }
        System.out.println(evenNumber);

        boolean notEvenNumber;
        if(y < 0){
            notEvenNumber = true;
        } else {
            notEvenNumber = false;
        }
        System.out.println(notEvenNumber);
    }
}
