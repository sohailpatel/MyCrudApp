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
        return userDao.saveStudent(student)
    }

    @Override
    List<StudentPojo> allStudents() {
        return userDao.allStudents()
    }

    @Override
    int updateStudent(int studentId, StudentPojo student) {
        return userDao.updateStudent(studentId,student)
    }

    @Override
    int deleteStudent(int studentId) {
        return userDao.deleteStudent(studentId)
    }

}
