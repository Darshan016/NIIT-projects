package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
       // ;

      //  ;
        System.out.println("grades scored in medical pathway are "+sm.calculateMarks(88,55,69,90));
        System.out.println("grades scored in non-medical scienses pathway are " +  sm.calculateMarks(77,57,40,0));
        System.out.println("grades scored in business pathway are " + sm.calculateMarks(70,66));
    }
}
