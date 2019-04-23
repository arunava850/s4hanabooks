/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

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
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerSalesAreaField;
import vdm.namespaces.odataserviceforbusinesspartner.link.CustomerSalesAreaLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSalesAreaSelectable;


/**
 * Customer Sales Area<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerSalesAreaType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerSalesArea
    extends VdmEntity<CustomerSalesArea>
{

    /**
     * Selector for all available fields of CustomerSalesArea.
     * 
     */
    public final static CustomerSalesAreaSelectable ALL_FIELDS = new CustomerSalesAreaSelectable() {


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
    public final static CustomerSalesAreaField<String> CUSTOMER = new CustomerSalesAreaField<String>("Customer");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOrganization</b></p>
     * 
     * @param salesOrganization
     *     
     * @return
     *     Sales Organization
     */
    @Key
    @SerializedName("SalesOrganization")
    @JsonProperty("SalesOrganization")
    @Nullable
    @ODataField(odataName = "SalesOrganization")
    private String salesOrganization;
    /**
     * Use with available fluent helpers to apply the <b>SalesOrganization</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> SALES_ORGANIZATION = new CustomerSalesAreaField<String>("SalesOrganization");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DistributionChannel</b></p>
     * 
     * @param distributionChannel
     *     
     * @return
     *     Distribution Channel
     */
    @Key
    @SerializedName("DistributionChannel")
    @JsonProperty("DistributionChannel")
    @Nullable
    @ODataField(odataName = "DistributionChannel")
    private String distributionChannel;
    /**
     * Use with available fluent helpers to apply the <b>DistributionChannel</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> DISTRIBUTION_CHANNEL = new CustomerSalesAreaField<String>("DistributionChannel");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Division</b></p>
     * 
     * @param division
     *     
     * @return
     *     Division
     */
    @Key
    @SerializedName("Division")
    @JsonProperty("Division")
    @Nullable
    @ODataField(odataName = "Division")
    private String division;
    /**
     * Use with available fluent helpers to apply the <b>Division</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> DIVISION = new CustomerSalesAreaField<String>("Division");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>AccountByCustomer</b></p>
     * 
     * @param accountByCustomer
     *     
     * @return
     *     Shipper's (Our) Account Number at the Customer or Vendor
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
    public final static CustomerSalesAreaField<String> ACCOUNT_BY_CUSTOMER = new CustomerSalesAreaField<String>("AccountByCustomer");
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
    public final static CustomerSalesAreaField<String> AUTHORIZATION_GROUP = new CustomerSalesAreaField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BillingIsBlockedForCustomer</b></p>
     * 
     * @param billingIsBlockedForCustomer
     *     
     * @return
     *     Billing block for customer (sales and distribution)
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
    public final static CustomerSalesAreaField<String> BILLING_IS_BLOCKED_FOR_CUSTOMER = new CustomerSalesAreaField<String>("BillingIsBlockedForCustomer");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CompleteDeliveryIsDefined</b></p>
     * 
     * @param completeDeliveryIsDefined
     *     
     * @return
     *     Complete Delivery Defined for Each Sales Order?
     */
    @SerializedName("CompleteDeliveryIsDefined")
    @JsonProperty("CompleteDeliveryIsDefined")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "CompleteDeliveryIsDefined")
    private Boolean completeDeliveryIsDefined;
    /**
     * Use with available fluent helpers to apply the <b>CompleteDeliveryIsDefined</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<Boolean> COMPLETE_DELIVERY_IS_DEFINED = new CustomerSalesAreaField<Boolean>("CompleteDeliveryIsDefined");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>Currency</b></p>
     * 
     * @param currency
     *     
     * @return
     *     Currency
     */
    @SerializedName("Currency")
    @JsonProperty("Currency")
    @Nullable
    @ODataField(odataName = "Currency")
    private String currency;
    /**
     * Use with available fluent helpers to apply the <b>Currency</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CURRENCY = new CustomerSalesAreaField<String>("Currency");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerABCClassification</b></p>
     * 
     * @param customerABCClassification
     *     
     * @return
     *     Customer classification (ABC analysis)
     */
    @SerializedName("CustomerABCClassification")
    @JsonProperty("CustomerABCClassification")
    @Nullable
    @ODataField(odataName = "CustomerABCClassification")
    private String customerABCClassification;
    /**
     * Use with available fluent helpers to apply the <b>CustomerABCClassification</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_ABC_CLASSIFICATION = new CustomerSalesAreaField<String>("CustomerABCClassification");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerAccountAssignmentGroup</b></p>
     * 
     * @param customerAccountAssignmentGroup
     *     
     * @return
     *     Account Assignment Group for this customer
     */
    @SerializedName("CustomerAccountAssignmentGroup")
    @JsonProperty("CustomerAccountAssignmentGroup")
    @Nullable
    @ODataField(odataName = "CustomerAccountAssignmentGroup")
    private String customerAccountAssignmentGroup;
    /**
     * Use with available fluent helpers to apply the <b>CustomerAccountAssignmentGroup</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_ACCOUNT_ASSIGNMENT_GROUP = new CustomerSalesAreaField<String>("CustomerAccountAssignmentGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerGroup</b></p>
     * 
     * @param customerGroup
     *     
     * @return
     *     Customer Group
     */
    @SerializedName("CustomerGroup")
    @JsonProperty("CustomerGroup")
    @Nullable
    @ODataField(odataName = "CustomerGroup")
    private String customerGroup;
    /**
     * Use with available fluent helpers to apply the <b>CustomerGroup</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_GROUP = new CustomerSalesAreaField<String>("CustomerGroup");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerPaymentTerms</b></p>
     * 
     * @param customerPaymentTerms
     *     
     * @return
     *     Terms of Payment Key
     */
    @SerializedName("CustomerPaymentTerms")
    @JsonProperty("CustomerPaymentTerms")
    @Nullable
    @ODataField(odataName = "CustomerPaymentTerms")
    private String customerPaymentTerms;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPaymentTerms</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_PAYMENT_TERMS = new CustomerSalesAreaField<String>("CustomerPaymentTerms");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerPriceGroup</b></p>
     * 
     * @param customerPriceGroup
     *     
     * @return
     *     Customer Price Group
     */
    @SerializedName("CustomerPriceGroup")
    @JsonProperty("CustomerPriceGroup")
    @Nullable
    @ODataField(odataName = "CustomerPriceGroup")
    private String customerPriceGroup;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPriceGroup</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_PRICE_GROUP = new CustomerSalesAreaField<String>("CustomerPriceGroup");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerPricingProcedure</b></p>
     * 
     * @param customerPricingProcedure
     *     
     * @return
     *     Customer Classification for Pricing Procedure Determination
     */
    @SerializedName("CustomerPricingProcedure")
    @JsonProperty("CustomerPricingProcedure")
    @Nullable
    @ODataField(odataName = "CustomerPricingProcedure")
    private String customerPricingProcedure;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPricingProcedure</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> CUSTOMER_PRICING_PROCEDURE = new CustomerSalesAreaField<String>("CustomerPricingProcedure");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlockedForCustomer</b></p>
     * 
     * @param deliveryIsBlockedForCustomer
     *     
     * @return
     *     Customer delivery block (sales area)
     */
    @SerializedName("DeliveryIsBlockedForCustomer")
    @JsonProperty("DeliveryIsBlockedForCustomer")
    @Nullable
    @ODataField(odataName = "DeliveryIsBlockedForCustomer")
    private String deliveryIsBlockedForCustomer;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryIsBlockedForCustomer</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> DELIVERY_IS_BLOCKED_FOR_CUSTOMER = new CustomerSalesAreaField<String>("DeliveryIsBlockedForCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryPriority</b></p>
     * 
     * @param deliveryPriority
     *     
     * @return
     *     Delivery Priority
     */
    @SerializedName("DeliveryPriority")
    @JsonProperty("DeliveryPriority")
    @Nullable
    @ODataField(odataName = "DeliveryPriority")
    private String deliveryPriority;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryPriority</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> DELIVERY_PRIORITY = new CustomerSalesAreaField<String>("DeliveryPriority");
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
    public final static CustomerSalesAreaField<String> INCOTERMS_CLASSIFICATION = new CustomerSalesAreaField<String>("IncotermsClassification");
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
    public final static CustomerSalesAreaField<String> INCOTERMS_LOCATION2 = new CustomerSalesAreaField<String>("IncotermsLocation2");
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
    public final static CustomerSalesAreaField<String> INCOTERMS_VERSION = new CustomerSalesAreaField<String>("IncotermsVersion");
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
    public final static CustomerSalesAreaField<String> INCOTERMS_LOCATION1 = new CustomerSalesAreaField<String>("IncotermsLocation1");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     
     * @return
     *     Deletion flag for customer (sales level)
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
    public final static CustomerSalesAreaField<Boolean> DELETION_INDICATOR = new CustomerSalesAreaField<Boolean>("DeletionIndicator");
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
    public final static CustomerSalesAreaField<String> INCOTERMS_TRANSFER_LOCATION = new CustomerSalesAreaField<String>("IncotermsTransferLocation");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InvoiceDate</b></p>
     * 
     * @param invoiceDate
     *     
     * @return
     *     Invoice Dates (Calendar Identification)
     */
    @SerializedName("InvoiceDate")
    @JsonProperty("InvoiceDate")
    @Nullable
    @ODataField(odataName = "InvoiceDate")
    private String invoiceDate;
    /**
     * Use with available fluent helpers to apply the <b>InvoiceDate</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> INVOICE_DATE = new CustomerSalesAreaField<String>("InvoiceDate");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>ItemOrderProbabilityInPercent</b></p>
     * 
     * @param itemOrderProbabilityInPercent
     *     
     * @return
     *     Order Probability of the Item
     */
    @SerializedName("ItemOrderProbabilityInPercent")
    @JsonProperty("ItemOrderProbabilityInPercent")
    @Nullable
    @ODataField(odataName = "ItemOrderProbabilityInPercent")
    private String itemOrderProbabilityInPercent;
    /**
     * Use with available fluent helpers to apply the <b>ItemOrderProbabilityInPercent</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> ITEM_ORDER_PROBABILITY_IN_PERCENT = new CustomerSalesAreaField<String>("ItemOrderProbabilityInPercent");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>OrderCombinationIsAllowed</b></p>
     * 
     * @param orderCombinationIsAllowed
     *     
     * @return
     *     Order Combination Indicator
     */
    @SerializedName("OrderCombinationIsAllowed")
    @JsonProperty("OrderCombinationIsAllowed")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "OrderCombinationIsAllowed")
    private Boolean orderCombinationIsAllowed;
    /**
     * Use with available fluent helpers to apply the <b>OrderCombinationIsAllowed</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<Boolean> ORDER_COMBINATION_IS_ALLOWED = new CustomerSalesAreaField<Boolean>("OrderCombinationIsAllowed");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OrderIsBlockedForCustomer</b></p>
     * 
     * @param orderIsBlockedForCustomer
     *     
     * @return
     *     Customer order block (sales area)
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
    public final static CustomerSalesAreaField<String> ORDER_IS_BLOCKED_FOR_CUSTOMER = new CustomerSalesAreaField<String>("OrderIsBlockedForCustomer");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PartialDeliveryIsAllowed</b></p>
     * 
     * @param partialDeliveryIsAllowed
     *     
     * @return
     *     Partial Delivery at Item Level
     */
    @SerializedName("PartialDeliveryIsAllowed")
    @JsonProperty("PartialDeliveryIsAllowed")
    @Nullable
    @ODataField(odataName = "PartialDeliveryIsAllowed")
    private String partialDeliveryIsAllowed;
    /**
     * Use with available fluent helpers to apply the <b>PartialDeliveryIsAllowed</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> PARTIAL_DELIVERY_IS_ALLOWED = new CustomerSalesAreaField<String>("PartialDeliveryIsAllowed");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PriceListType</b></p>
     * 
     * @param priceListType
     *     
     * @return
     *     Price List Type
     */
    @SerializedName("PriceListType")
    @JsonProperty("PriceListType")
    @Nullable
    @ODataField(odataName = "PriceListType")
    private String priceListType;
    /**
     * Use with available fluent helpers to apply the <b>PriceListType</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> PRICE_LIST_TYPE = new CustomerSalesAreaField<String>("PriceListType");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>SalesGroup</b></p>
     * 
     * @param salesGroup
     *     
     * @return
     *     Sales Group
     */
    @SerializedName("SalesGroup")
    @JsonProperty("SalesGroup")
    @Nullable
    @ODataField(odataName = "SalesGroup")
    private String salesGroup;
    /**
     * Use with available fluent helpers to apply the <b>SalesGroup</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> SALES_GROUP = new CustomerSalesAreaField<String>("SalesGroup");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOffice</b></p>
     * 
     * @param salesOffice
     *     
     * @return
     *     Sales Office
     */
    @SerializedName("SalesOffice")
    @JsonProperty("SalesOffice")
    @Nullable
    @ODataField(odataName = "SalesOffice")
    private String salesOffice;
    /**
     * Use with available fluent helpers to apply the <b>SalesOffice</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> SALES_OFFICE = new CustomerSalesAreaField<String>("SalesOffice");
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
    public final static CustomerSalesAreaField<String> SHIPPING_CONDITION = new CustomerSalesAreaField<String>("ShippingCondition");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplyingPlant</b></p>
     * 
     * @param supplyingPlant
     *     
     * @return
     *     Delivering Plant (Own or External)
     */
    @SerializedName("SupplyingPlant")
    @JsonProperty("SupplyingPlant")
    @Nullable
    @ODataField(odataName = "SupplyingPlant")
    private String supplyingPlant;
    /**
     * Use with available fluent helpers to apply the <b>SupplyingPlant</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> SUPPLYING_PLANT = new CustomerSalesAreaField<String>("SupplyingPlant");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SalesDistrict</b></p>
     * 
     * @param salesDistrict
     *     
     * @return
     *     Sales District
     */
    @SerializedName("SalesDistrict")
    @JsonProperty("SalesDistrict")
    @Nullable
    @ODataField(odataName = "SalesDistrict")
    private String salesDistrict;
    /**
     * Use with available fluent helpers to apply the <b>SalesDistrict</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaField<String> SALES_DISTRICT = new CustomerSalesAreaField<String>("SalesDistrict");
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
    public final static CustomerSalesAreaField<String> CUSTOMER_ACCOUNT_GROUP = new CustomerSalesAreaField<String>("CustomerAccountGroup");
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
     * Navigation property <b>to_PartnerFunction</b> for <b>CustomerSalesArea</b> to multiple <b>CustSalesPartnerFunc</b>.
     * 
     */
    @SerializedName("to_PartnerFunction")
    @JsonProperty("to_PartnerFunction")
    @ODataField(odataName = "to_PartnerFunction")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustSalesPartnerFunc> toPartnerFunction;
    /**
     * Navigation property <b>to_SalesAreaTax</b> for <b>CustomerSalesArea</b> to multiple <b>CustomerSalesAreaTax</b>.
     * 
     */
    @SerializedName("to_SalesAreaTax")
    @JsonProperty("to_SalesAreaTax")
    @ODataField(odataName = "to_SalesAreaTax")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<CustomerSalesAreaTax> toSalesAreaTax;
    /**
     * Use with available fluent helpers to apply the <b>to_PartnerFunction</b> navigation property to query operations.
     * 
     */
    public final static CustomerSalesAreaLink<CustSalesPartnerFunc> TO_PARTNER_FUNCTION = new CustomerSalesAreaLink<CustSalesPartnerFunc>("to_PartnerFunction");
    /**
     * Use with available fluent helpers to apply the <b>to_SalesAreaTax</b> navigation property to query operations.
     * 
     */
    public final static CustomerSalesAreaLink<CustomerSalesAreaTax> TO_SALES_AREA_TAX = new CustomerSalesAreaLink<CustomerSalesAreaTax>("to_SalesAreaTax");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<CustomerSalesArea> getType() {
        return CustomerSalesArea.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOrganization</b></p>
     * 
     * @param salesOrganization
     *     Sales Organization
     */
    public void setSalesOrganization(
        @Nullable
        final String salesOrganization) {
        rememberChangedField("SalesOrganization", this.salesOrganization);
        this.salesOrganization = salesOrganization;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DistributionChannel</b></p>
     * 
     * @param distributionChannel
     *     Distribution Channel
     */
    public void setDistributionChannel(
        @Nullable
        final String distributionChannel) {
        rememberChangedField("DistributionChannel", this.distributionChannel);
        this.distributionChannel = distributionChannel;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Division</b></p>
     * 
     * @param division
     *     Division
     */
    public void setDivision(
        @Nullable
        final String division) {
        rememberChangedField("Division", this.division);
        this.division = division;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>AccountByCustomer</b></p>
     * 
     * @param accountByCustomer
     *     Shipper's (Our) Account Number at the Customer or Vendor
     */
    public void setAccountByCustomer(
        @Nullable
        final String accountByCustomer) {
        rememberChangedField("AccountByCustomer", this.accountByCustomer);
        this.accountByCustomer = accountByCustomer;
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
     *     Billing block for customer (sales and distribution)
     */
    public void setBillingIsBlockedForCustomer(
        @Nullable
        final String billingIsBlockedForCustomer) {
        rememberChangedField("BillingIsBlockedForCustomer", this.billingIsBlockedForCustomer);
        this.billingIsBlockedForCustomer = billingIsBlockedForCustomer;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CompleteDeliveryIsDefined</b></p>
     * 
     * @param completeDeliveryIsDefined
     *     Complete Delivery Defined for Each Sales Order?
     */
    public void setCompleteDeliveryIsDefined(
        @Nullable
        final Boolean completeDeliveryIsDefined) {
        rememberChangedField("CompleteDeliveryIsDefined", this.completeDeliveryIsDefined);
        this.completeDeliveryIsDefined = completeDeliveryIsDefined;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>Currency</b></p>
     * 
     * @param currency
     *     Currency
     */
    public void setCurrency(
        @Nullable
        final String currency) {
        rememberChangedField("Currency", this.currency);
        this.currency = currency;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerABCClassification</b></p>
     * 
     * @param customerABCClassification
     *     Customer classification (ABC analysis)
     */
    public void setCustomerABCClassification(
        @Nullable
        final String customerABCClassification) {
        rememberChangedField("CustomerABCClassification", this.customerABCClassification);
        this.customerABCClassification = customerABCClassification;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerAccountAssignmentGroup</b></p>
     * 
     * @param customerAccountAssignmentGroup
     *     Account Assignment Group for this customer
     */
    public void setCustomerAccountAssignmentGroup(
        @Nullable
        final String customerAccountAssignmentGroup) {
        rememberChangedField("CustomerAccountAssignmentGroup", this.customerAccountAssignmentGroup);
        this.customerAccountAssignmentGroup = customerAccountAssignmentGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerGroup</b></p>
     * 
     * @param customerGroup
     *     Customer Group
     */
    public void setCustomerGroup(
        @Nullable
        final String customerGroup) {
        rememberChangedField("CustomerGroup", this.customerGroup);
        this.customerGroup = customerGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerPaymentTerms</b></p>
     * 
     * @param customerPaymentTerms
     *     Terms of Payment Key
     */
    public void setCustomerPaymentTerms(
        @Nullable
        final String customerPaymentTerms) {
        rememberChangedField("CustomerPaymentTerms", this.customerPaymentTerms);
        this.customerPaymentTerms = customerPaymentTerms;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerPriceGroup</b></p>
     * 
     * @param customerPriceGroup
     *     Customer Price Group
     */
    public void setCustomerPriceGroup(
        @Nullable
        final String customerPriceGroup) {
        rememberChangedField("CustomerPriceGroup", this.customerPriceGroup);
        this.customerPriceGroup = customerPriceGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CustomerPricingProcedure</b></p>
     * 
     * @param customerPricingProcedure
     *     Customer Classification for Pricing Procedure Determination
     */
    public void setCustomerPricingProcedure(
        @Nullable
        final String customerPricingProcedure) {
        rememberChangedField("CustomerPricingProcedure", this.customerPricingProcedure);
        this.customerPricingProcedure = customerPricingProcedure;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryIsBlockedForCustomer</b></p>
     * 
     * @param deliveryIsBlockedForCustomer
     *     Customer delivery block (sales area)
     */
    public void setDeliveryIsBlockedForCustomer(
        @Nullable
        final String deliveryIsBlockedForCustomer) {
        rememberChangedField("DeliveryIsBlockedForCustomer", this.deliveryIsBlockedForCustomer);
        this.deliveryIsBlockedForCustomer = deliveryIsBlockedForCustomer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DeliveryPriority</b></p>
     * 
     * @param deliveryPriority
     *     Delivery Priority
     */
    public void setDeliveryPriority(
        @Nullable
        final String deliveryPriority) {
        rememberChangedField("DeliveryPriority", this.deliveryPriority);
        this.deliveryPriority = deliveryPriority;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>DeletionIndicator</b></p>
     * 
     * @param deletionIndicator
     *     Deletion flag for customer (sales level)
     */
    public void setDeletionIndicator(
        @Nullable
        final Boolean deletionIndicator) {
        rememberChangedField("DeletionIndicator", this.deletionIndicator);
        this.deletionIndicator = deletionIndicator;
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
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>InvoiceDate</b></p>
     * 
     * @param invoiceDate
     *     Invoice Dates (Calendar Identification)
     */
    public void setInvoiceDate(
        @Nullable
        final String invoiceDate) {
        rememberChangedField("InvoiceDate", this.invoiceDate);
        this.invoiceDate = invoiceDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>ItemOrderProbabilityInPercent</b></p>
     * 
     * @param itemOrderProbabilityInPercent
     *     Order Probability of the Item
     */
    public void setItemOrderProbabilityInPercent(
        @Nullable
        final String itemOrderProbabilityInPercent) {
        rememberChangedField("ItemOrderProbabilityInPercent", this.itemOrderProbabilityInPercent);
        this.itemOrderProbabilityInPercent = itemOrderProbabilityInPercent;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>OrderCombinationIsAllowed</b></p>
     * 
     * @param orderCombinationIsAllowed
     *     Order Combination Indicator
     */
    public void setOrderCombinationIsAllowed(
        @Nullable
        final Boolean orderCombinationIsAllowed) {
        rememberChangedField("OrderCombinationIsAllowed", this.orderCombinationIsAllowed);
        this.orderCombinationIsAllowed = orderCombinationIsAllowed;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>OrderIsBlockedForCustomer</b></p>
     * 
     * @param orderIsBlockedForCustomer
     *     Customer order block (sales area)
     */
    public void setOrderIsBlockedForCustomer(
        @Nullable
        final String orderIsBlockedForCustomer) {
        rememberChangedField("OrderIsBlockedForCustomer", this.orderIsBlockedForCustomer);
        this.orderIsBlockedForCustomer = orderIsBlockedForCustomer;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PartialDeliveryIsAllowed</b></p>
     * 
     * @param partialDeliveryIsAllowed
     *     Partial Delivery at Item Level
     */
    public void setPartialDeliveryIsAllowed(
        @Nullable
        final String partialDeliveryIsAllowed) {
        rememberChangedField("PartialDeliveryIsAllowed", this.partialDeliveryIsAllowed);
        this.partialDeliveryIsAllowed = partialDeliveryIsAllowed;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PriceListType</b></p>
     * 
     * @param priceListType
     *     Price List Type
     */
    public void setPriceListType(
        @Nullable
        final String priceListType) {
        rememberChangedField("PriceListType", this.priceListType);
        this.priceListType = priceListType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>SalesGroup</b></p>
     * 
     * @param salesGroup
     *     Sales Group
     */
    public void setSalesGroup(
        @Nullable
        final String salesGroup) {
        rememberChangedField("SalesGroup", this.salesGroup);
        this.salesGroup = salesGroup;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SalesOffice</b></p>
     * 
     * @param salesOffice
     *     Sales Office
     */
    public void setSalesOffice(
        @Nullable
        final String salesOffice) {
        rememberChangedField("SalesOffice", this.salesOffice);
        this.salesOffice = salesOffice;
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
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>SupplyingPlant</b></p>
     * 
     * @param supplyingPlant
     *     Delivering Plant (Own or External)
     */
    public void setSupplyingPlant(
        @Nullable
        final String supplyingPlant) {
        rememberChangedField("SupplyingPlant", this.supplyingPlant);
        this.supplyingPlant = supplyingPlant;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SalesDistrict</b></p>
     * 
     * @param salesDistrict
     *     Sales District
     */
    public void setSalesDistrict(
        @Nullable
        final String salesDistrict) {
        rememberChangedField("SalesDistrict", this.salesDistrict);
        this.salesDistrict = salesDistrict;
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
        return "A_CustomerSalesArea";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("SalesOrganization", getSalesOrganization());
        result.put("DistributionChannel", getDistributionChannel());
        result.put("Division", getDivision());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("SalesOrganization", getSalesOrganization());
        values.put("DistributionChannel", getDistributionChannel());
        values.put("Division", getDivision());
        values.put("AccountByCustomer", getAccountByCustomer());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("BillingIsBlockedForCustomer", getBillingIsBlockedForCustomer());
        values.put("CompleteDeliveryIsDefined", getCompleteDeliveryIsDefined());
        values.put("Currency", getCurrency());
        values.put("CustomerABCClassification", getCustomerABCClassification());
        values.put("CustomerAccountAssignmentGroup", getCustomerAccountAssignmentGroup());
        values.put("CustomerGroup", getCustomerGroup());
        values.put("CustomerPaymentTerms", getCustomerPaymentTerms());
        values.put("CustomerPriceGroup", getCustomerPriceGroup());
        values.put("CustomerPricingProcedure", getCustomerPricingProcedure());
        values.put("DeliveryIsBlockedForCustomer", getDeliveryIsBlockedForCustomer());
        values.put("DeliveryPriority", getDeliveryPriority());
        values.put("IncotermsClassification", getIncotermsClassification());
        values.put("IncotermsLocation2", getIncotermsLocation2());
        values.put("IncotermsVersion", getIncotermsVersion());
        values.put("IncotermsLocation1", getIncotermsLocation1());
        values.put("DeletionIndicator", getDeletionIndicator());
        values.put("IncotermsTransferLocation", getIncotermsTransferLocation());
        values.put("InvoiceDate", getInvoiceDate());
        values.put("ItemOrderProbabilityInPercent", getItemOrderProbabilityInPercent());
        values.put("OrderCombinationIsAllowed", getOrderCombinationIsAllowed());
        values.put("OrderIsBlockedForCustomer", getOrderIsBlockedForCustomer());
        values.put("PartialDeliveryIsAllowed", getPartialDeliveryIsAllowed());
        values.put("PriceListType", getPriceListType());
        values.put("SalesGroup", getSalesGroup());
        values.put("SalesOffice", getSalesOffice());
        values.put("ShippingCondition", getShippingCondition());
        values.put("SupplyingPlant", getSupplyingPlant());
        values.put("SalesDistrict", getSalesDistrict());
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
            if (values.containsKey("SalesOrganization")) {
                final Object value = values.remove("SalesOrganization");
                if ((value == null)||(!value.equals(getSalesOrganization()))) {
                    setSalesOrganization(((String) value));
                }
            }
            if (values.containsKey("DistributionChannel")) {
                final Object value = values.remove("DistributionChannel");
                if ((value == null)||(!value.equals(getDistributionChannel()))) {
                    setDistributionChannel(((String) value));
                }
            }
            if (values.containsKey("Division")) {
                final Object value = values.remove("Division");
                if ((value == null)||(!value.equals(getDivision()))) {
                    setDivision(((String) value));
                }
            }
            if (values.containsKey("AccountByCustomer")) {
                final Object value = values.remove("AccountByCustomer");
                if ((value == null)||(!value.equals(getAccountByCustomer()))) {
                    setAccountByCustomer(((String) value));
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
            if (values.containsKey("CompleteDeliveryIsDefined")) {
                final Object value = values.remove("CompleteDeliveryIsDefined");
                if ((value == null)||(!value.equals(getCompleteDeliveryIsDefined()))) {
                    setCompleteDeliveryIsDefined(((Boolean) value));
                }
            }
            if (values.containsKey("Currency")) {
                final Object value = values.remove("Currency");
                if ((value == null)||(!value.equals(getCurrency()))) {
                    setCurrency(((String) value));
                }
            }
            if (values.containsKey("CustomerABCClassification")) {
                final Object value = values.remove("CustomerABCClassification");
                if ((value == null)||(!value.equals(getCustomerABCClassification()))) {
                    setCustomerABCClassification(((String) value));
                }
            }
            if (values.containsKey("CustomerAccountAssignmentGroup")) {
                final Object value = values.remove("CustomerAccountAssignmentGroup");
                if ((value == null)||(!value.equals(getCustomerAccountAssignmentGroup()))) {
                    setCustomerAccountAssignmentGroup(((String) value));
                }
            }
            if (values.containsKey("CustomerGroup")) {
                final Object value = values.remove("CustomerGroup");
                if ((value == null)||(!value.equals(getCustomerGroup()))) {
                    setCustomerGroup(((String) value));
                }
            }
            if (values.containsKey("CustomerPaymentTerms")) {
                final Object value = values.remove("CustomerPaymentTerms");
                if ((value == null)||(!value.equals(getCustomerPaymentTerms()))) {
                    setCustomerPaymentTerms(((String) value));
                }
            }
            if (values.containsKey("CustomerPriceGroup")) {
                final Object value = values.remove("CustomerPriceGroup");
                if ((value == null)||(!value.equals(getCustomerPriceGroup()))) {
                    setCustomerPriceGroup(((String) value));
                }
            }
            if (values.containsKey("CustomerPricingProcedure")) {
                final Object value = values.remove("CustomerPricingProcedure");
                if ((value == null)||(!value.equals(getCustomerPricingProcedure()))) {
                    setCustomerPricingProcedure(((String) value));
                }
            }
            if (values.containsKey("DeliveryIsBlockedForCustomer")) {
                final Object value = values.remove("DeliveryIsBlockedForCustomer");
                if ((value == null)||(!value.equals(getDeliveryIsBlockedForCustomer()))) {
                    setDeliveryIsBlockedForCustomer(((String) value));
                }
            }
            if (values.containsKey("DeliveryPriority")) {
                final Object value = values.remove("DeliveryPriority");
                if ((value == null)||(!value.equals(getDeliveryPriority()))) {
                    setDeliveryPriority(((String) value));
                }
            }
            if (values.containsKey("IncotermsClassification")) {
                final Object value = values.remove("IncotermsClassification");
                if ((value == null)||(!value.equals(getIncotermsClassification()))) {
                    setIncotermsClassification(((String) value));
                }
            }
            if (values.containsKey("IncotermsLocation2")) {
                final Object value = values.remove("IncotermsLocation2");
                if ((value == null)||(!value.equals(getIncotermsLocation2()))) {
                    setIncotermsLocation2(((String) value));
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
            if (values.containsKey("DeletionIndicator")) {
                final Object value = values.remove("DeletionIndicator");
                if ((value == null)||(!value.equals(getDeletionIndicator()))) {
                    setDeletionIndicator(((Boolean) value));
                }
            }
            if (values.containsKey("IncotermsTransferLocation")) {
                final Object value = values.remove("IncotermsTransferLocation");
                if ((value == null)||(!value.equals(getIncotermsTransferLocation()))) {
                    setIncotermsTransferLocation(((String) value));
                }
            }
            if (values.containsKey("InvoiceDate")) {
                final Object value = values.remove("InvoiceDate");
                if ((value == null)||(!value.equals(getInvoiceDate()))) {
                    setInvoiceDate(((String) value));
                }
            }
            if (values.containsKey("ItemOrderProbabilityInPercent")) {
                final Object value = values.remove("ItemOrderProbabilityInPercent");
                if ((value == null)||(!value.equals(getItemOrderProbabilityInPercent()))) {
                    setItemOrderProbabilityInPercent(((String) value));
                }
            }
            if (values.containsKey("OrderCombinationIsAllowed")) {
                final Object value = values.remove("OrderCombinationIsAllowed");
                if ((value == null)||(!value.equals(getOrderCombinationIsAllowed()))) {
                    setOrderCombinationIsAllowed(((Boolean) value));
                }
            }
            if (values.containsKey("OrderIsBlockedForCustomer")) {
                final Object value = values.remove("OrderIsBlockedForCustomer");
                if ((value == null)||(!value.equals(getOrderIsBlockedForCustomer()))) {
                    setOrderIsBlockedForCustomer(((String) value));
                }
            }
            if (values.containsKey("PartialDeliveryIsAllowed")) {
                final Object value = values.remove("PartialDeliveryIsAllowed");
                if ((value == null)||(!value.equals(getPartialDeliveryIsAllowed()))) {
                    setPartialDeliveryIsAllowed(((String) value));
                }
            }
            if (values.containsKey("PriceListType")) {
                final Object value = values.remove("PriceListType");
                if ((value == null)||(!value.equals(getPriceListType()))) {
                    setPriceListType(((String) value));
                }
            }
            if (values.containsKey("SalesGroup")) {
                final Object value = values.remove("SalesGroup");
                if ((value == null)||(!value.equals(getSalesGroup()))) {
                    setSalesGroup(((String) value));
                }
            }
            if (values.containsKey("SalesOffice")) {
                final Object value = values.remove("SalesOffice");
                if ((value == null)||(!value.equals(getSalesOffice()))) {
                    setSalesOffice(((String) value));
                }
            }
            if (values.containsKey("ShippingCondition")) {
                final Object value = values.remove("ShippingCondition");
                if ((value == null)||(!value.equals(getShippingCondition()))) {
                    setShippingCondition(((String) value));
                }
            }
            if (values.containsKey("SupplyingPlant")) {
                final Object value = values.remove("SupplyingPlant");
                if ((value == null)||(!value.equals(getSupplyingPlant()))) {
                    setSupplyingPlant(((String) value));
                }
            }
            if (values.containsKey("SalesDistrict")) {
                final Object value = values.remove("SalesDistrict");
                if ((value == null)||(!value.equals(getSalesDistrict()))) {
                    setSalesDistrict(((String) value));
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
                        CustSalesPartnerFunc entity;
                        if (toPartnerFunction.size()>i) {
                            entity = toPartnerFunction.get(i);
                        } else {
                            entity = new CustSalesPartnerFunc();
                            toPartnerFunction.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_SalesAreaTax")) {
                final Object value = (values).remove("to_SalesAreaTax");
                if (value instanceof Iterable) {
                    if (toSalesAreaTax == null) {
                        toSalesAreaTax = Lists.newArrayList();
                    } else {
                        toSalesAreaTax = Lists.newArrayList(toSalesAreaTax);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        CustomerSalesAreaTax entity;
                        if (toSalesAreaTax.size()>i) {
                            entity = toSalesAreaTax.get(i);
                        } else {
                            entity = new CustomerSalesAreaTax();
                            toSalesAreaTax.add(entity);
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
    public static<T >CustomerSalesAreaField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerSalesAreaField<T>(fieldName);
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
    public static<T,DomainT >CustomerSalesAreaField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerSalesAreaField<T>(fieldName, typeConverter);
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
        if (toSalesAreaTax!= null) {
            (values).put("to_SalesAreaTax", toSalesAreaTax);
        }
        return values;
    }

    /**
     * Fetches the <b>CustSalesPartnerFunc</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustSalesPartnerFunc</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustSalesPartnerFunc> fetchPartnerFunction()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustSalesPartnerFunc.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(",SalesOrganization=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrganization));
        odataResourceUrl.append(",DistributionChannel=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(distributionChannel));
        odataResourceUrl.append(",Division=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(division));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PartnerFunction");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustSalesPartnerFunc> entityList = result.asList(CustSalesPartnerFunc.class);
        for (CustSalesPartnerFunc entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustSalesPartnerFunc</b> entities (one to many). This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustSalesPartnerFunc</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustSalesPartnerFunc> getPartnerFunctionOrFetch()
        throws ODataException
    {
        if (toPartnerFunction == null) {
            toPartnerFunction = fetchPartnerFunction();
        }
        return toPartnerFunction;
    }

    /**
     * Retrieval of associated <b>CustSalesPartnerFunc</b> entities (one to many). This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property for an entity <b>CustomerSalesArea</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_PartnerFunction</b> is already loaded, the result will contain the <b>CustSalesPartnerFunc</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustSalesPartnerFunc>> getPartnerFunctionIfPresent() {
        return Optional.ofNullable(toPartnerFunction);
    }

    /**
     * Overwrites the list of associated <b>CustSalesPartnerFunc</b> entities for the loaded navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustSalesPartnerFunc</b> entities.
     */
    public void setPartnerFunction(
        @Nonnull
        final List<CustSalesPartnerFunc> value) {
        if (toPartnerFunction == null) {
            toPartnerFunction = Lists.newArrayList();
        }
        toPartnerFunction.clear();
        toPartnerFunction.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustSalesPartnerFunc</b> entities. This corresponds to the OData navigation property <b>to_PartnerFunction</b>.
     * <p>
     * If the navigation property <b>to_PartnerFunction</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustSalesPartnerFunc</b> entities.
     */
    public void addPartnerFunction(CustSalesPartnerFunc... entity) {
        if (toPartnerFunction == null) {
            toPartnerFunction = Lists.newArrayList();
        }
        toPartnerFunction.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>CustomerSalesAreaTax</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_SalesAreaTax</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>CustomerSalesAreaTax</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerSalesAreaTax> fetchSalesAreaTax()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type CustomerSalesAreaTax.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("Customer=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(customer));
        odataResourceUrl.append(",SalesOrganization=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(salesOrganization));
        odataResourceUrl.append(",DistributionChannel=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(distributionChannel));
        odataResourceUrl.append(",Division=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(division));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_SalesAreaTax");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<CustomerSalesAreaTax> entityList = result.asList(CustomerSalesAreaTax.class);
        for (CustomerSalesAreaTax entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>CustomerSalesAreaTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_SalesAreaTax</b>.
     * <p>
     * If the navigation property <b>to_SalesAreaTax</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>CustomerSalesAreaTax</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<CustomerSalesAreaTax> getSalesAreaTaxOrFetch()
        throws ODataException
    {
        if (toSalesAreaTax == null) {
            toSalesAreaTax = fetchSalesAreaTax();
        }
        return toSalesAreaTax;
    }

    /**
     * Retrieval of associated <b>CustomerSalesAreaTax</b> entities (one to many). This corresponds to the OData navigation property <b>to_SalesAreaTax</b>.
     * <p>
     * If the navigation property for an entity <b>CustomerSalesArea</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_SalesAreaTax</b> is already loaded, the result will contain the <b>CustomerSalesAreaTax</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<CustomerSalesAreaTax>> getSalesAreaTaxIfPresent() {
        return Optional.ofNullable(toSalesAreaTax);
    }

    /**
     * Overwrites the list of associated <b>CustomerSalesAreaTax</b> entities for the loaded navigation property <b>to_SalesAreaTax</b>.
     * <p>
     * If the navigation property <b>to_SalesAreaTax</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>CustomerSalesAreaTax</b> entities.
     */
    public void setSalesAreaTax(
        @Nonnull
        final List<CustomerSalesAreaTax> value) {
        if (toSalesAreaTax == null) {
            toSalesAreaTax = Lists.newArrayList();
        }
        toSalesAreaTax.clear();
        toSalesAreaTax.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>CustomerSalesAreaTax</b> entities. This corresponds to the OData navigation property <b>to_SalesAreaTax</b>.
     * <p>
     * If the navigation property <b>to_SalesAreaTax</b> of a queried <b>CustomerSalesArea</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>CustomerSalesAreaTax</b> entities.
     */
    public void addSalesAreaTax(CustomerSalesAreaTax... entity) {
        if (toSalesAreaTax == null) {
            toSalesAreaTax = Lists.newArrayList();
        }
        toSalesAreaTax.addAll(Lists.newArrayList(entity));
    }

    public final static class CustomerSalesAreaBuilder {

        private List<CustSalesPartnerFunc> toPartnerFunction = Lists.newArrayList();
        private List<CustomerSalesAreaTax> toSalesAreaTax = Lists.newArrayList();

        private CustomerSalesArea.CustomerSalesAreaBuilder toPartnerFunction(List<CustSalesPartnerFunc> value) {
            toPartnerFunction.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PartnerFunction</b> for <b>CustomerSalesArea</b> to multiple <b>CustSalesPartnerFunc</b>.
         * 
         */
        @Nonnull
        public CustomerSalesArea.CustomerSalesAreaBuilder partnerFunction(CustSalesPartnerFunc... value) {
            return toPartnerFunction(Lists.newArrayList(value));
        }

        private CustomerSalesArea.CustomerSalesAreaBuilder toSalesAreaTax(List<CustomerSalesAreaTax> value) {
            toSalesAreaTax.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_SalesAreaTax</b> for <b>CustomerSalesArea</b> to multiple <b>CustomerSalesAreaTax</b>.
         * 
         */
        @Nonnull
        public CustomerSalesArea.CustomerSalesAreaBuilder salesAreaTax(CustomerSalesAreaTax... value) {
            return toSalesAreaTax(Lists.newArrayList(value));
        }

    }

}
