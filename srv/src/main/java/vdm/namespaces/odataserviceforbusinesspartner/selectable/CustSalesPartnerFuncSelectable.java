/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.CustSalesPartnerFuncField CustSalesPartnerFuncField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.CustSalesPartnerFuncLink CustSalesPartnerFuncLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#CUSTOMER CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#SALES_ORGANIZATION SALES_ORGANIZATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#DISTRIBUTION_CHANNEL DISTRIBUTION_CHANNEL}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#DIVISION DIVISION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#PARTNER_COUNTER PARTNER_COUNTER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#PARTNER_FUNCTION PARTNER_FUNCTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#BP_CUSTOMER_NUMBER BP_CUSTOMER_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#CUSTOMER_PARTNER_DESCRIPTION CUSTOMER_PARTNER_DESCRIPTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#DEFAULT_PARTNER DEFAULT_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * </ul>
 * 
 */
public interface CustSalesPartnerFuncSelectable
    extends EntitySelectable<CustSalesPartnerFunc>
{


}
