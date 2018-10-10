package inheritance;

public class Person
{
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setData(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getData()
    {
        return "name=" + this.name + ", sex=" + this.sex + ", age=" + this.age;
    }
}
