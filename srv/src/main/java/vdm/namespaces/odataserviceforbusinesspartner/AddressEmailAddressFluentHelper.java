/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperRead;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressEmailAddressSelectable;


/**
 * Fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class AddressEmailAddressFluentHelper
    extends FluentHelperRead<AddressEmailAddressFluentHelper, AddressEmailAddress, AddressEmailAddressSelectable>
{


    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public AddressEmailAddressFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<AddressEmailAddress> getEntityClass() {
        return AddressEmailAddress.class;
    }

}
