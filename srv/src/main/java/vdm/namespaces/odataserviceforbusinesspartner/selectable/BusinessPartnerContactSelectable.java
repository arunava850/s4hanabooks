/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerContactField BusinessPartnerContactField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerContactLink BusinessPartnerContactLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#RELATIONSHIP_NUMBER RELATIONSHIP_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#BUSINESS_PARTNER_COMPANY BUSINESS_PARTNER_COMPANY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#BUSINESS_PARTNER_PERSON BUSINESS_PARTNER_PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#VALIDITY_END_DATE VALIDITY_END_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#VALIDITY_START_DATE VALIDITY_START_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#IS_STANDARD_RELATIONSHIP IS_STANDARD_RELATIONSHIP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#RELATIONSHIP_CATEGORY RELATIONSHIP_CATEGORY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#TO_CONTACT_ADDRESS TO_CONTACT_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact#TO_CONTACT_RELATIONSHIP TO_CONTACT_RELATIONSHIP}</li>
 * </ul>
 * 
 */
public interface BusinessPartnerContactSelectable
    extends EntitySelectable<BusinessPartnerContact>
{


}
