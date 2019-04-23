/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BPContactToAddressField BPContactToAddressField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BPContactToAddressLink BPContactToAddressLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#RELATIONSHIP_NUMBER RELATIONSHIP_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#BUSINESS_PARTNER_COMPANY BUSINESS_PARTNER_COMPANY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#BUSINESS_PARTNER_PERSON BUSINESS_PARTNER_PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#VALIDITY_END_DATE VALIDITY_END_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#ADDRESS_ID ADDRESS_ID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#ADDRESS_NUMBER ADDRESS_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#ADDITIONAL_STREET_PREFIX_NAME ADDITIONAL_STREET_PREFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#ADDITIONAL_STREET_SUFFIX_NAME ADDITIONAL_STREET_SUFFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#ADDRESS_TIME_ZONE ADDRESS_TIME_ZONE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#CARE_OF_NAME CARE_OF_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#CITY_CODE CITY_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#CITY_NAME CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#COMPANY_POSTAL_CODE COMPANY_POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#COUNTRY COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#COUNTY COUNTY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#DELIVERY_SERVICE_NUMBER DELIVERY_SERVICE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#DELIVERY_SERVICE_TYPE_CODE DELIVERY_SERVICE_TYPE_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#DISTRICT DISTRICT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#FORM_OF_ADDRESS FORM_OF_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#FULL_NAME FULL_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#HOME_CITY_NAME HOME_CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#HOUSE_NUMBER HOUSE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#HOUSE_NUMBER_SUPPLEMENT_TEXT HOUSE_NUMBER_SUPPLEMENT_TEXT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#LANGUAGE LANGUAGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX PO_BOX}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_DEVIATING_CITY_NAME PO_BOX_DEVIATING_CITY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_DEVIATING_COUNTRY PO_BOX_DEVIATING_COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_DEVIATING_REGION PO_BOX_DEVIATING_REGION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_IS_WITHOUT_NUMBER PO_BOX_IS_WITHOUT_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_LOBBY_NAME PO_BOX_LOBBY_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PO_BOX_POSTAL_CODE PO_BOX_POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PERSON PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#POSTAL_CODE POSTAL_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#PRFRD_COMM_MEDIUM_TYPE PRFRD_COMM_MEDIUM_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#REGION REGION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#STREET_NAME STREET_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#STREET_PREFIX_NAME STREET_PREFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#STREET_SUFFIX_NAME STREET_SUFFIX_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TAX_JURISDICTION TAX_JURISDICTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TRANSPORT_ZONE TRANSPORT_ZONE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TO_EMAIL_ADDRESS TO_EMAIL_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TO_FAX_NUMBER TO_FAX_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TO_MOBILE_PHONE_NUMBER TO_MOBILE_PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TO_PHONE_NUMBER TO_PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress#TO_URL_ADDRESS TO_URL_ADDRESS}</li>
 * </ul>
 * 
 */
public interface BPContactToAddressSelectable
    extends EntitySelectable<BPContactToAddress>
{


}
