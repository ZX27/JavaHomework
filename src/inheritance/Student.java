package inheritance;

import java.io.PrintStream;

public class Student extends Person
{
    private int sID;
    private int classNo;

    public Student(String name, char sex, int age, int sID, int classNo)
    {
        super(name, sex, age);
        this.sID = sID;
        this.classNo = classNo;
    }

    public void setData(String name, char sex, int age, int sID, int classNo)
    {
        super.setData(name, sex, age);//super调用父类方法
        this.sID = sID;
        this.classNo = classNo;
    }

    public String getData()
    {
        return super.getData() + ", sID=" + this.sID + ", classNo=" + this.classNo;
    }



    public static void main(String[] args)
    {
        Student aStudent = new Student("Monica", 'f', 17, 12, 12);
        System.out.println(aStudent.getData());
        aStudent.setData("Chandler", 'm', 18, 13, 13);
        System.out.println(aStudent.getData());
    }
}