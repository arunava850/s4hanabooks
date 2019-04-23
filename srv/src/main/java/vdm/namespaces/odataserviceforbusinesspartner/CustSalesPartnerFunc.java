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
import vdm.namespaces.odataserviceforbusinesspartner.field.CustSalesPartnerFuncField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustSalesPartnerFuncSelectable;


/**
 * Customer Sales Area Partner Function<p></p><p>Original entity name from the Odata EDM: <b>A_CustSalesPartnerFuncType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustSalesPartnerFunc
    extends VdmEntity<CustSalesPartnerFunc>
{

    /**
     * Selector for all available fields of CustSalesPartnerFunc.
     * 
     */
    public final static CustSalesPartnerFuncSelectable ALL_FIELDS = new CustSalesPartnerFuncSelectable() {


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
    public final static CustSalesPartnerFuncField<String> CUSTOMER = new CustSalesPartnerFuncField<String>("Customer");
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
    public final static CustSalesPartnerFuncField<String> SALES_ORGANIZATION = new CustSalesPartnerFuncField<String>("SalesOrganization");
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
    public final static CustSalesPartnerFuncField<String> DISTRIBUTION_CHANNEL = new CustSalesPartnerFuncField<String>("DistributionChannel");
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
    public final static CustSalesPartnerFuncField<String> DIVISION = new CustSalesPartnerFuncField<String>("Division");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PartnerCounter</b></p>
     * 
     * @param partnerCounter
     *     
     * @return
     *     Partner counter
     */
    @Key
    @SerializedName("PartnerCounter")
    @JsonProperty("PartnerCounter")
    @Nullable
    @ODataField(odataName = "PartnerCounter")
    private String partnerCounter;
    /**
     * Use with available fluent helpers to apply the <b>PartnerCounter</b> field to query operations.
     * 
     */
    public final static CustSalesPartnerFuncField<String> PARTNER_COUNTER = new CustSalesPartnerFuncField<String>("PartnerCounter");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PartnerFunction</b></p>
     * 
     * @param partnerFunction
     *     
     * @return
     *     Partner Function
     */
    @Key
    @SerializedName("PartnerFunction")
    @JsonProperty("PartnerFunction")
    @Nullable
    @ODataField(odataName = "PartnerFunction")
    private String partnerFunction;
    /**
     * Use with available fluent helpers to apply the <b>PartnerFunction</b> field to query operations.
     * 
     */
    public final static CustSalesPartnerFuncField<String> PARTNER_FUNCTION = new CustSalesPartnerFuncField<String>("PartnerFunction");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BPCustomerNumber</b></p>
     * 
     * @param bPCustomerNumber
     *     
     * @return
     *     Customer number of business partner
     */
    @SerializedName("BPCustomerNumber")
    @JsonProperty("BPCustomerNumber")
    @Nullable
    @ODataField(odataName = "BPCustomerNumber")
    private String bPCustomerNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPCustomerNumber</b> field to query operations.
     * 
     */
    public final static CustSalesPartnerFuncField<String> BP_CUSTOMER_NUMBER = new CustSalesPartnerFuncField<String>("BPCustomerNumber");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CustomerPartnerDescription</b></p>
     * 
     * @param customerPartnerDescription
     *     
     * @return
     *     Cust.-Specif. Descr. of Business Partner (Plant, Stor. Loc.)
     */
    @SerializedName("CustomerPartnerDescription")
    @JsonProperty("CustomerPartnerDescription")
    @Nullable
    @ODataField(odataName = "CustomerPartnerDescription")
    private String customerPartnerDescription;
    /**
     * Use with available fluent helpers to apply the <b>CustomerPartnerDescription</b> field to query operations.
     * 
     */
    public final static CustSalesPartnerFuncField<String> CUSTOMER_PARTNER_DESCRIPTION = new CustSalesPartnerFuncField<String>("CustomerPartnerDescription");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DefaultPartner</b></p>
     * 
     * @param defaultPartner
     *     
     * @return
     *     Default Partner
     */
    @SerializedName("DefaultPartner")
    @JsonProperty("DefaultPartner")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "DefaultPartner")
    private Boolean defaultPartner;
    /**
     * Use with available fluent helpers to apply the <b>DefaultPartner</b> field to query operations.
     * 
     */
    public final static CustSalesPartnerFuncField<Boolean> DEFAULT_PARTNER = new CustSalesPartnerFuncField<Boolean>("DefaultPartner");
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
    public final static CustSalesPartnerFuncField<String> AUTHORIZATION_GROUP = new CustSalesPartnerFuncField<String>("AuthorizationGroup");
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
    public Class<CustSalesPartnerFunc> getType() {
        return CustSalesPartnerFunc.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PartnerCounter</b></p>
     * 
     * @param partnerCounter
     *     Partner counter
     */
    public void setPartnerCounter(
        @Nullable
        final String partnerCounter) {
        rememberChangedField("PartnerCounter", this.partnerCounter);
        this.partnerCounter = partnerCounter;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PartnerFunction</b></p>
     * 
     * @param partnerFunction
     *     Partner Function
     */
    public void setPartnerFunction(
        @Nullable
        final String partnerFunction) {
        rememberChangedField("PartnerFunction", this.partnerFunction);
        this.partnerFunction = partnerFunction;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BPCustomerNumber</b></p>
     * 
     * @param bPCustomerNumber
     *     Customer number of business partner
     */
    public void setBPCustomerNumber(
        @Nullable
        final String bPCustomerNumber) {
        rememberChangedField("BPCustomerNumber", this.bPCustomerNumber);
        this.bPCustomerNumber = bPCustomerNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>CustomerPartnerDescription</b></p>
     * 
     * @param customerPartnerDescription
     *     Cust.-Specif. Descr. of Business Partner (Plant, Stor. Loc.)
     */
    public void setCustomerPartnerDescription(
        @Nullable
        final String customerPartnerDescription) {
        rememberChangedField("CustomerPartnerDescription", this.customerPartnerDescription);
        this.customerPartnerDescription = customerPartnerDescription;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DefaultPartner</b></p>
     * 
     * @param defaultPartner
     *     Default Partner
     */
    public void setDefaultPartner(
        @Nullable
        final Boolean defaultPartner) {
        rememberChangedField("DefaultPartner", this.defaultPartner);
        this.defaultPartner = defaultPartner;
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

    @Override
    protected String getEntityCollection() {
        return "A_CustSalesPartnerFunc";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("SalesOrganization", getSalesOrganization());
        result.put("DistributionChannel", getDistributionChannel());
        result.put("Division", getDivision());
        result.put("PartnerCounter", getPartnerCounter());
        result.put("PartnerFunction", getPartnerFunction());
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
        values.put("PartnerCounter", getPartnerCounter());
        values.put("PartnerFunction", getPartnerFunction());
        values.put("BPCustomerNumber", getBPCustomerNumber());
        values.put("CustomerPartnerDescription", getCustomerPartnerDescription());
        values.put("DefaultPartner", getDefaultPartner());
        values.put("AuthorizationGroup", getAuthorizationGroup());
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
            if (values.containsKey("PartnerCounter")) {
                final Object value = values.remove("PartnerCounter");
                if ((value == null)||(!value.equals(getPartnerCounter()))) {
                    setPartnerCounter(((String) value));
                }
            }
            if (values.containsKey("PartnerFunction")) {
                final Object value = values.remove("PartnerFunction");
                if ((value == null)||(!value.equals(getPartnerFunction()))) {
                    setPartnerFunction(((String) value));
                }
            }
            if (values.containsKey("BPCustomerNumber")) {
                final Object value = values.remove("BPCustomerNumber");
                if ((value == null)||(!value.equals(getBPCustomerNumber()))) {
                    setBPCustomerNumber(((String) value));
                }
            }
            if (values.containsKey("CustomerPartnerDescription")) {
                final Object value = values.remove("CustomerPartnerDescription");
                if ((value == null)||(!value.equals(getCustomerPartnerDescription()))) {
                    setCustomerPartnerDescription(((String) value));
                }
            }
            if (values.containsKey("DefaultPartner")) {
                final Object value = values.remove("DefaultPartner");
                if ((value == null)||(!value.equals(getDefaultPartner()))) {
                    setDefaultPartner(((Boolean) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
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
    public static<T >CustSalesPartnerFuncField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustSalesPartnerFuncField<T>(fieldName);
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
    public static<T,DomainT >CustSalesPartnerFuncField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustSalesPartnerFuncField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
