/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSalesAreaSelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CustomerSalesAreaByKeyFluentHelper
    extends FluentHelperByKey<CustomerSalesAreaByKeyFluentHelper, CustomerSalesArea, CustomerSalesAreaSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code CustomerSalesArea}
     * @param distributionChannel
     *     Distribution Channel<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public CustomerSalesAreaByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String customer, final String salesOrganization, final String distributionChannel, final String division) {
        super(servicePath);
        this.key.put("Customer", customer);
        this.key.put("SalesOrganization", salesOrganization);
        this.key.put("DistributionChannel", distributionChannel);
        this.key.put("Division", division);
    }

    @Override
    @Nonnull
    protected Class<CustomerSalesArea> getEntityClass() {
        return CustomerSalesArea.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
