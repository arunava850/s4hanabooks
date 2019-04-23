/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerSalesAreaTaxField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerSalesAreaTaxSelectable;


/**
 * Customer Sales Area Tax<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerSalesAreaTaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerSalesAreaTax
    extends VdmEntity<CustomerSalesAreaTax>
{

    /**
     * Selector for all available fields of CustomerSalesAreaTax.
     * 
     */
    public final static CustomerSalesAreaTaxSelectable ALL_FIELDS = new CustomerSalesAreaTaxSelectable() {


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
    public final static CustomerSalesAreaTaxField<String> CUSTOMER = new CustomerSalesAreaTaxField<String>("Customer");
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
    public final static CustomerSalesAreaTaxField<String> SALES_ORGANIZATION = new CustomerSalesAreaTaxField<String>("SalesOrganization");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DistributionChannel</b></p>
     * 
     * @param distributionChannel
     *     
     * @return
     *     Reference distrib.channel for cust.and material masters
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
    public final static CustomerSalesAreaTaxField<String> DISTRIBUTION_CHANNEL = new CustomerSalesAreaTaxField<String>("DistributionChannel");
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
    public final static CustomerSalesAreaTaxField<String> DIVISION = new CustomerSalesAreaTaxField<String>("Division");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DepartureCountry</b></p>
     * 
     * @param departureCountry
     *     
     * @return
     *     Departure country (country from which the goods are sent)
     */
    @Key
    @SerializedName("DepartureCountry")
    @JsonProperty("DepartureCountry")
    @Nullable
    @ODataField(odataName = "DepartureCountry")
    private String departureCountry;
    /**
     * Use with available fluent helpers to apply the <b>DepartureCountry</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaTaxField<String> DEPARTURE_COUNTRY = new CustomerSalesAreaTaxField<String>("DepartureCountry");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerTaxCategory</b></p>
     * 
     * @param customerTaxCategory
     *     
     * @return
     *     Tax category (sales tax, federal sales tax,...)
     */
    @Key
    @SerializedName("CustomerTaxCategory")
    @JsonProperty("CustomerTaxCategory")
    @Nullable
    @ODataField(odataName = "CustomerTaxCategory")
    private String customerTaxCategory;
    /**
     * Use with available fluent helpers to apply the <b>CustomerTaxCategory</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaTaxField<String> CUSTOMER_TAX_CATEGORY = new CustomerSalesAreaTaxField<String>("CustomerTaxCategory");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CustomerTaxClassification</b></p>
     * 
     * @param customerTaxClassification
     *     
     * @return
     *     Tax classification for customer
     */
    @SerializedName("CustomerTaxClassification")
    @JsonProperty("CustomerTaxClassification")
    @Nullable
    @ODataField(odataName = "CustomerTaxClassification")
    private String customerTaxClassification;
    /**
     * Use with available fluent helpers to apply the <b>CustomerTaxClassification</b> field to query operations.
     * 
     */
    public final static CustomerSalesAreaTaxField<String> CUSTOMER_TAX_CLASSIFICATION = new CustomerSalesAreaTaxField<String>("CustomerTaxClassification");
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
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<CustomerSalesAreaTax> getType() {
        return CustomerSalesAreaTax.class;
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
     *     Reference distrib.channel for cust.and material masters
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
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DepartureCountry</b></p>
     * 
     * @param departureCountry
     *     Departure country (country from which the goods are sent)
     */
    public void setDepartureCountry(
        @Nullable
        final String departureCountry) {
        rememberChangedField("DepartureCountry", this.departureCountry);
        this.departureCountry = departureCountry;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CustomerTaxCategory</b></p>
     * 
     * @param customerTaxCategory
     *     Tax category (sales tax, federal sales tax,...)
     */
    public void setCustomerTaxCategory(
        @Nullable
        final String customerTaxCategory) {
        rememberChangedField("CustomerTaxCategory", this.customerTaxCategory);
        this.customerTaxCategory = customerTaxCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>CustomerTaxClassification</b></p>
     * 
     * @param customerTaxClassification
     *     Tax classification for customer
     */
    public void setCustomerTaxClassification(
        @Nullable
        final String customerTaxClassification) {
        rememberChangedField("CustomerTaxClassification", this.customerTaxClassification);
        this.customerTaxClassification = customerTaxClassification;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustomerSalesAreaTax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("SalesOrganization", getSalesOrganization());
        result.put("DistributionChannel", getDistributionChannel());
        result.put("Division", getDivision());
        result.put("DepartureCountry", getDepartureCountry());
        result.put("CustomerTaxCategory", getCustomerTaxCategory());
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
        values.put("DepartureCountry", getDepartureCountry());
        values.put("CustomerTaxCategory", getCustomerTaxCategory());
        values.put("CustomerTaxClassification", getCustomerTaxClassification());
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
            if (values.containsKey("DepartureCountry")) {
                final Object value = values.remove("DepartureCountry");
                if ((value == null)||(!value.equals(getDepartureCountry()))) {
                    setDepartureCountry(((String) value));
                }
            }
            if (values.containsKey("CustomerTaxCategory")) {
                final Object value = values.remove("CustomerTaxCategory");
                if ((value == null)||(!value.equals(getCustomerTaxCategory()))) {
                    setCustomerTaxCategory(((String) value));
                }
            }
            if (values.containsKey("CustomerTaxClassification")) {
                final Object value = values.remove("CustomerTaxClassification");
                if ((value == null)||(!value.equals(getCustomerTaxClassification()))) {
                    setCustomerTaxClassification(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
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
    public static<T >CustomerSalesAreaTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerSalesAreaTaxField<T>(fieldName);
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
    public static<T,DomainT >CustomerSalesAreaTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerSalesAreaTaxField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
