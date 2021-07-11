package yuanqin.spring;

public class Student {
    private String name;
    private int num;
    private int age;
    private Teacher teacher;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
         this.name = name;
    }

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setChineseTeacher(Teacher chineseTeacher){
        this.teacher = chineseTeacher;
    }
}
