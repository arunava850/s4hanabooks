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
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerField;
import vdm.namespaces.odataserviceforbusinesspartner.link.CustomerLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSelectable;


/**
 * Customer<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Customer
    extends VdmEntity<Customer>
{

    /**
     * Selector for all available fields of Customer.
     * 
     */
    public final static CustomerSelectable ALL_FIELDS = new CustomerSelectable() {


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
    public final static CustomerField<String> CUSTOMER = new CustomerField<String>("Customer");
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
    public final static CustomerField<String> AUTHORIZATION_GROUP = new CustomerField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BillingIsBlockedForCustomer</b></p>
     * 
     * @param billingIsBlockedForCustomer
     *     
     * @return
     *     Central Billing Block for Customer
     */
    @SerializedName("BillingIsBlockedForCustomer")
    @JsonProperty("BillingIsBlockedForCustomer")
    @Nullable
    @ODataField(odataName = "BillingIsBlockedForCustomer")
    private String billingIsBlockedForCustomer;
    /**
     * Use with available fluent helpers to apply the <b>BillingIsBlockedForCustomer</b> field to query operations.
     * 
     */
    public final static CustomerField<String> BILLING_IS_BLOCKED_FOR_CUSTOMER = new CustomerField<String>("BillingIsBlockedForCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     
     * @return
     *     Name of Person who Created the Object
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    @ODataField(odataName = "CreatedByUser")
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static CustomerField<String> CREATED_BY_USER = new CustomerField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     
     * @return
     *     Date on which the Record Was Created
     */
    @SerializedName("CreationDate")
    @JsonProperty("CreationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CreationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime creationDate;
    /**
     * Use with available fluent helpers to apply the <b>CreationDate</b> field to query operations.
     * 
     */
    public final static CustomerField<LocalDateTime> CREATION_DATE = new CustomerField<LocalDateTime>("CreationDate");
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
    public final static CustomerField<String> CUSTOMER_ACCOUNT_GROUP = new CustomerField<String>("CustomerAccountGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerClassification</b></p>
     * 
     * @param customerClassification
     *     
     * @return
     *     Customer Classification
     */
    @SerializedName("CustomerClassification")
    @JsonProperty("CustomerClassification")
    @Nullable
    @ODataField(odataName = "CustomerClassification")
    private String customerClassification;
    /**
     * Use with available fluent helpers to apply the <b>CustomerClassification</b> field to query operations.
     * 
     */
    public final static CustomerField<String> CUSTOMER_CLASSIFICATION = new CustomerField<String>("CustomerClassification");
    /**
     * Constraints: Not nullable, Maximum length: 220 <p>Original property name from the Odata EDM: <b>CustomerFullName</b></p>
     * 
     * @param customerFullName
     *     
     * @return
     *     Customer Full Name
     */
    @SerializedName("CustomerFullName")
    @JsonProperty("CustomerFullName")
    @Nullable
    @ODataField(odataName = "CustomerFullName")
    private String customerFullName;
    /**
     * Use with available fluent helpers to apply the <b>CustomerFullName</b> field to query operations.
     * 
     */
    public final static CustomerField<String> CUSTOMER_FULL_NAME = new CustomerField<String>("CustomerFullName");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CustomerName</b></p>
     * 
     * @param customerName
     *     
     * @return
     *     Name of Customer
     */
    @SerializedName("CustomerName")
    @JsonProperty("CustomerName")
    @Nullable
    @ODataField(odataName = "CustomerName")
    private String customerName;
    /**
     * Use with available fluent helpers to apply the <b>CustomerName</b> field to query operations.
     * 
     */
    public final static CustomerField<String> CUSTOMER_NAME = new CustomerField<String>("CustomerName");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlocked</b></p>
     * 
     * @param deliveryIsBlocked
     *     
     * @return
     *     Central delivery block for the customer
     */
    @SerializedName("DeliveryIsBlocked")
    @JsonProperty("DeliveryIsBlocked")
    @Nullable
    @ODataField(odataName = "DeliveryIsBlocked")
    private String deliveryIsBlocked;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryIsBlocked</b> field to query operations.
     * 
     */
    public final static CustomerField<String> DELIVERY_IS_BLOCKED = new CustomerField<String>("DeliveryIsBlocked");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>NFPartnerIsNaturalPerson</b></p>
     * 
     * @param nFPartnerIsNaturalPerson
     *     
     * @return
     *     Natural Person
     */
    @SerializedName("NFPartnerIsNaturalPerson")
    @JsonProperty("NFPartnerIsNaturalPerson")
    @Nullable
    @ODataField(odataName = "NFPartnerIsNaturalPerson")
    private String nFPartnerIsNaturalPerson;
    /**
     * Use with available fluent helpers to apply the <b>NFPartnerIsNaturalPerson</b> field to query operations.
     * 
     */
    public final static CustomerField<String> NF_PARTNER_IS_NATURAL_PERSON = new CustomerField<String>("NFPartnerIsNaturalPerson");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OrderIsBlockedForCustomer</b></p>
     * 
     * @param orderIsBlockedForCustomer
     *     
     * @return
     *     Central Order Block for Customer
     */
    @SerializedName("OrderIsBlockedForCustomer")
    @JsonProperty("OrderIsBlockedForCustomer")
    @Nullable
    @ODataField(odataName = "OrderIsBlockedForCustomer")
    private String orderIsBlockedForCustomer;
    /**
     * Use with available fluent helpers to apply the <b>OrderIsBlockedForCustomer</b> field to query operations.
     * 
     */
    public final static CustomerField<String> ORDER_IS_BLOCKED_FOR_CUSTOMER = new CustomerField<String>("OrderIsBlockedForCustomer");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PostingIsBlocked</b></p>
     * 
     * @param postingIsBlocked
     *     
     * @return
     *     Central Posting Block
     */
    @SerializedName("PostingIsBlocked")
    @JsonProperty("PostingIsBlocked")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PostingIsBlocked")
    private Boolean postingIsBlocked;
    /**
     * Use with available fluent helpers to apply the <b>PostingIsBlocked</b> field to query operations.
     * 
     */
    public final static CustomerField<Boolean> POSTING_IS_BLOCKED = new CustomerField<Boolean>("PostingIsBlocked");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     
     * @return
     *     Account Number of Supplier
     */
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static CustomerField<String> SUPPLIER = new CustomerField<String>("Supplier");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CustomerCorporateGroup</b></p>
     * 
     * @param customerCorporateGroup
     *     
     * @return
     *     Group Key
     */
    @SerializedName("CustomerCorporateGroup")
    @JsonProperty("CustomerCorporateGroup")
    @Nullable
    @ODataField(odataName = "CustomerCorporateGroup")
    private String customerCorporateGroup;
    /**
     * Use with available fluent helpers to apply the <b>CustomerCorporateGroup</b> field to query operations.
     * 
     */
    public final static CustomerField<String> CUSTOMER_CORPORATE_GROUP = new CustomerField<String>("CustomerCorporateGroup");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FiscalAddress</b></p>
     * 
     * @param fiscalAddress
     *     
     * @return
     *     Account number of the master record with the fiscal address
     */
    @SerializedName("FiscalAddress")
    @JsonProperty("FiscalAddress")
    @Nullable
    @ODataField(odataName = "FiscalAddress")
    private String fiscalAddress;
    /**
     * Use with available fluent helpers to apply the <b>FiscalAddress</b> field to query operations.
     * 
     */
    public final static CustomerField<String> FISCAL_ADDRESS = new CustomerField<String>("FiscalAddress");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Industry</b></p>
     * 
     * @param industry
     *     
     * @return
     *     Industry key
     */
    @SerializedName("Industry")
    @JsonProperty("Industry")
    @Nullable
    @ODataField(odataName = "Industry")
    private String industry;
    /**
     * Use with available fluent helpers to apply the <b>Industry</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY = new CustomerField<String>("Industry");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode1</b></p>
     * 
     * @param industryCode1
     *     
     * @return
     *     Industry Code 1
     */
    @SerializedName("IndustryCode1")
    @JsonProperty("IndustryCode1")
    @Nullable
    @ODataField(odataName = "IndustryCode1")
    private String industryCode1;
    /**
     * Use with available fluent helpers to apply the <b>IndustryCode1</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY_CODE1 = new CustomerField<String>("IndustryCode1");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode2</b></p>
     * 
     * @param industryCode2
     *     
     * @return
     *     Industry Code 2
     */
    @SerializedName("IndustryCode2")
    @JsonProperty("IndustryCode2")
    @Nullable
    @ODataField(odataName = "IndustryCode2")
    private String industryCode2;
    /**
     * Use with available fluent helpers to apply the <b>IndustryCode2</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY_CODE2 = new CustomerField<String>("IndustryCode2");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode3</b></p>
     * 
     * @param industryCode3
     *     
     * @return
     *     Industry Code 3
     */
    @SerializedName("IndustryCode3")
    @JsonProperty("IndustryCode3")
    @Nullable
    @ODataField(odataName = "IndustryCode3")
    private String industryCode3;
    /**
     * Use with available fluent helpers to apply the <b>IndustryCode3</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY_CODE3 = new CustomerField<String>("IndustryCode3");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode4</b></p>
     * 
     * @param industryCode4
     *     
     * @return
     *     Industry Code 4
     */
    @SerializedName("IndustryCode4")
    @JsonProperty("IndustryCode4")
    @Nullable
    @ODataField(odataName = "IndustryCode4")
    private String industryCode4;
    /**
     * Use with available fluent helpers to apply the <b>IndustryCode4</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY_CODE4 = new CustomerField<String>("IndustryCode4");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode5</b></p>
     * 
     * @param industryCode5
     *     
     * @return
     *     Industry Code 5
     */
    @SerializedName("IndustryCode5")
    @JsonProperty("IndustryCode5")
    @Nullable
    @ODataField(odataName = "IndustryCode5")
    private String industryCode5;
    /**
     * Use with available fluent helpers to apply the <b>IndustryCode5</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INDUSTRY_CODE5 = new CustomerField<String>("IndustryCode5");
    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @param internationalLocationNumber1
     *     
     * @return
     *     International location number  (part 1)
     */
    @SerializedName("InternationalLocationNumber1")
    @JsonProperty("InternationalLocationNumber1")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber1")
    private String internationalLocationNumber1;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber1</b> field to query operations.
     * 
     */
    public final static CustomerField<String> INTERNATIONAL_LOCATION_NUMBER1 = new CustomerField<String>("InternationalLocationNumber1");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>NielsenRegion</b></p>
     * 
     * @param nielsenRegion
     *     
     * @return
     *     Nielsen ID
     */
    @SerializedName("NielsenRegion")
    @JsonProperty("NielsenRegion")
    @Nullable
    @ODataField(odataName = "NielsenRegion")
    private String nielsenRegion;
    /**
     * Use with available fluent helpers to apply the <b>NielsenRegion</b> field to query operations.
     * 
     */
    public final static CustomerField<String> NIELSEN_REGION = new CustomerField<String>("NielsenRegion");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ResponsibleType</b></p>
     * 
     * @param responsibleType
     *     
     * @return
     *     Tax type
     */
    @SerializedName("ResponsibleType")
    @JsonProperty("ResponsibleType")
    @Nullable
    @ODataField(odataName = "ResponsibleType")
    private String responsibleType;
    /**
     * Use with available fluent helpers to apply the <b>ResponsibleType</b> field to query operations.
     * 
     */
    public final static CustomerField<String> RESPONSIBLE_TYPE = new CustomerField<String>("ResponsibleType");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>TaxNumber1</b></p>
     * 
     * @param taxNumber1
     *     
     * @return
     *     Tax Number 1
     */
    @SerializedName("TaxNumber1")
    @JsonProperty("TaxNumber1")
    @Nullable
    @ODataField(odataName = "TaxNumber1")
    private String taxNumber1;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumber1</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER1 = new CustomerField<String>("TaxNumber1");
    /**
     * Constraints: Not nullable, Maximum length: 11 <p>Original property name from the Odata EDM: <b>TaxNumber2</b></p>
     * 
     * @param taxNumber2
     *     
     * @return
     *     Tax Number 2
     */
    @SerializedName("TaxNumber2")
    @JsonProperty("TaxNumber2")
    @Nullable
    @ODataField(odataName = "TaxNumber2")
    private String taxNumber2;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumber2</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER2 = new CustomerField<String>("TaxNumber2");
    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumber3</b></p>
     * 
     * @param taxNumber3
     *     
     * @return
     *     Tax Number 3
     */
    @SerializedName("TaxNumber3")
    @JsonProperty("TaxNumber3")
    @Nullable
    @ODataField(odataName = "TaxNumber3")
    private String taxNumber3;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumber3</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER3 = new CustomerField<String>("TaxNumber3");
    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumber4</b></p>
     * 
     * @param taxNumber4
     *     
     * @return
     *     Tax Number 4
     */
    @SerializedName("TaxNumber4")
    @JsonProperty("TaxNumber4")
    @Nullable
    @ODataField(odataName = "TaxNumber4")
    private String taxNumber4;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumber4</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER4 = new CustomerField<String>("TaxNumber4");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TaxNumber5</b></p>
     * 
     * @param taxNumber5
     *     
     * @return
     *     Tax Number 5
     */
    @SerializedName("TaxNumber5")
    @JsonProperty("TaxNumber5")
    @Nullable
    @ODataField(odataName = "TaxNumber5")
    private String taxNumber5;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumber5</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER5 = new CustomerField<String>("TaxNumber5");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TaxNumberType</b></p>
     * 
     * @param taxNumberType
     *     
     * @return
     *     Tax Number Type
     */
    @SerializedName("TaxNumberType")
    @JsonProperty("TaxNumberType")
    @Nullable
    @ODataField(odataName = "TaxNumberType")
    private String taxNumberType;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumberType</b> field to query operations.
     * 
     */
    public final static CustomerField<String> TAX_NUMBER_TYPE = new CustomerField<String>("TaxNumberType");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>VATRegistration</b></p>
     * 
     * @param vATRegistration
     *     
     * @return
     *     VAT Registration Number
     */
    @SerializedName("VATRegistration")
    @JsonProperty("VATRegistration")
    @Nullable
    @ODataField(odataName = "VATRegistration")
    private String vATRegistration;
    /**
     * Use with available fluent helpers to apply the <b>VATRegistration</b> field to query operations.
     * 
     */
    public final static CustomerField<String> VAT_REGISTRATION = new CustomerField<String>("VATRegistration");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     
     * @return
     *     Central Deletion Flag for Master Record
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
    public final static CustomerField<Boolean> DELETION_INDICATOR = new CustomerField<Boolean>("DeletionIndicator");
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
     * Navigation property <b>to_CustomerCompany</b> for <b>Customer</b> to multiple <b>CustomerCompany</b>.
     * 
     */
    @SerializedName("to_CustomerCompany")
    @JsonProperty("to_CustomerCompany")
    @ODataField(odataName = "to_CustomerCompany")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustomerCompany> toCustomerCompany;
    /**
     * Navigation property <b>to_CustomerSalesArea</b> for <b>Customer</b> to multiple <b>CustomerSalesArea</b>.
     * 
     */
    @SerializedName("to_CustomerSalesArea")
    @JsonProperty("to_CustomerSalesArea")
    @ODataField(odataName = "to_CustomerSalesArea")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustomerSalesArea> toCustomerSalesArea;
    /**
     * Use with available fluent helpers to apply the <b>to_CustomerCompany</b> navigation property to query operations.
     * 
     */
    public final static CustomerLink<CustomerCompany> TO_CUSTOMER_COMPANY = new CustomerLink<CustomerCompany>("to_CustomerCompany");
    /**
     * Use with available fluent helpers to apply the <b>to_CustomerSalesArea</b> navigation property to query operations.
     * 
     */
    public final static CustomerLink<CustomerSalesArea> TO_CUSTOMER_SALES_AREA = new CustomerLink<CustomerSalesArea>("to_CustomerSalesArea");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Customer> getType() {
        return Customer.class;
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
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BillingIsBlockedForCustomer</b></p>
     * 
     * @param billingIsBlockedForCustomer
     *     Central Billing Block for Customer
     */
    public void setBillingIsBlockedForCustomer(
        @Nullable
        final String billingIsBlockedForCustomer) {
        rememberChangedField("BillingIsBlockedForCustomer", this.billingIsBlockedForCustomer);
        this.billingIsBlockedForCustomer = billingIsBlockedForCustomer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     Name of Person who Created the Object
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     Date on which the Record Was Created
     */
    public void setCreationDate(
        @Nullable
        final LocalDateTime creationDate) {
        rememberChangedField("CreationDate", this.creationDate);
        this.creationDate = creationDate;
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

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerClassification</b></p>
     * 
     * @param customerClassification
     *     Customer Classification
     */
    public void setCustomerClassification(
        @Nullable
        final String customerClassification) {
        rememberChangedField("CustomerClassification", this.customerClassification);
        this.customerClassification = customerClassification;
    }

    /**
     * Constraints: Not nullable, Maximum length: 220 <p>Original property name from the Odata EDM: <b>CustomerFullName</b></p>
     * 
     * @param customerFullName
     *     Customer Full Name
     */
    public void setCustomerFullName(
        @Nullable
        final String customerFullName) {
        rememberChangedField("CustomerFullName", this.customerFullName);
        this.customerFullName = customerFullName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>CustomerName</b></p>
     * 
     * @param customerName
     *     Name of Customer
     */
    public void setCustomerName(
        @Nullable
        final String customerName) {
        rememberChangedField("CustomerName", this.customerName);
        this.customerName = customerName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlocked</b></p>
     * 
     * @param deliveryIsBlocked
     *     Central delivery block for the customer
     */
    public void setDeliveryIsBlocked(
        @Nullable
        final String deliveryIsBlocked) {
        rememberChangedField("DeliveryIsBlocked", this.deliveryIsBlocked);
        this.deliveryIsBlocked = deliveryIsBlocked;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>NFPartnerIsNaturalPerson</b></p>
     * 
     * @param nFPartnerIsNaturalPerson
     *     Natural Person
     */
    public void setNFPartnerIsNaturalPerson(
        @Nullable
        final String nFPartnerIsNaturalPerson) {
        rememberChangedField("NFPartnerIsNaturalPerson", this.nFPartnerIsNaturalPerson);
        this.nFPartnerIsNaturalPerson = nFPartnerIsNaturalPerson;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OrderIsBlockedForCustomer</b></p>
     * 
     * @param orderIsBlockedForCustomer
     *     Central Order Block for Customer
     */
    public void setOrderIsBlockedForCustomer(
        @Nullable
        final String orderIsBlockedForCustomer) {
        rememberChangedField("OrderIsBlockedForCustomer", this.orderIsBlockedForCustomer);
        this.orderIsBlockedForCustomer = orderIsBlockedForCustomer;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PostingIsBlocked</b></p>
     * 
     * @param postingIsBlocked
     *     Central Posting Block
     */
    public void setPostingIsBlocked(
        @Nullable
        final Boolean postingIsBlocked) {
        rememberChangedField("PostingIsBlocked", this.postingIsBlocked);
        this.postingIsBlocked = postingIsBlocked;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CustomerCorporateGroup</b></p>
     * 
     * @param customerCorporateGroup
     *     Group Key
     */
    public void setCustomerCorporateGroup(
        @Nullable
        final String customerCorporateGroup) {
        rememberChangedField("CustomerCorporateGroup", this.customerCorporateGroup);
        this.customerCorporateGroup = customerCorporateGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FiscalAddress</b></p>
     * 
     * @param fiscalAddress
     *     Account number of the master record with the fiscal address
     */
    public void setFiscalAddress(
        @Nullable
        final String fiscalAddress) {
        rememberChangedField("FiscalAddress", this.fiscalAddress);
        this.fiscalAddress = fiscalAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Industry</b></p>
     * 
     * @param industry
     *     Industry key
     */
    public void setIndustry(
        @Nullable
        final String industry) {
        rememberChangedField("Industry", this.industry);
        this.industry = industry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode1</b></p>
     * 
     * @param industryCode1
     *     Industry Code 1
     */
    public void setIndustryCode1(
        @Nullable
        final String industryCode1) {
        rememberChangedField("IndustryCode1", this.industryCode1);
        this.industryCode1 = industryCode1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode2</b></p>
     * 
     * @param industryCode2
     *     Industry Code 2
     */
    public void setIndustryCode2(
        @Nullable
        final String industryCode2) {
        rememberChangedField("IndustryCode2", this.industryCode2);
        this.industryCode2 = industryCode2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode3</b></p>
     * 
     * @param industryCode3
     *     Industry Code 3
     */
    public void setIndustryCode3(
        @Nullable
        final String industryCode3) {
        rememberChangedField("IndustryCode3", this.industryCode3);
        this.industryCode3 = industryCode3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode4</b></p>
     * 
     * @param industryCode4
     *     Industry Code 4
     */
    public void setIndustryCode4(
        @Nullable
        final String industryCode4) {
        rememberChangedField("IndustryCode4", this.industryCode4);
        this.industryCode4 = industryCode4;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustryCode5</b></p>
     * 
     * @param industryCode5
     *     Industry Code 5
     */
    public void setIndustryCode5(
        @Nullable
        final String industryCode5) {
        rememberChangedField("IndustryCode5", this.industryCode5);
        this.industryCode5 = industryCode5;
    }

    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @param internationalLocationNumber1
     *     International location number  (part 1)
     */
    public void setInternationalLocationNumber1(
        @Nullable
        final String internationalLocationNumber1) {
        rememberChangedField("InternationalLocationNumber1", this.internationalLocationNumber1);
        this.internationalLocationNumber1 = internationalLocationNumber1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>NielsenRegion</b></p>
     * 
     * @param nielsenRegion
     *     Nielsen ID
     */
    public void setNielsenRegion(
        @Nullable
        final String nielsenRegion) {
        rememberChangedField("NielsenRegion", this.nielsenRegion);
        this.nielsenRegion = nielsenRegion;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ResponsibleType</b></p>
     * 
     * @param responsibleType
     *     Tax type
     */
    public void setResponsibleType(
        @Nullable
        final String responsibleType) {
        rememberChangedField("ResponsibleType", this.responsibleType);
        this.responsibleType = responsibleType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>TaxNumber1</b></p>
     * 
     * @param taxNumber1
     *     Tax Number 1
     */
    public void setTaxNumber1(
        @Nullable
        final String taxNumber1) {
        rememberChangedField("TaxNumber1", this.taxNumber1);
        this.taxNumber1 = taxNumber1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 11 <p>Original property name from the Odata EDM: <b>TaxNumber2</b></p>
     * 
     * @param taxNumber2
     *     Tax Number 2
     */
    public void setTaxNumber2(
        @Nullable
        final String taxNumber2) {
        rememberChangedField("TaxNumber2", this.taxNumber2);
        this.taxNumber2 = taxNumber2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumber3</b></p>
     * 
     * @param taxNumber3
     *     Tax Number 3
     */
    public void setTaxNumber3(
        @Nullable
        final String taxNumber3) {
        rememberChangedField("TaxNumber3", this.taxNumber3);
        this.taxNumber3 = taxNumber3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumber4</b></p>
     * 
     * @param taxNumber4
     *     Tax Number 4
     */
    public void setTaxNumber4(
        @Nullable
        final String taxNumber4) {
        rememberChangedField("TaxNumber4", this.taxNumber4);
        this.taxNumber4 = taxNumber4;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>TaxNumber5</b></p>
     * 
     * @param taxNumber5
     *     Tax Number 5
     */
    public void setTaxNumber5(
        @Nullable
        final String taxNumber5) {
        rememberChangedField("TaxNumber5", this.taxNumber5);
        this.taxNumber5 = taxNumber5;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>TaxNumberType</b></p>
     * 
     * @param taxNumberType
     *     Tax Number Type
     */
    public void setTaxNumberType(
        @Nullable
        final String taxNumberType) {
        rememberChangedField("TaxNumberType", this.taxNumberType);
        this.taxNumberType = taxNumberType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>VATRegistration</b></p>
     * 
     * @param vATRegistration
     *     VAT Registration Number
     */
    public void setVATRegistration(
        @Nullable
        final String vATRegistration) {
        rememberChangedField("VATRegistration", this.vATRegistration);
        this.vATRegistration = vATRegistration;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     Central Deletion Flag for Master Record
     */
    public void setDeletionIndicator(
        @Nullable
        final Boolean deletionIndicator) {
        rememberChangedField("DeletionIndicator", this.deletionIndicator);
        this.deletionIndicator = deletionIndicator;
    }

    @Override
    protected String getEntityCollection() {
        return "A_Customer";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("BillingIsBlockedForCustomer", getBillingIsBlockedForCustomer());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreationDate", getCreationDate());
        values.put("CustomerAccountGroup", getCustomerAccountGroup());
        values.put("CustomerClassification", getCustomerClassification());
        values.put("CustomerFullName", getCustomerFullName());
        values.put("CustomerName", getCustomerName());
        values.put("DeliveryIsBlocked", getDeliveryIsBlocked());
        values.put("NFPartnerIsNaturalPerson", getNFPartnerIsNaturalPerson());
        values.put("OrderIsBlockedForCustomer", getOrderIsBlockedForCustomer());
        values.put("PostingIsBlocked", getPostingIsBlocked());
        values.put("Supplier", getSupplier());
        values.put("CustomerCorporateGroup", getCustomerCorporateGroup());
        values.put("FiscalAddress", getFiscalAddress());
        values.put("Industry", getIndustry());
        values.put("IndustryCode1", getIndustryCode1());
        values.put("IndustryCode2", getIndustryCode2());
        values.put("IndustryCode3", getIndustryCode3());
        values.put("IndustryCode4", getIndustryCode4());
        values.put("IndustryCode5", getIndustryCode5());
        values.put("InternationalLocationNumber1", getInternationalLocationNumber1());
        values.put("NielsenRegion", getNielsenRegion());
        values.put("ResponsibleType", getResponsibleType());
        values.put("TaxNumber1", getTaxNumber1());
        values.put("TaxNumber2", getTaxNumber2());
        values.put("TaxNumber3", getTaxNumber3());
        values.put("TaxNumber4", getTaxNumber4());
        values.put("TaxNumber5", getTaxNumber5());
        values.put("TaxNumberType", getTaxNumberType());
        values.put("VATRegistration", getVATRegistration());
        values.put("DeletionIndicator", getDeletionIndicator());
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
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
                }
            }
            if (values.containsKey("BillingIsBlockedForCustomer")) {
                final Object value = values.remove("BillingIsBlockedForCustomer");
                if ((value == null)||(!value.equals(getBillingIsBlockedForCustomer()))) {
                    setBillingIsBlockedForCustomer(((String) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("CreationDate")) {
                final Object value = values.remove("CreationDate");
                if ((value == null)||(!value.equals(getCreationDate()))) {
                    setCreationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CustomerAccountGroup")) {
                final Object value = values.remove("CustomerAccountGroup");
                if ((value == null)||(!value.equals(getCustomerAccountGroup()))) {
                    setCustomerAccountGroup(((String) value));
                }
            }
            if (values.containsKey("CustomerClassification")) {
                final Object value = values.remove("CustomerClassification");
                if ((value == null)||(!value.equals(getCustomerClassification()))) {
                    setCustomerClassification(((String) value));
                }
            }
            if (values.containsKey("CustomerFullName")) {
                final Object value = values.remove("CustomerFullName");
                if ((value == null)||(!value.equals(getCustomerFullName()))) {
                    setCustomerFullName(((String) value));
                }
            }
            if (values.containsKey("CustomerName")) {
                final Object value = values.remove("CustomerName");
                if ((value == null)||(!value.equals(getCustomerName()))) {
                    setCustomerName(((String) value));
                }
            }
            if (values.containsKey("DeliveryIsBlocked")) {
                final Object value = values.remove("DeliveryIsBlocked");
                if ((value == null)||(!value.equals(getDeliveryIsBlocked()))) {
                    setDeliveryIsBlocked(((String) value));
                }
            }
            if (values.containsKey("NFPartnerIsNaturalPerson")) {
                final Object value = values.remove("NFPartnerIsNaturalPerson");
                if ((value == null)||(!value.equals(getNFPartnerIsNaturalPerson()))) {
                    setNFPartnerIsNaturalPerson(((String) value));
                }
            }
            if (values.containsKey("OrderIsBlockedForCustomer")) {
                final Object value = values.remove("OrderIsBlockedForCustomer");
                if ((value == null)||(!value.equals(getOrderIsBlockedForCustomer()))) {
                    setOrderIsBlockedForCustomer(((String) value));
                }
            }
            if (values.containsKey("PostingIsBlocked")) {
                final Object value = values.remove("PostingIsBlocked");
                if ((value == null)||(!value.equals(getPostingIsBlocked()))) {
                    setPostingIsBlocked(((Boolean) value));
                }
            }
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("CustomerCorporateGroup")) {
                final Object value = values.remove("CustomerCorporateGroup");
                if ((value == null)||(!value.equals(getCustomerCorporateGroup()))) {
                    setCustomerCorporateGroup(((String) value));
                }
            }
            if (values.containsKey("FiscalAddress")) {
                final Object value = values.remove("FiscalAddress");
                if ((value == null)||(!value.equals(getFiscalAddress()))) {
                    setFiscalAddress(((String) value));
                }
            }
            if (values.containsKey("Industry")) {
                final Object value = values.remove("Industry");
                if ((value == null)||(!value.equals(getIndustry()))) {
                    setIndustry(((String) value));
                }
            }
            if (values.containsKey("IndustryCode1")) {
                final Object value = values.remove("IndustryCode1");
                if ((value == null)||(!value.equals(getIndustryCode1()))) {
                    setIndustryCode1(((String) value));
                }
            }
            if (values.containsKey("IndustryCode2")) {
                final Object value = values.remove("IndustryCode2");
                if ((value == null)||(!value.equals(getIndustryCode2()))) {
                    setIndustryCode2(((String) value));
                }
            }
            if (values.containsKey("IndustryCode3")) {
                final Object value = values.remove("IndustryCode3");
                if ((value == null)||(!value.equals(getIndustryCode3()))) {
                    setIndustryCode3(((String) value));
                }
            }
            if (values.containsKey("IndustryCode4")) {
                final Object value = values.remove("IndustryCode4");
                if ((value == null)||(!value.equals(getIndustryCode4()))) {
                    setIndustryCode4(((String) value));
                }
            }
            if (values.containsKey("IndustryCode5")) {
                final Object value = values.remove("IndustryCode5");
                if ((value == null)||(!value.equals(getIndustryCode5()))) {
                    setIndustryCode5(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber1")) {
                final Object value = values.remove("InternationalLocationNumber1");
                if ((value == null)||(!value.equals(getInternationalLocationNumber1()))) {
                    setInternationalLocationNumber1(((String) value));
                }
            }
            if (values.containsKey("NielsenRegion")) {
                final Object value = values.remove("NielsenRegion");
                if ((value == null)||(!value.equals(getNielsenRegion()))) {
                    setNielsenRegion(((String) value));
                }
            }
            if (values.containsKey("ResponsibleType")) {
                final Object value = values.remove("ResponsibleType");
                if ((value == null)||(!value.equals(getResponsibleType()))) {
                    setResponsibleType(((String) value));
                }
            }
            if (values.containsKey("TaxNumber1")) {
                final Object value = values.remove("TaxNumber1");
                if ((value == null)||(!value.equals(getTaxNumber1()))) {
                    setTaxNumber1(((String) value));
                }
            }
            if (values.containsKey("TaxNumber2")) {
                final Object value = values.remove("TaxNumber2");
                if ((value == null)||(!value.equals(getTaxNumber2()))) {
                    setTaxNumber2(((String) value));
                }
            }
            if (values.containsKey("TaxNumber3")) {
                final Object value = values.remove("TaxNumber3");
                if ((value == null)||(!value.equals(getTaxNumber3()))) {
                    setTaxNumber3(((String) value));
                }
            }
            if (values.containsKey("TaxNumber4")) {
                final Object value = values.remove("TaxNumber4");
                if ((value == null)||(!value.equals(getTaxNumber4()))) {
                    setTaxNumber4(((String) value));
                }
            }
            if (values.containsKey("TaxNumber5")) {
                final Object value = values.remove("TaxNumber5");
                if ((value == null)||(!value.equals(getTaxNumber5()))) {
                    setTaxNumber5(((String) value));
                }
            }
            if (values.containsKey("TaxNumberType")) {
                final Object value = values.remove("TaxNumberType");
                if ((value == null)||(!value.equals(getTaxNumberType()))) {
                    setTaxNumberType(((String) value));
                }
            }
            if (values.containsKey("VATRegistration")) {
                final Object value = values.remove("VATRegistration");
                if ((value == null)||(!value.equals(getVATRegistration()))) {
                    setVATRegistration(((String) value));
                }
            }
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_CustomerCompany")) {
                final Object value = (values).remove("to_CustomerCompany");
                if (value instanceof Iterable) {
                    if (toCustomerCompany == null) {
                        toCustomerCompany = Lists.newArrayList();
                    } else {
                        toCustomerCompany = Lists.newArrayList(toCustomerCompany);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CustomerCompany entity;
                        if (toCustomerCompany.size()>i) {
                            entity = toCustomerCompany.get(i);
                        } else {
                            entity = new CustomerCompany();
                            toCustomerCompany.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_CustomerSalesArea")) {
                final Object value = (values).remove("to_CustomerSalesArea");
                if (value instanceof Iterable) {
                    if (toCustomerSalesArea == null) {
                        toCustomerSalesArea = Lists.newArrayList();
                    } else {
                        toCustomerSalesArea = Lists.newArrayList(toCustomerSalesArea);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CustomerSalesArea entity;
                        if (toCustomerSalesArea.size()>i) {
                            entity = toCustomerSalesArea.get(i);
                        } else {
                            entity = new CustomerSalesArea();
                            toCustomerSalesArea.add(entity);
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
    public static<T >CustomerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerField<T>(fieldName);
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
    public static<T,DomainT >CustomerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerField<T>(fieldName, typeConverter);
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
        if (toCustomerCompany!= null) {
            (values).put("to_CustomerCompany", toCustomerCompany);
        }
        if (toCustomerSalesArea!= null) {
            (values).put("to_CustomerSalesArea", toCustomerSalesArea);
        }
        return values;
    }

    /**
     * Fetches the <b>CustomerCompany</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CustomerCompany</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustomerCompany</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerCompany> fetchCustomerCompany()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustomerCompany.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CustomerCompany");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustomerCompany> entityList = result.asList(CustomerCompany.class);
        for (CustomerCompany entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustomerCompany</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerCompany</b>.
     * <p>
     * If the navigation property <b>to_CustomerCompany</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustomerCompany</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerCompany> getCustomerCompanyOrFetch()
        throws ODataException
    {
        if (toCustomerCompany == null) {
            toCustomerCompany = fetchCustomerCompany();
        }
        return toCustomerCompany;
    }

    /**
     * Retrieval of associated <b>CustomerCompany</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerCompany</b>.
     * <p>
     * If the navigation property for an entity <b>Customer</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CustomerCompany</b> is already loaded, the result will contain the <b>CustomerCompany</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustomerCompany>> getCustomerCompanyIfPresent() {
        return Optional.ofNullable(toCustomerCompany);
    }

    /**
     * Overwrites the list of associated <b>CustomerCompany</b> entities for the loaded navigation property <b>to_CustomerCompany</b>.
     * <p>
     * If the navigation property <b>to_CustomerCompany</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustomerCompany</b> entities.
     */
    public void setCustomerCompany(
        @Nonnull
        final List<CustomerCompany> value) {
        if (toCustomerCompany == null) {
            toCustomerCompany = Lists.newArrayList();
        }
        toCustomerCompany.clear();
        toCustomerCompany.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustomerCompany</b> entities. This corresponds to the OData navigation property <b>to_CustomerCompany</b>.
     * <p>
     * If the navigation property <b>to_CustomerCompany</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustomerCompany</b> entities.
     */
    public void addCustomerCompany(CustomerCompany... entity) {
        if (toCustomerCompany == null) {
            toCustomerCompany = Lists.newArrayList();
        }
        toCustomerCompany.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CustomerSalesArea</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_CustomerSalesArea</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustomerSalesArea</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerSalesArea> fetchCustomerSalesArea()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustomerSalesArea.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_CustomerSalesArea");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustomerSalesArea> entityList = result.asList(CustomerSalesArea.class);
        for (CustomerSalesArea entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustomerSalesArea</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerSalesArea</b>.
     * <p>
     * If the navigation property <b>to_CustomerSalesArea</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustomerSalesArea</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerSalesArea> getCustomerSalesAreaOrFetch()
        throws ODataException
    {
        if (toCustomerSalesArea == null) {
            toCustomerSalesArea = fetchCustomerSalesArea();
        }
        return toCustomerSalesArea;
    }

    /**
     * Retrieval of associated <b>CustomerSalesArea</b> entities (one to many). This corresponds to the OData navigation property <b>to_CustomerSalesArea</b>.
     * <p>
     * If the navigation property for an entity <b>Customer</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_CustomerSalesArea</b> is already loaded, the result will contain the <b>CustomerSalesArea</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustomerSalesArea>> getCustomerSalesAreaIfPresent() {
        return Optional.ofNullable(toCustomerSalesArea);
    }

    /**
     * Overwrites the list of associated <b>CustomerSalesArea</b> entities for the loaded navigation property <b>to_CustomerSalesArea</b>.
     * <p>
     * If the navigation property <b>to_CustomerSalesArea</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustomerSalesArea</b> entities.
     */
    public void setCustomerSalesArea(
        @Nonnull
        final List<CustomerSalesArea> value) {
        if (toCustomerSalesArea == null) {
            toCustomerSalesArea = Lists.newArrayList();
        }
        toCustomerSalesArea.clear();
        toCustomerSalesArea.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustomerSalesArea</b> entities. This corresponds to the OData navigation property <b>to_CustomerSalesArea</b>.
     * <p>
     * If the navigation property <b>to_CustomerSalesArea</b> of a queried <b>Customer</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustomerSalesArea</b> entities.
     */
    public void addCustomerSalesArea(CustomerSalesArea... entity) {
        if (toCustomerSalesArea == null) {
            toCustomerSalesArea = Lists.newArrayList();
        }
        toCustomerSalesArea.addAll(Lists.newArrayList(entity));
    }

    public final static class CustomerBuilder {

        private List<CustomerCompany> toCustomerCompany = Lists.newArrayList();
        private List<CustomerSalesArea> toCustomerSalesArea = Lists.newArrayList();

        private Customer.CustomerBuilder toCustomerCompany(List<CustomerCompany> value) {
            toCustomerCompany.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CustomerCompany</b> for <b>Customer</b> to multiple <b>CustomerCompany</b>.
         * 
         */
        @Nonnull
        public Customer.CustomerBuilder customerCompany(CustomerCompany... value) {
            return toCustomerCompany(Lists.newArrayList(value));
        }

        private Customer.CustomerBuilder toCustomerSalesArea(List<CustomerSalesArea> value) {
            toCustomerSalesArea.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_CustomerSalesArea</b> for <b>Customer</b> to multiple <b>CustomerSalesArea</b>.
         * 
         */
        @Nonnull
        public Customer.CustomerBuilder customerSalesArea(CustomerSalesArea... value) {
            return toCustomerSalesArea(Lists.newArrayList(value));
        }

    }

}
