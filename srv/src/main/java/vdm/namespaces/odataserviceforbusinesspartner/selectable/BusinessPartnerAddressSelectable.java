/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerAddressField BusinessPartnerAddressField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerAddressLink BusinessPartnerAddressLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDRESS_ID ADDRESS_ID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#VALIDITY_START_DATE VALIDITY_START_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#VALIDITY_END_DATE VALIDITY_END_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDRESS_UUID ADDRESS_UUID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDITIONAL_STREET_PREFIX_NAME ADDITIONAL_STREET_PREFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDITIONAL_STREET_SUFFIX_NAME ADDITIONAL_STREET_SUFFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDRESS_TIME_ZONE ADDRESS_TIME_ZONE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#CARE_OF_NAME CARE_OF_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#CITY_CODE CITY_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#CITY_NAME CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#COMPANY_POSTAL_CODE COMPANY_POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#COUNTRY COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#COUNTY COUNTY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#DELIVERY_SERVICE_NUMBER DELIVERY_SERVICE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#DELIVERY_SERVICE_TYPE_CODE DELIVERY_SERVICE_TYPE_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#DISTRICT DISTRICT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#FORM_OF_ADDRESS FORM_OF_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#FULL_NAME FULL_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#HOME_CITY_NAME HOME_CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#HOUSE_NUMBER HOUSE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#HOUSE_NUMBER_SUPPLEMENT_TEXT HOUSE_NUMBER_SUPPLEMENT_TEXT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#LANGUAGE LANGUAGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX PO_BOX}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_DEVIATING_CITY_NAME PO_BOX_DEVIATING_CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_DEVIATING_COUNTRY PO_BOX_DEVIATING_COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_DEVIATING_REGION PO_BOX_DEVIATING_REGION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_IS_WITHOUT_NUMBER PO_BOX_IS_WITHOUT_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_LOBBY_NAME PO_BOX_LOBBY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PO_BOX_POSTAL_CODE PO_BOX_POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PERSON PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#POSTAL_CODE POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#PRFRD_COMM_MEDIUM_TYPE PRFRD_COMM_MEDIUM_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#REGION REGION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#STREET_NAME STREET_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#STREET_PREFIX_NAME STREET_PREFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#STREET_SUFFIX_NAME STREET_SUFFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TAX_JURISDICTION TAX_JURISDICTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TRANSPORT_ZONE TRANSPORT_ZONE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#ADDRESS_ID_BY_EXTERNAL_SYSTEM ADDRESS_ID_BY_EXTERNAL_SYSTEM}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_ADDRESS_USAGE TO_ADDRESS_USAGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_EMAIL_ADDRESS TO_EMAIL_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_FAX_NUMBER TO_FAX_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_MOBILE_PHONE_NUMBER TO_MOBILE_PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_PHONE_NUMBER TO_PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress#TO_URL_ADDRESS TO_URL_ADDRESS}</li>
 * </ul>
 * 
 */
public interface BusinessPartnerAddressSelectable
    extends EntitySelectable<BusinessPartnerAddress>
{


}
