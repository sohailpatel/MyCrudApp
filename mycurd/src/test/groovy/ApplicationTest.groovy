import daos.UserDao
import modules.ApplicationPropertiesModule
import modules.DaoModule
import modules.ServiceModule
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import pojos.StudentPojo
import resources.StudentResource
import services.impl.StudentServiceImp
import services.interfaces.StudentService
import spock.lang.Specification

import java.sql.Connection
import java.sql.DriverManager

/**
 * Created by webonise on 27-12-2016.
 */
class ApplicationTest extends Specification {
    private DSLContext dslContext;
   def setup(){
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttest", "root", "root")
       dslContext= DSL.using(connection, SQLDialect.MYSQL)
       dslContext.execute("create table studentinfo (_id int PRIMARY KEY AUTO_INCREMENT,name varchar(20),age int,class varchar(10),rollno int);")
       dslContext.execute("use studenttest")
    }

    def "saveStudent"(){
       given:
       UserDao userDao=new UserDao(dslContext)
       StudentService studentService=new StudentServiceImp(userDao);
        when:
        StudentPojo studentPojo=new StudentPojo('test',12,'testclass',10)
        int saveStudentOutput=studentService.saveStudent(studentPojo)
        then:
        assert saveStudentOutput == 1
    }

    def "updateStudent"(){
        given:
        UserDao userDao=new UserDao(dslContext)
        StudentService studentService=new StudentServiceImp(userDao);
        when:
        StudentPojo studentPojo=new StudentPojo('test',12,'testclass',10)
        int saveStudentOutput=studentService.saveStudent(studentPojo)
        studentPojo=new StudentPojo('testchange',22,'test',9)
        int updateStudent=studentService.updateStudent(1,studentPojo)
        then:
        assert updateStudent == 1
    }

    def "deleteStudent"(){
        given:
        UserDao userDao=new UserDao(dslContext)
        StudentService studentService=new StudentServiceImp(userDao);
        when:
        StudentPojo studentPojo=new StudentPojo('test',12,'testclass',10)
        int saveStudentOutput=studentService.saveStudent(studentPojo)
        int deleteStudent=studentService.deleteStudent(1)
        then:
        assert deleteStudent == 1
    }

    def cleanup(){
        dslContext.execute("drop table studentinfo")
        dslContext=null
    }
}
