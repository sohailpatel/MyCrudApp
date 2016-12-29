package modules
/**
 * Created by webonise on 26-12-2016.
 */

import com.google.inject.AbstractModule
import com.google.inject.Singleton
import groovy.transform.CompileStatic
import providers.ApplicationPropertiesProvider

@CompileStatic
class ApplicationPropertiesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Properties).toProvider(ApplicationPropertiesProvider).in(Singleton)
    }
}

