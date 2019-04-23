/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerField BusinessPartnerField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerLink BusinessPartnerLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#CUSTOMER CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#SUPPLIER SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ACADEMIC_TITLE ACADEMIC_TITLE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_CATEGORY BUSINESS_PARTNER_CATEGORY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_FULL_NAME BUSINESS_PARTNER_FULL_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_GROUPING BUSINESS_PARTNER_GROUPING}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_NAME BUSINESS_PARTNER_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_UUID BUSINESS_PARTNER_UUID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#CORRESPONDENCE_LANGUAGE CORRESPONDENCE_LANGUAGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#CREATION_DATE CREATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#CREATION_TIME CREATION_TIME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#FIRST_NAME FIRST_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#FORM_OF_ADDRESS FORM_OF_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#INDUSTRY INDUSTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#INTERNATIONAL_LOCATION_NUMBER1 INTERNATIONAL_LOCATION_NUMBER1}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#INTERNATIONAL_LOCATION_NUMBER2 INTERNATIONAL_LOCATION_NUMBER2}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#IS_FEMALE IS_FEMALE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#IS_MALE IS_MALE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#IS_NATURAL_PERSON IS_NATURAL_PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#IS_SEX_UNKNOWN IS_SEX_UNKNOWN}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LANGUAGE LANGUAGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LAST_CHANGE_DATE LAST_CHANGE_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LAST_CHANGE_TIME LAST_CHANGE_TIME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LAST_CHANGED_BY_USER LAST_CHANGED_BY_USER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LAST_NAME LAST_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#LEGAL_FORM LEGAL_FORM}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_BP_NAME1 ORGANIZATION_BP_NAME1}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_BP_NAME2 ORGANIZATION_BP_NAME2}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_BP_NAME3 ORGANIZATION_BP_NAME3}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_BP_NAME4 ORGANIZATION_BP_NAME4}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_FOUNDATION_DATE ORGANIZATION_FOUNDATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ORGANIZATION_LIQUIDATION_DATE ORGANIZATION_LIQUIDATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#SEARCH_TERM1 SEARCH_TERM1}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#ADDITIONAL_LAST_NAME ADDITIONAL_LAST_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BIRTH_DATE BIRTH_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_IS_BLOCKED BUSINESS_PARTNER_IS_BLOCKED}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_TYPE BUSINESS_PARTNER_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#E_TAG E_TAG}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#GROUP_BUSINESS_PARTNER_NAME1 GROUP_BUSINESS_PARTNER_NAME1}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#GROUP_BUSINESS_PARTNER_NAME2 GROUP_BUSINESS_PARTNER_NAME2}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#INDEPENDENT_ADDRESS_ID INDEPENDENT_ADDRESS_ID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#INTERNATIONAL_LOCATION_NUMBER3 INTERNATIONAL_LOCATION_NUMBER3}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#MIDDLE_NAME MIDDLE_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#NAME_COUNTRY NAME_COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#NAME_FORMAT NAME_FORMAT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#PERSON_FULL_NAME PERSON_FULL_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#PERSON_NUMBER PERSON_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#IS_MARKED_FOR_ARCHIVING IS_MARKED_FOR_ARCHIVING}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#BUSINESS_PARTNER_ID_BY_EXT_SYSTEM BUSINESS_PARTNER_ID_BY_EXT_SYSTEM}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BU_PA_IDENTIFICATION TO_BU_PA_IDENTIFICATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BU_PA_INDUSTRY TO_BU_PA_INDUSTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BUSINESS_PARTNER_ADDRESS TO_BUSINESS_PARTNER_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BUSINESS_PARTNER_BANK TO_BUSINESS_PARTNER_BANK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BUSINESS_PARTNER_CONTACT TO_BUSINESS_PARTNER_CONTACT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BUSINESS_PARTNER_ROLE TO_BUSINESS_PARTNER_ROLE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_BUSINESS_PARTNER_TAX TO_BUSINESS_PARTNER_TAX}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_CUSTOMER TO_CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner#TO_SUPPLIER TO_SUPPLIER}</li>
 * </ul>
 * 
 */
public interface BusinessPartnerSelectable
    extends EntitySelectable<BusinessPartner>
{


}
