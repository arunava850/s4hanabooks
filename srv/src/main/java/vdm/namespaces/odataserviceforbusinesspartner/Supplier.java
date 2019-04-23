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
import vdm.namespaces.odataserviceforbusinesspartner.field.SupplierField;
import vdm.namespaces.odataserviceforbusinesspartner.link.SupplierLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierSelectable;


/**
 * Supplier<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class Supplier
    extends VdmEntity<Supplier>
{

    /**
     * Selector for all available fields of Supplier.
     * 
     */
    public final static SupplierSelectable ALL_FIELDS = new SupplierSelectable() {


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
    public final static SupplierField<String> SUPPLIER = new SupplierField<String>("Supplier");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayeeAccountNumber</b></p>
     * 
     * @param alternativePayeeAccountNumber
     *     
     * @return
     *     Account Number of the Alternative Payee
     */
    @SerializedName("AlternativePayeeAccountNumber")
    @JsonProperty("AlternativePayeeAccountNumber")
    @Nullable
    @ODataField(odataName = "AlternativePayeeAccountNumber")
    private String alternativePayeeAccountNumber;
    /**
     * Use with available fluent helpers to apply the <b>AlternativePayeeAccountNumber</b> field to query operations.
     * 
     */
    public final static SupplierField<String> ALTERNATIVE_PAYEE_ACCOUNT_NUMBER = new SupplierField<String>("AlternativePayeeAccountNumber");
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
    public final static SupplierField<String> AUTHORIZATION_GROUP = new SupplierField<String>("AuthorizationGroup");
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
    public final static SupplierField<String> CREATED_BY_USER = new SupplierField<String>("CreatedByUser");
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
    public final static SupplierField<LocalDateTime> CREATION_DATE = new SupplierField<LocalDateTime>("CreationDate");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     
     * @return
     *     Customer Number
     */
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static SupplierField<String> CUSTOMER = new SupplierField<String>("Customer");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaymentIsBlockedForSupplier</b></p>
     * 
     * @param paymentIsBlockedForSupplier
     *     
     * @return
     *     Payment Block
     */
    @SerializedName("PaymentIsBlockedForSupplier")
    @JsonProperty("PaymentIsBlockedForSupplier")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PaymentIsBlockedForSupplier")
    private Boolean paymentIsBlockedForSupplier;
    /**
     * Use with available fluent helpers to apply the <b>PaymentIsBlockedForSupplier</b> field to query operations.
     * 
     */
    public final static SupplierField<Boolean> PAYMENT_IS_BLOCKED_FOR_SUPPLIER = new SupplierField<Boolean>("PaymentIsBlockedForSupplier");
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
    public final static SupplierField<Boolean> POSTING_IS_BLOCKED = new SupplierField<Boolean>("PostingIsBlocked");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurchasingIsBlocked</b></p>
     * 
     * @param purchasingIsBlocked
     *     
     * @return
     *     Centrally imposed purchasing block
     */
    @SerializedName("PurchasingIsBlocked")
    @JsonProperty("PurchasingIsBlocked")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PurchasingIsBlocked")
    private Boolean purchasingIsBlocked;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingIsBlocked</b> field to query operations.
     * 
     */
    public final static SupplierField<Boolean> PURCHASING_IS_BLOCKED = new SupplierField<Boolean>("PurchasingIsBlocked");
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
    public final static SupplierField<String> SUPPLIER_ACCOUNT_GROUP = new SupplierField<String>("SupplierAccountGroup");
    /**
     * Constraints: Not nullable, Maximum length: 220 <p>Original property name from the Odata EDM: <b>SupplierFullName</b></p>
     * 
     * @param supplierFullName
     *     
     * @return
     *     Supplier Full Name
     */
    @SerializedName("SupplierFullName")
    @JsonProperty("SupplierFullName")
    @Nullable
    @ODataField(odataName = "SupplierFullName")
    private String supplierFullName;
    /**
     * Use with available fluent helpers to apply the <b>SupplierFullName</b> field to query operations.
     * 
     */
    public final static SupplierField<String> SUPPLIER_FULL_NAME = new SupplierField<String>("SupplierFullName");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>SupplierName</b></p>
     * 
     * @param supplierName
     *     
     * @return
     *     Name of Supplier
     */
    @SerializedName("SupplierName")
    @JsonProperty("SupplierName")
    @Nullable
    @ODataField(odataName = "SupplierName")
    private String supplierName;
    /**
     * Use with available fluent helpers to apply the <b>SupplierName</b> field to query operations.
     * 
     */
    public final static SupplierField<String> SUPPLIER_NAME = new SupplierField<String>("SupplierName");
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
    public final static SupplierField<String> VAT_REGISTRATION = new SupplierField<String>("VATRegistration");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BirthDate</b></p>
     * 
     * @param birthDate
     *     
     * @return
     *     Date of birth of the person subject to withholding tax
     */
    @SerializedName("BirthDate")
    @JsonProperty("BirthDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BirthDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime birthDate;
    /**
     * Use with available fluent helpers to apply the <b>BirthDate</b> field to query operations.
     * 
     */
    public final static SupplierField<LocalDateTime> BIRTH_DATE = new SupplierField<LocalDateTime>("BirthDate");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>ConcatenatedInternationalLocNo</b></p>
     * 
     * @param concatenatedInternationalLocNo
     *     
     * @return
     *     Cocatenated International Location Number
     */
    @SerializedName("ConcatenatedInternationalLocNo")
    @JsonProperty("ConcatenatedInternationalLocNo")
    @Nullable
    @ODataField(odataName = "ConcatenatedInternationalLocNo")
    private String concatenatedInternationalLocNo;
    /**
     * Use with available fluent helpers to apply the <b>ConcatenatedInternationalLocNo</b> field to query operations.
     * 
     */
    public final static SupplierField<String> CONCATENATED_INTERNATIONAL_LOC_NO = new SupplierField<String>("ConcatenatedInternationalLocNo");
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
    public final static SupplierField<Boolean> DELETION_INDICATOR = new SupplierField<Boolean>("DeletionIndicator");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FiscalAddress</b></p>
     * 
     * @param fiscalAddress
     *     
     * @return
     *     Account number of the master record with fiscal address
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
    public final static SupplierField<String> FISCAL_ADDRESS = new SupplierField<String>("FiscalAddress");
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
    public final static SupplierField<String> INDUSTRY = new SupplierField<String>("Industry");
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
    public final static SupplierField<String> INTERNATIONAL_LOCATION_NUMBER1 = new SupplierField<String>("InternationalLocationNumber1");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @param internationalLocationNumber2
     *     
     * @return
     *     International location number (Part 2)
     */
    @SerializedName("InternationalLocationNumber2")
    @JsonProperty("InternationalLocationNumber2")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber2")
    private String internationalLocationNumber2;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber2</b> field to query operations.
     * 
     */
    public final static SupplierField<String> INTERNATIONAL_LOCATION_NUMBER2 = new SupplierField<String>("InternationalLocationNumber2");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @param internationalLocationNumber3
     *     
     * @return
     *     Check digit for the international location number
     */
    @SerializedName("InternationalLocationNumber3")
    @JsonProperty("InternationalLocationNumber3")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber3")
    private String internationalLocationNumber3;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber3</b> field to query operations.
     * 
     */
    public final static SupplierField<String> INTERNATIONAL_LOCATION_NUMBER3 = new SupplierField<String>("InternationalLocationNumber3");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsNaturalPerson</b></p>
     * 
     * @param isNaturalPerson
     *     
     * @return
     *     Natural Person
     */
    @SerializedName("IsNaturalPerson")
    @JsonProperty("IsNaturalPerson")
    @Nullable
    @ODataField(odataName = "IsNaturalPerson")
    private String isNaturalPerson;
    /**
     * Use with available fluent helpers to apply the <b>IsNaturalPerson</b> field to query operations.
     * 
     */
    public final static SupplierField<String> IS_NATURAL_PERSON = new SupplierField<String>("IsNaturalPerson");
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
    public final static SupplierField<String> RESPONSIBLE_TYPE = new SupplierField<String>("ResponsibleType");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SuplrQltyInProcmtCertfnValidTo</b></p>
     * 
     * @param suplrQltyInProcmtCertfnValidTo
     *     
     * @return
     *     Validity date of certification
     */
    @SerializedName("SuplrQltyInProcmtCertfnValidTo")
    @JsonProperty("SuplrQltyInProcmtCertfnValidTo")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "SuplrQltyInProcmtCertfnValidTo", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime suplrQltyInProcmtCertfnValidTo;
    /**
     * Use with available fluent helpers to apply the <b>SuplrQltyInProcmtCertfnValidTo</b> field to query operations.
     * 
     */
    public final static SupplierField<LocalDateTime> SUPLR_QLTY_IN_PROCMT_CERTFN_VALID_TO = new SupplierField<LocalDateTime>("SuplrQltyInProcmtCertfnValidTo");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SuplrQualityManagementSystem</b></p>
     * 
     * @param suplrQualityManagementSystem
     *     
     * @return
     *     Supplier's QM system
     */
    @SerializedName("SuplrQualityManagementSystem")
    @JsonProperty("SuplrQualityManagementSystem")
    @Nullable
    @ODataField(odataName = "SuplrQualityManagementSystem")
    private String suplrQualityManagementSystem;
    /**
     * Use with available fluent helpers to apply the <b>SuplrQualityManagementSystem</b> field to query operations.
     * 
     */
    public final static SupplierField<String> SUPLR_QUALITY_MANAGEMENT_SYSTEM = new SupplierField<String>("SuplrQualityManagementSystem");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SupplierCorporateGroup</b></p>
     * 
     * @param supplierCorporateGroup
     *     
     * @return
     *     Group Key
     */
    @SerializedName("SupplierCorporateGroup")
    @JsonProperty("SupplierCorporateGroup")
    @Nullable
    @ODataField(odataName = "SupplierCorporateGroup")
    private String supplierCorporateGroup;
    /**
     * Use with available fluent helpers to apply the <b>SupplierCorporateGroup</b> field to query operations.
     * 
     */
    public final static SupplierField<String> SUPPLIER_CORPORATE_GROUP = new SupplierField<String>("SupplierCorporateGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>SupplierProcurementBlock</b></p>
     * 
     * @param supplierProcurementBlock
     *     
     * @return
     *     Function That Will Be Blocked
     */
    @SerializedName("SupplierProcurementBlock")
    @JsonProperty("SupplierProcurementBlock")
    @Nullable
    @ODataField(odataName = "SupplierProcurementBlock")
    private String supplierProcurementBlock;
    /**
     * Use with available fluent helpers to apply the <b>SupplierProcurementBlock</b> field to query operations.
     * 
     */
    public final static SupplierField<String> SUPPLIER_PROCUREMENT_BLOCK = new SupplierField<String>("SupplierProcurementBlock");
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
    public final static SupplierField<String> TAX_NUMBER1 = new SupplierField<String>("TaxNumber1");
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
    public final static SupplierField<String> TAX_NUMBER2 = new SupplierField<String>("TaxNumber2");
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
    public final static SupplierField<String> TAX_NUMBER3 = new SupplierField<String>("TaxNumber3");
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
    public final static SupplierField<String> TAX_NUMBER4 = new SupplierField<String>("TaxNumber4");
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
    public final static SupplierField<String> TAX_NUMBER5 = new SupplierField<String>("TaxNumber5");
    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumberResponsible</b></p>
     * 
     * @param taxNumberResponsible
     *     
     * @return
     *     Tax Number at Responsible Tax Authority
     */
    @SerializedName("TaxNumberResponsible")
    @JsonProperty("TaxNumberResponsible")
    @Nullable
    @ODataField(odataName = "TaxNumberResponsible")
    private String taxNumberResponsible;
    /**
     * Use with available fluent helpers to apply the <b>TaxNumberResponsible</b> field to query operations.
     * 
     */
    public final static SupplierField<String> TAX_NUMBER_RESPONSIBLE = new SupplierField<String>("TaxNumberResponsible");
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
    public final static SupplierField<String> TAX_NUMBER_TYPE = new SupplierField<String>("TaxNumberType");
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
     * Navigation property <b>to_SupplierCompany</b> for <b>Supplier</b> to multiple <b>SupplierCompany</b>.
     * 
     */
    @SerializedName("to_SupplierCompany")
    @JsonProperty("to_SupplierCompany")
    @ODataField(odataName = "to_SupplierCompany")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SupplierCompany> toSupplierCompany;
    /**
     * Navigation property <b>to_SupplierPurchasingOrg</b> for <b>Supplier</b> to multiple <b>SupplierPurchasingOrg</b>.
     * 
     */
    @SerializedName("to_SupplierPurchasingOrg")
    @JsonProperty("to_SupplierPurchasingOrg")
    @ODataField(odataName = "to_SupplierPurchasingOrg")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SupplierPurchasingOrg> toSupplierPurchasingOrg;
    /**
     * Use with available fluent helpers to apply the <b>to_SupplierCompany</b> navigation property to query operations.
     * 
     */
    public final static SupplierLink<SupplierCompany> TO_SUPPLIER_COMPANY = new SupplierLink<SupplierCompany>("to_SupplierCompany");
    /**
     * Use with available fluent helpers to apply the <b>to_SupplierPurchasingOrg</b> navigation property to query operations.
     * 
     */
    public final static SupplierLink<SupplierPurchasingOrg> TO_SUPPLIER_PURCHASING_ORG = new SupplierLink<SupplierPurchasingOrg>("to_SupplierPurchasingOrg");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<Supplier> getType() {
        return Supplier.class;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AlternativePayeeAccountNumber</b></p>
     * 
     * @param alternativePayeeAccountNumber
     *     Account Number of the Alternative Payee
     */
    public void setAlternativePayeeAccountNumber(
        @Nullable
        final String alternativePayeeAccountNumber) {
        rememberChangedField("AlternativePayeeAccountNumber", this.alternativePayeeAccountNumber);
        this.alternativePayeeAccountNumber = alternativePayeeAccountNumber;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>PaymentIsBlockedForSupplier</b></p>
     * 
     * @param paymentIsBlockedForSupplier
     *     Payment Block
     */
    public void setPaymentIsBlockedForSupplier(
        @Nullable
        final Boolean paymentIsBlockedForSupplier) {
        rememberChangedField("PaymentIsBlockedForSupplier", this.paymentIsBlockedForSupplier);
        this.paymentIsBlockedForSupplier = paymentIsBlockedForSupplier;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurchasingIsBlocked</b></p>
     * 
     * @param purchasingIsBlocked
     *     Centrally imposed purchasing block
     */
    public void setPurchasingIsBlocked(
        @Nullable
        final Boolean purchasingIsBlocked) {
        rememberChangedField("PurchasingIsBlocked", this.purchasingIsBlocked);
        this.purchasingIsBlocked = purchasingIsBlocked;
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

    /**
     * Constraints: Not nullable, Maximum length: 220 <p>Original property name from the Odata EDM: <b>SupplierFullName</b></p>
     * 
     * @param supplierFullName
     *     Supplier Full Name
     */
    public void setSupplierFullName(
        @Nullable
        final String supplierFullName) {
        rememberChangedField("SupplierFullName", this.supplierFullName);
        this.supplierFullName = supplierFullName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>SupplierName</b></p>
     * 
     * @param supplierName
     *     Name of Supplier
     */
    public void setSupplierName(
        @Nullable
        final String supplierName) {
        rememberChangedField("SupplierName", this.supplierName);
        this.supplierName = supplierName;
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
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BirthDate</b></p>
     * 
     * @param birthDate
     *     Date of birth of the person subject to withholding tax
     */
    public void setBirthDate(
        @Nullable
        final LocalDateTime birthDate) {
        rememberChangedField("BirthDate", this.birthDate);
        this.birthDate = birthDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>ConcatenatedInternationalLocNo</b></p>
     * 
     * @param concatenatedInternationalLocNo
     *     Cocatenated International Location Number
     */
    public void setConcatenatedInternationalLocNo(
        @Nullable
        final String concatenatedInternationalLocNo) {
        rememberChangedField("ConcatenatedInternationalLocNo", this.concatenatedInternationalLocNo);
        this.concatenatedInternationalLocNo = concatenatedInternationalLocNo;
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

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FiscalAddress</b></p>
     * 
     * @param fiscalAddress
     *     Account number of the master record with fiscal address
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
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @param internationalLocationNumber2
     *     International location number (Part 2)
     */
    public void setInternationalLocationNumber2(
        @Nullable
        final String internationalLocationNumber2) {
        rememberChangedField("InternationalLocationNumber2", this.internationalLocationNumber2);
        this.internationalLocationNumber2 = internationalLocationNumber2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @param internationalLocationNumber3
     *     Check digit for the international location number
     */
    public void setInternationalLocationNumber3(
        @Nullable
        final String internationalLocationNumber3) {
        rememberChangedField("InternationalLocationNumber3", this.internationalLocationNumber3);
        this.internationalLocationNumber3 = internationalLocationNumber3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsNaturalPerson</b></p>
     * 
     * @param isNaturalPerson
     *     Natural Person
     */
    public void setIsNaturalPerson(
        @Nullable
        final String isNaturalPerson) {
        rememberChangedField("IsNaturalPerson", this.isNaturalPerson);
        this.isNaturalPerson = isNaturalPerson;
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
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>SuplrQltyInProcmtCertfnValidTo</b></p>
     * 
     * @param suplrQltyInProcmtCertfnValidTo
     *     Validity date of certification
     */
    public void setSuplrQltyInProcmtCertfnValidTo(
        @Nullable
        final LocalDateTime suplrQltyInProcmtCertfnValidTo) {
        rememberChangedField("SuplrQltyInProcmtCertfnValidTo", this.suplrQltyInProcmtCertfnValidTo);
        this.suplrQltyInProcmtCertfnValidTo = suplrQltyInProcmtCertfnValidTo;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SuplrQualityManagementSystem</b></p>
     * 
     * @param suplrQualityManagementSystem
     *     Supplier's QM system
     */
    public void setSuplrQualityManagementSystem(
        @Nullable
        final String suplrQualityManagementSystem) {
        rememberChangedField("SuplrQualityManagementSystem", this.suplrQualityManagementSystem);
        this.suplrQualityManagementSystem = suplrQualityManagementSystem;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>SupplierCorporateGroup</b></p>
     * 
     * @param supplierCorporateGroup
     *     Group Key
     */
    public void setSupplierCorporateGroup(
        @Nullable
        final String supplierCorporateGroup) {
        rememberChangedField("SupplierCorporateGroup", this.supplierCorporateGroup);
        this.supplierCorporateGroup = supplierCorporateGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>SupplierProcurementBlock</b></p>
     * 
     * @param supplierProcurementBlock
     *     Function That Will Be Blocked
     */
    public void setSupplierProcurementBlock(
        @Nullable
        final String supplierProcurementBlock) {
        rememberChangedField("SupplierProcurementBlock", this.supplierProcurementBlock);
        this.supplierProcurementBlock = supplierProcurementBlock;
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
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>TaxNumberResponsible</b></p>
     * 
     * @param taxNumberResponsible
     *     Tax Number at Responsible Tax Authority
     */
    public void setTaxNumberResponsible(
        @Nullable
        final String taxNumberResponsible) {
        rememberChangedField("TaxNumberResponsible", this.taxNumberResponsible);
        this.taxNumberResponsible = taxNumberResponsible;
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

    @Override
    protected String getEntityCollection() {
        return "A_Supplier";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("AlternativePayeeAccountNumber", getAlternativePayeeAccountNumber());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreationDate", getCreationDate());
        values.put("Customer", getCustomer());
        values.put("PaymentIsBlockedForSupplier", getPaymentIsBlockedForSupplier());
        values.put("PostingIsBlocked", getPostingIsBlocked());
        values.put("PurchasingIsBlocked", getPurchasingIsBlocked());
        values.put("SupplierAccountGroup", getSupplierAccountGroup());
        values.put("SupplierFullName", getSupplierFullName());
        values.put("SupplierName", getSupplierName());
        values.put("VATRegistration", getVATRegistration());
        values.put("BirthDate", getBirthDate());
        values.put("ConcatenatedInternationalLocNo", getConcatenatedInternationalLocNo());
        values.put("DeletionIndicator", getDeletionIndicator());
        values.put("FiscalAddress", getFiscalAddress());
        values.put("Industry", getIndustry());
        values.put("InternationalLocationNumber1", getInternationalLocationNumber1());
        values.put("InternationalLocationNumber2", getInternationalLocationNumber2());
        values.put("InternationalLocationNumber3", getInternationalLocationNumber3());
        values.put("IsNaturalPerson", getIsNaturalPerson());
        values.put("ResponsibleType", getResponsibleType());
        values.put("SuplrQltyInProcmtCertfnValidTo", getSuplrQltyInProcmtCertfnValidTo());
        values.put("SuplrQualityManagementSystem", getSuplrQualityManagementSystem());
        values.put("SupplierCorporateGroup", getSupplierCorporateGroup());
        values.put("SupplierProcurementBlock", getSupplierProcurementBlock());
        values.put("TaxNumber1", getTaxNumber1());
        values.put("TaxNumber2", getTaxNumber2());
        values.put("TaxNumber3", getTaxNumber3());
        values.put("TaxNumber4", getTaxNumber4());
        values.put("TaxNumber5", getTaxNumber5());
        values.put("TaxNumberResponsible", getTaxNumberResponsible());
        values.put("TaxNumberType", getTaxNumberType());
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
            if (values.containsKey("AlternativePayeeAccountNumber")) {
                final Object value = values.remove("AlternativePayeeAccountNumber");
                if ((value == null)||(!value.equals(getAlternativePayeeAccountNumber()))) {
                    setAlternativePayeeAccountNumber(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
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
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("PaymentIsBlockedForSupplier")) {
                final Object value = values.remove("PaymentIsBlockedForSupplier");
                if ((value == null)||(!value.equals(getPaymentIsBlockedForSupplier()))) {
                    setPaymentIsBlockedForSupplier(((Boolean) value));
                }
            }
            if (values.containsKey("PostingIsBlocked")) {
                final Object value = values.remove("PostingIsBlocked");
                if ((value == null)||(!value.equals(getPostingIsBlocked()))) {
                    setPostingIsBlocked(((Boolean) value));
                }
            }
            if (values.containsKey("PurchasingIsBlocked")) {
                final Object value = values.remove("PurchasingIsBlocked");
                if ((value == null)||(!value.equals(getPurchasingIsBlocked()))) {
                    setPurchasingIsBlocked(((Boolean) value));
                }
            }
            if (values.containsKey("SupplierAccountGroup")) {
                final Object value = values.remove("SupplierAccountGroup");
                if ((value == null)||(!value.equals(getSupplierAccountGroup()))) {
                    setSupplierAccountGroup(((String) value));
                }
            }
            if (values.containsKey("SupplierFullName")) {
                final Object value = values.remove("SupplierFullName");
                if ((value == null)||(!value.equals(getSupplierFullName()))) {
                    setSupplierFullName(((String) value));
                }
            }
            if (values.containsKey("SupplierName")) {
                final Object value = values.remove("SupplierName");
                if ((value == null)||(!value.equals(getSupplierName()))) {
                    setSupplierName(((String) value));
                }
            }
            if (values.containsKey("VATRegistration")) {
                final Object value = values.remove("VATRegistration");
                if ((value == null)||(!value.equals(getVATRegistration()))) {
                    setVATRegistration(((String) value));
                }
            }
            if (values.containsKey("BirthDate")) {
                final Object value = values.remove("BirthDate");
                if ((value == null)||(!value.equals(getBirthDate()))) {
                    setBirthDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ConcatenatedInternationalLocNo")) {
                final Object value = values.remove("ConcatenatedInternationalLocNo");
                if ((value == null)||(!value.equals(getConcatenatedInternationalLocNo()))) {
                    setConcatenatedInternationalLocNo(((String) value));
                }
            }
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
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
            if (values.containsKey("InternationalLocationNumber1")) {
                final Object value = values.remove("InternationalLocationNumber1");
                if ((value == null)||(!value.equals(getInternationalLocationNumber1()))) {
                    setInternationalLocationNumber1(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber2")) {
                final Object value = values.remove("InternationalLocationNumber2");
                if ((value == null)||(!value.equals(getInternationalLocationNumber2()))) {
                    setInternationalLocationNumber2(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber3")) {
                final Object value = values.remove("InternationalLocationNumber3");
                if ((value == null)||(!value.equals(getInternationalLocationNumber3()))) {
                    setInternationalLocationNumber3(((String) value));
                }
            }
            if (values.containsKey("IsNaturalPerson")) {
                final Object value = values.remove("IsNaturalPerson");
                if ((value == null)||(!value.equals(getIsNaturalPerson()))) {
                    setIsNaturalPerson(((String) value));
                }
            }
            if (values.containsKey("ResponsibleType")) {
                final Object value = values.remove("ResponsibleType");
                if ((value == null)||(!value.equals(getResponsibleType()))) {
                    setResponsibleType(((String) value));
                }
            }
            if (values.containsKey("SuplrQltyInProcmtCertfnValidTo")) {
                final Object value = values.remove("SuplrQltyInProcmtCertfnValidTo");
                if ((value == null)||(!value.equals(getSuplrQltyInProcmtCertfnValidTo()))) {
                    setSuplrQltyInProcmtCertfnValidTo(((LocalDateTime) value));
                }
            }
            if (values.containsKey("SuplrQualityManagementSystem")) {
                final Object value = values.remove("SuplrQualityManagementSystem");
                if ((value == null)||(!value.equals(getSuplrQualityManagementSystem()))) {
                    setSuplrQualityManagementSystem(((String) value));
                }
            }
            if (values.containsKey("SupplierCorporateGroup")) {
                final Object value = values.remove("SupplierCorporateGroup");
                if ((value == null)||(!value.equals(getSupplierCorporateGroup()))) {
                    setSupplierCorporateGroup(((String) value));
                }
            }
            if (values.containsKey("SupplierProcurementBlock")) {
                final Object value = values.remove("SupplierProcurementBlock");
                if ((value == null)||(!value.equals(getSupplierProcurementBlock()))) {
                    setSupplierProcurementBlock(((String) value));
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
            if (values.containsKey("TaxNumberResponsible")) {
                final Object value = values.remove("TaxNumberResponsible");
                if ((value == null)||(!value.equals(getTaxNumberResponsible()))) {
                    setTaxNumberResponsible(((String) value));
                }
            }
            if (values.containsKey("TaxNumberType")) {
                final Object value = values.remove("TaxNumberType");
                if ((value == null)||(!value.equals(getTaxNumberType()))) {
                    setTaxNumberType(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_SupplierCompany")) {
                final Object value = (values).remove("to_SupplierCompany");
                if (value instanceof Iterable) {
                    if (toSupplierCompany == null) {
                        toSupplierCompany = Lists.newArrayList();
                    } else {
                        toSupplierCompany = Lists.newArrayList(toSupplierCompany);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SupplierCompany entity;
                        if (toSupplierCompany.size()>i) {
                            entity = toSupplierCompany.get(i);
                        } else {
                            entity = new SupplierCompany();
                            toSupplierCompany.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_SupplierPurchasingOrg")) {
                final Object value = (values).remove("to_SupplierPurchasingOrg");
                if (value instanceof Iterable) {
                    if (toSupplierPurchasingOrg == null) {
                        toSupplierPurchasingOrg = Lists.newArrayList();
                    } else {
                        toSupplierPurchasingOrg = Lists.newArrayList(toSupplierPurchasingOrg);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SupplierPurchasingOrg entity;
                        if (toSupplierPurchasingOrg.size()>i) {
                            entity = toSupplierPurchasingOrg.get(i);
                        } else {
                            entity = new SupplierPurchasingOrg();
                            toSupplierPurchasingOrg.add(entity);
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
    public static<T >SupplierField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierField<T>(fieldName);
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
    public static<T,DomainT >SupplierField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierField<T>(fieldName, typeConverter);
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
        if (toSupplierCompany!= null) {
            (values).put("to_SupplierCompany", toSupplierCompany);
        }
        if (toSupplierPurchasingOrg!= null) {
            (values).put("to_SupplierPurchasingOrg", toSupplierPurchasingOrg);
        }
        return values;
    }

    /**
     * Fetches the <b>SupplierCompany</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SupplierCompany</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SupplierCompany</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierCompany> fetchSupplierCompany()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SupplierCompany.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Supplier=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(supplier));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SupplierCompany");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SupplierCompany> entityList = result.asList(SupplierCompany.class);
        for (SupplierCompany entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SupplierCompany</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierCompany</b>.
     * <p>
     * If the navigation property <b>to_SupplierCompany</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SupplierCompany</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierCompany> getSupplierCompanyOrFetch()
        throws ODataException
    {
        if (toSupplierCompany == null) {
            toSupplierCompany = fetchSupplierCompany();
        }
        return toSupplierCompany;
    }

    /**
     * Retrieval of associated <b>SupplierCompany</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierCompany</b>.
     * <p>
     * If the navigation property for an entity <b>Supplier</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SupplierCompany</b> is already loaded, the result will contain the <b>SupplierCompany</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SupplierCompany>> getSupplierCompanyIfPresent() {
        return Optional.ofNullable(toSupplierCompany);
    }

    /**
     * Overwrites the list of associated <b>SupplierCompany</b> entities for the loaded navigation property <b>to_SupplierCompany</b>.
     * <p>
     * If the navigation property <b>to_SupplierCompany</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SupplierCompany</b> entities.
     */
    public void setSupplierCompany(
        @Nonnull
        final List<SupplierCompany> value) {
        if (toSupplierCompany == null) {
            toSupplierCompany = Lists.newArrayList();
        }
        toSupplierCompany.clear();
        toSupplierCompany.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SupplierCompany</b> entities. This corresponds to the OData navigation property <b>to_SupplierCompany</b>.
     * <p>
     * If the navigation property <b>to_SupplierCompany</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SupplierCompany</b> entities.
     */
    public void addSupplierCompany(SupplierCompany... entity) {
        if (toSupplierCompany == null) {
            toSupplierCompany = Lists.newArrayList();
        }
        toSupplierCompany.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>SupplierPurchasingOrg</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SupplierPurchasingOrg</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SupplierPurchasingOrg</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierPurchasingOrg> fetchSupplierPurchasingOrg()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SupplierPurchasingOrg.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Supplier=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(supplier));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SupplierPurchasingOrg");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SupplierPurchasingOrg> entityList = result.asList(SupplierPurchasingOrg.class);
        for (SupplierPurchasingOrg entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SupplierPurchasingOrg</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierPurchasingOrg</b>.
     * <p>
     * If the navigation property <b>to_SupplierPurchasingOrg</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SupplierPurchasingOrg</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierPurchasingOrg> getSupplierPurchasingOrgOrFetch()
        throws ODataException
    {
        if (toSupplierPurchasingOrg == null) {
            toSupplierPurchasingOrg = fetchSupplierPurchasingOrg();
        }
        return toSupplierPurchasingOrg;
    }

    /**
     * Retrieval of associated <b>SupplierPurchasingOrg</b> entities (one to many). This corresponds to the OData navigation property <b>to_SupplierPurchasingOrg</b>.
     * <p>
     * If the navigation property for an entity <b>Supplier</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SupplierPurchasingOrg</b> is already loaded, the result will contain the <b>SupplierPurchasingOrg</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SupplierPurchasingOrg>> getSupplierPurchasingOrgIfPresent() {
        return Optional.ofNullable(toSupplierPurchasingOrg);
    }

    /**
     * Overwrites the list of associated <b>SupplierPurchasingOrg</b> entities for the loaded navigation property <b>to_SupplierPurchasingOrg</b>.
     * <p>
     * If the navigation property <b>to_SupplierPurchasingOrg</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SupplierPurchasingOrg</b> entities.
     */
    public void setSupplierPurchasingOrg(
        @Nonnull
        final List<SupplierPurchasingOrg> value) {
        if (toSupplierPurchasingOrg == null) {
            toSupplierPurchasingOrg = Lists.newArrayList();
        }
        toSupplierPurchasingOrg.clear();
        toSupplierPurchasingOrg.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SupplierPurchasingOrg</b> entities. This corresponds to the OData navigation property <b>to_SupplierPurchasingOrg</b>.
     * <p>
     * If the navigation property <b>to_SupplierPurchasingOrg</b> of a queried <b>Supplier</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SupplierPurchasingOrg</b> entities.
     */
    public void addSupplierPurchasingOrg(SupplierPurchasingOrg... entity) {
        if (toSupplierPurchasingOrg == null) {
            toSupplierPurchasingOrg = Lists.newArrayList();
        }
        toSupplierPurchasingOrg.addAll(Lists.newArrayList(entity));
    }

    public final static class SupplierBuilder {

        private List<SupplierCompany> toSupplierCompany = Lists.newArrayList();
        private List<SupplierPurchasingOrg> toSupplierPurchasingOrg = Lists.newArrayList();

        private Supplier.SupplierBuilder toSupplierCompany(List<SupplierCompany> value) {
            toSupplierCompany.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SupplierCompany</b> for <b>Supplier</b> to multiple <b>SupplierCompany</b>.
         * 
         */
        @Nonnull
        public Supplier.SupplierBuilder supplierCompany(SupplierCompany... value) {
            return toSupplierCompany(Lists.newArrayList(value));
        }

        private Supplier.SupplierBuilder toSupplierPurchasingOrg(List<SupplierPurchasingOrg> value) {
            toSupplierPurchasingOrg.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SupplierPurchasingOrg</b> for <b>Supplier</b> to multiple <b>SupplierPurchasingOrg</b>.
         * 
         */
        @Nonnull
        public Supplier.SupplierBuilder supplierPurchasingOrg(SupplierPurchasingOrg... value) {
            return toSupplierPurchasingOrg(Lists.newArrayList(value));
        }

    }

}
