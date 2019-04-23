/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierPurchasingOrgSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SupplierPurchasingOrgByKeyFluentHelper
    extends FluentHelperByKey<SupplierPurchasingOrgByKeyFluentHelper, SupplierPurchasingOrg, SupplierPurchasingOrgSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     Service path to be used to fetch a single {@code SupplierPurchasingOrg}
     * @param supplier
     *     Vendor Account Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param purchasingOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     */
    public SupplierPurchasingOrgByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String supplier, final String purchasingOrganization) {
        super(servicePath);
        this.key.put("Supplier", supplier);
        this.key.put("PurchasingOrganization", purchasingOrganization);
    }

    @Override
    @Nonnull
    protected Class<SupplierPurchasingOrg> getEntityClass() {
        return SupplierPurchasingOrg.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
