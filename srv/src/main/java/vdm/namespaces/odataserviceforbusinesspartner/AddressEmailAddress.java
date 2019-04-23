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
import vdm.namespaces.odataserviceforbusinesspartner.field.AddressEmailAddressField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.AddressEmailAddressSelectable;


/**
 * Address Email Address<p></p><p>Original entity name from the Odata EDM: <b>A_AddressEmailAddressType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class AddressEmailAddress
    extends VdmEntity<AddressEmailAddress>
{

    /**
     * Selector for all available fields of AddressEmailAddress.
     * 
     */
    public final static AddressEmailAddressSelectable ALL_FIELDS = new AddressEmailAddressSelectable() {


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
    public final static AddressEmailAddressField<String> ADDRESS_ID = new AddressEmailAddressField<String>("AddressID");
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
    public final static AddressEmailAddressField<String> PERSON = new AddressEmailAddressField<String>("Person");
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
    public final static AddressEmailAddressField<String> ORDINAL_NUMBER = new AddressEmailAddressField<String>("OrdinalNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultEmailAddress</b></p>
     * 
     * @param isDefaultEmailAddress
     *     
     * @return
     *     Flag: this address is the default address
     */
    @SerializedName("IsDefaultEmailAddress")
    @JsonProperty("IsDefaultEmailAddress")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsDefaultEmailAddress")
    private Boolean isDefaultEmailAddress;
    /**
     * Use with available fluent helpers to apply the <b>IsDefaultEmailAddress</b> field to query operations.
     * 
     */
    public final static AddressEmailAddressField<Boolean> IS_DEFAULT_EMAIL_ADDRESS = new AddressEmailAddressField<Boolean>("IsDefaultEmailAddress");
    /**
     * Constraints: Not nullable, Maximum length: 241 <p>Original property name from the Odata EDM: <b>EmailAddress</b></p>
     * 
     * @param emailAddress
     *     
     * @return
     *     Email Address
     */
    @SerializedName("EmailAddress")
    @JsonProperty("EmailAddress")
    @Nullable
    @ODataField(odataName = "EmailAddress")
    private String emailAddress;
    /**
     * Use with available fluent helpers to apply the <b>EmailAddress</b> field to query operations.
     * 
     */
    public final static AddressEmailAddressField<String> EMAIL_ADDRESS = new AddressEmailAddressField<String>("EmailAddress");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SearchEmailAddress</b></p>
     * 
     * @param searchEmailAddress
     *     
     * @return
     *     E-Mail Address Search Field
     */
    @SerializedName("SearchEmailAddress")
    @JsonProperty("SearchEmailAddress")
    @Nullable
    @ODataField(odataName = "SearchEmailAddress")
    private String searchEmailAddress;
    /**
     * Use with available fluent helpers to apply the <b>SearchEmailAddress</b> field to query operations.
     * 
     */
    public final static AddressEmailAddressField<String> SEARCH_EMAIL_ADDRESS = new AddressEmailAddressField<String>("SearchEmailAddress");
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
    public Class<AddressEmailAddress> getType() {
        return AddressEmailAddress.class;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsDefaultEmailAddress</b></p>
     * 
     * @param isDefaultEmailAddress
     *     Flag: this address is the default address
     */
    public void setIsDefaultEmailAddress(
        @Nullable
        final Boolean isDefaultEmailAddress) {
        rememberChangedField("IsDefaultEmailAddress", this.isDefaultEmailAddress);
        this.isDefaultEmailAddress = isDefaultEmailAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 241 <p>Original property name from the Odata EDM: <b>EmailAddress</b></p>
     * 
     * @param emailAddress
     *     Email Address
     */
    public void setEmailAddress(
        @Nullable
        final String emailAddress) {
        rememberChangedField("EmailAddress", this.emailAddress);
        this.emailAddress = emailAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SearchEmailAddress</b></p>
     * 
     * @param searchEmailAddress
     *     E-Mail Address Search Field
     */
    public void setSearchEmailAddress(
        @Nullable
        final String searchEmailAddress) {
        rememberChangedField("SearchEmailAddress", this.searchEmailAddress);
        this.searchEmailAddress = searchEmailAddress;
    }

    @Override
    protected String getEntityCollection() {
        return "A_AddressEmailAddress";
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
        values.put("IsDefaultEmailAddress", getIsDefaultEmailAddress());
        values.put("EmailAddress", getEmailAddress());
        values.put("SearchEmailAddress", getSearchEmailAddress());
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
            if (values.containsKey("IsDefaultEmailAddress")) {
                final Object value = values.remove("IsDefaultEmailAddress");
                if ((value == null)||(!value.equals(getIsDefaultEmailAddress()))) {
                    setIsDefaultEmailAddress(((Boolean) value));
                }
            }
            if (values.containsKey("EmailAddress")) {
                final Object value = values.remove("EmailAddress");
                if ((value == null)||(!value.equals(getEmailAddress()))) {
                    setEmailAddress(((String) value));
                }
            }
            if (values.containsKey("SearchEmailAddress")) {
                final Object value = values.remove("SearchEmailAddress");
                if ((value == null)||(!value.equals(getSearchEmailAddress()))) {
                    setSearchEmailAddress(((String) value));
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
    public static<T >AddressEmailAddressField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new AddressEmailAddressField<T>(fieldName);
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
    public static<T,DomainT >AddressEmailAddressField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new AddressEmailAddressField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
