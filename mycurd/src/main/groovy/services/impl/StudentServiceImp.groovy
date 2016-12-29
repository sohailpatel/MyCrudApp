package services.impl

import com.google.inject.Inject
import com.webonise.mycurd.tables.records.StudentinfoRecord
import daos.UserDao
import services.interfaces.StudentService
import pojos.StudentPojo

/**
 * Created by webonise on 24-12-2016.
 */
class StudentServiceImp implements StudentService{

    private UserDao userDao

    @Inject
    StudentServiceImp(UserDao userDao) {
        this.userDao = userDao
    }

    @Override
    int saveStudent(StudentPojo student) {
        //context.insertInto(Tables.STUDENTINFO).set(Tables.STUDENTINFO.NAME,student.name).set(Tables.STUDENTINFO.AGE,student.age).set(Tables.STUDENTINFO.CLASS,student.className).set(Tables.STUDENTINFO.ROLLNO,student.rollNo)
        //return context.execute("insert into studentinfo(name,age,class,rollno) values('$student.name',$student.age,'$student.className',$student.rollNo)")
        return userDao.saveStudent(student)
    }

    @Override
    List<StudentPojo> allStudents() {
        return userDao.allStudents()
    }

    @Override
    int updateStudent(int studentId, StudentPojo student) {
        // return context.execute("update studentinfo set name='updated' where _id=$studentId")
        return userDao.updateStudent(studentId,student)
    }

    @Override
    int deleteStudent(int studentId) {
        //return context.execute("delete from studentinfo where _id=$studentId")
        return userDao.deleteStudent(studentId)
    }

}
