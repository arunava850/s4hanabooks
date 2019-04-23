/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.math.BigDecimal;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.SupplierCompanyField;
import vdm.namespaces.odataserviceforbusinesspartner.link.SupplierCompanyLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierCompanySelectable;


/**
 * Supplier Company<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierCompanyType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SupplierCompany
    extends VdmEntity<SupplierCompany>
{

    /**
     * Selector for all available fields of SupplierCompany.
     * 
     */
    public final static SupplierCompanySelectable ALL_FIELDS = new SupplierCompanySelectable() {


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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     
     * @return
     *     Account Number of Supplier
     */
    @Key
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER = new SupplierCompanyField<String>("Supplier");
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
    public final static SupplierCompanyField<String> COMPANY_CODE = new SupplierCompanyField<String>("CompanyCode");
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
    public final static SupplierCompanyField<String> AUTHORIZATION_GROUP = new SupplierCompanyField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>CompanyCodeName</b></p>
     * 
     * @param companyCodeName
     *     
     * @return
     *     Name of Company Code or Company
     */
    @SerializedName("CompanyCodeName")
    @JsonProperty("CompanyCodeName")
    @Nullable
    @ODataField(odataName = "CompanyCodeName")
    private String companyCodeName;
    /**
     * Use with available fluent helpers to apply the <b>CompanyCodeName</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> COMPANY_CODE_NAME = new SupplierCompanyField<String>("CompanyCodeName");
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
    public final static SupplierCompanyField<String> PAYMENT_BLOCKING_REASON = new SupplierCompanyField<String>("PaymentBlockingReason");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>SupplierIsBlockedForPosting</b></p>
     * 
     * @param supplierIsBlockedForPosting
     *     
     * @return
     *     Posting block for company code
     */
    @SerializedName("SupplierIsBlockedForPosting")
    @JsonProperty("SupplierIsBlockedForPosting")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "SupplierIsBlockedForPosting")
    private Boolean supplierIsBlockedForPosting;
    /**
     * Use with available fluent helpers to apply the <b>SupplierIsBlockedForPosting</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<Boolean> SUPPLIER_IS_BLOCKED_FOR_POSTING = new SupplierCompanyField<Boolean>("SupplierIsBlockedForPosting");
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
    public final static SupplierCompanyField<String> ACCOUNTING_CLERK = new SupplierCompanyField<String>("AccountingClerk");
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
    public final static SupplierCompanyField<String> ACCOUNTING_CLERK_FAX_NUMBER = new SupplierCompanyField<String>("AccountingClerkFaxNumber");
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
    public final static SupplierCompanyField<String> ACCOUNTING_CLERK_PHONE_NUMBER = new SupplierCompanyField<String>("AccountingClerkPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>SupplierClerk</b></p>
     * 
     * @param supplierClerk
     *     
     * @return
     *     Clerk at vendor
     */
    @SerializedName("SupplierClerk")
    @JsonProperty("SupplierClerk")
    @Nullable
    @ODataField(odataName = "SupplierClerk")
    private String supplierClerk;
    /**
     * Use with available fluent helpers to apply the <b>SupplierClerk</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_CLERK = new SupplierCompanyField<String>("SupplierClerk");
    /**
     * Constraints: Not nullable, Maximum length: 130 <p>Original property name from the Odata EDM: <b>SupplierClerkURL</b></p>
     * 
     * @param supplierClerkURL
     *     
     * @return
     *     Internet address of partner company clerk
     */
    @SerializedName("SupplierClerkURL")
    @JsonProperty("SupplierClerkURL")
    @Nullable
    @ODataField(odataName = "SupplierClerkURL")
    private String supplierClerkURL;
    /**
     * Use with available fluent helpers to apply the <b>SupplierClerkURL</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_CLERK_URL = new SupplierCompanyField<String>("SupplierClerkURL");
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
    public final static SupplierCompanyField<String> PAYMENT_METHODS_LIST = new SupplierCompanyField<String>("PaymentMethodsList");
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
    public final static SupplierCompanyField<String> PAYMENT_TERMS = new SupplierCompanyField<String>("PaymentTerms");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>ClearCustomerSupplier</b></p>
     * 
     * @param clearCustomerSupplier
     *     
     * @return
     *     Indicator: Clearing between customer and vendor?
     */
    @SerializedName("ClearCustomerSupplier")
    @JsonProperty("ClearCustomerSupplier")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "ClearCustomerSupplier")
    private Boolean clearCustomerSupplier;
    /**
     * Use with available fluent helpers to apply the <b>ClearCustomerSupplier</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<Boolean> CLEAR_CUSTOMER_SUPPLIER = new SupplierCompanyField<Boolean>("ClearCustomerSupplier");
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
    public final static SupplierCompanyField<Boolean> IS_TO_BE_LOCALLY_PROCESSED = new SupplierCompanyField<Boolean>("IsToBeLocallyProcessed");
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
    public final static SupplierCompanyField<Boolean> ITEM_IS_TO_BE_PAID_SEPARATELY = new SupplierCompanyField<Boolean>("ItemIsToBePaidSeparately");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaymentIsToBeSentByEDI</b></p>
     * 
     * @param paymentIsToBeSentByEDI
     *     
     * @return
     *     Indicator: Send Payment Advices by EDI
     */
    @SerializedName("PaymentIsToBeSentByEDI")
    @JsonProperty("PaymentIsToBeSentByEDI")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PaymentIsToBeSentByEDI")
    private Boolean paymentIsToBeSentByEDI;
    /**
     * Use with available fluent helpers to apply the <b>PaymentIsToBeSentByEDI</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<Boolean> PAYMENT_IS_TO_BE_SENT_BY_EDI = new SupplierCompanyField<Boolean>("PaymentIsToBeSentByEDI");
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
    public final static SupplierCompanyField<String> HOUSE_BANK = new SupplierCompanyField<String>("HouseBank");
    /**
     * Constraints: Not nullable, Precision: 3, Scale: 0 <p>Original property name from the Odata EDM: <b>CheckPaidDurationInDays</b></p>
     * 
     * @param checkPaidDurationInDays
     *     
     * @return
     *     Probable time until check is paid
     */
    @SerializedName("CheckPaidDurationInDays")
    @JsonProperty("CheckPaidDurationInDays")
    @Nullable
    @ODataField(odataName = "CheckPaidDurationInDays")
    private BigDecimal checkPaidDurationInDays;
    /**
     * Use with available fluent helpers to apply the <b>CheckPaidDurationInDays</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<BigDecimal> CHECK_PAID_DURATION_IN_DAYS = new SupplierCompanyField<BigDecimal>("CheckPaidDurationInDays");
    /**
     * Constraints: Not nullable, Precision: 14, Scale: 3 <p>Original property name from the Odata EDM: <b>BillOfExchLmtAmtInCoCodeCrcy</b></p>
     * 
     * @param billOfExchLmtAmtInCoCodeCrcy
     *     
     * @return
     *     Bill of Exchange Limit (in Local Currency)
     */
    @SerializedName("BillOfExchLmtAmtInCoCodeCrcy")
    @JsonProperty("BillOfExchLmtAmtInCoCodeCrcy")
    @Nullable
    @ODataField(odataName = "BillOfExchLmtAmtInCoCodeCrcy")
    private BigDecimal billOfExchLmtAmtInCoCodeCrcy;
    /**
     * Use with available fluent helpers to apply the <b>BillOfExchLmtAmtInCoCodeCrcy</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<BigDecimal> BILL_OF_EXCH_LMT_AMT_IN_CO_CODE_CRCY = new SupplierCompanyField<BigDecimal>("BillOfExchLmtAmtInCoCodeCrcy");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>SupplierClerkIDBySupplier</b></p>
     * 
     * @param supplierClerkIDBySupplier
     *     
     * @return
     *     Our account number with the vendor
     */
    @SerializedName("SupplierClerkIDBySupplier")
    @JsonProperty("SupplierClerkIDBySupplier")
    @Nullable
    @ODataField(odataName = "SupplierClerkIDBySupplier")
    private String supplierClerkIDBySupplier;
    /**
     * Use with available fluent helpers to apply the <b>SupplierClerkIDBySupplier</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_CLERK_ID_BY_SUPPLIER = new SupplierCompanyField<String>("SupplierClerkIDBySupplier");
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
    public final static SupplierCompanyField<String> RECONCILIATION_ACCOUNT = new SupplierCompanyField<String>("ReconciliationAccount");
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
    public final static SupplierCompanyField<String> INTEREST_CALCULATION_CODE = new SupplierCompanyField<String>("InterestCalculationCode");
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
    public final static SupplierCompanyField<LocalDateTime> INTEREST_CALCULATION_DATE = new SupplierCompanyField<LocalDateTime>("InterestCalculationDate");
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
    public final static SupplierCompanyField<String> INTRST_CALC_FREQUENCY_IN_MONTHS = new SupplierCompanyField<String>("IntrstCalcFrequencyInMonths");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SupplierHeadOffice</b></p>
     * 
     * @param supplierHeadOffice
     *     
     * @return
     *     Head office account number
     */
    @SerializedName("SupplierHeadOffice")
    @JsonProperty("SupplierHeadOffice")
    @Nullable
    @ODataField(odataName = "SupplierHeadOffice")
    private String supplierHeadOffice;
    /**
     * Use with available fluent helpers to apply the <b>SupplierHeadOffice</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_HEAD_OFFICE = new SupplierCompanyField<String>("SupplierHeadOffice");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayee</b></p>
     * 
     * @param alternativePayee
     *     
     * @return
     *     Account number of the alternative payee
     */
    @SerializedName("AlternativePayee")
    @JsonProperty("AlternativePayee")
    @Nullable
    @ODataField(odataName = "AlternativePayee")
    private String alternativePayee;
    /**
     * Use with available fluent helpers to apply the <b>AlternativePayee</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> ALTERNATIVE_PAYEE = new SupplierCompanyField<String>("AlternativePayee");
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
    public final static SupplierCompanyField<String> LAYOUT_SORTING_RULE = new SupplierCompanyField<String>("LayoutSortingRule");
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
    public final static SupplierCompanyField<String> APAR_TOLERANCE_GROUP = new SupplierCompanyField<String>("APARToleranceGroup");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SupplierCertificationDate</b></p>
     * 
     * @param supplierCertificationDate
     *     
     * @return
     *     Certification date
     */
    @SerializedName("SupplierCertificationDate")
    @JsonProperty("SupplierCertificationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "SupplierCertificationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime supplierCertificationDate;
    /**
     * Use with available fluent helpers to apply the <b>SupplierCertificationDate</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<LocalDateTime> SUPPLIER_CERTIFICATION_DATE = new SupplierCompanyField<LocalDateTime>("SupplierCertificationDate");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SupplierAccountNote</b></p>
     * 
     * @param supplierAccountNote
     *     
     * @return
     *     Memo
     */
    @SerializedName("SupplierAccountNote")
    @JsonProperty("SupplierAccountNote")
    @Nullable
    @ODataField(odataName = "SupplierAccountNote")
    private String supplierAccountNote;
    /**
     * Use with available fluent helpers to apply the <b>SupplierAccountNote</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_ACCOUNT_NOTE = new SupplierCompanyField<String>("SupplierAccountNote");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>WithholdingTaxCountry</b></p>
     * 
     * @param withholdingTaxCountry
     *     
     * @return
     *     Withholding Tax Country Key
     */
    @SerializedName("WithholdingTaxCountry")
    @JsonProperty("WithholdingTaxCountry")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCountry")
    private String withholdingTaxCountry;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCountry</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> WITHHOLDING_TAX_COUNTRY = new SupplierCompanyField<String>("WithholdingTaxCountry");
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
    public final static SupplierCompanyField<Boolean> DELETION_INDICATOR = new SupplierCompanyField<Boolean>("DeletionIndicator");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CashPlanningGroup</b></p>
     * 
     * @param cashPlanningGroup
     *     
     * @return
     *     Planning group
     */
    @SerializedName("CashPlanningGroup")
    @JsonProperty("CashPlanningGroup")
    @Nullable
    @ODataField(odataName = "CashPlanningGroup")
    private String cashPlanningGroup;
    /**
     * Use with available fluent helpers to apply the <b>CashPlanningGroup</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> CASH_PLANNING_GROUP = new SupplierCompanyField<String>("CashPlanningGroup");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsToBeCheckedForDuplicates</b></p>
     * 
     * @param isToBeCheckedForDuplicates
     *     
     * @return
     *     Check Flag for Double Invoices or Credit Memos
     */
    @SerializedName("IsToBeCheckedForDuplicates")
    @JsonProperty("IsToBeCheckedForDuplicates")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsToBeCheckedForDuplicates")
    private Boolean isToBeCheckedForDuplicates;
    /**
     * Use with available fluent helpers to apply the <b>IsToBeCheckedForDuplicates</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<Boolean> IS_TO_BE_CHECKED_FOR_DUPLICATES = new SupplierCompanyField<Boolean>("IsToBeCheckedForDuplicates");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplierAccountGroup</b></p>
     * 
     * @param supplierAccountGroup
     *     
     * @return
     *     Supplier Account Group
     */
    @SerializedName("SupplierAccountGroup")
    @JsonProperty("SupplierAccountGroup")
    @Nullable
    @ODataField(odataName = "SupplierAccountGroup")
    private String supplierAccountGroup;
    /**
     * Use with available fluent helpers to apply the <b>SupplierAccountGroup</b> field to query operations.
     * 
     */
    public final static SupplierCompanyField<String> SUPPLIER_ACCOUNT_GROUP = new SupplierCompanyField<String>("SupplierAccountGroup");
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
     * Navigation property <b>to_SupplierDunning</b> for <b>SupplierCompany</b> to multiple <b>SupplierDunning</b>.
     * 
     */
    @SerializedName("to_SupplierDunning")
    @JsonProperty("to_SupplierDunning")
    @ODataField(odataName = "to_SupplierDunning")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SupplierDunning> toSupplierDunning;
    /**
     * Navigation property <b>to_SupplierWithHoldingTax</b> for <b>SupplierCompany</b> to multiple <b>SupplierWithHoldingTax</b>.
     * 
     */
    @SerializedName("to_SupplierWithHoldingTax")
    @JsonProperty("to_SupplierWithHoldingTax")
    @ODataField(odataName = "to_SupplierWithHoldingTax")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SupplierWithHoldingTax> toSupplierWithHoldingTax;
    /**
     * Use with available fluent helpers to apply the <b>to_SupplierDunning</b> navigation property to query operations.
     * 
     */
    public final static SupplierCompanyLink<SupplierDunning> TO_SUPPLIER_DUNNING = new SupplierCompanyLink<SupplierDunning>("to_SupplierDunning");
    /**
     * Use with available fluent helpers to apply the <b>to_SupplierWithHoldingTax</b> navigation property to query operations.
     * 
     */
    public final static SupplierCompanyLink<SupplierWithHoldingTax> TO_SUPPLIER_WITH_HOLDING_TAX = new SupplierCompanyLink<SupplierWithHoldingTax>("to_SupplierWithHoldingTax");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SupplierCompany> getType() {
        return SupplierCompany.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     Account Number of Supplier
     */
    public void setSupplier(
        @Nullable
        final String supplier) {
        rememberChangedField("Supplier", this.supplier);
        this.supplier = supplier;
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
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>CompanyCodeName</b></p>
     * 
     * @param companyCodeName
     *     Name of Company Code or Company
     */
    public void setCompanyCodeName(
        @Nullable
        final String companyCodeName) {
        rememberChangedField("CompanyCodeName", this.companyCodeName);
        this.companyCodeName = companyCodeName;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>SupplierIsBlockedForPosting</b></p>
     * 
     * @param supplierIsBlockedForPosting
     *     Posting block for company code
     */
    public void setSupplierIsBlockedForPosting(
        @Nullable
        final Boolean supplierIsBlockedForPosting) {
        rememberChangedField("SupplierIsBlockedForPosting", this.supplierIsBlockedForPosting);
        this.supplierIsBlockedForPosting = supplierIsBlockedForPosting;
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
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>SupplierClerk</b></p>
     * 
     * @param supplierClerk
     *     Clerk at vendor
     */
    public void setSupplierClerk(
        @Nullable
        final String supplierClerk) {
        rememberChangedField("SupplierClerk", this.supplierClerk);
        this.supplierClerk = supplierClerk;
    }

    /**
     * Constraints: Not nullable, Maximum length: 130 <p>Original property name from the Odata EDM: <b>SupplierClerkURL</b></p>
     * 
     * @param supplierClerkURL
     *     Internet address of partner company clerk
     */
    public void setSupplierClerkURL(
        @Nullable
        final String supplierClerkURL) {
        rememberChangedField("SupplierClerkURL", this.supplierClerkURL);
        this.supplierClerkURL = supplierClerkURL;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>ClearCustomerSupplier</b></p>
     * 
     * @param clearCustomerSupplier
     *     Indicator: Clearing between customer and vendor?
     */
    public void setClearCustomerSupplier(
        @Nullable
        final Boolean clearCustomerSupplier) {
        rememberChangedField("ClearCustomerSupplier", this.clearCustomerSupplier);
        this.clearCustomerSupplier = clearCustomerSupplier;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaymentIsToBeSentByEDI</b></p>
     * 
     * @param paymentIsToBeSentByEDI
     *     Indicator: Send Payment Advices by EDI
     */
    public void setPaymentIsToBeSentByEDI(
        @Nullable
        final Boolean paymentIsToBeSentByEDI) {
        rememberChangedField("PaymentIsToBeSentByEDI", this.paymentIsToBeSentByEDI);
        this.paymentIsToBeSentByEDI = paymentIsToBeSentByEDI;
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
     * Constraints: Not nullable, Precision: 3, Scale: 0 <p>Original property name from the Odata EDM: <b>CheckPaidDurationInDays</b></p>
     * 
     * @param checkPaidDurationInDays
     *     Probable time until check is paid
     */
    public void setCheckPaidDurationInDays(
        @Nullable
        final BigDecimal checkPaidDurationInDays) {
        rememberChangedField("CheckPaidDurationInDays", this.checkPaidDurationInDays);
        this.checkPaidDurationInDays = checkPaidDurationInDays;
    }

    /**
     * Constraints: Not nullable, Precision: 14, Scale: 3 <p>Original property name from the Odata EDM: <b>BillOfExchLmtAmtInCoCodeCrcy</b></p>
     * 
     * @param billOfExchLmtAmtInCoCodeCrcy
     *     Bill of Exchange Limit (in Local Currency)
     */
    public void setBillOfExchLmtAmtInCoCodeCrcy(
        @Nullable
        final BigDecimal billOfExchLmtAmtInCoCodeCrcy) {
        rememberChangedField("BillOfExchLmtAmtInCoCodeCrcy", this.billOfExchLmtAmtInCoCodeCrcy);
        this.billOfExchLmtAmtInCoCodeCrcy = billOfExchLmtAmtInCoCodeCrcy;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>SupplierClerkIDBySupplier</b></p>
     * 
     * @param supplierClerkIDBySupplier
     *     Our account number with the vendor
     */
    public void setSupplierClerkIDBySupplier(
        @Nullable
        final String supplierClerkIDBySupplier) {
        rememberChangedField("SupplierClerkIDBySupplier", this.supplierClerkIDBySupplier);
        this.supplierClerkIDBySupplier = supplierClerkIDBySupplier;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SupplierHeadOffice</b></p>
     * 
     * @param supplierHeadOffice
     *     Head office account number
     */
    public void setSupplierHeadOffice(
        @Nullable
        final String supplierHeadOffice) {
        rememberChangedField("SupplierHeadOffice", this.supplierHeadOffice);
        this.supplierHeadOffice = supplierHeadOffice;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayee</b></p>
     * 
     * @param alternativePayee
     *     Account number of the alternative payee
     */
    public void setAlternativePayee(
        @Nullable
        final String alternativePayee) {
        rememberChangedField("AlternativePayee", this.alternativePayee);
        this.alternativePayee = alternativePayee;
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
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SupplierCertificationDate</b></p>
     * 
     * @param supplierCertificationDate
     *     Certification date
     */
    public void setSupplierCertificationDate(
        @Nullable
        final LocalDateTime supplierCertificationDate) {
        rememberChangedField("SupplierCertificationDate", this.supplierCertificationDate);
        this.supplierCertificationDate = supplierCertificationDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SupplierAccountNote</b></p>
     * 
     * @param supplierAccountNote
     *     Memo
     */
    public void setSupplierAccountNote(
        @Nullable
        final String supplierAccountNote) {
        rememberChangedField("SupplierAccountNote", this.supplierAccountNote);
        this.supplierAccountNote = supplierAccountNote;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>WithholdingTaxCountry</b></p>
     * 
     * @param withholdingTaxCountry
     *     Withholding Tax Country Key
     */
    public void setWithholdingTaxCountry(
        @Nullable
        final String withholdingTaxCountry) {
        rememberChangedField("WithholdingTaxCountry", this.withholdingTaxCountry);
        this.withholdingTaxCountry = withholdingTaxCountry;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CashPlanningGroup</b></p>
     * 
     * @param cashPlanningGroup
     *     Planning group
     */
    public void setCashPlanningGroup(
        @Nullable
        final String cashPlanningGroup) {
        rememberChangedField("CashPlanningGroup", this.cashPlanningGroup);
        this.cashPlanningGroup = cashPlanningGroup;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsToBeCheckedForDuplicates</b></p>
     * 
     * @param isToBeCheckedForDuplicates
     *     Check Flag for Double Invoices or Credit Memos
     */
    public void setIsToBeCheckedForDuplicates(
        @Nullable
        final Boolean isToBeCheckedForDuplicates) {
        rememberChangedField("IsToBeCheckedForDuplicates", this.isToBeCheckedForDuplicates);
        this.isToBeCheckedForDuplicates = isToBeCheckedForDuplicates;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplierAccountGroup</b></p>
     * 
     * @param supplierAccountGroup
     *     Supplier Account Group
     */
    public void setSupplierAccountGroup(
        @Nullable
        final String supplierAccountGroup) {
        rememberChangedField("SupplierAccountGroup", this.supplierAccountGroup);
        this.supplierAccountGroup = supplierAccountGroup;
    }

    @Override
    protected String getEntityCollection() {
        return "A_SupplierCompany";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("CompanyCode", getCompanyCode());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("CompanyCode", getCompanyCode());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("CompanyCodeName", getCompanyCodeName());
        values.put("PaymentBlockingReason", getPaymentBlockingReason());
        values.put("SupplierIsBlockedForPosting", getSupplierIsBlockedForPosting());
        values.put("AccountingClerk", getAccountingClerk());
        values.put("AccountingClerkFaxNumber", getAccountingClerkFaxNumber());
        values.put("AccountingClerkPhoneNumber", getAccountingClerkPhoneNumber());
        values.put("SupplierClerk", getSupplierClerk());
        values.put("SupplierClerkURL", getSupplierClerkURL());
        values.put("PaymentMethodsList", getPaymentMethodsList());
        values.put("PaymentTerms", getPaymentTerms());
        values.put("ClearCustomerSupplier", getClearCustomerSupplier());
        values.put("IsToBeLocallyProcessed", getIsToBeLocallyProcessed());
        values.put("ItemIsToBePaidSeparately", getItemIsToBePaidSeparately());
        values.put("PaymentIsToBeSentByEDI", getPaymentIsToBeSentByEDI());
        values.put("HouseBank", getHouseBank());
        values.put("CheckPaidDurationInDays", getCheckPaidDurationInDays());
        values.put("BillOfExchLmtAmtInCoCodeCrcy", getBillOfExchLmtAmtInCoCodeCrcy());
        values.put("SupplierClerkIDBySupplier", getSupplierClerkIDBySupplier());
        values.put("ReconciliationAccount", getReconciliationAccount());
        values.put("InterestCalculationCode", getInterestCalculationCode());
        values.put("InterestCalculationDate", getInterestCalculationDate());
        values.put("IntrstCalcFrequencyInMonths", getIntrstCalcFrequencyInMonths());
        values.put("SupplierHeadOffice", getSupplierHeadOffice());
        values.put("AlternativePayee", getAlternativePayee());
        values.put("LayoutSortingRule", getLayoutSortingRule());
        values.put("APARToleranceGroup", getAPARToleranceGroup());
        values.put("SupplierCertificationDate", getSupplierCertificationDate());
        values.put("SupplierAccountNote", getSupplierAccountNote());
        values.put("WithholdingTaxCountry", getWithholdingTaxCountry());
        values.put("DeletionIndicator", getDeletionIndicator());
        values.put("CashPlanningGroup", getCashPlanningGroup());
        values.put("IsToBeCheckedForDuplicates", getIsToBeCheckedForDuplicates());
        values.put("SupplierAccountGroup", getSupplierAccountGroup());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
                }
            }
            if (values.containsKey("CompanyCodeName")) {
                final Object value = values.remove("CompanyCodeName");
                if ((value == null)||(!value.equals(getCompanyCodeName()))) {
                    setCompanyCodeName(((String) value));
                }
            }
            if (values.containsKey("PaymentBlockingReason")) {
                final Object value = values.remove("PaymentBlockingReason");
                if ((value == null)||(!value.equals(getPaymentBlockingReason()))) {
                    setPaymentBlockingReason(((String) value));
                }
            }
            if (values.containsKey("SupplierIsBlockedForPosting")) {
                final Object value = values.remove("SupplierIsBlockedForPosting");
                if ((value == null)||(!value.equals(getSupplierIsBlockedForPosting()))) {
                    setSupplierIsBlockedForPosting(((Boolean) value));
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
            if (values.containsKey("AccountingClerkPhoneNumber")) {
                final Object value = values.remove("AccountingClerkPhoneNumber");
                if ((value == null)||(!value.equals(getAccountingClerkPhoneNumber()))) {
                    setAccountingClerkPhoneNumber(((String) value));
                }
            }
            if (values.containsKey("SupplierClerk")) {
                final Object value = values.remove("SupplierClerk");
                if ((value == null)||(!value.equals(getSupplierClerk()))) {
                    setSupplierClerk(((String) value));
                }
            }
            if (values.containsKey("SupplierClerkURL")) {
                final Object value = values.remove("SupplierClerkURL");
                if ((value == null)||(!value.equals(getSupplierClerkURL()))) {
                    setSupplierClerkURL(((String) value));
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
            if (values.containsKey("ClearCustomerSupplier")) {
                final Object value = values.remove("ClearCustomerSupplier");
                if ((value == null)||(!value.equals(getClearCustomerSupplier()))) {
                    setClearCustomerSupplier(((Boolean) value));
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
            if (values.containsKey("PaymentIsToBeSentByEDI")) {
                final Object value = values.remove("PaymentIsToBeSentByEDI");
                if ((value == null)||(!value.equals(getPaymentIsToBeSentByEDI()))) {
                    setPaymentIsToBeSentByEDI(((Boolean) value));
                }
            }
            if (values.containsKey("HouseBank")) {
                final Object value = values.remove("HouseBank");
                if ((value == null)||(!value.equals(getHouseBank()))) {
                    setHouseBank(((String) value));
                }
            }
            if (values.containsKey("CheckPaidDurationInDays")) {
                final Object value = values.remove("CheckPaidDurationInDays");
                if ((value == null)||(!value.equals(getCheckPaidDurationInDays()))) {
                    setCheckPaidDurationInDays(((BigDecimal) value));
                }
            }
            if (values.containsKey("BillOfExchLmtAmtInCoCodeCrcy")) {
                final Object value = values.remove("BillOfExchLmtAmtInCoCodeCrcy");
                if ((value == null)||(!value.equals(getBillOfExchLmtAmtInCoCodeCrcy()))) {
                    setBillOfExchLmtAmtInCoCodeCrcy(((BigDecimal) value));
                }
            }
            if (values.containsKey("SupplierClerkIDBySupplier")) {
                final Object value = values.remove("SupplierClerkIDBySupplier");
                if ((value == null)||(!value.equals(getSupplierClerkIDBySupplier()))) {
                    setSupplierClerkIDBySupplier(((String) value));
                }
            }
            if (values.containsKey("ReconciliationAccount")) {
                final Object value = values.remove("ReconciliationAccount");
                if ((value == null)||(!value.equals(getReconciliationAccount()))) {
                    setReconciliationAccount(((String) value));
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
            if (values.containsKey("SupplierHeadOffice")) {
                final Object value = values.remove("SupplierHeadOffice");
                if ((value == null)||(!value.equals(getSupplierHeadOffice()))) {
                    setSupplierHeadOffice(((String) value));
                }
            }
            if (values.containsKey("AlternativePayee")) {
                final Object value = values.remove("AlternativePayee");
                if ((value == null)||(!value.equals(getAlternativePayee()))) {
                    setAlternativePayee(((String) value));
                }
            }
            if (values.containsKey("LayoutSortingRule")) {
                final Object value = values.remove("LayoutSortingRule");
                if ((value == null)||(!value.equals(getLayoutSortingRule()))) {
                    setLayoutSortingRule(((String) value));
                }
            }
            if (values.containsKey("APARToleranceGroup")) {
                final Object value = values.remove("APARToleranceGroup");
                if ((value == null)||(!value.equals(getAPARToleranceGroup()))) {
                    setAPARToleranceGroup(((String) value));
                }
            }
            if (values.containsKey("SupplierCertificationDate")) {
                final Object value = values.remove("SupplierCertificationDate");
                if ((value == null)||(!value.equals(getSupplierCertificationDate()))) {
                    setSupplierCertificationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("SupplierAccountNote")) {
                final Object value = values.remove("SupplierAccountNote");
                if ((value == null)||(!value.equals(getSupplierAccountNote()))) {
                    setSupplierAccountNote(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCountry")) {
                final Object value = values.remove("WithholdingTaxCountry");
                if ((value == null)||(!value.equals(getWithholdingTaxCountry()))) {
                    setWithholdingTaxCountry(((String) value));
                }
            }
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
                }
            }
            if (values.containsKey("CashPlanningGroup")) {
                final Object value = values.remove("CashPlanningGroup");
                if ((value == null)||(!value.equals(getCashPlanningGroup()))) {
                    setCashPlanningGroup(((String) value));
                }
            }
            if (values.containsKey("IsToBeCheckedForDuplicates")) {
                final Object value = values.remove("IsToBeCheckedForDuplicates");
                if ((value == null)||(!value.equals(getIsToBeCheckedForDuplicates()))) {
                    setIsToBeCheckedForDuplicates(((Boolean) value));
                }
            }
            if (values.containsKey("SupplierAccountGroup")) {
                final Object value = values.remove("SupplierAccountGroup");
                if ((value == null)||(!value.equals(getSupplierAccountGroup()))) {
                    setSupplierAccountGroup(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_SupplierDunning")) {
                final Object value = (values).remove("to_SupplierDunning");
                if (value instanceof Iterable) {
                    if (toSupplierDunning == null) {
                        toSupplierDunning = Lists.newArrayList();
                    } else {
                        toSupplierDunning = Lists.newArrayList(toSupplierDunning);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SupplierDunning entity;
                        if (toSupplierDunning.size()>i) {
                            entity = toSupplierDunning.get(i);
                        } else {
                            entity = new SupplierDunning();
                            toSupplierDunning.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_SupplierWithHoldingTax")) {
                final Object value = (values).remove("to_SupplierWithHoldingTax");
                if (value instanceof Iterable) {
                    if (toSupplierWithHoldingTax == null) {
                        toSupplierWithHoldingTax = Lists.newArrayList();
                    } else {
                        toSupplierWithHoldingTax = Lists.newArrayList(toSupplierWithHoldingTax);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SupplierWithHoldingTax entity;
                        if (toSupplierWithHoldingTax.size()>i) {
                            entity = toSupplierWithHoldingTax.get(i);
                        } else {
                            entity = new SupplierWithHoldingTax();
                            toSupplierWithHoldingTax.add(entity);
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
    public static<T >SupplierCompanyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierCompanyField<T>(fieldName);
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
    public static<T,DomainT >SupplierCompanyField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierCompanyField<T>(fieldName, typeConverter);
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
        if (toSupplierDunning!= null) {
            (values).put("to_SupplierDunning", toSupplierDunning);
        }
        if (toSupplierWithHoldingTax!= null) {
            (values).put("to_SupplierWithHoldingTax", toSupplierWithHoldingTax);
        }
        return values;
    }

    /**
     * Fetches the <b>SupplierDunning</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SupplierDunning</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SupplierDunning</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierDunning> fetchSupplierDunning()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SupplierDunning.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Supplier=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(supplier));
        odataResourceUrl.append(",CompanyCode=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(companyCode));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SupplierDunning");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SupplierDunning> entityList = result.asList(SupplierDunning.class);
        for (SupplierDunning entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SupplierDunning</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierDunning</b>.
     * <p>
     * If the navigation property <b>to_SupplierDunning</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SupplierDunning</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierDunning> getSupplierDunningOrFetch()
        throws ODataException
    {
        if (toSupplierDunning == null) {
            toSupplierDunning = fetchSupplierDunning();
        }
        return toSupplierDunning;
    }

    /**
     * Retrieval of associated <b>SupplierDunning</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierDunning</b>.
     * <p>
     * If the navigation property for an entity <b>SupplierCompany</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SupplierDunning</b> is already loaded, the result will contain the <b>SupplierDunning</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SupplierDunning>> getSupplierDunningIfPresent() {
        return Optional.ofNullable(toSupplierDunning);
    }

    /**
     * Overwrites the list of associated <b>SupplierDunning</b> entities for the loaded navigation property <b>to_SupplierDunning</b>.
     * <p>
     * If the navigation property <b>to_SupplierDunning</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SupplierDunning</b> entities.
     */
    public void setSupplierDunning(
        @Nonnull
        final List<SupplierDunning> value) {
        if (toSupplierDunning == null) {
            toSupplierDunning = Lists.newArrayList();
        }
        toSupplierDunning.clear();
        toSupplierDunning.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SupplierDunning</b> entities. This corresponds to the OData navigation property <b>to_SupplierDunning</b>.
     * <p>
     * If the navigation property <b>to_SupplierDunning</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SupplierDunning</b> entities.
     */
    public void addSupplierDunning(SupplierDunning... entity) {
        if (toSupplierDunning == null) {
            toSupplierDunning = Lists.newArrayList();
        }
        toSupplierDunning.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SupplierWithHoldingTax</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SupplierWithHoldingTax</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SupplierWithHoldingTax</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierWithHoldingTax> fetchSupplierWithHoldingTax()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SupplierWithHoldingTax.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Supplier=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(supplier));
        odataResourceUrl.append(",CompanyCode=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(companyCode));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SupplierWithHoldingTax");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SupplierWithHoldingTax> entityList = result.asList(SupplierWithHoldingTax.class);
        for (SupplierWithHoldingTax entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SupplierWithHoldingTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierWithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_SupplierWithHoldingTax</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SupplierWithHoldingTax</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierWithHoldingTax> getSupplierWithHoldingTaxOrFetch()
        throws ODataException
    {
        if (toSupplierWithHoldingTax == null) {
            toSupplierWithHoldingTax = fetchSupplierWithHoldingTax();
        }
        return toSupplierWithHoldingTax;
    }

    /**
     * Retrieval of associated <b>SupplierWithHoldingTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierWithHoldingTax</b>.
     * <p>
     * If the navigation property for an entity <b>SupplierCompany</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SupplierWithHoldingTax</b> is already loaded, the result will contain the <b>SupplierWithHoldingTax</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SupplierWithHoldingTax>> getSupplierWithHoldingTaxIfPresent() {
        return Optional.ofNullable(toSupplierWithHoldingTax);
    }

    /**
     * Overwrites the list of associated <b>SupplierWithHoldingTax</b> entities for the loaded navigation property <b>to_SupplierWithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_SupplierWithHoldingTax</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SupplierWithHoldingTax</b> entities.
     */
    public void setSupplierWithHoldingTax(
        @Nonnull
        final List<SupplierWithHoldingTax> value) {
        if (toSupplierWithHoldingTax == null) {
            toSupplierWithHoldingTax = Lists.newArrayList();
        }
        toSupplierWithHoldingTax.clear();
        toSupplierWithHoldingTax.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SupplierWithHoldingTax</b> entities. This corresponds to the OData navigation property <b>to_SupplierWithHoldingTax</b>.
     * <p>
     * If the navigation property <b>to_SupplierWithHoldingTax</b> of a queried <b>SupplierCompany</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SupplierWithHoldingTax</b> entities.
     */
    public void addSupplierWithHoldingTax(SupplierWithHoldingTax... entity) {
        if (toSupplierWithHoldingTax == null) {
            toSupplierWithHoldingTax = Lists.newArrayList();
        }
        toSupplierWithHoldingTax.addAll(Lists.newArrayList(entity));
    }

    public final static class SupplierCompanyBuilder {

        private List<SupplierDunning> toSupplierDunning = Lists.newArrayList();
        private List<SupplierWithHoldingTax> toSupplierWithHoldingTax = Lists.newArrayList();

        private SupplierCompany.SupplierCompanyBuilder toSupplierDunning(List<SupplierDunning> value) {
            toSupplierDunning.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SupplierDunning</b> for <b>SupplierCompany</b> to multiple <b>SupplierDunning</b>.
         * 
         */
        @Nonnull
        public SupplierCompany.SupplierCompanyBuilder supplierDunning(SupplierDunning... value) {
            return toSupplierDunning(Lists.newArrayList(value));
        }

        private SupplierCompany.SupplierCompanyBuilder toSupplierWithHoldingTax(List<SupplierWithHoldingTax> value) {
            toSupplierWithHoldingTax.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SupplierWithHoldingTax</b> for <b>SupplierCompany</b> to multiple <b>SupplierWithHoldingTax</b>.
         * 
         */
        @Nonnull
        public SupplierCompany.SupplierCompanyBuilder supplierWithHoldingTax(SupplierWithHoldingTax... value) {
            return toSupplierWithHoldingTax(Lists.newArrayList(value));
        }

    }

}
