package resources
/**
 * Created by webonise on 24-12-2016.
 */

import com.google.inject.Inject
import org.restlet.resource.Delete
import org.restlet.resource.Get
import org.restlet.resource.Post
import org.restlet.resource.Put
import org.restlet.resource.ServerResource
import pojos.StudentPojo
import services.interfaces.StudentService

class StudentResource extends ServerResource{

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
        return studentService.updateStudent(studentId, student)
    }

    @Delete
    int deleteStudent() {
        int studentId = getQueryValue("studentId") as int
        return studentService.deleteStudent(studentId)
    }
}
