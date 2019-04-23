/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.ZonedDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BuPaAddressUsageSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BuPaAddressUsageByKeyFluentHelper
    extends FluentHelperByKey<BuPaAddressUsageByKeyFluentHelper, BuPaAddressUsage, BuPaAddressUsageSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BuPaAddressUsage}
     * @param validityEndDate
     *     Validity End of a Business Partner Address Usage<p>Constraints: Not nullable, Precision: 0</p>
     * @param addressUsage
     *     Address Type<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public BuPaAddressUsageByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String businessPartner, final ZonedDateTime validityEndDate, final String addressUsage, final String addressID) {
        super(servicePath);
        this.key.put("BusinessPartner", businessPartner);
        this.key.put("ValidityEndDate", validityEndDate);
        this.key.put("AddressUsage", addressUsage);
        this.key.put("AddressID", addressID);
    }

    @Override
    @Nonnull
    protected Class<BuPaAddressUsage> getEntityClass() {
        return BuPaAddressUsage.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
