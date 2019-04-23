/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperDelete;


/**
 * Fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity in the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class BusinessPartnerAddressDeleteFluentHelper
    extends FluentHelperDelete<BusinessPartnerAddressDeleteFluentHelper, BusinessPartnerAddress>
{

    /**
     * {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity object that will be deleted in the S/4HANA system.
     * 
     */
    private final BusinessPartnerAddress entity;

    /**
     * Creates a fluent helper object that will delete a {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The BusinessPartnerAddress to delete from the endpoint.
     */
    public BusinessPartnerAddressDeleteFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final BusinessPartnerAddress entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected BusinessPartnerAddress getEntity() {
        return entity;
    }

}
