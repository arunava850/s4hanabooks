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
import vdm.namespaces.odataserviceforbusinesspartner.field.AddressFaxNumberField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressFaxNumberSelectable;


/**
 * Address Fax Number<p></p><p>Original entity name from the Odata EDM: <b>A_AddressFaxNumberType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressFaxNumber
    extends VdmEntity<AddressFaxNumber>
{

    /**
     * Selector for all available fields of AddressFaxNumber.
     * 
     */
    public final static AddressFaxNumberSelectable ALL_FIELDS = new AddressFaxNumberSelectable() {


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
    public final static AddressFaxNumberField<String> ADDRESS_ID = new AddressFaxNumberField<String>("AddressID");
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
    public final static AddressFaxNumberField<String> PERSON = new AddressFaxNumberField<String>("Person");
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
    public final static AddressFaxNumberField<String> ORDINAL_NUMBER = new AddressFaxNumberField<String>("OrdinalNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @param isDefaultFaxNumber
     *     
     * @return
     *     Standard Sender Address in this Communication Type
     */
    @SerializedName("IsDefaultFaxNumber")
    @JsonProperty("IsDefaultFaxNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultFaxNumber")
    private Boolean isDefaultFaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultFaxNumber</b> field to query operations.
     * 
     */
    public final static AddressFaxNumberField<Boolean> IS_DEFAULT_FAX_NUMBER = new AddressFaxNumberField<Boolean>("IsDefaultFaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @param faxCountry
     *     
     * @return
     *     Country for telephone/fax number
     */
    @SerializedName("FaxCountry")
    @JsonProperty("FaxCountry")
    @Nullable
    @ODataField(odataName = "FaxCountry")
    private String faxCountry;
    /**
     * Use with available fluent helpers to apply the <b>FaxCountry</b> field to query operations.
     * 
     */
    public final static AddressFaxNumberField<String> FAX_COUNTRY = new AddressFaxNumberField<String>("FaxCountry");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxNumber</b></p>
     * 
     * @param faxNumber
     *     
     * @return
     *     Fax number: dialling code+number
     */
    @SerializedName("FaxNumber")
    @JsonProperty("FaxNumber")
    @Nullable
    @ODataField(odataName = "FaxNumber")
    private String faxNumber;
    /**
     * Use with available fluent helpers to apply the <b>FaxNumber</b> field to query operations.
     * 
     */
    public final static AddressFaxNumberField<String> FAX_NUMBER = new AddressFaxNumberField<String>("FaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @param faxNumberExtension
     *     
     * @return
     *     Fax no.: Extension
     */
    @SerializedName("FaxNumberExtension")
    @JsonProperty("FaxNumberExtension")
    @Nullable
    @ODataField(odataName = "FaxNumberExtension")
    private String faxNumberExtension;
    /**
     * Use with available fluent helpers to apply the <b>FaxNumberExtension</b> field to query operations.
     * 
     */
    public final static AddressFaxNumberField<String> FAX_NUMBER_EXTENSION = new AddressFaxNumberField<String>("FaxNumberExtension");
    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @param internationalFaxNumber
     *     
     * @return
     *     Complete number: dialling code+number+extension
     */
    @SerializedName("InternationalFaxNumber")
    @JsonProperty("InternationalFaxNumber")
    @Nullable
    @ODataField(odataName = "InternationalFaxNumber")
    private String internationalFaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>InternationalFaxNumber</b> field to query operations.
     * 
     */
    public final static AddressFaxNumberField<String> INTERNATIONAL_FAX_NUMBER = new AddressFaxNumberField<String>("InternationalFaxNumber");
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
    public Class<AddressFaxNumber> getType() {
        return AddressFaxNumber.class;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultFaxNumber</b></p>
     * 
     * @param isDefaultFaxNumber
     *     Standard Sender Address in this Communication Type
     */
    public void setIsDefaultFaxNumber(
        @Nullable
        final Boolean isDefaultFaxNumber) {
        rememberChangedField("IsDefaultFaxNumber", this.isDefaultFaxNumber);
        this.isDefaultFaxNumber = isDefaultFaxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>FaxCountry</b></p>
     * 
     * @param faxCountry
     *     Country for telephone/fax number
     */
    public void setFaxCountry(
        @Nullable
        final String faxCountry) {
        rememberChangedField("FaxCountry", this.faxCountry);
        this.faxCountry = faxCountry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>FaxNumber</b></p>
     * 
     * @param faxNumber
     *     Fax number: dialling code+number
     */
    public void setFaxNumber(
        @Nullable
        final String faxNumber) {
        rememberChangedField("FaxNumber", this.faxNumber);
        this.faxNumber = faxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>FaxNumberExtension</b></p>
     * 
     * @param faxNumberExtension
     *     Fax no.: Extension
     */
    public void setFaxNumberExtension(
        @Nullable
        final String faxNumberExtension) {
        rememberChangedField("FaxNumberExtension", this.faxNumberExtension);
        this.faxNumberExtension = faxNumberExtension;
    }

    /**
     * Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>InternationalFaxNumber</b></p>
     * 
     * @param internationalFaxNumber
     *     Complete number: dialling code+number+extension
     */
    public void setInternationalFaxNumber(
        @Nullable
        final String internationalFaxNumber) {
        rememberChangedField("InternationalFaxNumber", this.internationalFaxNumber);
        this.internationalFaxNumber = internationalFaxNumber;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressFaxNumber";
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
        values.put("IsDefaultFaxNumber", getIsDefaultFaxNumber());
        values.put("FaxCountry", getFaxCountry());
        values.put("FaxNumber", getFaxNumber());
        values.put("FaxNumberExtension", getFaxNumberExtension());
        values.put("InternationalFaxNumber", getInternationalFaxNumber());
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
            if (values.containsKey("IsDefaultFaxNumber")) {
                final Object value = values.remove("IsDefaultFaxNumber");
                if ((value == null)||(!value.equals(getIsDefaultFaxNumber()))) {
                    setIsDefaultFaxNumber(((Boolean) value));
                }
            }
            if (values.containsKey("FaxCountry")) {
                final Object value = values.remove("FaxCountry");
                if ((value == null)||(!value.equals(getFaxCountry()))) {
                    setFaxCountry(((String) value));
                }
            }
            if (values.containsKey("FaxNumber")) {
                final Object value = values.remove("FaxNumber");
                if ((value == null)||(!value.equals(getFaxNumber()))) {
                    setFaxNumber(((String) value));
                }
            }
            if (values.containsKey("FaxNumberExtension")) {
                final Object value = values.remove("FaxNumberExtension");
                if ((value == null)||(!value.equals(getFaxNumberExtension()))) {
                    setFaxNumberExtension(((String) value));
                }
            }
            if (values.containsKey("InternationalFaxNumber")) {
                final Object value = values.remove("InternationalFaxNumber");
                if ((value == null)||(!value.equals(getInternationalFaxNumber()))) {
                    setInternationalFaxNumber(((String) value));
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
    public static<T >AddressFaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressFaxNumberField<T>(fieldName);
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
    public static<T,DomainT >AddressFaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressFaxNumberField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
