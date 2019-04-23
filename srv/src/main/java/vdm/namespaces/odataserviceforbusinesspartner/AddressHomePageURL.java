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
import vdm.namespaces.odataserviceforbusinesspartner.field.AddressHomePageURLField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressHomePageURLSelectable;


/**
 * Address Home Page URL<p></p><p>Original entity name from the Odata EDM: <b>A_AddressHomePageURLType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressHomePageURL
    extends VdmEntity<AddressHomePageURL>
{

    /**
     * Selector for all available fields of AddressHomePageURL.
     * 
     */
    public final static AddressHomePageURLSelectable ALL_FIELDS = new AddressHomePageURLSelectable() {


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
    public final static AddressHomePageURLField<String> ADDRESS_ID = new AddressHomePageURLField<String>("AddressID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param person
     *     
     * @return
     *     Person number
     */
    @Key
    @SerializedName("Person")
    @JsonProperty("Person")
    @Nullable
    @ODataField(odataName = "Person")
    private String person;
    /**
     * Use with available fluent helpers to apply the <b>Person</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<String> PERSON = new AddressHomePageURLField<String>("Person");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @param ordinalNumber
     *     
     * @return
     *     Sequence Number
     */
    @Key
    @SerializedName("OrdinalNumber")
    @JsonProperty("OrdinalNumber")
    @Nullable
    @ODataField(odataName = "OrdinalNumber")
    private String ordinalNumber;
    /**
     * Use with available fluent helpers to apply the <b>OrdinalNumber</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<String> ORDINAL_NUMBER = new AddressHomePageURLField<String>("OrdinalNumber");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     
     * @return
     *     Valid-from date - in current Release only 00010101 possible
     */
    @Key
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
    public final static AddressHomePageURLField<LocalDateTime> VALIDITY_START_DATE = new AddressHomePageURLField<LocalDateTime>("ValidityStartDate");
    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @param isDefaultURLAddress
     *     
     * @return
     *     Flag: this address is the default address
     */
    @Key
    @SerializedName("IsDefaultURLAddress")
    @JsonProperty("IsDefaultURLAddress")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultURLAddress")
    private Boolean isDefaultURLAddress;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultURLAddress</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<Boolean> IS_DEFAULT_URL_ADDRESS = new AddressHomePageURLField<Boolean>("IsDefaultURLAddress");
    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>SearchURLAddress</b></p>
     * 
     * @param searchURLAddress
     *     
     * @return
     *     URI address search field
     */
    @SerializedName("SearchURLAddress")
    @JsonProperty("SearchURLAddress")
    @Nullable
    @ODataField(odataName = "SearchURLAddress")
    private String searchURLAddress;
    /**
     * Use with available fluent helpers to apply the <b>SearchURLAddress</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<String> SEARCH_URL_ADDRESS = new AddressHomePageURLField<String>("SearchURLAddress");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @param uRLFieldLength
     *     
     * @return
     *     URI field length
     */
    @SerializedName("URLFieldLength")
    @JsonProperty("URLFieldLength")
    @Nullable
    @ODataField(odataName = "URLFieldLength")
    private Short uRLFieldLength;
    /**
     * Use with available fluent helpers to apply the <b>URLFieldLength</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<Short> URL_FIELD_LENGTH = new AddressHomePageURLField<Short>("URLFieldLength");
    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @param websiteURL
     *     
     * @return
     *     Universal Resource Identifier (URI)
     */
    @SerializedName("WebsiteURL")
    @JsonProperty("WebsiteURL")
    @Nullable
    @ODataField(odataName = "WebsiteURL")
    private String websiteURL;
    /**
     * Use with available fluent helpers to apply the <b>WebsiteURL</b> field to query operations.
     * 
     */
    public final static AddressHomePageURLField<String> WEBSITE_URL = new AddressHomePageURLField<String>("WebsiteURL");
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
    public Class<AddressHomePageURL> getType() {
        return AddressHomePageURL.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param person
     *     Person number
     */
    public void setPerson(
        @Nullable
        final String person) {
        rememberChangedField("Person", this.person);
        this.person = person;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>OrdinalNumber</b></p>
     * 
     * @param ordinalNumber
     *     Sequence Number
     */
    public void setOrdinalNumber(
        @Nullable
        final String ordinalNumber) {
        rememberChangedField("OrdinalNumber", this.ordinalNumber);
        this.ordinalNumber = ordinalNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     Valid-from date - in current Release only 00010101 possible
     */
    public void setValidityStartDate(
        @Nullable
        final LocalDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    /**
     * (Key Field) Constraints: Not nullable<p>Original property name from the Odata EDM: <b>IsDefaultURLAddress</b></p>
     * 
     * @param isDefaultURLAddress
     *     Flag: this address is the default address
     */
    public void setIsDefaultURLAddress(
        @Nullable
        final Boolean isDefaultURLAddress) {
        rememberChangedField("IsDefaultURLAddress", this.isDefaultURLAddress);
        this.isDefaultURLAddress = isDefaultURLAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 50 <p>Original property name from the Odata EDM: <b>SearchURLAddress</b></p>
     * 
     * @param searchURLAddress
     *     URI address search field
     */
    public void setSearchURLAddress(
        @Nullable
        final String searchURLAddress) {
        rememberChangedField("SearchURLAddress", this.searchURLAddress);
        this.searchURLAddress = searchURLAddress;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>URLFieldLength</b></p>
     * 
     * @param uRLFieldLength
     *     URI field length
     */
    public void setURLFieldLength(
        @Nullable
        final Short uRLFieldLength) {
        rememberChangedField("URLFieldLength", this.uRLFieldLength);
        this.uRLFieldLength = uRLFieldLength;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2048 <p>Original property name from the Odata EDM: <b>WebsiteURL</b></p>
     * 
     * @param websiteURL
     *     Universal Resource Identifier (URI)
     */
    public void setWebsiteURL(
        @Nullable
        final String websiteURL) {
        rememberChangedField("WebsiteURL", this.websiteURL);
        this.websiteURL = websiteURL;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressHomePageURL";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("AddressID", getAddressID());
        result.put("Person", getPerson());
        result.put("OrdinalNumber", getOrdinalNumber());
        result.put("ValidityStartDate", getValidityStartDate());
        result.put("IsDefaultURLAddress", getIsDefaultURLAddress());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("AddressID", getAddressID());
        values.put("Person", getPerson());
        values.put("OrdinalNumber", getOrdinalNumber());
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("IsDefaultURLAddress", getIsDefaultURLAddress());
        values.put("SearchURLAddress", getSearchURLAddress());
        values.put("URLFieldLength", getURLFieldLength());
        values.put("WebsiteURL", getWebsiteURL());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressID()))) {
                    setAddressID(((String) value));
                }
            }
            if (values.containsKey("Person")) {
                final Object value = values.remove("Person");
                if ((value == null)||(!value.equals(getPerson()))) {
                    setPerson(((String) value));
                }
            }
            if (values.containsKey("OrdinalNumber")) {
                final Object value = values.remove("OrdinalNumber");
                if ((value == null)||(!value.equals(getOrdinalNumber()))) {
                    setOrdinalNumber(((String) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("IsDefaultURLAddress")) {
                final Object value = values.remove("IsDefaultURLAddress");
                if ((value == null)||(!value.equals(getIsDefaultURLAddress()))) {
                    setIsDefaultURLAddress(((Boolean) value));
                }
            }
            if (values.containsKey("SearchURLAddress")) {
                final Object value = values.remove("SearchURLAddress");
                if ((value == null)||(!value.equals(getSearchURLAddress()))) {
                    setSearchURLAddress(((String) value));
                }
            }
            if (values.containsKey("URLFieldLength")) {
                final Object value = values.remove("URLFieldLength");
                if ((value == null)||(!value.equals(getURLFieldLength()))) {
                    setURLFieldLength(((Short) value));
                }
            }
            if (values.containsKey("WebsiteURL")) {
                final Object value = values.remove("WebsiteURL");
                if ((value == null)||(!value.equals(getWebsiteURL()))) {
                    setWebsiteURL(((String) value));
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
    public static<T >AddressHomePageURLField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressHomePageURLField<T>(fieldName);
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
    public static<T,DomainT >AddressHomePageURLField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressHomePageURLField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
