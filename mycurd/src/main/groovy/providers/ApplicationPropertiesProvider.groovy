package providers
/**
 * Created by webonise on 24-12-2016.
 */
import com.google.inject.Provider
import groovy.transform.CompileStatic

@CompileStatic
class ApplicationPropertiesProvider implements Provider<Properties> {

    @Override
    Properties get() {
        Properties properties = new Properties()
        properties.load(new FileInputStream("application.properties"))
        return properties
    }
}
