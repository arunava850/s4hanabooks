/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressHomePageURLSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class AddressHomePageURLByKeyFluentHelper
    extends FluentHelperByKey<AddressHomePageURLByKeyFluentHelper, AddressHomePageURL, AddressHomePageURLSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param validityStartDate
     *     Valid-from date - in current Release only 00010101 possible<p>Constraints: Not nullable, Precision: 0</p>
     * @param isDefaultURLAddress
     *     Flag: this address is the default address<p>Constraints: Not nullable</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code AddressHomePageURL}
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public AddressHomePageURLByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String addressID, final String person, final String ordinalNumber, final LocalDateTime validityStartDate, final Boolean isDefaultURLAddress) {
        super(servicePath);
        this.key.put("AddressID", addressID);
        this.key.put("Person", person);
        this.key.put("OrdinalNumber", ordinalNumber);
        this.key.put("ValidityStartDate", validityStartDate);
        this.key.put("IsDefaultURLAddress", isDefaultURLAddress);
    }

    @Override
    @Nonnull
    protected Class<AddressHomePageURL> getEntityClass() {
        return AddressHomePageURL.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
