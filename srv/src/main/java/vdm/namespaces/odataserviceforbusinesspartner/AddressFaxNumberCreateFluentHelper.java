/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class AddressFaxNumberCreateFluentHelper
    extends FluentHelperCreate<AddressFaxNumberCreateFluentHelper, AddressFaxNumber>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity object that will be created in the S/4HANA system.
     * 
     */
    private final AddressFaxNumber entity;

    /**
     * Creates a fluent helper object that will create a {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The AddressFaxNumber to create.
     */
    public AddressFaxNumberCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final AddressFaxNumber entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected AddressFaxNumber getEntity() {
        return entity;
    }

}
