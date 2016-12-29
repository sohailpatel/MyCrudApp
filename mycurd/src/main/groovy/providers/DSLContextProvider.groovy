package providers

import com.google.inject.Inject
import com.google.inject.Provider
import groovy.transform.CompileStatic
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * Created by webonise on 24-12-2016.
 */
@CompileStatic
class DSLContextProvider implements Provider<DSLContext> {
    private Properties properties

    @Inject
    DSLContextProvider(Properties properties) {
        this.properties = properties
    }

    @Override
    DSLContext get() throws SQLException {
        String userName = properties.getProperty("MYSQL_USER_LOGIN")
        String password = properties.getProperty("MYSQL_USER_PASSWORD")
        String url = properties.getProperty("MYSQL_DB_URL")
        println userName+password+url+properties
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password)
        return DSL.using(connection, SQLDialect.MYSQL)
    }
}
