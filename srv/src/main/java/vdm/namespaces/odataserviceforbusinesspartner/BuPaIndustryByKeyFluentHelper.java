/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperByKey;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BuPaIndustrySelectable;


/**
 * Fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BuPaIndustryByKeyFluentHelper
    extends FluentHelperByKey<BuPaIndustryByKeyFluentHelper, BuPaIndustry, BuPaIndustrySelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param industrySector
     *     Industry<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BuPaIndustry}
     * @param industrySystemType
     *     Industry System<p>Constraints: Not nullable, Maximum length: 4</p>
     */
    public BuPaIndustryByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String industrySector, final String industrySystemType, final String businessPartner) {
        super(servicePath);
        this.key.put("IndustrySector", industrySector);
        this.key.put("IndustrySystemType", industrySystemType);
        this.key.put("BusinessPartner", businessPartner);
    }

    @Override
    @Nonnull
    protected Class<BuPaIndustry> getEntityClass() {
        return BuPaIndustry.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
