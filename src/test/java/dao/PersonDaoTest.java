package dao;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yuanqin.spring.Person;
import yuanqin.spring.Teacher;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContextTest.xml"})
public class PersonDaoTest extends TestCase {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private Teacher teacher;

    @Test
    public void testInsertPerson(){
        Person person = new Person();
        person.setName("小螺号");
        person.setAge(5);
        person.setUserName("xiaoluohao");
        int record = personDao.insertPerson(person);
        assertEquals(1,record);
    }
    @Test
    public void testDeleteByName(){
        Person person = new Person();
        personDao.deleteByName("xiaoluohao");

    }

    @Test
    public void testInsertPersonList() {
        Person person = new Person();
        person.setUserName("crabime");
        person.setPassWord("213");
        List<Person> list = new ArrayList<Person>();
        list.add(person);
        personDao.insertPersonList(list);

    }

}
