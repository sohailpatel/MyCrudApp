/**
 * This class is generated by jOOQ
 */
package com.webonise.mycurd.tables;


import com.webonise.mycurd.Student;
import com.webonise.mycurd.tables.records.StudentinfoRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Studentinfo extends TableImpl<StudentinfoRecord> {

    private static final long serialVersionUID = -343997557;

    /**
     * The reference instance of <code>student.studentinfo</code>
     */
    public static final Studentinfo STUDENTINFO = new Studentinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentinfoRecord> getRecordType() {
        return StudentinfoRecord.class;
    }

    /**
     * The column <code>student.studentinfo.name</code>.
     */
    public final TableField<StudentinfoRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>student.studentinfo.age</code>.
     */
    public final TableField<StudentinfoRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>student.studentinfo.class</code>.
     */
    public final TableField<StudentinfoRecord, String> CLASS = createField("class", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>student.studentinfo.rollno</code>.
     */
    public final TableField<StudentinfoRecord, Integer> ROLLNO = createField("rollno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>student.studentinfo._id</code>.
     */
    public final TableField<StudentinfoRecord, Integer> _ID = createField("_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>student.studentinfo</code> table reference
     */
    public Studentinfo() {
        this("studentinfo", null);
    }

    /**
     * Create an aliased <code>student.studentinfo</code> table reference
     */
    public Studentinfo(String alias) {
        this(alias, STUDENTINFO);
    }

    private Studentinfo(String alias, Table<StudentinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Studentinfo(String alias, Table<StudentinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Student.STUDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Studentinfo as(String alias) {
        return new Studentinfo(alias, this);
    }

    /**
     * Rename this table
     */
    public Studentinfo rename(String name) {
        return new Studentinfo(name, null);
    }
}
