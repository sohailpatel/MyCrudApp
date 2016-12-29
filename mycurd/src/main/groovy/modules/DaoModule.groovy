package modules
/**
 * Created by webonise on 26-12-2016.
 */
import com.google.inject.AbstractModule
import com.google.inject.Singleton
import groovy.transform.CompileStatic
import org.jooq.DSLContext
import providers.DSLContextProvider

@CompileStatic
class DaoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DSLContext).toProvider(DSLContextProvider).in(Singleton)
    }
}
