/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BPContactToAddressSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BPContactToAddressByKeyFluentHelper
    extends FluentHelperByKey<BPContactToAddressByKeyFluentHelper, BPContactToAddress, BPContactToAddressSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param businessPartnerPerson
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BPContactToAddress}
     * @param businessPartnerCompany
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param validityEndDate
     *     Validity Date (Valid To)<p>Constraints: Not nullable, Precision: 0</p>
     * @param relationshipNumber
     *     BP Relationship Number<p>Constraints: Not nullable, Maximum length: 12</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public BPContactToAddressByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate, final String addressID) {
        super(servicePath);
        this.key.put("RelationshipNumber", relationshipNumber);
        this.key.put("BusinessPartnerCompany", businessPartnerCompany);
        this.key.put("BusinessPartnerPerson", businessPartnerPerson);
        this.key.put("ValidityEndDate", validityEndDate);
        this.key.put("AddressID", addressID);
    }

    @Override
    @Nonnull
    protected Class<BPContactToAddress> getEntityClass() {
        return BPContactToAddress.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
