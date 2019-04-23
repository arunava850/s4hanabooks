/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.SupplierCompanyField SupplierCompanyField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.SupplierCompanyLink SupplierCompanyLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#COMPANY_CODE COMPANY_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#COMPANY_CODE_NAME COMPANY_CODE_NAME}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#PAYMENT_BLOCKING_REASON PAYMENT_BLOCKING_REASON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_IS_BLOCKED_FOR_POSTING SUPPLIER_IS_BLOCKED_FOR_POSTING}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#ACCOUNTING_CLERK ACCOUNTING_CLERK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#ACCOUNTING_CLERK_FAX_NUMBER ACCOUNTING_CLERK_FAX_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#ACCOUNTING_CLERK_PHONE_NUMBER ACCOUNTING_CLERK_PHONE_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_CLERK SUPPLIER_CLERK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_CLERK_URL SUPPLIER_CLERK_URL}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#PAYMENT_METHODS_LIST PAYMENT_METHODS_LIST}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#PAYMENT_TERMS PAYMENT_TERMS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#CLEAR_CUSTOMER_SUPPLIER CLEAR_CUSTOMER_SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#IS_TO_BE_LOCALLY_PROCESSED IS_TO_BE_LOCALLY_PROCESSED}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#ITEM_IS_TO_BE_PAID_SEPARATELY ITEM_IS_TO_BE_PAID_SEPARATELY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#PAYMENT_IS_TO_BE_SENT_BY_EDI PAYMENT_IS_TO_BE_SENT_BY_EDI}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#HOUSE_BANK HOUSE_BANK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#CHECK_PAID_DURATION_IN_DAYS CHECK_PAID_DURATION_IN_DAYS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_CLERK_ID_BY_SUPPLIER SUPPLIER_CLERK_ID_BY_SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#RECONCILIATION_ACCOUNT RECONCILIATION_ACCOUNT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#INTEREST_CALCULATION_CODE INTEREST_CALCULATION_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#INTEREST_CALCULATION_DATE INTEREST_CALCULATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#INTRST_CALC_FREQUENCY_IN_MONTHS INTRST_CALC_FREQUENCY_IN_MONTHS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_HEAD_OFFICE SUPPLIER_HEAD_OFFICE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#ALTERNATIVE_PAYEE ALTERNATIVE_PAYEE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#LAYOUT_SORTING_RULE LAYOUT_SORTING_RULE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#APAR_TOLERANCE_GROUP APAR_TOLERANCE_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_CERTIFICATION_DATE SUPPLIER_CERTIFICATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_ACCOUNT_NOTE SUPPLIER_ACCOUNT_NOTE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#WITHHOLDING_TAX_COUNTRY WITHHOLDING_TAX_COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#DELETION_INDICATOR DELETION_INDICATOR}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#CASH_PLANNING_GROUP CASH_PLANNING_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#IS_TO_BE_CHECKED_FOR_DUPLICATES IS_TO_BE_CHECKED_FOR_DUPLICATES}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#SUPPLIER_ACCOUNT_GROUP SUPPLIER_ACCOUNT_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#TO_SUPPLIER_DUNNING TO_SUPPLIER_DUNNING}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany#TO_SUPPLIER_WITH_HOLDING_TAX TO_SUPPLIER_WITH_HOLDING_TAX}</li>
 * </ul>
 * 
 */
public interface SupplierCompanySelectable
    extends EntitySelectable<SupplierCompany>
{


}
