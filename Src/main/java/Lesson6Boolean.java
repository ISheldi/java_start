package Src.main.java;

public class Lesson6Boolean {
    public static void main(String [] args){
        int i = 6;
        int j = 7;
        boolean evenNumber;
        if(i%2==0){
            evenNumber = true;
        } else {
            evenNumber = false;
        }
        System.out.println(evenNumber);

        boolean notEvenNumber;
        if(j%2==0){
            notEvenNumber = true;
        } else {
            notEvenNumber = false;
        }
        System.out.println(notEvenNumber);
    }
}
