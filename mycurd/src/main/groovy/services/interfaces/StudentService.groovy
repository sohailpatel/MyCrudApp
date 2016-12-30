package services.interfaces

import pojos.StudentPojo

/**
 * Created by webonise on 24-12-2016.
 */
interface StudentService {

    List<StudentPojo> allStudents();
    int updateStudent(int studentId, StudentPojo student);
    int deleteStudent(int studentId);
    int saveStudent(StudentPojo student);
}