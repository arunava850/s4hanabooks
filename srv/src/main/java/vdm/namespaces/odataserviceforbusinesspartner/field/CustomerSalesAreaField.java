/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.field;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityField;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSalesAreaSelectable;


/**
 * Template class to represent entity fields of the Entity {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea}. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <FieldT>
 * Field type
 * 
 */
public class CustomerSalesAreaField<FieldT >
    extends EntityField<CustomerSalesArea, FieldT>
    implements CustomerSalesAreaSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData field name. Must match the field returned by the underlying OData service.OData field name. Must match the field returned by the underlying OData service.
     */
    public CustomerSalesAreaField(final String fieldName) {
        super(fieldName);
    }

    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.When creating instances for custom fields, this constructor can be used to add a type converter that will be automatically used by the respective entity when getting or setting custom fields.
     * 
     * @param typeConverter
     *     An implementation of a TypeConverter. The first type must match FieldT, the second type must match the type Olingo returns.
     */
    public CustomerSalesAreaField(final String fieldName, final TypeConverter<FieldT, ?> typeConverter) {
        super(fieldName, typeConverter);
    }

}
