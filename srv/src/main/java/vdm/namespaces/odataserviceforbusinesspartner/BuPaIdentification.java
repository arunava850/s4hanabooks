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
import vdm.namespaces.odataserviceforbusinesspartner.field.BuPaIdentificationField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BuPaIdentificationSelectable;


/**
 * Business Partner Identification<p></p><p>Original entity name from the Odata EDM: <b>A_BuPaIdentificationType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BuPaIdentification
    extends VdmEntity<BuPaIdentification>
{

    /**
     * Selector for all available fields of BuPaIdentification.
     * 
     */
    public final static BuPaIdentificationSelectable ALL_FIELDS = new BuPaIdentificationSelectable() {


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
    public final static BuPaIdentificationField<String> BUSINESS_PARTNER = new BuPaIdentificationField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>BPIdentificationType</b></p>
     * 
     * @param bPIdentificationType
     *     
     * @return
     *     Identification Type
     */
    @Key
    @SerializedName("BPIdentificationType")
    @JsonProperty("BPIdentificationType")
    @Nullable
    @ODataField(odataName = "BPIdentificationType")
    private String bPIdentificationType;
    /**
     * Use with available fluent helpers to apply the <b>BPIdentificationType</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<String> BP_IDENTIFICATION_TYPE = new BuPaIdentificationField<String>("BPIdentificationType");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPIdentificationNumber</b></p>
     * 
     * @param bPIdentificationNumber
     *     
     * @return
     *     Identification Number
     */
    @Key
    @SerializedName("BPIdentificationNumber")
    @JsonProperty("BPIdentificationNumber")
    @Nullable
    @ODataField(odataName = "BPIdentificationNumber")
    private String bPIdentificationNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPIdentificationNumber</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<String> BP_IDENTIFICATION_NUMBER = new BuPaIdentificationField<String>("BPIdentificationNumber");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BPIdnNmbrIssuingInstitute</b></p>
     * 
     * @param bPIdnNmbrIssuingInstitute
     *     
     * @return
     *     Responsible Institution for ID Number
     */
    @SerializedName("BPIdnNmbrIssuingInstitute")
    @JsonProperty("BPIdnNmbrIssuingInstitute")
    @Nullable
    @ODataField(odataName = "BPIdnNmbrIssuingInstitute")
    private String bPIdnNmbrIssuingInstitute;
    /**
     * Use with available fluent helpers to apply the <b>BPIdnNmbrIssuingInstitute</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<String> BP_IDN_NMBR_ISSUING_INSTITUTE = new BuPaIdentificationField<String>("BPIdnNmbrIssuingInstitute");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPIdentificationEntryDate</b></p>
     * 
     * @param bPIdentificationEntryDate
     *     
     * @return
     *     Date of Entry for ID Number
     */
    @SerializedName("BPIdentificationEntryDate")
    @JsonProperty("BPIdentificationEntryDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BPIdentificationEntryDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime bPIdentificationEntryDate;
    /**
     * Use with available fluent helpers to apply the <b>BPIdentificationEntryDate</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<LocalDateTime> BP_IDENTIFICATION_ENTRY_DATE = new BuPaIdentificationField<LocalDateTime>("BPIdentificationEntryDate");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Country</b></p>
     * 
     * @param country
     *     
     * @return
     *     Country in Which ID Number is Valid or Was Assigned
     */
    @SerializedName("Country")
    @JsonProperty("Country")
    @Nullable
    @ODataField(odataName = "Country")
    private String country;
    /**
     * Use with available fluent helpers to apply the <b>Country</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<String> COUNTRY = new BuPaIdentificationField<String>("Country");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Region</b></p>
     * 
     * @param region
     *     
     * @return
     *     Region (State, Province, County)
     */
    @SerializedName("Region")
    @JsonProperty("Region")
    @Nullable
    @ODataField(odataName = "Region")
    private String region;
    /**
     * Use with available fluent helpers to apply the <b>Region</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<String> REGION = new BuPaIdentificationField<String>("Region");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     
     * @return
     *     Validity Start for ID Number
     */
    @SerializedName("ValidityStartDate")
    @JsonProperty("ValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime validityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDate</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<LocalDateTime> VALIDITY_START_DATE = new BuPaIdentificationField<LocalDateTime>("ValidityStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     
     * @return
     *     Validity End for ID Number
     */
    @SerializedName("ValidityEndDate")
    @JsonProperty("ValidityEndDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityEndDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime validityEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityEndDate</b> field to query operations.
     * 
     */
    public final static BuPaIdentificationField<LocalDateTime> VALIDITY_END_DATE = new BuPaIdentificationField<LocalDateTime>("ValidityEndDate");
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
    public final static BuPaIdentificationField<String> AUTHORIZATION_GROUP = new BuPaIdentificationField<String>("AuthorizationGroup");
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
    public Class<BuPaIdentification> getType() {
        return BuPaIdentification.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>BPIdentificationType</b></p>
     * 
     * @param bPIdentificationType
     *     Identification Type
     */
    public void setBPIdentificationType(
        @Nullable
        final String bPIdentificationType) {
        rememberChangedField("BPIdentificationType", this.bPIdentificationType);
        this.bPIdentificationType = bPIdentificationType;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPIdentificationNumber</b></p>
     * 
     * @param bPIdentificationNumber
     *     Identification Number
     */
    public void setBPIdentificationNumber(
        @Nullable
        final String bPIdentificationNumber) {
        rememberChangedField("BPIdentificationNumber", this.bPIdentificationNumber);
        this.bPIdentificationNumber = bPIdentificationNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BPIdnNmbrIssuingInstitute</b></p>
     * 
     * @param bPIdnNmbrIssuingInstitute
     *     Responsible Institution for ID Number
     */
    public void setBPIdnNmbrIssuingInstitute(
        @Nullable
        final String bPIdnNmbrIssuingInstitute) {
        rememberChangedField("BPIdnNmbrIssuingInstitute", this.bPIdnNmbrIssuingInstitute);
        this.bPIdnNmbrIssuingInstitute = bPIdnNmbrIssuingInstitute;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BPIdentificationEntryDate</b></p>
     * 
     * @param bPIdentificationEntryDate
     *     Date of Entry for ID Number
     */
    public void setBPIdentificationEntryDate(
        @Nullable
        final LocalDateTime bPIdentificationEntryDate) {
        rememberChangedField("BPIdentificationEntryDate", this.bPIdentificationEntryDate);
        this.bPIdentificationEntryDate = bPIdentificationEntryDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Country</b></p>
     * 
     * @param country
     *     Country in Which ID Number is Valid or Was Assigned
     */
    public void setCountry(
        @Nullable
        final String country) {
        rememberChangedField("Country", this.country);
        this.country = country;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Region</b></p>
     * 
     * @param region
     *     Region (State, Province, County)
     */
    public void setRegion(
        @Nullable
        final String region) {
        rememberChangedField("Region", this.region);
        this.region = region;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     Validity Start for ID Number
     */
    public void setValidityStartDate(
        @Nullable
        final LocalDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     Validity End for ID Number
     */
    public void setValidityEndDate(
        @Nullable
        final LocalDateTime validityEndDate) {
        rememberChangedField("ValidityEndDate", this.validityEndDate);
        this.validityEndDate = validityEndDate;
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
        return "A_BuPaIdentification";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPIdentificationType", getBPIdentificationType());
        result.put("BPIdentificationNumber", getBPIdentificationNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPIdentificationType", getBPIdentificationType());
        values.put("BPIdentificationNumber", getBPIdentificationNumber());
        values.put("BPIdnNmbrIssuingInstitute", getBPIdnNmbrIssuingInstitute());
        values.put("BPIdentificationEntryDate", getBPIdentificationEntryDate());
        values.put("Country", getCountry());
        values.put("Region", getRegion());
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("ValidityEndDate", getValidityEndDate());
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
            if (values.containsKey("BPIdentificationType")) {
                final Object value = values.remove("BPIdentificationType");
                if ((value == null)||(!value.equals(getBPIdentificationType()))) {
                    setBPIdentificationType(((String) value));
                }
            }
            if (values.containsKey("BPIdentificationNumber")) {
                final Object value = values.remove("BPIdentificationNumber");
                if ((value == null)||(!value.equals(getBPIdentificationNumber()))) {
                    setBPIdentificationNumber(((String) value));
                }
            }
            if (values.containsKey("BPIdnNmbrIssuingInstitute")) {
                final Object value = values.remove("BPIdnNmbrIssuingInstitute");
                if ((value == null)||(!value.equals(getBPIdnNmbrIssuingInstitute()))) {
                    setBPIdnNmbrIssuingInstitute(((String) value));
                }
            }
            if (values.containsKey("BPIdentificationEntryDate")) {
                final Object value = values.remove("BPIdentificationEntryDate");
                if ((value == null)||(!value.equals(getBPIdentificationEntryDate()))) {
                    setBPIdentificationEntryDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("Country")) {
                final Object value = values.remove("Country");
                if ((value == null)||(!value.equals(getCountry()))) {
                    setCountry(((String) value));
                }
            }
            if (values.containsKey("Region")) {
                final Object value = values.remove("Region");
                if ((value == null)||(!value.equals(getRegion()))) {
                    setRegion(((String) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((LocalDateTime) value));
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
    public static<T >BuPaIdentificationField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BuPaIdentificationField<T>(fieldName);
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
    public static<T,DomainT >BuPaIdentificationField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BuPaIdentificationField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
