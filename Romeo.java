public class Romeo{

    private String name;
    private int age;
    private String course;
    private char grade;

    public Romeo()
    {
        this(" ", 0, " ", ' ');
    }

    public Romeo(String name , int age, String course, char grade)
    {
        setName(name);
        setAge(age);
        setCourse(course);
        setGrade(grade);
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }    
    public void setCourse(String course)
    {
        this.course = course;
    }
    public void setGrade(char grade)
    {
        this.grade = grade;
    }    

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCourse()
    {
        return course;
    }

    public char getGrade()
    {
        return grade;
    }

    public String toSting()
    {
        return "Your name " + getName() + " and your doing " + getCourse() +
                " at the age of " + getAge() + " and a grade of " + getGrade();
    }


    public static void main(String args[])
    {
        Romeo r1 =  new Romeo("Romeo", 20 , "Bsc in Information Technology", 'A' );
    }
    
    System.out.println(r1);

}