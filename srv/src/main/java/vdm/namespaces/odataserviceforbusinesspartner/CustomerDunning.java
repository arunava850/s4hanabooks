/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerDunningField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerDunningSelectable;


/**
 * Customer Company Dunning<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerDunningType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerDunning
    extends VdmEntity<CustomerDunning>
{

    /**
     * Selector for all available fields of CustomerDunning.
     * 
     */
    public final static CustomerDunningSelectable ALL_FIELDS = new CustomerDunningSelectable() {


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
    public final static CustomerDunningField<String> CUSTOMER = new CustomerDunningField<String>("Customer");
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
    public final static CustomerDunningField<String> COMPANY_CODE = new CustomerDunningField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningArea</b></p>
     * 
     * @param dunningArea
     *     
     * @return
     *     Dunning Area
     */
    @Key
    @SerializedName("DunningArea")
    @JsonProperty("DunningArea")
    @Nullable
    @ODataField(odataName = "DunningArea")
    private String dunningArea;
    /**
     * Use with available fluent helpers to apply the <b>DunningArea</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_AREA = new CustomerDunningField<String>("DunningArea");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningBlock</b></p>
     * 
     * @param dunningBlock
     *     
     * @return
     *     Dunning Block
     */
    @SerializedName("DunningBlock")
    @JsonProperty("DunningBlock")
    @Nullable
    @ODataField(odataName = "DunningBlock")
    private String dunningBlock;
    /**
     * Use with available fluent helpers to apply the <b>DunningBlock</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_BLOCK = new CustomerDunningField<String>("DunningBlock");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningLevel</b></p>
     * 
     * @param dunningLevel
     *     
     * @return
     *     Dunning Level
     */
    @SerializedName("DunningLevel")
    @JsonProperty("DunningLevel")
    @Nullable
    @ODataField(odataName = "DunningLevel")
    private String dunningLevel;
    /**
     * Use with available fluent helpers to apply the <b>DunningLevel</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_LEVEL = new CustomerDunningField<String>("DunningLevel");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DunningProcedure</b></p>
     * 
     * @param dunningProcedure
     *     
     * @return
     *     Dunning Procedure
     */
    @SerializedName("DunningProcedure")
    @JsonProperty("DunningProcedure")
    @Nullable
    @ODataField(odataName = "DunningProcedure")
    private String dunningProcedure;
    /**
     * Use with available fluent helpers to apply the <b>DunningProcedure</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_PROCEDURE = new CustomerDunningField<String>("DunningProcedure");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DunningRecipient</b></p>
     * 
     * @param dunningRecipient
     *     
     * @return
     *     Account number of the dunning recipient
     */
    @SerializedName("DunningRecipient")
    @JsonProperty("DunningRecipient")
    @Nullable
    @ODataField(odataName = "DunningRecipient")
    private String dunningRecipient;
    /**
     * Use with available fluent helpers to apply the <b>DunningRecipient</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_RECIPIENT = new CustomerDunningField<String>("DunningRecipient");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastDunnedOn</b></p>
     * 
     * @param lastDunnedOn
     *     
     * @return
     *     Date of Last Dunning Notice
     */
    @SerializedName("LastDunnedOn")
    @JsonProperty("LastDunnedOn")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "LastDunnedOn", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime lastDunnedOn;
    /**
     * Use with available fluent helpers to apply the <b>LastDunnedOn</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<LocalDateTime> LAST_DUNNED_ON = new CustomerDunningField<LocalDateTime>("LastDunnedOn");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LegDunningProcedureOn</b></p>
     * 
     * @param legDunningProcedureOn
     *     
     * @return
     *     Date of the legal dunning proceedings
     */
    @SerializedName("LegDunningProcedureOn")
    @JsonProperty("LegDunningProcedureOn")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "LegDunningProcedureOn", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime legDunningProcedureOn;
    /**
     * Use with available fluent helpers to apply the <b>LegDunningProcedureOn</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<LocalDateTime> LEG_DUNNING_PROCEDURE_ON = new CustomerDunningField<LocalDateTime>("LegDunningProcedureOn");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningClerk</b></p>
     * 
     * @param dunningClerk
     *     
     * @return
     *     Dunning clerk
     */
    @SerializedName("DunningClerk")
    @JsonProperty("DunningClerk")
    @Nullable
    @ODataField(odataName = "DunningClerk")
    private String dunningClerk;
    /**
     * Use with available fluent helpers to apply the <b>DunningClerk</b> field to query operations.
     * 
     */
    public final static CustomerDunningField<String> DUNNING_CLERK = new CustomerDunningField<String>("DunningClerk");
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
    public final static CustomerDunningField<String> AUTHORIZATION_GROUP = new CustomerDunningField<String>("AuthorizationGroup");
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
    public final static CustomerDunningField<String> CUSTOMER_ACCOUNT_GROUP = new CustomerDunningField<String>("CustomerAccountGroup");
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
    public Class<CustomerDunning> getType() {
        return CustomerDunning.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningArea</b></p>
     * 
     * @param dunningArea
     *     Dunning Area
     */
    public void setDunningArea(
        @Nullable
        final String dunningArea) {
        rememberChangedField("DunningArea", this.dunningArea);
        this.dunningArea = dunningArea;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningBlock</b></p>
     * 
     * @param dunningBlock
     *     Dunning Block
     */
    public void setDunningBlock(
        @Nullable
        final String dunningBlock) {
        rememberChangedField("DunningBlock", this.dunningBlock);
        this.dunningBlock = dunningBlock;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DunningLevel</b></p>
     * 
     * @param dunningLevel
     *     Dunning Level
     */
    public void setDunningLevel(
        @Nullable
        final String dunningLevel) {
        rememberChangedField("DunningLevel", this.dunningLevel);
        this.dunningLevel = dunningLevel;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DunningProcedure</b></p>
     * 
     * @param dunningProcedure
     *     Dunning Procedure
     */
    public void setDunningProcedure(
        @Nullable
        final String dunningProcedure) {
        rememberChangedField("DunningProcedure", this.dunningProcedure);
        this.dunningProcedure = dunningProcedure;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DunningRecipient</b></p>
     * 
     * @param dunningRecipient
     *     Account number of the dunning recipient
     */
    public void setDunningRecipient(
        @Nullable
        final String dunningRecipient) {
        rememberChangedField("DunningRecipient", this.dunningRecipient);
        this.dunningRecipient = dunningRecipient;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastDunnedOn</b></p>
     * 
     * @param lastDunnedOn
     *     Date of Last Dunning Notice
     */
    public void setLastDunnedOn(
        @Nullable
        final LocalDateTime lastDunnedOn) {
        rememberChangedField("LastDunnedOn", this.lastDunnedOn);
        this.lastDunnedOn = lastDunnedOn;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LegDunningProcedureOn</b></p>
     * 
     * @param legDunningProcedureOn
     *     Date of the legal dunning proceedings
     */
    public void setLegDunningProcedureOn(
        @Nullable
        final LocalDateTime legDunningProcedureOn) {
        rememberChangedField("LegDunningProcedureOn", this.legDunningProcedureOn);
        this.legDunningProcedureOn = legDunningProcedureOn;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>DunningClerk</b></p>
     * 
     * @param dunningClerk
     *     Dunning clerk
     */
    public void setDunningClerk(
        @Nullable
        final String dunningClerk) {
        rememberChangedField("DunningClerk", this.dunningClerk);
        this.dunningClerk = dunningClerk;
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
        return "A_CustomerDunning";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CompanyCode", getCompanyCode());
        result.put("DunningArea", getDunningArea());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CompanyCode", getCompanyCode());
        values.put("DunningArea", getDunningArea());
        values.put("DunningBlock", getDunningBlock());
        values.put("DunningLevel", getDunningLevel());
        values.put("DunningProcedure", getDunningProcedure());
        values.put("DunningRecipient", getDunningRecipient());
        values.put("LastDunnedOn", getLastDunnedOn());
        values.put("LegDunningProcedureOn", getLegDunningProcedureOn());
        values.put("DunningClerk", getDunningClerk());
        values.put("AuthorizationGroup", getAuthorizationGroup());
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
            if (values.containsKey("DunningArea")) {
                final Object value = values.remove("DunningArea");
                if ((value == null)||(!value.equals(getDunningArea()))) {
                    setDunningArea(((String) value));
                }
            }
            if (values.containsKey("DunningBlock")) {
                final Object value = values.remove("DunningBlock");
                if ((value == null)||(!value.equals(getDunningBlock()))) {
                    setDunningBlock(((String) value));
                }
            }
            if (values.containsKey("DunningLevel")) {
                final Object value = values.remove("DunningLevel");
                if ((value == null)||(!value.equals(getDunningLevel()))) {
                    setDunningLevel(((String) value));
                }
            }
            if (values.containsKey("DunningProcedure")) {
                final Object value = values.remove("DunningProcedure");
                if ((value == null)||(!value.equals(getDunningProcedure()))) {
                    setDunningProcedure(((String) value));
                }
            }
            if (values.containsKey("DunningRecipient")) {
                final Object value = values.remove("DunningRecipient");
                if ((value == null)||(!value.equals(getDunningRecipient()))) {
                    setDunningRecipient(((String) value));
                }
            }
            if (values.containsKey("LastDunnedOn")) {
                final Object value = values.remove("LastDunnedOn");
                if ((value == null)||(!value.equals(getLastDunnedOn()))) {
                    setLastDunnedOn(((LocalDateTime) value));
                }
            }
            if (values.containsKey("LegDunningProcedureOn")) {
                final Object value = values.remove("LegDunningProcedureOn");
                if ((value == null)||(!value.equals(getLegDunningProcedureOn()))) {
                    setLegDunningProcedureOn(((LocalDateTime) value));
                }
            }
            if (values.containsKey("DunningClerk")) {
                final Object value = values.remove("DunningClerk");
                if ((value == null)||(!value.equals(getDunningClerk()))) {
                    setDunningClerk(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
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
    public static<T >CustomerDunningField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerDunningField<T>(fieldName);
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
    public static<T,DomainT >CustomerDunningField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerDunningField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
