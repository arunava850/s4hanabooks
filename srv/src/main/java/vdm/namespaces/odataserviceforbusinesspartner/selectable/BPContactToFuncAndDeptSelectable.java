/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BPContactToFuncAndDeptField BPContactToFuncAndDeptField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BPContactToFuncAndDeptLink BPContactToFuncAndDeptLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#RELATIONSHIP_NUMBER RELATIONSHIP_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#BUSINESS_PARTNER_COMPANY BUSINESS_PARTNER_COMPANY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#BUSINESS_PARTNER_PERSON BUSINESS_PARTNER_PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#VALIDITY_END_DATE VALIDITY_END_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#CONTACT_PERSON_FUNCTION CONTACT_PERSON_FUNCTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#CONTACT_PERSON_DEPARTMENT CONTACT_PERSON_DEPARTMENT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#PHONE_NUMBER PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#PHONE_NUMBER_EXTENSION PHONE_NUMBER_EXTENSION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#FAX_NUMBER FAX_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#FAX_NUMBER_EXTENSION FAX_NUMBER_EXTENSION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#EMAIL_ADDRESS EMAIL_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept#RELATIONSHIP_CATEGORY RELATIONSHIP_CATEGORY}</li>
 * </ul>
 * 
 */
public interface BPContactToFuncAndDeptSelectable
    extends EntitySelectable<BPContactToFuncAndDept>
{


}
