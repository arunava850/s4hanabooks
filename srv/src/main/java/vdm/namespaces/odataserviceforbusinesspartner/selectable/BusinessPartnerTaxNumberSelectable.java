/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerTaxNumberField BusinessPartnerTaxNumberField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerTaxNumberLink BusinessPartnerTaxNumberLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber#BP_TAX_TYPE BP_TAX_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber#BP_TAX_NUMBER BP_TAX_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber#BP_TAX_LONG_NUMBER BP_TAX_LONG_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * </ul>
 * 
 */
public interface BusinessPartnerTaxNumberSelectable
    extends EntitySelectable<BusinessPartnerTaxNumber>
{


}
