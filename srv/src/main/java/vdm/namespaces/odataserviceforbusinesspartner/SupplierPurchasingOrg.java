/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.SupplierPurchasingOrgField;
import vdm.namespaces.odataserviceforbusinesspartner.link.SupplierPurchasingOrgLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierPurchasingOrgSelectable;


/**
 * Supplier Purchasing Organization<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierPurchasingOrgType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SupplierPurchasingOrg
    extends VdmEntity<SupplierPurchasingOrg>
{

    /**
     * Selector for all available fields of SupplierPurchasingOrg.
     * 
     */
    public final static SupplierPurchasingOrgSelectable ALL_FIELDS = new SupplierPurchasingOrgSelectable() {


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
     *     Vendor Account Number
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
    public final static SupplierPurchasingOrgField<String> SUPPLIER = new SupplierPurchasingOrgField<String>("Supplier");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @param purchasingOrganization
     *     
     * @return
     *     Purchasing Organization
     */
    @Key
    @SerializedName("PurchasingOrganization")
    @JsonProperty("PurchasingOrganization")
    @Nullable
    @ODataField(odataName = "PurchasingOrganization")
    private String purchasingOrganization;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingOrganization</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> PURCHASING_ORGANIZATION = new SupplierPurchasingOrgField<String>("PurchasingOrganization");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CalculationSchemaGroupCode</b></p>
     * 
     * @param calculationSchemaGroupCode
     *     
     * @return
     *     Group for Calculation Schema (Supplier)
     */
    @SerializedName("CalculationSchemaGroupCode")
    @JsonProperty("CalculationSchemaGroupCode")
    @Nullable
    @ODataField(odataName = "CalculationSchemaGroupCode")
    private String calculationSchemaGroupCode;
    /**
     * Use with available fluent helpers to apply the <b>CalculationSchemaGroupCode</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> CALCULATION_SCHEMA_GROUP_CODE = new SupplierPurchasingOrgField<String>("CalculationSchemaGroupCode");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     
     * @return
     *     Deletion Indicator for Supplier at Purchasing Level
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
    public final static SupplierPurchasingOrgField<Boolean> DELETION_INDICATOR = new SupplierPurchasingOrgField<Boolean>("DeletionIndicator");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>IncotermsClassification</b></p>
     * 
     * @param incotermsClassification
     *     
     * @return
     *     Incoterms (Part 1)
     */
    @SerializedName("IncotermsClassification")
    @JsonProperty("IncotermsClassification")
    @Nullable
    @ODataField(odataName = "IncotermsClassification")
    private String incotermsClassification;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsClassification</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> INCOTERMS_CLASSIFICATION = new SupplierPurchasingOrgField<String>("IncotermsClassification");
    /**
     * Constraints: Not nullable, Maximum length: 28 <p>Original property name from the Odata EDM: <b>IncotermsTransferLocation</b></p>
     * 
     * @param incotermsTransferLocation
     *     
     * @return
     *     Incoterms (Part 2)
     */
    @SerializedName("IncotermsTransferLocation")
    @JsonProperty("IncotermsTransferLocation")
    @Nullable
    @ODataField(odataName = "IncotermsTransferLocation")
    private String incotermsTransferLocation;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsTransferLocation</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> INCOTERMS_TRANSFER_LOCATION = new SupplierPurchasingOrgField<String>("IncotermsTransferLocation");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IncotermsVersion</b></p>
     * 
     * @param incotermsVersion
     *     
     * @return
     *     Incoterms Version
     */
    @SerializedName("IncotermsVersion")
    @JsonProperty("IncotermsVersion")
    @Nullable
    @ODataField(odataName = "IncotermsVersion")
    private String incotermsVersion;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsVersion</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> INCOTERMS_VERSION = new SupplierPurchasingOrgField<String>("IncotermsVersion");
    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation1</b></p>
     * 
     * @param incotermsLocation1
     *     
     * @return
     *     Incoterms Location 1
     */
    @SerializedName("IncotermsLocation1")
    @JsonProperty("IncotermsLocation1")
    @Nullable
    @ODataField(odataName = "IncotermsLocation1")
    private String incotermsLocation1;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation1</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> INCOTERMS_LOCATION1 = new SupplierPurchasingOrgField<String>("IncotermsLocation1");
    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation2</b></p>
     * 
     * @param incotermsLocation2
     *     
     * @return
     *     Incoterms Location 2
     */
    @SerializedName("IncotermsLocation2")
    @JsonProperty("IncotermsLocation2")
    @Nullable
    @ODataField(odataName = "IncotermsLocation2")
    private String incotermsLocation2;
    /**
     * Use with available fluent helpers to apply the <b>IncotermsLocation2</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> INCOTERMS_LOCATION2 = new SupplierPurchasingOrgField<String>("IncotermsLocation2");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InvoiceIsGoodsReceiptBased</b></p>
     * 
     * @param invoiceIsGoodsReceiptBased
     *     
     * @return
     *     Indicator: GR-Based Invoice Verification
     */
    @SerializedName("InvoiceIsGoodsReceiptBased")
    @JsonProperty("InvoiceIsGoodsReceiptBased")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "InvoiceIsGoodsReceiptBased")
    private Boolean invoiceIsGoodsReceiptBased;
    /**
     * Use with available fluent helpers to apply the <b>InvoiceIsGoodsReceiptBased</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<Boolean> INVOICE_IS_GOODS_RECEIPT_BASED = new SupplierPurchasingOrgField<Boolean>("InvoiceIsGoodsReceiptBased");
    /**
     * Constraints: Not nullable, Precision: 3, Scale: 0 <p>Original property name from the Odata EDM: <b>MaterialPlannedDeliveryDurn</b></p>
     * 
     * @param materialPlannedDeliveryDurn
     *     
     * @return
     *     Planned Delivery Time in Days
     */
    @SerializedName("MaterialPlannedDeliveryDurn")
    @JsonProperty("MaterialPlannedDeliveryDurn")
    @Nullable
    @ODataField(odataName = "MaterialPlannedDeliveryDurn")
    private BigDecimal materialPlannedDeliveryDurn;
    /**
     * Use with available fluent helpers to apply the <b>MaterialPlannedDeliveryDurn</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<BigDecimal> MATERIAL_PLANNED_DELIVERY_DURN = new SupplierPurchasingOrgField<BigDecimal>("MaterialPlannedDeliveryDurn");
    /**
     * Constraints: Not nullable, Precision: 14, Scale: 3 <p>Original property name from the Odata EDM: <b>MinimumOrderAmount</b></p>
     * 
     * @param minimumOrderAmount
     *     
     * @return
     *     Minimum order value
     */
    @SerializedName("MinimumOrderAmount")
    @JsonProperty("MinimumOrderAmount")
    @Nullable
    @ODataField(odataName = "MinimumOrderAmount")
    private BigDecimal minimumOrderAmount;
    /**
     * Use with available fluent helpers to apply the <b>MinimumOrderAmount</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<BigDecimal> MINIMUM_ORDER_AMOUNT = new SupplierPurchasingOrgField<BigDecimal>("MinimumOrderAmount");
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
    public final static SupplierPurchasingOrgField<String> PAYMENT_TERMS = new SupplierPurchasingOrgField<String>("PaymentTerms");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PricingDateControl</b></p>
     * 
     * @param pricingDateControl
     *     
     * @return
     *     Price Determination (Pricing) Date Control
     */
    @SerializedName("PricingDateControl")
    @JsonProperty("PricingDateControl")
    @Nullable
    @ODataField(odataName = "PricingDateControl")
    private String pricingDateControl;
    /**
     * Use with available fluent helpers to apply the <b>PricingDateControl</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> PRICING_DATE_CONTROL = new SupplierPurchasingOrgField<String>("PricingDateControl");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurOrdAutoGenerationIsAllowed</b></p>
     * 
     * @param purOrdAutoGenerationIsAllowed
     *     
     * @return
     *     Automatic Generation of Purchase Order Allowed
     */
    @SerializedName("PurOrdAutoGenerationIsAllowed")
    @JsonProperty("PurOrdAutoGenerationIsAllowed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PurOrdAutoGenerationIsAllowed")
    private Boolean purOrdAutoGenerationIsAllowed;
    /**
     * Use with available fluent helpers to apply the <b>PurOrdAutoGenerationIsAllowed</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<Boolean> PUR_ORD_AUTO_GENERATION_IS_ALLOWED = new SupplierPurchasingOrgField<Boolean>("PurOrdAutoGenerationIsAllowed");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PurchaseOrderCurrency</b></p>
     * 
     * @param purchaseOrderCurrency
     *     
     * @return
     *     Purchase order currency
     */
    @SerializedName("PurchaseOrderCurrency")
    @JsonProperty("PurchaseOrderCurrency")
    @Nullable
    @ODataField(odataName = "PurchaseOrderCurrency")
    private String purchaseOrderCurrency;
    /**
     * Use with available fluent helpers to apply the <b>PurchaseOrderCurrency</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> PURCHASE_ORDER_CURRENCY = new SupplierPurchasingOrgField<String>("PurchaseOrderCurrency");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PurchasingGroup</b></p>
     * 
     * @param purchasingGroup
     *     
     * @return
     *     Purchasing Group
     */
    @SerializedName("PurchasingGroup")
    @JsonProperty("PurchasingGroup")
    @Nullable
    @ODataField(odataName = "PurchasingGroup")
    private String purchasingGroup;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingGroup</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> PURCHASING_GROUP = new SupplierPurchasingOrgField<String>("PurchasingGroup");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurchasingIsBlockedForSupplier</b></p>
     * 
     * @param purchasingIsBlockedForSupplier
     *     
     * @return
     *     Purchasing block at purchasing organization level
     */
    @SerializedName("PurchasingIsBlockedForSupplier")
    @JsonProperty("PurchasingIsBlockedForSupplier")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "PurchasingIsBlockedForSupplier")
    private Boolean purchasingIsBlockedForSupplier;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingIsBlockedForSupplier</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<Boolean> PURCHASING_IS_BLOCKED_FOR_SUPPLIER = new SupplierPurchasingOrgField<Boolean>("PurchasingIsBlockedForSupplier");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ShippingCondition</b></p>
     * 
     * @param shippingCondition
     *     
     * @return
     *     Shipping Conditions
     */
    @SerializedName("ShippingCondition")
    @JsonProperty("ShippingCondition")
    @Nullable
    @ODataField(odataName = "ShippingCondition")
    private String shippingCondition;
    /**
     * Use with available fluent helpers to apply the <b>ShippingCondition</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> SHIPPING_CONDITION = new SupplierPurchasingOrgField<String>("ShippingCondition");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>SupplierABCClassificationCode</b></p>
     * 
     * @param supplierABCClassificationCode
     *     
     * @return
     *     ABC indicator
     */
    @SerializedName("SupplierABCClassificationCode")
    @JsonProperty("SupplierABCClassificationCode")
    @Nullable
    @ODataField(odataName = "SupplierABCClassificationCode")
    private String supplierABCClassificationCode;
    /**
     * Use with available fluent helpers to apply the <b>SupplierABCClassificationCode</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> SUPPLIER_ABC_CLASSIFICATION_CODE = new SupplierPurchasingOrgField<String>("SupplierABCClassificationCode");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>SupplierPhoneNumber</b></p>
     * 
     * @param supplierPhoneNumber
     *     
     * @return
     *     Supplier's Telephone Number
     */
    @SerializedName("SupplierPhoneNumber")
    @JsonProperty("SupplierPhoneNumber")
    @Nullable
    @ODataField(odataName = "SupplierPhoneNumber")
    private String supplierPhoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>SupplierPhoneNumber</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> SUPPLIER_PHONE_NUMBER = new SupplierPurchasingOrgField<String>("SupplierPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SupplierRespSalesPersonName</b></p>
     * 
     * @param supplierRespSalesPersonName
     *     
     * @return
     *     Responsible Salesperson at Supplier's Office
     */
    @SerializedName("SupplierRespSalesPersonName")
    @JsonProperty("SupplierRespSalesPersonName")
    @Nullable
    @ODataField(odataName = "SupplierRespSalesPersonName")
    private String supplierRespSalesPersonName;
    /**
     * Use with available fluent helpers to apply the <b>SupplierRespSalesPersonName</b> field to query operations.
     * 
     */
    public final static SupplierPurchasingOrgField<String> SUPPLIER_RESP_SALES_PERSON_NAME = new SupplierPurchasingOrgField<String>("SupplierRespSalesPersonName");
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
    public final static SupplierPurchasingOrgField<String> AUTHORIZATION_GROUP = new SupplierPurchasingOrgField<String>("AuthorizationGroup");
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
    public final static SupplierPurchasingOrgField<String> SUPPLIER_ACCOUNT_GROUP = new SupplierPurchasingOrgField<String>("SupplierAccountGroup");
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
     * Navigation property <b>to_PartnerFunction</b> for <b>SupplierPurchasingOrg</b> to multiple <b>SupplierPartnerFunc</b>.
     * 
     */
    @SerializedName("to_PartnerFunction")
    @JsonProperty("to_PartnerFunction")
    @ODataField(odataName = "to_PartnerFunction")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<SupplierPartnerFunc> toPartnerFunction;
    /**
     * Use with available fluent helpers to apply the <b>to_PartnerFunction</b> navigation property to query operations.
     * 
     */
    public final static SupplierPurchasingOrgLink<SupplierPartnerFunc> TO_PARTNER_FUNCTION = new SupplierPurchasingOrgLink<SupplierPartnerFunc>("to_PartnerFunction");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<SupplierPurchasingOrg> getType() {
        return SupplierPurchasingOrg.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     Vendor Account Number
     */
    public void setSupplier(
        @Nullable
        final String supplier) {
        rememberChangedField("Supplier", this.supplier);
        this.supplier = supplier;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @param purchasingOrganization
     *     Purchasing Organization
     */
    public void setPurchasingOrganization(
        @Nullable
        final String purchasingOrganization) {
        rememberChangedField("PurchasingOrganization", this.purchasingOrganization);
        this.purchasingOrganization = purchasingOrganization;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CalculationSchemaGroupCode</b></p>
     * 
     * @param calculationSchemaGroupCode
     *     Group for Calculation Schema (Supplier)
     */
    public void setCalculationSchemaGroupCode(
        @Nullable
        final String calculationSchemaGroupCode) {
        rememberChangedField("CalculationSchemaGroupCode", this.calculationSchemaGroupCode);
        this.calculationSchemaGroupCode = calculationSchemaGroupCode;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     Deletion Indicator for Supplier at Purchasing Level
     */
    public void setDeletionIndicator(
        @Nullable
        final Boolean deletionIndicator) {
        rememberChangedField("DeletionIndicator", this.deletionIndicator);
        this.deletionIndicator = deletionIndicator;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>IncotermsClassification</b></p>
     * 
     * @param incotermsClassification
     *     Incoterms (Part 1)
     */
    public void setIncotermsClassification(
        @Nullable
        final String incotermsClassification) {
        rememberChangedField("IncotermsClassification", this.incotermsClassification);
        this.incotermsClassification = incotermsClassification;
    }

    /**
     * Constraints: Not nullable, Maximum length: 28 <p>Original property name from the Odata EDM: <b>IncotermsTransferLocation</b></p>
     * 
     * @param incotermsTransferLocation
     *     Incoterms (Part 2)
     */
    public void setIncotermsTransferLocation(
        @Nullable
        final String incotermsTransferLocation) {
        rememberChangedField("IncotermsTransferLocation", this.incotermsTransferLocation);
        this.incotermsTransferLocation = incotermsTransferLocation;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IncotermsVersion</b></p>
     * 
     * @param incotermsVersion
     *     Incoterms Version
     */
    public void setIncotermsVersion(
        @Nullable
        final String incotermsVersion) {
        rememberChangedField("IncotermsVersion", this.incotermsVersion);
        this.incotermsVersion = incotermsVersion;
    }

    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation1</b></p>
     * 
     * @param incotermsLocation1
     *     Incoterms Location 1
     */
    public void setIncotermsLocation1(
        @Nullable
        final String incotermsLocation1) {
        rememberChangedField("IncotermsLocation1", this.incotermsLocation1);
        this.incotermsLocation1 = incotermsLocation1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 70 <p>Original property name from the Odata EDM: <b>IncotermsLocation2</b></p>
     * 
     * @param incotermsLocation2
     *     Incoterms Location 2
     */
    public void setIncotermsLocation2(
        @Nullable
        final String incotermsLocation2) {
        rememberChangedField("IncotermsLocation2", this.incotermsLocation2);
        this.incotermsLocation2 = incotermsLocation2;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>InvoiceIsGoodsReceiptBased</b></p>
     * 
     * @param invoiceIsGoodsReceiptBased
     *     Indicator: GR-Based Invoice Verification
     */
    public void setInvoiceIsGoodsReceiptBased(
        @Nullable
        final Boolean invoiceIsGoodsReceiptBased) {
        rememberChangedField("InvoiceIsGoodsReceiptBased", this.invoiceIsGoodsReceiptBased);
        this.invoiceIsGoodsReceiptBased = invoiceIsGoodsReceiptBased;
    }

    /**
     * Constraints: Not nullable, Precision: 3, Scale: 0 <p>Original property name from the Odata EDM: <b>MaterialPlannedDeliveryDurn</b></p>
     * 
     * @param materialPlannedDeliveryDurn
     *     Planned Delivery Time in Days
     */
    public void setMaterialPlannedDeliveryDurn(
        @Nullable
        final BigDecimal materialPlannedDeliveryDurn) {
        rememberChangedField("MaterialPlannedDeliveryDurn", this.materialPlannedDeliveryDurn);
        this.materialPlannedDeliveryDurn = materialPlannedDeliveryDurn;
    }

    /**
     * Constraints: Not nullable, Precision: 14, Scale: 3 <p>Original property name from the Odata EDM: <b>MinimumOrderAmount</b></p>
     * 
     * @param minimumOrderAmount
     *     Minimum order value
     */
    public void setMinimumOrderAmount(
        @Nullable
        final BigDecimal minimumOrderAmount) {
        rememberChangedField("MinimumOrderAmount", this.minimumOrderAmount);
        this.minimumOrderAmount = minimumOrderAmount;
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
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PricingDateControl</b></p>
     * 
     * @param pricingDateControl
     *     Price Determination (Pricing) Date Control
     */
    public void setPricingDateControl(
        @Nullable
        final String pricingDateControl) {
        rememberChangedField("PricingDateControl", this.pricingDateControl);
        this.pricingDateControl = pricingDateControl;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurOrdAutoGenerationIsAllowed</b></p>
     * 
     * @param purOrdAutoGenerationIsAllowed
     *     Automatic Generation of Purchase Order Allowed
     */
    public void setPurOrdAutoGenerationIsAllowed(
        @Nullable
        final Boolean purOrdAutoGenerationIsAllowed) {
        rememberChangedField("PurOrdAutoGenerationIsAllowed", this.purOrdAutoGenerationIsAllowed);
        this.purOrdAutoGenerationIsAllowed = purOrdAutoGenerationIsAllowed;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>PurchaseOrderCurrency</b></p>
     * 
     * @param purchaseOrderCurrency
     *     Purchase order currency
     */
    public void setPurchaseOrderCurrency(
        @Nullable
        final String purchaseOrderCurrency) {
        rememberChangedField("PurchaseOrderCurrency", this.purchaseOrderCurrency);
        this.purchaseOrderCurrency = purchaseOrderCurrency;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PurchasingGroup</b></p>
     * 
     * @param purchasingGroup
     *     Purchasing Group
     */
    public void setPurchasingGroup(
        @Nullable
        final String purchasingGroup) {
        rememberChangedField("PurchasingGroup", this.purchasingGroup);
        this.purchasingGroup = purchasingGroup;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>PurchasingIsBlockedForSupplier</b></p>
     * 
     * @param purchasingIsBlockedForSupplier
     *     Purchasing block at purchasing organization level
     */
    public void setPurchasingIsBlockedForSupplier(
        @Nullable
        final Boolean purchasingIsBlockedForSupplier) {
        rememberChangedField("PurchasingIsBlockedForSupplier", this.purchasingIsBlockedForSupplier);
        this.purchasingIsBlockedForSupplier = purchasingIsBlockedForSupplier;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ShippingCondition</b></p>
     * 
     * @param shippingCondition
     *     Shipping Conditions
     */
    public void setShippingCondition(
        @Nullable
        final String shippingCondition) {
        rememberChangedField("ShippingCondition", this.shippingCondition);
        this.shippingCondition = shippingCondition;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>SupplierABCClassificationCode</b></p>
     * 
     * @param supplierABCClassificationCode
     *     ABC indicator
     */
    public void setSupplierABCClassificationCode(
        @Nullable
        final String supplierABCClassificationCode) {
        rememberChangedField("SupplierABCClassificationCode", this.supplierABCClassificationCode);
        this.supplierABCClassificationCode = supplierABCClassificationCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>SupplierPhoneNumber</b></p>
     * 
     * @param supplierPhoneNumber
     *     Supplier's Telephone Number
     */
    public void setSupplierPhoneNumber(
        @Nullable
        final String supplierPhoneNumber) {
        rememberChangedField("SupplierPhoneNumber", this.supplierPhoneNumber);
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>SupplierRespSalesPersonName</b></p>
     * 
     * @param supplierRespSalesPersonName
     *     Responsible Salesperson at Supplier's Office
     */
    public void setSupplierRespSalesPersonName(
        @Nullable
        final String supplierRespSalesPersonName) {
        rememberChangedField("SupplierRespSalesPersonName", this.supplierRespSalesPersonName);
        this.supplierRespSalesPersonName = supplierRespSalesPersonName;
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
        return "A_SupplierPurchasingOrg";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("PurchasingOrganization", getPurchasingOrganization());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("PurchasingOrganization", getPurchasingOrganization());
        values.put("CalculationSchemaGroupCode", getCalculationSchemaGroupCode());
        values.put("DeletionIndicator", getDeletionIndicator());
        values.put("IncotermsClassification", getIncotermsClassification());
        values.put("IncotermsTransferLocation", getIncotermsTransferLocation());
        values.put("IncotermsVersion", getIncotermsVersion());
        values.put("IncotermsLocation1", getIncotermsLocation1());
        values.put("IncotermsLocation2", getIncotermsLocation2());
        values.put("InvoiceIsGoodsReceiptBased", getInvoiceIsGoodsReceiptBased());
        values.put("MaterialPlannedDeliveryDurn", getMaterialPlannedDeliveryDurn());
        values.put("MinimumOrderAmount", getMinimumOrderAmount());
        values.put("PaymentTerms", getPaymentTerms());
        values.put("PricingDateControl", getPricingDateControl());
        values.put("PurOrdAutoGenerationIsAllowed", getPurOrdAutoGenerationIsAllowed());
        values.put("PurchaseOrderCurrency", getPurchaseOrderCurrency());
        values.put("PurchasingGroup", getPurchasingGroup());
        values.put("PurchasingIsBlockedForSupplier", getPurchasingIsBlockedForSupplier());
        values.put("ShippingCondition", getShippingCondition());
        values.put("SupplierABCClassificationCode", getSupplierABCClassificationCode());
        values.put("SupplierPhoneNumber", getSupplierPhoneNumber());
        values.put("SupplierRespSalesPersonName", getSupplierRespSalesPersonName());
        values.put("AuthorizationGroup", getAuthorizationGroup());
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
            if (values.containsKey("PurchasingOrganization")) {
                final Object value = values.remove("PurchasingOrganization");
                if ((value == null)||(!value.equals(getPurchasingOrganization()))) {
                    setPurchasingOrganization(((String) value));
                }
            }
            if (values.containsKey("CalculationSchemaGroupCode")) {
                final Object value = values.remove("CalculationSchemaGroupCode");
                if ((value == null)||(!value.equals(getCalculationSchemaGroupCode()))) {
                    setCalculationSchemaGroupCode(((String) value));
                }
            }
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
                }
            }
            if (values.containsKey("IncotermsClassification")) {
                final Object value = values.remove("IncotermsClassification");
                if ((value == null)||(!value.equals(getIncotermsClassification()))) {
                    setIncotermsClassification(((String) value));
                }
            }
            if (values.containsKey("IncotermsTransferLocation")) {
                final Object value = values.remove("IncotermsTransferLocation");
                if ((value == null)||(!value.equals(getIncotermsTransferLocation()))) {
                    setIncotermsTransferLocation(((String) value));
                }
            }
            if (values.containsKey("IncotermsVersion")) {
                final Object value = values.remove("IncotermsVersion");
                if ((value == null)||(!value.equals(getIncotermsVersion()))) {
                    setIncotermsVersion(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation1")) {
                final Object value = values.remove("IncotermsLocation1");
                if ((value == null)||(!value.equals(getIncotermsLocation1()))) {
                    setIncotermsLocation1(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation2")) {
                final Object value = values.remove("IncotermsLocation2");
                if ((value == null)||(!value.equals(getIncotermsLocation2()))) {
                    setIncotermsLocation2(((String) value));
                }
            }
            if (values.containsKey("InvoiceIsGoodsReceiptBased")) {
                final Object value = values.remove("InvoiceIsGoodsReceiptBased");
                if ((value == null)||(!value.equals(getInvoiceIsGoodsReceiptBased()))) {
                    setInvoiceIsGoodsReceiptBased(((Boolean) value));
                }
            }
            if (values.containsKey("MaterialPlannedDeliveryDurn")) {
                final Object value = values.remove("MaterialPlannedDeliveryDurn");
                if ((value == null)||(!value.equals(getMaterialPlannedDeliveryDurn()))) {
                    setMaterialPlannedDeliveryDurn(((BigDecimal) value));
                }
            }
            if (values.containsKey("MinimumOrderAmount")) {
                final Object value = values.remove("MinimumOrderAmount");
                if ((value == null)||(!value.equals(getMinimumOrderAmount()))) {
                    setMinimumOrderAmount(((BigDecimal) value));
                }
            }
            if (values.containsKey("PaymentTerms")) {
                final Object value = values.remove("PaymentTerms");
                if ((value == null)||(!value.equals(getPaymentTerms()))) {
                    setPaymentTerms(((String) value));
                }
            }
            if (values.containsKey("PricingDateControl")) {
                final Object value = values.remove("PricingDateControl");
                if ((value == null)||(!value.equals(getPricingDateControl()))) {
                    setPricingDateControl(((String) value));
                }
            }
            if (values.containsKey("PurOrdAutoGenerationIsAllowed")) {
                final Object value = values.remove("PurOrdAutoGenerationIsAllowed");
                if ((value == null)||(!value.equals(getPurOrdAutoGenerationIsAllowed()))) {
                    setPurOrdAutoGenerationIsAllowed(((Boolean) value));
                }
            }
            if (values.containsKey("PurchaseOrderCurrency")) {
                final Object value = values.remove("PurchaseOrderCurrency");
                if ((value == null)||(!value.equals(getPurchaseOrderCurrency()))) {
                    setPurchaseOrderCurrency(((String) value));
                }
            }
            if (values.containsKey("PurchasingGroup")) {
                final Object value = values.remove("PurchasingGroup");
                if ((value == null)||(!value.equals(getPurchasingGroup()))) {
                    setPurchasingGroup(((String) value));
                }
            }
            if (values.containsKey("PurchasingIsBlockedForSupplier")) {
                final Object value = values.remove("PurchasingIsBlockedForSupplier");
                if ((value == null)||(!value.equals(getPurchasingIsBlockedForSupplier()))) {
                    setPurchasingIsBlockedForSupplier(((Boolean) value));
                }
            }
            if (values.containsKey("ShippingCondition")) {
                final Object value = values.remove("ShippingCondition");
                if ((value == null)||(!value.equals(getShippingCondition()))) {
                    setShippingCondition(((String) value));
                }
            }
            if (values.containsKey("SupplierABCClassificationCode")) {
                final Object value = values.remove("SupplierABCClassificationCode");
                if ((value == null)||(!value.equals(getSupplierABCClassificationCode()))) {
                    setSupplierABCClassificationCode(((String) value));
                }
            }
            if (values.containsKey("SupplierPhoneNumber")) {
                final Object value = values.remove("SupplierPhoneNumber");
                if ((value == null)||(!value.equals(getSupplierPhoneNumber()))) {
                    setSupplierPhoneNumber(((String) value));
                }
            }
            if (values.containsKey("SupplierRespSalesPersonName")) {
                final Object value = values.remove("SupplierRespSalesPersonName");
                if ((value == null)||(!value.equals(getSupplierRespSalesPersonName()))) {
                    setSupplierRespSalesPersonName(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
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
            if ((values).containsKey("to_PartnerFunction")) {
                final Object value = (values).remove("to_PartnerFunction");
                if (value instanceof Iterable) {
                    if (toPartnerFunction == null) {
                        toPartnerFunction = Lists.newArrayList();
                    } else {
                        toPartnerFunction = Lists.newArrayList(toPartnerFunction);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        SupplierPartnerFunc entity;
                        if (toPartnerFunction.size()>i) {
                            entity = toPartnerFunction.get(i);
                        } else {
                            entity = new SupplierPartnerFunc();
                            toPartnerFunction.add(entity);
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
    public static<T >SupplierPurchasingOrgField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierPurchasingOrgField<T>(fieldName);
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
    public static<T,DomainT >SupplierPurchasingOrgField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierPurchasingOrgField<T>(fieldName, typeConverter);
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
        if (toPartnerFunction!= null) {
            (values).put("to_PartnerFunction", toPartnerFunction);
        }
        return values;
    }

    /**
     * Fetches the <b>SupplierPartnerFunc</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>SupplierPartnerFunc</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierPartnerFunc> fetchPartnerFunction()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type SupplierPartnerFunc.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Supplier=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(supplier));
        odataResourceUrl.append(",PurchasingOrganization=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(purchasingOrganization));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PartnerFunction");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<SupplierPartnerFunc> entityList = result.asList(SupplierPartnerFunc.class);
        for (SupplierPartnerFunc entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>SupplierPartnerFunc</b> entities (one to many). This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>SupplierPurchasingOrg</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>SupplierPartnerFunc</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<SupplierPartnerFunc> getPartnerFunctionOrFetch()
        throws ODataException
    {
        if (toPartnerFunction == null) {
            toPartnerFunction = fetchPartnerFunction();
        }
        return toPartnerFunction;
    }

    /**
     * Retrieval of associated <b>SupplierPartnerFunc</b> entities (one to many). This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property for an entity <b>SupplierPurchasingOrg</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_PartnerFunction</b> is already loaded, the result will contain the <b>SupplierPartnerFunc</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<SupplierPartnerFunc>> getPartnerFunctionIfPresent() {
        return Optional.ofNullable(toPartnerFunction);
    }

    /**
     * Overwrites the list of associated <b>SupplierPartnerFunc</b> entities for the loaded navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>SupplierPurchasingOrg</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>SupplierPartnerFunc</b> entities.
     */
    public void setPartnerFunction(
        @Nonnull
        final List<SupplierPartnerFunc> value) {
        if (toPartnerFunction == null) {
            toPartnerFunction = Lists.newArrayList();
        }
        toPartnerFunction.clear();
        toPartnerFunction.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>SupplierPartnerFunc</b> entities. This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>SupplierPurchasingOrg</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>SupplierPartnerFunc</b> entities.
     */
    public void addPartnerFunction(SupplierPartnerFunc... entity) {
        if (toPartnerFunction == null) {
            toPartnerFunction = Lists.newArrayList();
        }
        toPartnerFunction.addAll(Lists.newArrayList(entity));
    }

    public final static class SupplierPurchasingOrgBuilder {

        private List<SupplierPartnerFunc> toPartnerFunction = Lists.newArrayList();

        private SupplierPurchasingOrg.SupplierPurchasingOrgBuilder toPartnerFunction(List<SupplierPartnerFunc> value) {
            toPartnerFunction.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PartnerFunction</b> for <b>SupplierPurchasingOrg</b> to multiple <b>SupplierPartnerFunc</b>.
         * 
         */
        @Nonnull
        public SupplierPurchasingOrg.SupplierPurchasingOrgBuilder partnerFunction(SupplierPartnerFunc... value) {
            return toPartnerFunction(Lists.newArrayList(value));
        }

    }

}
