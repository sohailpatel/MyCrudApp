/**
 * Created by webonise on 26-12-2016.
 */
import groovy.transform.CompileStatic
import modules.ApplicationPropertiesModule
import modules.DaoModule
import modules.ServiceModule
import restling.guice.modules.RestlingApplicationModule
import routers.RootRouter

@CompileStatic
class Application extends RestlingApplicationModule {
    Class<RootRouter> routerClass = RootRouter

    @Override
    void configureCustomBindings() {
        install(new DaoModule())
        install(new ServiceModule())
        install(new ApplicationPropertiesModule())
    }
}
