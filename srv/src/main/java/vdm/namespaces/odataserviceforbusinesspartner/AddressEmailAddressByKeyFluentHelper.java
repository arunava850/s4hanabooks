/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressEmailAddressSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class AddressEmailAddressByKeyFluentHelper
    extends FluentHelperByKey<AddressEmailAddressByKeyFluentHelper, AddressEmailAddress, AddressEmailAddressSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code AddressEmailAddress}
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public AddressEmailAddressByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String addressID, final String person, final String ordinalNumber) {
        super(servicePath);
        this.key.put("AddressID", addressID);
        this.key.put("Person", person);
        this.key.put("OrdinalNumber", ordinalNumber);
    }

    @Override
    @Nonnull
    protected Class<AddressEmailAddress> getEntityClass() {
        return AddressEmailAddress.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
