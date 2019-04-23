/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class CustomerDunningUpdateFluentHelper
    extends FluentHelperUpdate<CustomerDunningUpdateFluentHelper, CustomerDunning>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final CustomerDunning entity;

    /**
     * Creates a fluent helper object that will update a {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The CustomerDunning to take the updated values from.
     */
    public CustomerDunningUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final CustomerDunning entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected CustomerDunning getEntity() {
        return entity;
    }

}
