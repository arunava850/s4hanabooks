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
import vdm.namespaces.odataserviceforbusinesspartner.field.AddressPhoneNumberField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressPhoneNumberSelectable;


/**
 * Address Phone Number<p></p><p>Original entity name from the Odata EDM: <b>A_AddressPhoneNumberType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressPhoneNumber
    extends VdmEntity<AddressPhoneNumber>
{

    /**
     * Selector for all available fields of AddressPhoneNumber.
     * 
     */
    public final static AddressPhoneNumberSelectable ALL_FIELDS = new AddressPhoneNumberSelectable() {


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
    public final static AddressPhoneNumberField<String> ADDRESS_ID = new AddressPhoneNumberField<String>("AddressID");
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
    public final static AddressPhoneNumberField<String> PERSON = new AddressPhoneNumberField<String>("Person");
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
    public final static AddressPhoneNumberField<String> ORDINAL_NUMBER = new AddressPhoneNumberField<String>("OrdinalNumber");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DestinationLocationCountry</b></p>
     * 
     * @param destinationLocationCountry
     *     
     * @return
     *     Country for telephone/fax number
     */
    @SerializedName("DestinationLocationCountry")
    @JsonProperty("DestinationLocationCountry")
    @Nullable
    @ODataField(odataName = "DestinationLocationCountry")
    private String destinationLocationCountry;
    /**
     * Use with available fluent helpers to apply the <b>DestinationLocationCountry</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<String> DESTINATION_LOCATION_COUNTRY = new AddressPhoneNumberField<String>("DestinationLocationCountry");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultPhoneNumber</b></p>
     * 
     * @param isDefaultPhoneNumber
     *     
     * @return
     *     Standard Sender Address in this Communication Type
     */
    @SerializedName("IsDefaultPhoneNumber")
    @JsonProperty("IsDefaultPhoneNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultPhoneNumber")
    private Boolean isDefaultPhoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultPhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<Boolean> IS_DEFAULT_PHONE_NUMBER = new AddressPhoneNumberField<Boolean>("IsDefaultPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PhoneNumber</b></p>
     * 
     * @param phoneNumber
     *     
     * @return
     *     Telephone no.: dialling code+number
     */
    @SerializedName("PhoneNumber")
    @JsonProperty("PhoneNumber")
    @Nullable
    @ODataField(odataName = "PhoneNumber")
    private String phoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<String> PHONE_NUMBER = new AddressPhoneNumberField<String>("PhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PhoneNumberExtension</b></p>
     * 
     * @param phoneNumberExtension
     *     
     * @return
     *     Telephone no.: Extension
     */
    @SerializedName("PhoneNumberExtension")
    @JsonProperty("PhoneNumberExtension")
    @Nullable
    @ODataField(odataName = "PhoneNumberExtension")
    private String phoneNumberExtension;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumberExtension</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<String> PHONE_NUMBER_EXTENSION = new AddressPhoneNumberField<String>("PhoneNumberExtension");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalPhoneNumber</b></p>
     * 
     * @param internationalPhoneNumber
     *     
     * @return
     *     Complete Number: Dialing Code+Number+Extension
     */
    @SerializedName("InternationalPhoneNumber")
    @JsonProperty("InternationalPhoneNumber")
    @Nullable
    @ODataField(odataName = "InternationalPhoneNumber")
    private String internationalPhoneNumber;
    /**
     * Use with available fluent helpers to apply the <b>InternationalPhoneNumber</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<String> INTERNATIONAL_PHONE_NUMBER = new AddressPhoneNumberField<String>("InternationalPhoneNumber");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PhoneNumberType</b></p>
     * 
     * @param phoneNumberType
     *     
     * @return
     *     Indicator: Telephone is a Mobile Telephone
     */
    @SerializedName("PhoneNumberType")
    @JsonProperty("PhoneNumberType")
    @Nullable
    @ODataField(odataName = "PhoneNumberType")
    private String phoneNumberType;
    /**
     * Use with available fluent helpers to apply the <b>PhoneNumberType</b> field to query operations.
     * 
     */
    public final static AddressPhoneNumberField<String> PHONE_NUMBER_TYPE = new AddressPhoneNumberField<String>("PhoneNumberType");
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
    public Class<AddressPhoneNumber> getType() {
        return AddressPhoneNumber.class;
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
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>DestinationLocationCountry</b></p>
     * 
     * @param destinationLocationCountry
     *     Country for telephone/fax number
     */
    public void setDestinationLocationCountry(
        @Nullable
        final String destinationLocationCountry) {
        rememberChangedField("DestinationLocationCountry", this.destinationLocationCountry);
        this.destinationLocationCountry = destinationLocationCountry;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultPhoneNumber</b></p>
     * 
     * @param isDefaultPhoneNumber
     *     Standard Sender Address in this Communication Type
     */
    public void setIsDefaultPhoneNumber(
        @Nullable
        final Boolean isDefaultPhoneNumber) {
        rememberChangedField("IsDefaultPhoneNumber", this.isDefaultPhoneNumber);
        this.isDefaultPhoneNumber = isDefaultPhoneNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PhoneNumber</b></p>
     * 
     * @param phoneNumber
     *     Telephone no.: dialling code+number
     */
    public void setPhoneNumber(
        @Nullable
        final String phoneNumber) {
        rememberChangedField("PhoneNumber", this.phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PhoneNumberExtension</b></p>
     * 
     * @param phoneNumberExtension
     *     Telephone no.: Extension
     */
    public void setPhoneNumberExtension(
        @Nullable
        final String phoneNumberExtension) {
        rememberChangedField("PhoneNumberExtension", this.phoneNumberExtension);
        this.phoneNumberExtension = phoneNumberExtension;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalPhoneNumber</b></p>
     * 
     * @param internationalPhoneNumber
     *     Complete Number: Dialing Code+Number+Extension
     */
    public void setInternationalPhoneNumber(
        @Nullable
        final String internationalPhoneNumber) {
        rememberChangedField("InternationalPhoneNumber", this.internationalPhoneNumber);
        this.internationalPhoneNumber = internationalPhoneNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PhoneNumberType</b></p>
     * 
     * @param phoneNumberType
     *     Indicator: Telephone is a Mobile Telephone
     */
    public void setPhoneNumberType(
        @Nullable
        final String phoneNumberType) {
        rememberChangedField("PhoneNumberType", this.phoneNumberType);
        this.phoneNumberType = phoneNumberType;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressPhoneNumber";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("AddressID", getAddressID());
        result.put("Person", getPerson());
        result.put("OrdinalNumber", getOrdinalNumber());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("AddressID", getAddressID());
        values.put("Person", getPerson());
        values.put("OrdinalNumber", getOrdinalNumber());
        values.put("DestinationLocationCountry", getDestinationLocationCountry());
        values.put("IsDefaultPhoneNumber", getIsDefaultPhoneNumber());
        values.put("PhoneNumber", getPhoneNumber());
        values.put("PhoneNumberExtension", getPhoneNumberExtension());
        values.put("InternationalPhoneNumber", getInternationalPhoneNumber());
        values.put("PhoneNumberType", getPhoneNumberType());
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
            if (values.containsKey("DestinationLocationCountry")) {
                final Object value = values.remove("DestinationLocationCountry");
                if ((value == null)||(!value.equals(getDestinationLocationCountry()))) {
                    setDestinationLocationCountry(((String) value));
                }
            }
            if (values.containsKey("IsDefaultPhoneNumber")) {
                final Object value = values.remove("IsDefaultPhoneNumber");
                if ((value == null)||(!value.equals(getIsDefaultPhoneNumber()))) {
                    setIsDefaultPhoneNumber(((Boolean) value));
                }
            }
            if (values.containsKey("PhoneNumber")) {
                final Object value = values.remove("PhoneNumber");
                if ((value == null)||(!value.equals(getPhoneNumber()))) {
                    setPhoneNumber(((String) value));
                }
            }
            if (values.containsKey("PhoneNumberExtension")) {
                final Object value = values.remove("PhoneNumberExtension");
                if ((value == null)||(!value.equals(getPhoneNumberExtension()))) {
                    setPhoneNumberExtension(((String) value));
                }
            }
            if (values.containsKey("InternationalPhoneNumber")) {
                final Object value = values.remove("InternationalPhoneNumber");
                if ((value == null)||(!value.equals(getInternationalPhoneNumber()))) {
                    setInternationalPhoneNumber(((String) value));
                }
            }
            if (values.containsKey("PhoneNumberType")) {
                final Object value = values.remove("PhoneNumberType");
                if ((value == null)||(!value.equals(getPhoneNumberType()))) {
                    setPhoneNumberType(((String) value));
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
    public static<T >AddressPhoneNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressPhoneNumberField<T>(fieldName);
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
    public static<T,DomainT >AddressPhoneNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressPhoneNumberField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
