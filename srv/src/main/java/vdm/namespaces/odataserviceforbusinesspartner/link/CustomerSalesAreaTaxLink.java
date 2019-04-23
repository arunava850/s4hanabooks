/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSalesAreaTaxSelectable;


/**
 * Template class to represent entity navigation links of {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CustomerSalesAreaTaxLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CustomerSalesAreaTaxLink<ObjectT> , CustomerSalesAreaTax, ObjectT>
    implements CustomerSalesAreaTaxSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CustomerSalesAreaTaxLink(final String fieldName) {
        super(fieldName);
    }

    private CustomerSalesAreaTaxLink(final EntityLink<CustomerSalesAreaTaxLink<ObjectT> , CustomerSalesAreaTax, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected CustomerSalesAreaTaxLink<ObjectT> translateLinkType(final EntityLink<CustomerSalesAreaTaxLink<ObjectT> , CustomerSalesAreaTax, ObjectT> link) {
        return new CustomerSalesAreaTaxLink<ObjectT>(link);
    }

}
