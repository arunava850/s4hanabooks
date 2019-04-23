/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SupplierByKeyFluentHelper
    extends FluentHelperByKey<SupplierByKeyFluentHelper, Supplier, SupplierSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code Supplier}
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SupplierByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String supplier) {
        super(servicePath);
        this.key.put("Supplier", supplier);
    }

    @Override
    @Nonnull
    protected Class<Supplier> getEntityClass() {
        return Supplier.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
