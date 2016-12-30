package daos

import com.google.inject.Inject
import com.webonise.mycurd.Tables
import groovy.transform.CompileStatic
import org.jooq.DSLContext
import com.webonise.mycurd.tables.records.StudentinfoRecord
import pojos.StudentPojo
import groovy.util.logging.Slf4j

/**
 * Created by webonise on 25-12-2016.
 */

@Slf4j
@CompileStatic
class UserDao {
    private static final String ID_PARAMETER = "ID_PARAMETER"
    private final DSLContext dslContext

    @Inject
    UserDao(DSLContext dslContext) {
        this.dslContext = dslContext
    }

    List<StudentPojo> allStudents() {
        log.info "Student Table - "+dslContext.select().from(Tables.STUDENTINFO).fetch().into(Tables.STUDENTINFO)
        List<StudentinfoRecord> studentinfoRecordList = dslContext.select().from(Tables.STUDENTINFO).fetch().into(Tables.STUDENTINFO)
        List<StudentPojo> studentPojoList=new ArrayList<StudentPojo>();
        for (int rowCounter = 0; rowCounter < studentinfoRecordList.size(); rowCounter++) {
           StudentPojo studentPojo = new StudentPojo(name: String.valueOf(studentinfoRecordList.get(rowCounter).get(0)),
                age: Integer.parseInt(String.valueOf(studentinfoRecordList.get(rowCounter).get(1))),
                    className: String.valueOf(studentinfoRecordList.get(rowCounter).get(2)),
                        rollNo: Integer.parseInt(String.valueOf(studentinfoRecordList.get(rowCounter).get(3))),
                            _id: Integer.parseInt(String.valueOf(studentinfoRecordList.get(rowCounter).get(4))))
            studentPojoList.add(studentPojo);
        }
        return studentPojoList
    }

    int saveStudent(StudentPojo student) {
        log.info "Student Pojo Name - "+student.getName()
        return dslContext.insertInto(Tables.STUDENTINFO).values(student.name,student.age,student.className,student.rollNo,student._id).execute()
    }

    int updateStudent(int studentId, StudentPojo student) {
        log.info "Student ID - "+studentId
        log.info "Studeint Pojo - "+" "+student
        return dslContext.update(Tables.STUDENTINFO).set(Tables.STUDENTINFO.NAME , student.name).
                set(Tables.STUDENTINFO.AGE , student.age).
                set(Tables.STUDENTINFO.CLASS , student.className).
                set(Tables.STUDENTINFO.ROLLNO , student.rollNo).where(Tables.STUDENTINFO._ID.equal(student._id)).execute()
    }

    int deleteStudent(int studentId) {
        log.info "Student ID - "+studentId
        return dslContext.delete(Tables.STUDENTINFO).where(Tables.STUDENTINFO._ID.equal(studentId)).execute()
    }
}