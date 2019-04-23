/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class SupplierDunningUpdateFluentHelper
    extends FluentHelperUpdate<SupplierDunningUpdateFluentHelper, SupplierDunning>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final SupplierDunning entity;

    /**
     * Creates a fluent helper object that will update a {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The SupplierDunning to take the updated values from.
     */
    public SupplierDunningUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final SupplierDunning entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected SupplierDunning getEntity() {
        return entity;
    }

}
