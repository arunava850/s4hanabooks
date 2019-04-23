/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BusinessPartnerByKeyFluentHelper
    extends FluentHelperByKey<BusinessPartnerByKeyFluentHelper, BusinessPartner, BusinessPartnerSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BusinessPartner}
     */
    public BusinessPartnerByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String businessPartner) {
        super(servicePath);
        this.key.put("BusinessPartner", businessPartner);
    }

    @Override
    @Nonnull
    protected Class<BusinessPartner> getEntityClass() {
        return BusinessPartner.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
