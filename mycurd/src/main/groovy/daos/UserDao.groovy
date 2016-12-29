package daos

import com.google.inject.Inject
import com.webonise.mycurd.Tables
import com.webonise.mycurd.tables.pojos.Studentinfo
import groovy.transform.CompileStatic
import org.jooq.DSLContext
import com.webonise.mycurd.tables.records.StudentinfoRecord;
import org.jooq.Param
import org.jooq.Record
import org.jooq.SelectJoinStep
import org.jooq.TableLike
import org.jooq.impl.DSL
import pojos.StudentPojo

/**
 * Created by webonise on 25-12-2016.
 */

@CompileStatic
class UserDao {
    private static final String ID_PARAMETER = "ID_PARAMETER"
    private final DSLContext dslContext

    @Inject
    UserDao(DSLContext dslContext) {
        this.dslContext = dslContext
    }

    List<StudentPojo> allStudents() {
        //println(dslContext.select().from(Tables.STUDENTINFO).fetch().into(Tables.STUDENTINFO))
        List<StudentinfoRecord> studentinfoRecordList = dslContext.select().from(Tables.STUDENTINFO).fetch().into(Tables.STUDENTINFO)
        List<StudentPojo> studentPojoList=new ArrayList<StudentPojo>();
        for (int rowCounter = 0; rowCounter < studentinfoRecordList.size(); rowCounter++) {
           StudentPojo studentPojo = new StudentPojo(String.valueOf(studentinfoRecordList.get(rowCounter).get(1)),
                Integer.parseInt(String.valueOf(studentinfoRecordList.get(rowCounter).get(2))),
                    String.valueOf(studentinfoRecordList.get(rowCounter).get(3)),
                        Integer.parseInt(String.valueOf(studentinfoRecordList.get(rowCounter).get(4))))
            studentPojoList.add(studentPojo);
        }
        return studentPojoList
    }
    int saveStudent(StudentPojo student) {
        println "-----"+student
        return dslContext.execute("insert into studentinfo(name,age,class,rollno) values('$student.name',$student.age,'$student.className',$student.rollNo)")

        /*StudentinfoRecord studentRecord = dslContext.newRecord(Tables.STUDENTINFO)
        studentRecord.setName(student.getName())
        studentRecord.setAge(student.getAge())
        studentRecord.setClass_(student.getClassName())
        studentRecord.setRollno(student.getRollNo())
        println StudentinfoRecord
        studentRecord.into(Tables.STUDENTINFO)
        return studentRecord.into(Tables.STUDENTINFO)*/
    }

    int updateStudent(int studentId, StudentPojo student) {
        println studentId+" "+student
        return dslContext.execute("update studentinfo set name='$student.name',age=$student.age,class='$student.className',rollno=$student.rollNo where _id=$studentId");

        /*Param<Integer> idParam = DSL.param(ID_PARAMETER, studentId)
        StudentinfoRecord studentRecord = dslContext.fetchOne(Tables.STUDENTINFO, Tables.STUDENTINFO._ID.equal(idParam))
        studentRecord.setName(student.getName())
        return studentRecord.store()*/
    }

    int deleteStudent(int studentId) {
        println studentId
        return dslContext.execute("delete from studentinfo where _id=$studentId");

        /*Param<Integer> idParam = DSL.param(ID_PARAMETER, studentId)
        StudentinfoRecord studentRecord = dslContext.fetchOne(Tables.STUDENTINFO, Tables.STUDENTINFO._ID.equal(idParam))
        studentRecord.delete()
        return studentRecord.into(Tables.STUDENTINFO)*/
    }
}