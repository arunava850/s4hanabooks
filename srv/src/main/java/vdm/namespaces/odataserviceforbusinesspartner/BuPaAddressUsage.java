/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.ZonedDateTime;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.BuPaAddressUsageField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BuPaAddressUsageSelectable;


/**
 * Business Partner Address Usage<p></p><p>Original entity name from the Odata EDM: <b>A_BuPaAddressUsageType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BuPaAddressUsage
    extends VdmEntity<BuPaAddressUsage>
{

    /**
     * Selector for all available fields of BuPaAddressUsage.
     * 
     */
    public final static BuPaAddressUsageSelectable ALL_FIELDS = new BuPaAddressUsageSelectable() {


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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @param businessPartner
     *     
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartner")
    @JsonProperty("BusinessPartner")
    @Nullable
    @ODataField(odataName = "BusinessPartner")
    private String businessPartner;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartner</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<String> BUSINESS_PARTNER = new BuPaAddressUsageField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     
     * @return
     *     Validity End of a Business Partner Address Usage
     */
    @Key
    @SerializedName("ValidityEndDate")
    @JsonProperty("ValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validityEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityEndDate</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<ZonedDateTime> VALIDITY_END_DATE = new BuPaAddressUsageField<ZonedDateTime>("ValidityEndDate");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressUsage</b></p>
     * 
     * @param addressUsage
     *     
     * @return
     *     Address Type
     */
    @Key
    @SerializedName("AddressUsage")
    @JsonProperty("AddressUsage")
    @Nullable
    @ODataField(odataName = "AddressUsage")
    private String addressUsage;
    /**
     * Use with available fluent helpers to apply the <b>AddressUsage</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<String> ADDRESS_USAGE = new BuPaAddressUsageField<String>("AddressUsage");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressID
     *     
     * @return
     *     Address Number
     */
    @Key
    @SerializedName("AddressID")
    @JsonProperty("AddressID")
    @Nullable
    @ODataField(odataName = "AddressID")
    private String addressID;
    /**
     * Use with available fluent helpers to apply the <b>AddressID</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<String> ADDRESS_ID = new BuPaAddressUsageField<String>("AddressID");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     
     * @return
     *     Validity Start of a Business Partner Address Usage
     */
    @SerializedName("ValidityStartDate")
    @JsonProperty("ValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDate</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<ZonedDateTime> VALIDITY_START_DATE = new BuPaAddressUsageField<ZonedDateTime>("ValidityStartDate");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>StandardUsage</b></p>
     * 
     * @param standardUsage
     *     
     * @return
     *     Indicator: Standard Address Usage
     */
    @SerializedName("StandardUsage")
    @JsonProperty("StandardUsage")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "StandardUsage")
    private Boolean standardUsage;
    /**
     * Use with available fluent helpers to apply the <b>StandardUsage</b> field to query operations.
     * 
     */
    public final static BuPaAddressUsageField<Boolean> STANDARD_USAGE = new BuPaAddressUsageField<Boolean>("StandardUsage");
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
    public final static BuPaAddressUsageField<String> AUTHORIZATION_GROUP = new BuPaAddressUsageField<String>("AuthorizationGroup");
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
    public Class<BuPaAddressUsage> getType() {
        return BuPaAddressUsage.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @param businessPartner
     *     Business Partner Number
     */
    public void setBusinessPartner(
        @Nullable
        final String businessPartner) {
        rememberChangedField("BusinessPartner", this.businessPartner);
        this.businessPartner = businessPartner;
    }

    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     Validity End of a Business Partner Address Usage
     */
    public void setValidityEndDate(
        @Nullable
        final ZonedDateTime validityEndDate) {
        rememberChangedField("ValidityEndDate", this.validityEndDate);
        this.validityEndDate = validityEndDate;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressUsage</b></p>
     * 
     * @param addressUsage
     *     Address Type
     */
    public void setAddressUsage(
        @Nullable
        final String addressUsage) {
        rememberChangedField("AddressUsage", this.addressUsage);
        this.addressUsage = addressUsage;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressID
     *     Address Number
     */
    public void setAddressID(
        @Nullable
        final String addressID) {
        rememberChangedField("AddressID", this.addressID);
        this.addressID = addressID;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     Validity Start of a Business Partner Address Usage
     */
    public void setValidityStartDate(
        @Nullable
        final ZonedDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>StandardUsage</b></p>
     * 
     * @param standardUsage
     *     Indicator: Standard Address Usage
     */
    public void setStandardUsage(
        @Nullable
        final Boolean standardUsage) {
        rememberChangedField("StandardUsage", this.standardUsage);
        this.standardUsage = standardUsage;
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
        return "A_BuPaAddressUsage";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("ValidityEndDate", getValidityEndDate());
        result.put("AddressUsage", getAddressUsage());
        result.put("AddressID", getAddressID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("ValidityEndDate", getValidityEndDate());
        values.put("AddressUsage", getAddressUsage());
        values.put("AddressID", getAddressID());
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("StandardUsage", getStandardUsage());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("AddressUsage")) {
                final Object value = values.remove("AddressUsage");
                if ((value == null)||(!value.equals(getAddressUsage()))) {
                    setAddressUsage(((String) value));
                }
            }
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressID()))) {
                    setAddressID(((String) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("StandardUsage")) {
                final Object value = values.remove("StandardUsage");
                if ((value == null)||(!value.equals(getStandardUsage()))) {
                    setStandardUsage(((Boolean) value));
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
    public static<T >BuPaAddressUsageField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BuPaAddressUsageField<T>(fieldName);
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
    public static<T,DomainT >BuPaAddressUsageField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BuPaAddressUsageField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
