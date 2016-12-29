package routers
/**
 * Created by webonise on 25-12-2016.
 */
import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class RootRouter extends RestlingRouter {

    @Override
    void init() throws Exception {
        attachSubRouter("/api",ApiRouter);
    }
}
