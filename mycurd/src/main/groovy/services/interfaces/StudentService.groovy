package services.interfaces

import com.webonise.mycurd.tables.records.StudentinfoRecord
import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.SelectJoinStep
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