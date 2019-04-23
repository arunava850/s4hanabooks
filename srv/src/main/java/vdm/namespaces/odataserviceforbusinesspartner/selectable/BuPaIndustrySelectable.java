/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BuPaIndustryField BuPaIndustryField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BuPaIndustryLink BuPaIndustryLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry#INDUSTRY_SECTOR INDUSTRY_SECTOR}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry#INDUSTRY_SYSTEM_TYPE INDUSTRY_SYSTEM_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry#IS_STANDARD_INDUSTRY IS_STANDARD_INDUSTRY}</li>
 * </ul>
 * 
 */
public interface BuPaIndustrySelectable
    extends EntitySelectable<BuPaIndustry>
{


}
