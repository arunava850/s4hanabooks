/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class SupplierWithHoldingTaxDeleteFluentHelper
    extends FluentHelperDelete<SupplierWithHoldingTaxDeleteFluentHelper, SupplierWithHoldingTax>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final SupplierWithHoldingTax entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The SupplierWithHoldingTax to delete from the endpoint.
     */
    public SupplierWithHoldingTaxDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final SupplierWithHoldingTax entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected SupplierWithHoldingTax getEntity() {
        return entity;
    }

}
