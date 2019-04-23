/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierCompanySelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SupplierCompanyByKeyFluentHelper
    extends FluentHelperByKey<SupplierCompanyByKeyFluentHelper, SupplierCompany, SupplierCompanySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code SupplierCompany}
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public SupplierCompanyByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String supplier, final String companyCode) {
        super(servicePath);
        this.key.put("Supplier", supplier);
        this.key.put("CompanyCode", companyCode);
    }

    @Override
    @Nonnull
    protected Class<SupplierCompany> getEntityClass() {
        return SupplierCompany.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
