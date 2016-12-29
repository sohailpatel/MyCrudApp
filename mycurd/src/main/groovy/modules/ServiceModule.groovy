package modules
/**
 * Created by webonise on 26-12-2016.
 */
import com.google.inject.AbstractModule
import com.google.inject.Singleton
import services.impl.StudentServiceImp
import groovy.transform.CompileStatic
import services.interfaces.StudentService

@CompileStatic
class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(StudentService).to(StudentServiceImp).in(Singleton)
    }
}
