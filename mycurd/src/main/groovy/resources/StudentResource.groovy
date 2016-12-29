package resources
/**
 * Created by webonise on 24-12-2016.
 */

import com.google.inject.Inject
import com.webonise.mycurd.tables.records.StudentinfoRecord
import org.jooq.Record
import org.jooq.SelectJoinStep
import org.restlet.resource.Delete
import org.restlet.resource.Get
import org.restlet.resource.Post
import org.restlet.resource.Put
import org.restlet.resource.ServerResource
import pojos.StudentPojo
import services.interfaces.StudentService

class StudentResource extends ServerResource{

    private static final String USER_ID = "userid"
    private StudentService studentService

    @Inject
    StudentResource(StudentService studentService) {
        this.studentService = studentService
    }

    @Get
    List<StudentPojo> allStudents() {
        return studentService.allStudents()
    }

    @Post
    int saveStudent(StudentPojo student) {
        return studentService.saveStudent(student)
    }

    @Put
    int updateStudent(StudentPojo student) {
        int studentId = getQueryValue("studentId") as int
        println studentId
        println student
        return studentService.updateStudent(studentId, student)
    }

    @Delete
    int deleteStudent() {
        println("delete resource")
        //int id = Integer.parseInt(getQuery().getValues(USER_ID))
        int studentId = getQueryValue("studentId") as int
        return studentService.deleteStudent(studentId)
    }
}
