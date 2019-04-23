/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerAddressSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BusinessPartnerAddressByKeyFluentHelper
    extends FluentHelperByKey<BusinessPartnerAddressByKeyFluentHelper, BusinessPartnerAddress, BusinessPartnerAddressSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BusinessPartnerAddress}
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public BusinessPartnerAddressByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String businessPartner, final String addressID) {
        super(servicePath);
        this.key.put("BusinessPartner", businessPartner);
        this.key.put("AddressID", addressID);
    }

    @Override
    @Nonnull
    protected Class<BusinessPartnerAddress> getEntityClass() {
        return BusinessPartnerAddress.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
