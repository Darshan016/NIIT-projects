package com.marks;

import java.sql.SQLOutput;

public class StudentMarks {
    public int calculateMarks(int math,int physics,int chemistry,int biology)
    {
        int sum = math+physics+chemistry+biology;
        return sum;
       // System.out.println("grades scored in medical sciences are " + sum);
    }
  /*  public int calculateMarks(int math,int physics,int chemistry)
    {
        int sum = math+physics+chemistry;
        return sum;
    }*/
    public int calculateMarks(int accounting,int finance)
    {
        int sum = accounting+finance;
        return sum;
    }
}
