/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerCompanyField;
import vdm.namespaces.odataserviceforbusinesspartner.link.CustomerCompanyLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerCompanySelectable;


/**
 * Customer Company<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerCompanyType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerCompany
    extends VdmEntity<CustomerCompany>
{

    /**
     * Selector for all available fields of CustomerCompany.
     * 
     */
    public final static CustomerCompanySelectable ALL_FIELDS = new CustomerCompanySelectable() {


        @Nonnull
        @Override
        public String getFieldName() {
            return "*";
        }

        @Nonnull
        @Override
        public List<String> getSelections() {
            return Collections.singletonList("*");
        }

    }
    ;
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     
     * @return
     *     Customer Number
     */
    @Key
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> CUSTOMER = new CustomerCompanyField<String>("Customer");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     
     * @return
     *     Company Code
     */
    @Key
    @SerializedName("CompanyCode")
    @JsonProperty("CompanyCode")
    @Nullable
    @ODataField(odataName = "CompanyCode")
    private String companyCode;
    /**
     * Use with available fluent helpers to apply the <b>CompanyCode</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> COMPANY_CODE = new CustomerCompanyField<String>("CompanyCode");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>APARToleranceGroup</b></p>
     * 
     * @param aPARToleranceGroup
     *     
     * @return
     *     Tolerance group for the business partner/G/L account
     */
    @SerializedName("APARToleranceGroup")
    @JsonProperty("APARToleranceGroup")
    @Nullable
    @ODataField(odataName = "APARToleranceGroup")
    private String aPARToleranceGroup;
    /**
     * Use with available fluent helpers to apply the <b>APARToleranceGroup</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> APAR_TOLERANCE_GROUP = new CustomerCompanyField<String>("APARToleranceGroup");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>AccountByCustomer</b></p>
     * 
     * @param accountByCustomer
     *     
     * @return
     *     Our account number at customer
     */
    @SerializedName("AccountByCustomer")
    @JsonProperty("AccountByCustomer")
    @Nullable
    @ODataField(odataName = "AccountByCustomer")
    private String accountByCustomer;
    /**
     * Use with available fluent helpers to apply the <b>AccountByCustomer</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ACCOUNT_BY_CUSTOMER = new CustomerCompanyField<String>("AccountByCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>AccountingClerk</b></p>
     * 
     * @param accountingClerk
     *     
     * @return
     *     Accounting Clerk Abbreviation
     */
    @SerializedName("AccountingClerk")
    @JsonProperty("AccountingClerk")
    @Nullable
    @ODataField(odataName = "AccountingClerk")
    private String accountingClerk;
    /**
     * Use with available fluent helpers to apply the <b>AccountingClerk</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ACCOUNTING_CLERK = new CustomerCompanyField<String>("AccountingClerk");
    /**
     * Constraints: Not nullable, Maximum length: 31 <p>Original property name from the Odata EDM: <b>AccountingClerkFaxNumber</b></p>
     * 
     * @param accountingClerkFaxNumber
     *     
     * @return
     *     Accounting clerk's fax number at the customer/vendor
     */
    @SerializedName("AccountingClerkFaxNumber")
    @JsonProperty("AccountingClerkFaxNumber")
    @Nullable
    @ODataField(odataName = "AccountingClerkFaxNumber")
    private String accountingClerkFaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>AccountingClerkFaxNumber</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ACCOUNTING_CLERK_FAX_NUMBER = new CustomerCompanyField<String>("AccountingClerkFaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 130 <p>Original property name from the Odata EDM: <b>AccountingClerkInternetAddress</b></p>
     * 
     * @param accountingClerkInternetAddress
     *     
     * @return
     *     Internet address of partner company clerk
     */
    @SerializedName("AccountingClerkInternetAddress")
    @JsonProperty("AccountingClerkInternetAddress")
    @Nullable
    @ODataField(odataName = "AccountingClerkInternetAddress")
    private String accountingClerkInternetAddress;
    /**
     * Use with available fluent helpers to apply the <b>AccountingClerkInternetAddress</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ACCOUNTING_CLERK_INTERNET_ADDRESS = new CustomerCompanyField<String>("AccountingClerkInternetAddress");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>AccountingClerkPhoneNumber</b></p>
     * 
     * @param accountingClerkPhoneNumber
     *     
     * @return
     *     Accounting clerk's telephone number at business partner
     */
    @SerializedName("AccountingClerkPhoneNumber")
    @JsonProperty("AccountingClerkPhoneNumber")
    @Nullable
    @ODataField(odataName = "AccountingClerkPhoneNumber")
    private String accountingClerkPhoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>AccountingClerkPhoneNumber</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ACCOUNTING_CLERK_PHONE_NUMBER = new CustomerCompanyField<String>("AccountingClerkPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayerAccount</b></p>
     * 
     * @param alternativePayerAccount
     *     
     * @return
     *     Account number of an alternative payer
     */
    @SerializedName("AlternativePayerAccount")
    @JsonProperty("AlternativePayerAccount")
    @Nullable
    @ODataField(odataName = "AlternativePayerAccount")
    private String alternativePayerAccount;
    /**
     * Use with available fluent helpers to apply the <b>AlternativePayerAccount</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> ALTERNATIVE_PAYER_ACCOUNT = new CustomerCompanyField<String>("AlternativePayerAccount");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @param authorizationGroup
     *     
     * @return
     *     Authorization Group
     */
    @SerializedName("AuthorizationGroup")
    @JsonProperty("AuthorizationGroup")
    @Nullable
    @ODataField(odataName = "AuthorizationGroup")
    private String authorizationGroup;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationGroup</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> AUTHORIZATION_GROUP = new CustomerCompanyField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CollectiveInvoiceVariant</b></p>
     * 
     * @param collectiveInvoiceVariant
     *     
     * @return
     *     Collective invoice variant
     */
    @SerializedName("CollectiveInvoiceVariant")
    @JsonProperty("CollectiveInvoiceVariant")
    @Nullable
    @ODataField(odataName = "CollectiveInvoiceVariant")
    private String collectiveInvoiceVariant;
    /**
     * Use with available fluent helpers to apply the <b>CollectiveInvoiceVariant</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> COLLECTIVE_INVOICE_VARIANT = new CustomerCompanyField<String>("CollectiveInvoiceVariant");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CustomerAccountNote</b></p>
     * 
     * @param customerAccountNote
     *     
     * @return
     *     Memo
     */
    @SerializedName("CustomerAccountNote")
    @JsonProperty("CustomerAccountNote")
    @Nullable
    @ODataField(odataName = "CustomerAccountNote")
    private String customerAccountNote;
    /**
     * Use with available fluent helpers to apply the <b>CustomerAccountNote</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> CUSTOMER_ACCOUNT_NOTE = new CustomerCompanyField<String>("CustomerAccountNote");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CustomerHeadOffice</b></p>
     * 
     * @param customerHeadOffice
     *     
     * @return
     *     Head office account number (in branch accounts)
     */
    @SerializedName("CustomerHeadOffice")
    @JsonProperty("CustomerHeadOffice")
    @Nullable
    @ODataField(odataName = "CustomerHeadOffice")
    private String customerHeadOffice;
    /**
     * Use with available fluent helpers to apply the <b>CustomerHeadOffice</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> CUSTOMER_HEAD_OFFICE = new CustomerCompanyField<String>("CustomerHeadOffice");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CustomerSupplierClearingIsUsed</b></p>
     * 
     * @param customerSupplierClearingIsUsed
     *     
     * @return
     *     Indicator: Clearing between customer and vendor ?
     */
    @SerializedName("CustomerSupplierClearingIsUsed")
    @JsonProperty("CustomerSupplierClearingIsUsed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "CustomerSupplierClearingIsUsed")
    private Boolean customerSupplierClearingIsUsed;
    /**
     * Use with available fluent helpers to apply the <b>CustomerSupplierClearingIsUsed</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> CUSTOMER_SUPPLIER_CLEARING_IS_USED = new CustomerCompanyField<Boolean>("CustomerSupplierClearingIsUsed");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>HouseBank</b></p>
     * 
     * @param houseBank
     *     
     * @return
     *     Short Key for a House Bank
     */
    @SerializedName("HouseBank")
    @JsonProperty("HouseBank")
    @Nullable
    @ODataField(odataName = "HouseBank")
    private String houseBank;
    /**
     * Use with available fluent helpers to apply the <b>HouseBank</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> HOUSE_BANK = new CustomerCompanyField<String>("HouseBank");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InterestCalculationCode</b></p>
     * 
     * @param interestCalculationCode
     *     
     * @return
     *     Interest calculation indicator
     */
    @SerializedName("InterestCalculationCode")
    @JsonProperty("InterestCalculationCode")
    @Nullable
    @ODataField(odataName = "InterestCalculationCode")
    private String interestCalculationCode;
    /**
     * Use with available fluent helpers to apply the <b>InterestCalculationCode</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> INTEREST_CALCULATION_CODE = new CustomerCompanyField<String>("InterestCalculationCode");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>InterestCalculationDate</b></p>
     * 
     * @param interestCalculationDate
     *     
     * @return
     *     Key date of the last interest calculation
     */
    @SerializedName("InterestCalculationDate")
    @JsonProperty("InterestCalculationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "InterestCalculationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime interestCalculationDate;
    /**
     * Use with available fluent helpers to apply the <b>InterestCalculationDate</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<LocalDateTime> INTEREST_CALCULATION_DATE = new CustomerCompanyField<LocalDateTime>("InterestCalculationDate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>IntrstCalcFrequencyInMonths</b></p>
     * 
     * @param intrstCalcFrequencyInMonths
     *     
     * @return
     *     Interest Calculation Frequency in Months
     */
    @SerializedName("IntrstCalcFrequencyInMonths")
    @JsonProperty("IntrstCalcFrequencyInMonths")
    @Nullable
    @ODataField(odataName = "IntrstCalcFrequencyInMonths")
    private String intrstCalcFrequencyInMonths;
    /**
     * Use with available fluent helpers to apply the <b>IntrstCalcFrequencyInMonths</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> INTRST_CALC_FREQUENCY_IN_MONTHS = new CustomerCompanyField<String>("IntrstCalcFrequencyInMonths");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsToBeLocallyProcessed</b></p>
     * 
     * @param isToBeLocallyProcessed
     *     
     * @return
     *     Indicator: Local processing?
     */
    @SerializedName("IsToBeLocallyProcessed")
    @JsonProperty("IsToBeLocallyProcessed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsToBeLocallyProcessed")
    private Boolean isToBeLocallyProcessed;
    /**
     * Use with available fluent helpers to apply the <b>IsToBeLocallyProcessed</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> IS_TO_BE_LOCALLY_PROCESSED = new CustomerCompanyField<Boolean>("IsToBeLocallyProcessed");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ItemIsToBePaidSeparately</b></p>
     * 
     * @param itemIsToBePaidSeparately
     *     
     * @return
     *     Indicator: Pay all items separately ?
     */
    @SerializedName("ItemIsToBePaidSeparately")
    @JsonProperty("ItemIsToBePaidSeparately")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "ItemIsToBePaidSeparately")
    private Boolean itemIsToBePaidSeparately;
    /**
     * Use with available fluent helpers to apply the <b>ItemIsToBePaidSeparately</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> ITEM_IS_TO_BE_PAID_SEPARATELY = new CustomerCompanyField<Boolean>("ItemIsToBePaidSeparately");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>LayoutSortingRule</b></p>
     * 
     * @param layoutSortingRule
     *     
     * @return
     *     Key for Sorting According to Assignment Numbers
     */
    @SerializedName("LayoutSortingRule")
    @JsonProperty("LayoutSortingRule")
    @Nullable
    @ODataField(odataName = "LayoutSortingRule")
    private String layoutSortingRule;
    /**
     * Use with available fluent helpers to apply the <b>LayoutSortingRule</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> LAYOUT_SORTING_RULE = new CustomerCompanyField<String>("LayoutSortingRule");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PaymentBlockingReason</b></p>
     * 
     * @param paymentBlockingReason
     *     
     * @return
     *     Block Key for Payment
     */
    @SerializedName("PaymentBlockingReason")
    @JsonProperty("PaymentBlockingReason")
    @Nullable
    @ODataField(odataName = "PaymentBlockingReason")
    private String paymentBlockingReason;
    /**
     * Use with available fluent helpers to apply the <b>PaymentBlockingReason</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> PAYMENT_BLOCKING_REASON = new CustomerCompanyField<String>("PaymentBlockingReason");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PaymentMethodsList</b></p>
     * 
     * @param paymentMethodsList
     *     
     * @return
     *     List of Respected Payment Methods
     */
    @SerializedName("PaymentMethodsList")
    @JsonProperty("PaymentMethodsList")
    @Nullable
    @ODataField(odataName = "PaymentMethodsList")
    private String paymentMethodsList;
    /**
     * Use with available fluent helpers to apply the <b>PaymentMethodsList</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> PAYMENT_METHODS_LIST = new CustomerCompanyField<String>("PaymentMethodsList");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PaymentTerms</b></p>
     * 
     * @param paymentTerms
     *     
     * @return
     *     Terms of Payment Key
     */
    @SerializedName("PaymentTerms")
    @JsonProperty("PaymentTerms")
    @Nullable
    @ODataField(odataName = "PaymentTerms")
    private String paymentTerms;
    /**
     * Use with available fluent helpers to apply the <b>PaymentTerms</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> PAYMENT_TERMS = new CustomerCompanyField<String>("PaymentTerms");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaytAdviceIsSentbyEDI</b></p>
     * 
     * @param paytAdviceIsSentbyEDI
     *     
     * @return
     *     Indicator: Send Payment Advices by EDI
     */
    @SerializedName("PaytAdviceIsSentbyEDI")
    @JsonProperty("PaytAdviceIsSentbyEDI")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PaytAdviceIsSentbyEDI")
    private Boolean paytAdviceIsSentbyEDI;
    /**
     * Use with available fluent helpers to apply the <b>PaytAdviceIsSentbyEDI</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> PAYT_ADVICE_IS_SENTBY_EDI = new CustomerCompanyField<Boolean>("PaytAdviceIsSentbyEDI");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PhysicalInventoryBlockInd</b></p>
     * 
     * @param physicalInventoryBlockInd
     *     
     * @return
     *     Posting block for company code
     */
    @SerializedName("PhysicalInventoryBlockInd")
    @JsonProperty("PhysicalInventoryBlockInd")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PhysicalInventoryBlockInd")
    private Boolean physicalInventoryBlockInd;
    /**
     * Use with available fluent helpers to apply the <b>PhysicalInventoryBlockInd</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> PHYSICAL_INVENTORY_BLOCK_IND = new CustomerCompanyField<Boolean>("PhysicalInventoryBlockInd");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ReconciliationAccount</b></p>
     * 
     * @param reconciliationAccount
     *     
     * @return
     *     Reconciliation Account in General Ledger
     */
    @SerializedName("ReconciliationAccount")
    @JsonProperty("ReconciliationAccount")
    @Nullable
    @ODataField(odataName = "ReconciliationAccount")
    private String reconciliationAccount;
    /**
     * Use with available fluent helpers to apply the <b>ReconciliationAccount</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> RECONCILIATION_ACCOUNT = new CustomerCompanyField<String>("ReconciliationAccount");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>RecordPaymentHistoryIndicator</b></p>
     * 
     * @param recordPaymentHistoryIndicator
     *     
     * @return
     *     Indicator: Record Payment History ?
     */
    @SerializedName("RecordPaymentHistoryIndicator")
    @JsonProperty("RecordPaymentHistoryIndicator")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "RecordPaymentHistoryIndicator")
    private Boolean recordPaymentHistoryIndicator;
    /**
     * Use with available fluent helpers to apply the <b>RecordPaymentHistoryIndicator</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> RECORD_PAYMENT_HISTORY_INDICATOR = new CustomerCompanyField<Boolean>("RecordPaymentHistoryIndicator");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>UserAtCustomer</b></p>
     * 
     * @param userAtCustomer
     *     
     * @return
     *     User at customer
     */
    @SerializedName("UserAtCustomer")
    @JsonProperty("UserAtCustomer")
    @Nullable
    @ODataField(odataName = "UserAtCustomer")
    private String userAtCustomer;
    /**
     * Use with available fluent helpers to apply the <b>UserAtCustomer</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> USER_AT_CUSTOMER = new CustomerCompanyField<String>("UserAtCustomer");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     
     * @return
     *     Deletion Flag for Master Record (Company Code Level)
     */
    @SerializedName("DeletionIndicator")
    @JsonProperty("DeletionIndicator")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "DeletionIndicator")
    private Boolean deletionIndicator;
    /**
     * Use with available fluent helpers to apply the <b>DeletionIndicator</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<Boolean> DELETION_INDICATOR = new CustomerCompanyField<Boolean>("DeletionIndicator");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerAccountGroup</b></p>
     * 
     * @param customerAccountGroup
     *     
     * @return
     *     Customer Account Group
     */
    @SerializedName("CustomerAccountGroup")
    @JsonProperty("CustomerAccountGroup")
    @Nullable
    @ODataField(odataName = "CustomerAccountGroup")
    private String customerAccountGroup;
    /**
     * Use with available fluent helpers to apply the <b>CustomerAccountGroup</b> field to query operations.
     * 
     */
    public final static CustomerCompanyField<String> CUSTOMER_ACCOUNT_GROUP = new CustomerCompanyField<String>("CustomerAccountGroup");
    /**
     * Convienence field for reusing the same ERP system context with multiple queries (e.g. fetching associated entities).
     * 
     * @param erpConfigContext
     *     
     * @return
     *     The stored ERP system context for executing queries, or null if no such context has been set.
     */
    @JsonIgnore
    @Nullable
    private transient ErpConfigContext erpConfigContext;
    /**
     * Navigation property <b>to_CustomerDunning</b> for <b>CustomerCompany</b> to multiple <b>CustomerDunning</b>.
     * 
     */
    @SerializedName("to_CustomerDunning")
    @JsonProperty("to_CustomerDunning")
    @ODataField(odataName = "to_CustomerDunning")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustomerDunning> toCustomerDunning;
    /**
     * Navigation property <b>to_WithHoldingTax</b> for <b>CustomerCompany</b> to multiple <b>CustomerWithHoldingTax</b>.
     * 
     */
    @SerializedName("to_WithHoldingTax")
    @JsonProperty("to_WithHoldingTax")
    @ODataField(odataName = "to_WithHoldingTax")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustomerWithHoldingTax> toWithHoldingTax;
    /**
     * Use with available fluent helpers to apply the <b>to_CustomerDunning</b> navigation property to query operations.
     * 
     */
    public final static CustomerCompanyLink<CustomerDunning> TO_CUSTOMER_DUNNING = new CustomerCompanyLink<CustomerDunning>("to_CustomerDunning");
    /**
     * Use with available fluent helpers to apply the <b>to_WithHoldingTax</b> navigation property to query operations.
     * 
     */
    public final static CustomerCompanyLink<CustomerWithHoldingTax> TO_WITH_HOLDING_TAX = new CustomerCompanyLink<CustomerWithHoldingTax>("to_WithHoldingTax");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<CustomerCompany> getType() {
        return CustomerCompany.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     Customer Number
     */
    public void setCustomer(
        @Nullable
        final String customer) {
        rememberChangedField("Customer", this.customer);
        this.customer = customer;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     Company Code
     */
    public void setCompanyCode(
        @Nullable
        final String companyCode) {
        rememberChangedField("CompanyCode", this.companyCode);
        this.companyCode = companyCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>APARToleranceGroup</b></p>
     * 
     * @param aPARToleranceGroup
     *     Tolerance group for the business partner/G/L account
     */
    public void setAPARToleranceGroup(
        @Nullable
        final String aPARToleranceGroup) {
        rememberChangedField("APARToleranceGroup", this.aPARToleranceGroup);
        this.aPARToleranceGroup = aPARToleranceGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>AccountByCustomer</b></p>
     * 
     * @param accountByCustomer
     *     Our account number at customer
     */
    public void setAccountByCustomer(
        @Nullable
        final String accountByCustomer) {
        rememberChangedField("AccountByCustomer", this.accountByCustomer);
        this.accountByCustomer = accountByCustomer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>AccountingClerk</b></p>
     * 
     * @param accountingClerk
     *     Accounting Clerk Abbreviation
     */
    public void setAccountingClerk(
        @Nullable
        final String accountingClerk) {
        rememberChangedField("AccountingClerk", this.accountingClerk);
        this.accountingClerk = accountingClerk;
    }

    /**
     * Constraints: Not nullable, Maximum length: 31 <p>Original property name from the Odata EDM: <b>AccountingClerkFaxNumber</b></p>
     * 
     * @param accountingClerkFaxNumber
     *     Accounting clerk's fax number at the customer/vendor
     */
    public void setAccountingClerkFaxNumber(
        @Nullable
        final String accountingClerkFaxNumber) {
        rememberChangedField("AccountingClerkFaxNumber", this.accountingClerkFaxNumber);
        this.accountingClerkFaxNumber = accountingClerkFaxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 130 <p>Original property name from the Odata EDM: <b>AccountingClerkInternetAddress</b></p>
     * 
     * @param accountingClerkInternetAddress
     *     Internet address of partner company clerk
     */
    public void setAccountingClerkInternetAddress(
        @Nullable
        final String accountingClerkInternetAddress) {
        rememberChangedField("AccountingClerkInternetAddress", this.accountingClerkInternetAddress);
        this.accountingClerkInternetAddress = accountingClerkInternetAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>AccountingClerkPhoneNumber</b></p>
     * 
     * @param accountingClerkPhoneNumber
     *     Accounting clerk's telephone number at business partner
     */
    public void setAccountingClerkPhoneNumber(
        @Nullable
        final String accountingClerkPhoneNumber) {
        rememberChangedField("AccountingClerkPhoneNumber", this.accountingClerkPhoneNumber);
        this.accountingClerkPhoneNumber = accountingClerkPhoneNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayerAccount</b></p>
     * 
     * @param alternativePayerAccount
     *     Account number of an alternative payer
     */
    public void setAlternativePayerAccount(
        @Nullable
        final String alternativePayerAccount) {
        rememberChangedField("AlternativePayerAccount", this.alternativePayerAccount);
        this.alternativePayerAccount = alternativePayerAccount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @param authorizationGroup
     *     Authorization Group
     */
    public void setAuthorizationGroup(
        @Nullable
        final String authorizationGroup) {
        rememberChangedField("AuthorizationGroup", this.authorizationGroup);
        this.authorizationGroup = authorizationGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CollectiveInvoiceVariant</b></p>
     * 
     * @param collectiveInvoiceVariant
     *     Collective invoice variant
     */
    public void setCollectiveInvoiceVariant(
        @Nullable
        final String collectiveInvoiceVariant) {
        rememberChangedField("CollectiveInvoiceVariant", this.collectiveInvoiceVariant);
        this.collectiveInvoiceVariant = collectiveInvoiceVariant;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CustomerAccountNote</b></p>
     * 
     * @param customerAccountNote
     *     Memo
     */
    public void setCustomerAccountNote(
        @Nullable
        final String customerAccountNote) {
        rememberChangedField("CustomerAccountNote", this.customerAccountNote);
        this.customerAccountNote = customerAccountNote;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CustomerHeadOffice</b></p>
     * 
     * @param customerHeadOffice
     *     Head office account number (in branch accounts)
     */
    public void setCustomerHeadOffice(
        @Nullable
        final String customerHeadOffice) {
        rememberChangedField("CustomerHeadOffice", this.customerHeadOffice);
        this.customerHeadOffice = customerHeadOffice;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CustomerSupplierClearingIsUsed</b></p>
     * 
     * @param customerSupplierClearingIsUsed
     *     Indicator: Clearing between customer and vendor ?
     */
    public void setCustomerSupplierClearingIsUsed(
        @Nullable
        final Boolean customerSupplierClearingIsUsed) {
        rememberChangedField("CustomerSupplierClearingIsUsed", this.customerSupplierClearingIsUsed);
        this.customerSupplierClearingIsUsed = customerSupplierClearingIsUsed;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>HouseBank</b></p>
     * 
     * @param houseBank
     *     Short Key for a House Bank
     */
    public void setHouseBank(
        @Nullable
        final String houseBank) {
        rememberChangedField("HouseBank", this.houseBank);
        this.houseBank = houseBank;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InterestCalculationCode</b></p>
     * 
     * @param interestCalculationCode
     *     Interest calculation indicator
     */
    public void setInterestCalculationCode(
        @Nullable
        final String interestCalculationCode) {
        rememberChangedField("InterestCalculationCode", this.interestCalculationCode);
        this.interestCalculationCode = interestCalculationCode;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>InterestCalculationDate</b></p>
     * 
     * @param interestCalculationDate
     *     Key date of the last interest calculation
     */
    public void setInterestCalculationDate(
        @Nullable
        final LocalDateTime interestCalculationDate) {
        rememberChangedField("InterestCalculationDate", this.interestCalculationDate);
        this.interestCalculationDate = interestCalculationDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>IntrstCalcFrequencyInMonths</b></p>
     * 
     * @param intrstCalcFrequencyInMonths
     *     Interest Calculation Frequency in Months
     */
    public void setIntrstCalcFrequencyInMonths(
        @Nullable
        final String intrstCalcFrequencyInMonths) {
        rememberChangedField("IntrstCalcFrequencyInMonths", this.intrstCalcFrequencyInMonths);
        this.intrstCalcFrequencyInMonths = intrstCalcFrequencyInMonths;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsToBeLocallyProcessed</b></p>
     * 
     * @param isToBeLocallyProcessed
     *     Indicator: Local processing?
     */
    public void setIsToBeLocallyProcessed(
        @Nullable
        final Boolean isToBeLocallyProcessed) {
        rememberChangedField("IsToBeLocallyProcessed", this.isToBeLocallyProcessed);
        this.isToBeLocallyProcessed = isToBeLocallyProcessed;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ItemIsToBePaidSeparately</b></p>
     * 
     * @param itemIsToBePaidSeparately
     *     Indicator: Pay all items separately ?
     */
    public void setItemIsToBePaidSeparately(
        @Nullable
        final Boolean itemIsToBePaidSeparately) {
        rememberChangedField("ItemIsToBePaidSeparately", this.itemIsToBePaidSeparately);
        this.itemIsToBePaidSeparately = itemIsToBePaidSeparately;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>LayoutSortingRule</b></p>
     * 
     * @param layoutSortingRule
     *     Key for Sorting According to Assignment Numbers
     */
    public void setLayoutSortingRule(
        @Nullable
        final String layoutSortingRule) {
        rememberChangedField("LayoutSortingRule", this.layoutSortingRule);
        this.layoutSortingRule = layoutSortingRule;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PaymentBlockingReason</b></p>
     * 
     * @param paymentBlockingReason
     *     Block Key for Payment
     */
    public void setPaymentBlockingReason(
        @Nullable
        final String paymentBlockingReason) {
        rememberChangedField("PaymentBlockingReason", this.paymentBlockingReason);
        this.paymentBlockingReason = paymentBlockingReason;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PaymentMethodsList</b></p>
     * 
     * @param paymentMethodsList
     *     List of Respected Payment Methods
     */
    public void setPaymentMethodsList(
        @Nullable
        final String paymentMethodsList) {
        rememberChangedField("PaymentMethodsList", this.paymentMethodsList);
        this.paymentMethodsList = paymentMethodsList;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PaymentTerms</b></p>
     * 
     * @param paymentTerms
     *     Terms of Payment Key
     */
    public void setPaymentTerms(
        @Nullable
        final String paymentTerms) {
        rememberChangedField("PaymentTerms", this.paymentTerms);
        this.paymentTerms = paymentTerms;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaytAdviceIsSentbyEDI</b></p>
     * 
     * @param paytAdviceIsSentbyEDI
     *     Indicator: Send Payment Advices by EDI
     */
    public void setPaytAdviceIsSentbyEDI(
        @Nullable
        final Boolean paytAdviceIsSentbyEDI) {
        rememberChangedField("PaytAdviceIsSentbyEDI", this.paytAdviceIsSentbyEDI);
        this.paytAdviceIsSentbyEDI = paytAdviceIsSentbyEDI;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PhysicalInventoryBlockInd</b></p>
     * 
     * @param physicalInventoryBlockInd
     *     Posting block for company code
     */
    public void setPhysicalInventoryBlockInd(
        @Nullable
        final Boolean physicalInventoryBlockInd) {
        rememberChangedField("PhysicalInventoryBlockInd", this.physicalInventoryBlockInd);
        this.physicalInventoryBlockInd = physicalInventoryBlockInd;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ReconciliationAccount</b></p>
     * 
     * @param reconciliationAccount
     *     Reconciliation Account in General Ledger
     */
    public void setReconciliationAccount(
        @Nullable
        final String reconciliationAccount) {
        rememberChangedField("ReconciliationAccount", this.reconciliationAccount);
        this.reconciliationAccount = reconciliationAccount;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>RecordPaymentHistoryIndicator</b></p>
     * 
     * @param recordPaymentHistoryIndicator
     *     Indicator: Record Payment History ?
     */
    public void setRecordPaymentHistoryIndicator(
        @Nullable
        final Boolean recordPaymentHistoryIndicator) {
        rememberChangedField("RecordPaymentHistoryIndicator", this.recordPaymentHistoryIndicator);
        this.recordPaymentHistoryIndicator = recordPaymentHistoryIndicator;
    }

    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>UserAtCustomer</b></p>
     * 
     * @param userAtCustomer
     *     User at customer
     */
    public void setUserAtCustomer(
        @Nullable
        final String userAtCustomer) {
        rememberChangedField("UserAtCustomer", this.userAtCustomer);
        this.userAtCustomer = userAtCustomer;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     Deletion Flag for Master Record (Company Code Level)
     */
    public void setDeletionIndicator(
        @Nullable
        final Boolean deletionIndicator) {
        rememberChangedField("DeletionIndicator", this.deletionIndicator);
        this.deletionIndicator = deletionIndicator;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerAccountGroup</b></p>
     * 
     * @param customerAccountGroup
     *     Customer Account Group
     */
    public void setCustomerAccountGroup(
        @Nullable
        final String customerAccountGroup) {
        rememberChangedField("CustomerAccountGroup", this.customerAccountGroup);
        this.customerAccountGroup = customerAccountGroup;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustomerCompany";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CompanyCode", getCompanyCode());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CompanyCode", getCompanyCode());
        values.put("APARToleranceGroup", getAPARToleranceGroup());
        values.put("AccountByCustomer", getAccountByCustomer());
        values.put("AccountingClerk", getAccountingClerk());
        values.put("AccountingClerkFaxNumber", getAccountingClerkFaxNumber());
        values.put("AccountingClerkInternetAddress", getAccountingClerkInternetAddress());
        values.put("AccountingClerkPhoneNumber", getAccountingClerkPhoneNumber());
        values.put("AlternativePayerAccount", getAlternativePayerAccount());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("CollectiveInvoiceVariant", getCollectiveInvoiceVariant());
        values.put("CustomerAccountNote", getCustomerAccountNote());
        values.put("CustomerHeadOffice", getCustomerHeadOffice());
        values.put("CustomerSupplierClearingIsUsed", getCustomerSupplierClearingIsUsed());
        values.put("HouseBank", getHouseBank());
        values.put("InterestCalculationCode", getInterestCalculationCode());
        values.put("InterestCalculationDate", getInterestCalculationDate());
        values.put("IntrstCalcFrequencyInMonths", getIntrstCalcFrequencyInMonths());
        values.put("IsToBeLocallyProcessed", getIsToBeLocallyProcessed());
        values.put("ItemIsToBePaidSeparately", getItemIsToBePaidSeparately());
        values.put("LayoutSortingRule", getLayoutSortingRule());
        values.put("PaymentBlockingReason", getPaymentBlockingReason());
        values.put("PaymentMethodsList", getPaymentMethodsList());
        values.put("PaymentTerms", getPaymentTerms());
        values.put("PaytAdviceIsSentbyEDI", getPaytAdviceIsSentbyEDI());
        values.put("PhysicalInventoryBlockInd", getPhysicalInventoryBlockInd());
        values.put("ReconciliationAccount", getReconciliationAccount());
        values.put("RecordPaymentHistoryIndicator", getRecordPaymentHistoryIndicator());
        values.put("UserAtCustomer", getUserAtCustomer());
        values.put("DeletionIndicator", getDeletionIndicator());
        values.put("CustomerAccountGroup", getCustomerAccountGroup());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("APARToleranceGroup")) {
                final Object value = values.remove("APARToleranceGroup");
                if ((value == null)||(!value.equals(getAPARToleranceGroup()))) {
                    setAPARToleranceGroup(((String) value));
                }
            }
            if (values.containsKey("AccountByCustomer")) {
                final Object value = values.remove("AccountByCustomer");
                if ((value == null)||(!value.equals(getAccountByCustomer()))) {
                    setAccountByCustomer(((String) value));
                }
            }
            if (values.containsKey("AccountingClerk")) {
                final Object value = values.remove("AccountingClerk");
                if ((value == null)||(!value.equals(getAccountingClerk()))) {
                    setAccountingClerk(((String) value));
                }
            }
            if (values.containsKey("AccountingClerkFaxNumber")) {
                final Object value = values.remove("AccountingClerkFaxNumber");
                if ((value == null)||(!value.equals(getAccountingClerkFaxNumber()))) {
                    setAccountingClerkFaxNumber(((String) value));
                }
            }
            if (values.containsKey("AccountingClerkInternetAddress")) {
                final Object value = values.remove("AccountingClerkInternetAddress");
                if ((value == null)||(!value.equals(getAccountingClerkInternetAddress()))) {
                    setAccountingClerkInternetAddress(((String) value));
                }
            }
            if (values.containsKey("AccountingClerkPhoneNumber")) {
                final Object value = values.remove("AccountingClerkPhoneNumber");
                if ((value == null)||(!value.equals(getAccountingClerkPhoneNumber()))) {
                    setAccountingClerkPhoneNumber(((String) value));
                }
            }
            if (values.containsKey("AlternativePayerAccount")) {
                final Object value = values.remove("AlternativePayerAccount");
                if ((value == null)||(!value.equals(getAlternativePayerAccount()))) {
                    setAlternativePayerAccount(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
                }
            }
            if (values.containsKey("CollectiveInvoiceVariant")) {
                final Object value = values.remove("CollectiveInvoiceVariant");
                if ((value == null)||(!value.equals(getCollectiveInvoiceVariant()))) {
                    setCollectiveInvoiceVariant(((String) value));
                }
            }
            if (values.containsKey("CustomerAccountNote")) {
                final Object value = values.remove("CustomerAccountNote");
                if ((value == null)||(!value.equals(getCustomerAccountNote()))) {
                    setCustomerAccountNote(((String) value));
                }
            }
            if (values.containsKey("CustomerHeadOffice")) {
                final Object value = values.remove("CustomerHeadOffice");
                if ((value == null)||(!value.equals(getCustomerHeadOffice()))) {
                    setCustomerHeadOffice(((String) value));
                }
            }
            if (values.containsKey("CustomerSupplierClearingIsUsed")) {
                final Object value = values.remove("CustomerSupplierClearingIsUsed");
                if ((value == null)||(!value.equals(getCustomerSupplierClearingIsUsed()))) {
                    setCustomerSupplierClearingIsUsed(((Boolean) value));
                }
            }
            if (values.containsKey("HouseBank")) {
                final Object value = values.remove("HouseBank");
                if ((value == null)||(!value.equals(getHouseBank()))) {
                    setHouseBank(((String) value));
                }
            }
            if (values.containsKey("InterestCalculationCode")) {
                final Object value = values.remove("InterestCalculationCode");
                if ((value == null)||(!value.equals(getInterestCalculationCode()))) {
                    setInterestCalculationCode(((String) value));
                }
            }
            if (values.containsKey("InterestCalculationDate")) {
                final Object value = values.remove("InterestCalculationDate");
                if ((value == null)||(!value.equals(getInterestCalculationDate()))) {
                    setInterestCalculationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("IntrstCalcFrequencyInMonths")) {
                final Object value = values.remove("IntrstCalcFrequencyInMonths");
                if ((value == null)||(!value.equals(getIntrstCalcFrequencyInMonths()))) {
                    setIntrstCalcFrequencyInMonths(((String) value));
                }
            }
            if (values.containsKey("IsToBeLocallyProcessed")) {
                final Object value = values.remove("IsToBeLocallyProcessed");
                if ((value == null)||(!value.equals(getIsToBeLocallyProcessed()))) {
                    setIsToBeLocallyProcessed(((Boolean) value));
                }
            }
            if (values.containsKey("ItemIsToBePaidSeparately")) {
                final Object value = values.remove("ItemIsToBePaidSeparately");
                if ((value == null)||(!value.equals(getItemIsToBePaidSeparately()))) {
                    setItemIsToBePaidSeparately(((Boolean) value));
                }
            }
            if (values.containsKey("LayoutSortingRule")) {
                final Object value = values.remove("LayoutSortingRule");
                if ((value == null)||(!value.equals(getLayoutSortingRule()))) {
                    setLayoutSortingRule(((String) value));
                }
            }
            if (values.containsKey("PaymentBlockingReason")) {
                final Object value = values.remove("PaymentBlockingReason");
                if ((value == null)||(!value.equals(getPaymentBlockingReason()))) {
                    setPaymentBlockingReason(((String) value));
                }
            }
            if (values.containsKey("PaymentMethodsList")) {
                final Object value = values.remove("PaymentMethodsList");
                if ((value == null)||(!value.equals(getPaymentMethodsList()))) {
                    setPaymentMethodsList(((String) value));
                }
            }
            if (values.containsKey("PaymentTerms")) {
                final Object value = values.remove("PaymentTerms");
                if ((value == null)||(!value.equals(getPaymentTerms()))) {
                    setPaymentTerms(((String) value));
                }
            }
            if (values.containsKey("PaytAdviceIsSentbyEDI")) {
                final Object value = values.remove("PaytAdviceIsSentbyEDI");
                if ((value == null)||(!value.equals(getPaytAdviceIsSentbyEDI()))) {
                    setPaytAdviceIsSentbyEDI(((Boolean) value));
                }
            }
            if (values.containsKey("PhysicalInventoryBlockInd")) {
                final Object value = values.remove("PhysicalInventoryBlockInd");
                if ((value == null)||(!value.equals(getPhysicalInventoryBlockInd()))) {
                    setPhysicalInventoryBlockInd(((Boolean) value));
                }
            }
            if (values.containsKey("ReconciliationAccount")) {
                final Object value = values.remove("ReconciliationAccount");
                if ((value == null)||(!value.equals(getReconciliationAccount()))) {
                    setReconciliationAccount(((String) value));
                }
            }
            if (values.containsKey("RecordPaymentHistoryIndicator")) {
                final Object value = values.remove("RecordPaymentHistoryIndicator");
                if ((value == null)||(!value.equals(getRecordPaymentHistoryIndicator()))) {
                    setRecordPaymentHistoryIndicator(((Boolean) value));
                }
            }
            if (values.containsKey("UserAtCustomer")) {
                final Object value = values.remove("UserAtCustomer");
                if ((value == null)||(!value.equals(getUserAtCustomer()))) {
                    setUserAtCustomer(((String) value));
                }
            }
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
                }
            }
            if (values.containsKey("CustomerAccountGroup")) {
                final Object value = values.remove("CustomerAccountGroup");
                if ((value == null)||(!value.equals(getCustomerAccountGroup()))) {
                    setCustomerAccountGroup(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_CustomerDunning")) {
                final Object value = (values).remove("to_CustomerDunning");
                if (value instanceof Iterable) {
                    if (toCustomerDunning == null) {
                        toCustomerDunning = Lists.newArrayList();
                    } else {
                        toCustomerDunning = Lists.newArrayList(toCustomerDunning);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CustomerDunning entity;
                        if (toCustomerDunning.size()>i) {
                            entity = toCustomerDunning.get(i);
                        } else {
                            entity = new CustomerDunning();
                            toCustomerDunning.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_WithHoldingTax")) {
                final Object value = (values).remove("to_WithHoldingTax");
                if (value instanceof Iterable) {
                    if (toWithHoldingTax == null) {
                        toWithHoldingTax = Lists.newArrayList();
                    } else {
                        toWithHoldingTax = Lists.newArrayList(toWithHoldingTax);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CustomerWithHoldingTax entity;
                        if (toWithHoldingTax.size()>i) {
                            entity = toWithHoldingTax.get(i);
                        } else {
                            entity = new CustomerWithHoldingTax();
                            toWithHoldingTax.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >CustomerCompanyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerCompanyField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >CustomerCompanyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerCompanyField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toCustomerDunning!= null) {
            (values).put("to_CustomerDunning", toCustomerDunning);
        }
        if (toWithHoldingTax!= null) {
            (values).put("to_WithHoldingTax", toWithHoldingTax);
        }
        return values;
    }

    /**
     * Fetches the <b>CustomerDunning</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CustomerDunning</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustomerDunning</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerDunning> fetchCustomerDunning()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustomerDunning.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(",CompanyCode=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(companyCode));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CustomerDunning");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustomerDunning> entityList = result.asList(CustomerDunning.class);
        for (CustomerDunning entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustomerDunning</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerDunning</b>.
     * <p>
     * If the navigation property <b>to_CustomerDunning</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustomerDunning</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerDunning> getCustomerDunningOrFetch()
        throws ODataException
    {
        if (toCustomerDunning == null) {
            toCustomerDunning = fetchCustomerDunning();
        }
        return toCustomerDunning;
    }

    /**
     * Retrieval of associated <b>CustomerDunning</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerDunning</b>.
     * <p>
     * If the navigation property for an entity <b>CustomerCompany</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CustomerDunning</b> is already loaded, the result will contain the <b>CustomerDunning</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustomerDunning>> getCustomerDunningIfPresent() {
        return Optional.ofNullable(toCustomerDunning);
    }

    /**
     * Overwrites the list of associated <b>CustomerDunning</b> entities for the loaded navigation property <b>to_CustomerDunning</b>.
     * <p>
     * If the navigation property <b>to_CustomerDunning</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustomerDunning</b> entities.
     */
    public void setCustomerDunning(
        @Nonnull
        final List<CustomerDunning> value) {
        if (toCustomerDunning == null) {
            toCustomerDunning = Lists.newArrayList();
        }
        toCustomerDunning.clear();
        toCustomerDunning.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustomerDunning</b> entities. This corresponds to the OData navigation property <b>to_CustomerDunning</b>.
     * <p>
     * If the navigation property <b>to_CustomerDunning</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustomerDunning</b> entities.
     */
    public void addCustomerDunning(CustomerDunning... entity) {
        if (toCustomerDunning == null) {
            toCustomerDunning = Lists.newArrayList();
        }
        toCustomerDunning.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CustomerWithHoldingTax</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_WithHoldingTax</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustomerWithHoldingTax</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerWithHoldingTax> fetchWithHoldingTax()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustomerWithHoldingTax.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(",CompanyCode=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(companyCode));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_WithHoldingTax");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustomerWithHoldingTax> entityList = result.asList(CustomerWithHoldingTax.class);
        for (CustomerWithHoldingTax entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustomerWithHoldingTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_WithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_WithHoldingTax</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustomerWithHoldingTax</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerWithHoldingTax> getWithHoldingTaxOrFetch()
        throws ODataException
    {
        if (toWithHoldingTax == null) {
            toWithHoldingTax = fetchWithHoldingTax();
        }
        return toWithHoldingTax;
    }

    /**
     * Retrieval of associated <b>CustomerWithHoldingTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_WithHoldingTax</b>.
     * <p>
     * If the navigation property for an entity <b>CustomerCompany</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_WithHoldingTax</b> is already loaded, the result will contain the <b>CustomerWithHoldingTax</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustomerWithHoldingTax>> getWithHoldingTaxIfPresent() {
        return Optional.ofNullable(toWithHoldingTax);
    }

    /**
     * Overwrites the list of associated <b>CustomerWithHoldingTax</b> entities for the loaded navigation property <b>to_WithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_WithHoldingTax</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustomerWithHoldingTax</b> entities.
     */
    public void setWithHoldingTax(
        @Nonnull
        final List<CustomerWithHoldingTax> value) {
        if (toWithHoldingTax == null) {
            toWithHoldingTax = Lists.newArrayList();
        }
        toWithHoldingTax.clear();
        toWithHoldingTax.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustomerWithHoldingTax</b> entities. This corresponds to the OData navigation property <b>to_WithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_WithHoldingTax</b> of a queried <b>CustomerCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustomerWithHoldingTax</b> entities.
     */
    public void addWithHoldingTax(CustomerWithHoldingTax... entity) {
        if (toWithHoldingTax == null) {
            toWithHoldingTax = Lists.newArrayList();
        }
        toWithHoldingTax.addAll(Lists.newArrayList(entity));
    }

    public final static class CustomerCompanyBuilder {

        private List<CustomerDunning> toCustomerDunning = Lists.newArrayList();
        private List<CustomerWithHoldingTax> toWithHoldingTax = Lists.newArrayList();

        private CustomerCompany.CustomerCompanyBuilder toCustomerDunning(List<CustomerDunning> value) {
            toCustomerDunning.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CustomerDunning</b> for <b>CustomerCompany</b> to multiple <b>CustomerDunning</b>.
         * 
         */
        @Nonnull
        public CustomerCompany.CustomerCompanyBuilder customerDunning(CustomerDunning... value) {
            return toCustomerDunning(Lists.newArrayList(value));
        }

        private CustomerCompany.CustomerCompanyBuilder toWithHoldingTax(List<CustomerWithHoldingTax> value) {
            toWithHoldingTax.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_WithHoldingTax</b> for <b>CustomerCompany</b> to multiple <b>CustomerWithHoldingTax</b>.
         * 
         */
        @Nonnull
        public CustomerCompany.CustomerCompanyBuilder withHoldingTax(CustomerWithHoldingTax... value) {
            return toWithHoldingTax(Lists.newArrayList(value));
        }

    }

}
