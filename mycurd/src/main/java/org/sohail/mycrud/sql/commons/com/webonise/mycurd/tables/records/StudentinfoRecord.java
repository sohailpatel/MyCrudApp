/**
 * This class is generated by jOOQ
 */
package com.webonise.mycurd.tables.records;


import com.webonise.mycurd.tables.Studentinfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class StudentinfoRecord extends TableRecordImpl<StudentinfoRecord> implements Record5<String, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = -1828671499;

    /**
     * Setter for <code>student.studentinfo.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>student.studentinfo.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>student.studentinfo.age</code>.
     */
    public void setAge(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>student.studentinfo.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>student.studentinfo.class</code>.
     */
    public void setClass_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>student.studentinfo.class</code>.
     */
    public String getClass_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>student.studentinfo.rollno</code>.
     */
    public void setRollno(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>student.studentinfo.rollno</code>.
     */
    public Integer getRollno() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>student.studentinfo._id</code>.
     */
    public void set_Id(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>student.studentinfo._id</code>.
     */
    public Integer get_Id() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Integer, String, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Studentinfo.STUDENTINFO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Studentinfo.STUDENTINFO.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Studentinfo.STUDENTINFO.CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Studentinfo.STUDENTINFO.ROLLNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Studentinfo.STUDENTINFO._ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClass_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRollno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return get_Id();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord value2(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord value3(String value) {
        setClass_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord value4(Integer value) {
        setRollno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord value5(Integer value) {
        set_Id(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentinfoRecord values(String value1, Integer value2, String value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentinfoRecord
     */
    public StudentinfoRecord() {
        super(Studentinfo.STUDENTINFO);
    }

    /**
     * Create a detached, initialised StudentinfoRecord
     */
    public StudentinfoRecord(String name, Integer age, String class_, Integer rollno, Integer _Id) {
        super(Studentinfo.STUDENTINFO);

        set(0, name);
        set(1, age);
        set(2, class_);
        set(3, rollno);
        set(4, _Id);
    }
}
