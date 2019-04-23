/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.CustomerSalesAreaField CustomerSalesAreaField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.CustomerSalesAreaLink CustomerSalesAreaLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SALES_ORGANIZATION SALES_ORGANIZATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#DISTRIBUTION_CHANNEL DISTRIBUTION_CHANNEL}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#DIVISION DIVISION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#ACCOUNT_BY_CUSTOMER ACCOUNT_BY_CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#BILLING_IS_BLOCKED_FOR_CUSTOMER BILLING_IS_BLOCKED_FOR_CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#COMPLETE_DELIVERY_IS_DEFINED COMPLETE_DELIVERY_IS_DEFINED}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CURRENCY CURRENCY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_ABC_CLASSIFICATION CUSTOMER_ABC_CLASSIFICATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_GROUP CUSTOMER_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_PAYMENT_TERMS CUSTOMER_PAYMENT_TERMS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_PRICE_GROUP CUSTOMER_PRICE_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_PRICING_PROCEDURE CUSTOMER_PRICING_PROCEDURE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#DELIVERY_IS_BLOCKED_FOR_CUSTOMER DELIVERY_IS_BLOCKED_FOR_CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#DELIVERY_PRIORITY DELIVERY_PRIORITY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INCOTERMS_CLASSIFICATION INCOTERMS_CLASSIFICATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INCOTERMS_LOCATION2 INCOTERMS_LOCATION2}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INCOTERMS_VERSION INCOTERMS_VERSION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INCOTERMS_LOCATION1 INCOTERMS_LOCATION1}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#DELETION_INDICATOR DELETION_INDICATOR}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INCOTERMS_TRANSFER_LOCATION INCOTERMS_TRANSFER_LOCATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#INVOICE_DATE INVOICE_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#ITEM_ORDER_PROBABILITY_IN_PERCENT ITEM_ORDER_PROBABILITY_IN_PERCENT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#ORDER_COMBINATION_IS_ALLOWED ORDER_COMBINATION_IS_ALLOWED}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#ORDER_IS_BLOCKED_FOR_CUSTOMER ORDER_IS_BLOCKED_FOR_CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#PARTIAL_DELIVERY_IS_ALLOWED PARTIAL_DELIVERY_IS_ALLOWED}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#PRICE_LIST_TYPE PRICE_LIST_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SALES_GROUP SALES_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SALES_OFFICE SALES_OFFICE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SHIPPING_CONDITION SHIPPING_CONDITION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SUPPLYING_PLANT SUPPLYING_PLANT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#SALES_DISTRICT SALES_DISTRICT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#CUSTOMER_ACCOUNT_GROUP CUSTOMER_ACCOUNT_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#TO_PARTNER_FUNCTION TO_PARTNER_FUNCTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea#TO_SALES_AREA_TAX TO_SALES_AREA_TAX}</li>
 * </ul>
 * 
 */
public interface CustomerSalesAreaSelectable
    extends EntitySelectable<CustomerSalesArea>
{


}
