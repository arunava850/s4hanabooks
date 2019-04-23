/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class AddressEmailAddressDeleteFluentHelper
    extends FluentHelperDelete<AddressEmailAddressDeleteFluentHelper, AddressEmailAddress>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final AddressEmailAddress entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The AddressEmailAddress to delete from the endpoint.
     */
    public AddressEmailAddressDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final AddressEmailAddress entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected AddressEmailAddress getEntity() {
        return entity;
    }

}
