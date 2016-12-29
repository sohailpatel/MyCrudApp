package routers
/**
 * Created by webonise on 25-12-2016.
 */

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter
import resources.StudentResource

@CompileStatic
class ApiRouter extends RestlingRouter {

    @Override
    void init() throws Exception {
        attach("/student", StudentResource)
    }
}
