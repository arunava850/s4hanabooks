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
import vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerTaxNumberField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerTaxNumberSelectable;


/**
 * Business Partner Tax Number<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerTaxNumberType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerTaxNumber
    extends VdmEntity<BusinessPartnerTaxNumber>
{

    /**
     * Selector for all available fields of BusinessPartnerTaxNumber.
     * 
     */
    public final static BusinessPartnerTaxNumberSelectable ALL_FIELDS = new BusinessPartnerTaxNumberSelectable() {


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
    public final static BusinessPartnerTaxNumberField<String> BUSINESS_PARTNER = new BusinessPartnerTaxNumberField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BPTaxType</b></p>
     * 
     * @param bPTaxType
     *     
     * @return
     *     Tax Number Category
     */
    @Key
    @SerializedName("BPTaxType")
    @JsonProperty("BPTaxType")
    @Nullable
    @ODataField(odataName = "BPTaxType")
    private String bPTaxType;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxType</b> field to query operations.
     * 
     */
    public final static BusinessPartnerTaxNumberField<String> BP_TAX_TYPE = new BusinessPartnerTaxNumberField<String>("BPTaxType");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BPTaxNumber</b></p>
     * 
     * @param bPTaxNumber
     *     
     * @return
     *     Business Partner Tax Number
     */
    @SerializedName("BPTaxNumber")
    @JsonProperty("BPTaxNumber")
    @Nullable
    @ODataField(odataName = "BPTaxNumber")
    private String bPTaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerTaxNumberField<String> BP_TAX_NUMBER = new BusinessPartnerTaxNumberField<String>("BPTaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPTaxLongNumber</b></p>
     * 
     * @param bPTaxLongNumber
     *     
     * @return
     *     Business Partner Tax Number
     */
    @SerializedName("BPTaxLongNumber")
    @JsonProperty("BPTaxLongNumber")
    @Nullable
    @ODataField(odataName = "BPTaxLongNumber")
    private String bPTaxLongNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxLongNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerTaxNumberField<String> BP_TAX_LONG_NUMBER = new BusinessPartnerTaxNumberField<String>("BPTaxLongNumber");
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
    public final static BusinessPartnerTaxNumberField<String> AUTHORIZATION_GROUP = new BusinessPartnerTaxNumberField<String>("AuthorizationGroup");
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
    public Class<BusinessPartnerTaxNumber> getType() {
        return BusinessPartnerTaxNumber.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BPTaxType</b></p>
     * 
     * @param bPTaxType
     *     Tax Number Category
     */
    public void setBPTaxType(
        @Nullable
        final String bPTaxType) {
        rememberChangedField("BPTaxType", this.bPTaxType);
        this.bPTaxType = bPTaxType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BPTaxNumber</b></p>
     * 
     * @param bPTaxNumber
     *     Business Partner Tax Number
     */
    public void setBPTaxNumber(
        @Nullable
        final String bPTaxNumber) {
        rememberChangedField("BPTaxNumber", this.bPTaxNumber);
        this.bPTaxNumber = bPTaxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPTaxLongNumber</b></p>
     * 
     * @param bPTaxLongNumber
     *     Business Partner Tax Number
     */
    public void setBPTaxLongNumber(
        @Nullable
        final String bPTaxLongNumber) {
        rememberChangedField("BPTaxLongNumber", this.bPTaxLongNumber);
        this.bPTaxLongNumber = bPTaxLongNumber;
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
        return "A_BusinessPartnerTaxNumber";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BPTaxType", getBPTaxType());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BPTaxType", getBPTaxType());
        values.put("BPTaxNumber", getBPTaxNumber());
        values.put("BPTaxLongNumber", getBPTaxLongNumber());
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
            if (values.containsKey("BPTaxType")) {
                final Object value = values.remove("BPTaxType");
                if ((value == null)||(!value.equals(getBPTaxType()))) {
                    setBPTaxType(((String) value));
                }
            }
            if (values.containsKey("BPTaxNumber")) {
                final Object value = values.remove("BPTaxNumber");
                if ((value == null)||(!value.equals(getBPTaxNumber()))) {
                    setBPTaxNumber(((String) value));
                }
            }
            if (values.containsKey("BPTaxLongNumber")) {
                final Object value = values.remove("BPTaxLongNumber");
                if ((value == null)||(!value.equals(getBPTaxLongNumber()))) {
                    setBPTaxLongNumber(((String) value));
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
    public static<T >BusinessPartnerTaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerTaxNumberField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerTaxNumberField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerTaxNumberField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
