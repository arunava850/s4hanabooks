/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerRoleField BusinessPartnerRoleField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerRoleLink BusinessPartnerRoleLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole#BUSINESS_PARTNER_ROLE BUSINESS_PARTNER_ROLE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole#VALID_FROM VALID_FROM}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole#VALID_TO VALID_TO}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * </ul>
 * 
 */
public interface BusinessPartnerRoleSelectable
    extends EntitySelectable<BusinessPartnerRole>
{


}
