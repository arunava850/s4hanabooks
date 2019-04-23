/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierPartnerFuncSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class SupplierPartnerFuncByKeyFluentHelper
    extends FluentHelperByKey<SupplierPartnerFuncByKeyFluentHelper, SupplierPartnerFunc, SupplierPartnerFuncSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code SupplierPartnerFunc}
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param plant
     *     Plant<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param purchasingOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param partnerCounter
     *     Partner counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param supplierSubrange
     *     Supplier Subrange<p>Constraints: Not nullable, Maximum length: 6</p>
     */
    public SupplierPartnerFuncByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String supplier, final String purchasingOrganization, final String supplierSubrange, final String plant, final String partnerFunction, final String partnerCounter) {
        super(servicePath);
        this.key.put("Supplier", supplier);
        this.key.put("PurchasingOrganization", purchasingOrganization);
        this.key.put("SupplierSubrange", supplierSubrange);
        this.key.put("Plant", plant);
        this.key.put("PartnerFunction", partnerFunction);
        this.key.put("PartnerCounter", partnerCounter);
    }

    @Override
    @Nonnull
    protected Class<SupplierPartnerFunc> getEntityClass() {
        return SupplierPartnerFunc.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
