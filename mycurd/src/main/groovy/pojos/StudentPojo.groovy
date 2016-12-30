package pojos

import com.google.inject.Inject
import groovy.transform.Canonical
import jdk.nashorn.internal.ir.annotations.Immutable

/**
 * Created by webonise on 24-12-2016.
 */
@Immutable
class StudentPojo {
    String name;
    int age;
    String className;
    int rollNo;
    int _id;
}
