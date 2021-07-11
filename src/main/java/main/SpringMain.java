package main;

import a.StudentDao;
import dao.PersonDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yuanqin.spring.*;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        System.out.println(applicationContext.getClass());
//
//        HelloWorld object = (HelloWorld) applicationContext.getBean("helloWorld1");
//        System.out.println(object.getClass());
//        object.run();
//
//        HelloWorld object2 = (HelloWorld) applicationContext.getBean("helloWorld2");
//        System.out.println(object2.getClass());
//        object2.run();
//
//        HelloWorld helloWorldImple2 = applicationContext.getBean(HelloWorldImple2.class);
//        System.out.println("-----------------");
//        helloWorldImple2.run();
//
//        System.out.println(applicationContext.getDisplayName());
//        System.out.println(applicationContext.getId());
//
//        Student student1 = (Student) applicationContext.getBean("student");
//        System.out.println(student1.getName());

        /*PersonDao personDao = applicationContext.getBean(PersonDao.class);
        Person person = new Person();
        person.setName("waymo");
        person.setAge(12);
        person.setCountry("American");
        person.setPassWord("123456");
        person.setUserName("machine");
        person.setSex(false);
        personDao.insertPerson(person);*/

        Student student = applicationContext.getBean(Student.class);
        Teacher teacher = student.getTeacher();
        System.out.println(teacher.getName());

        StudentDao  studentDao = applicationContext.getBean(StudentDao.class);
        Student student2 = new Student();
        student2.setName("张三");
        student2.setAge(20);
        studentDao.insertStudent(student2);




    }

}
