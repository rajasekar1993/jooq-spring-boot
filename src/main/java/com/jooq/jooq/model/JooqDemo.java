/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model;


import com.jooq.jooq.model.tables.CustomerMaster;
import com.jooq.jooq.model.tables.FieldMaster;
import com.jooq.jooq.model.tables.FieldTabMaster;
import com.jooq.jooq.model.tables.FieldValidationMaster;
import com.jooq.jooq.model.tables.UserMaster;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqDemo extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_demo</code>
     */
    public static final JooqDemo JOOQ_DEMO = new JooqDemo();

    /**
     * The table <code>jooq_demo.customer_master</code>.
     */
    public final CustomerMaster CUSTOMER_MASTER = CustomerMaster.CUSTOMER_MASTER;

    /**
     * The table <code>jooq_demo.Field_master</code>.
     */
    public final FieldMaster FIELD_MASTER = FieldMaster.FIELD_MASTER;

    /**
     * The table <code>jooq_demo.field_tab_master</code>.
     */
    public final FieldTabMaster FIELD_TAB_MASTER = FieldTabMaster.FIELD_TAB_MASTER;

    /**
     * The table <code>jooq_demo.field_validation_master</code>.
     */
    public final FieldValidationMaster FIELD_VALIDATION_MASTER = FieldValidationMaster.FIELD_VALIDATION_MASTER;

    /**
     * The table <code>jooq_demo.user_master</code>.
     */
    public final UserMaster USER_MASTER = UserMaster.USER_MASTER;

    /**
     * No further instances allowed
     */
    private JooqDemo() {
        super("jooq_demo", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            CustomerMaster.CUSTOMER_MASTER,
            FieldMaster.FIELD_MASTER,
            FieldTabMaster.FIELD_TAB_MASTER,
            FieldValidationMaster.FIELD_VALIDATION_MASTER,
            UserMaster.USER_MASTER);
    }
}
