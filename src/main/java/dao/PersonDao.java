package dao;

import org.apache.ibatis.annotations.Param;
import yuanqin.spring.Person;

import java.util.List;

public interface PersonDao {
    public int insertPerson(Person person);
    public Person selectPerson(@Param("abc") int personId);
    public Person getByName(@Param("name") String personName);
    public void deleteByName(@Param("name") String personName);
    public int updateByName(@Param("name") String personName,@Param("password") String password);
    public int insertPersonList(List<Person> personList);
}
