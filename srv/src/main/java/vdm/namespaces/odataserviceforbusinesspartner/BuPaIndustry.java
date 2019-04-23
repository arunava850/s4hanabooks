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
import vdm.namespaces.odataserviceforbusinesspartner.field.BuPaIndustryField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BuPaIndustrySelectable;


/**
 * Business Partner Industry<p></p><p>Original entity name from the Odata EDM: <b>A_BuPaIndustryType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BuPaIndustry
    extends VdmEntity<BuPaIndustry>
{

    /**
     * Selector for all available fields of BuPaIndustry.
     * 
     */
    public final static BuPaIndustrySelectable ALL_FIELDS = new BuPaIndustrySelectable() {


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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustrySector</b></p>
     * 
     * @param industrySector
     *     
     * @return
     *     Industry
     */
    @Key
    @SerializedName("IndustrySector")
    @JsonProperty("IndustrySector")
    @Nullable
    @ODataField(odataName = "IndustrySector")
    private String industrySector;
    /**
     * Use with available fluent helpers to apply the <b>IndustrySector</b> field to query operations.
     * 
     */
    public final static BuPaIndustryField<String> INDUSTRY_SECTOR = new BuPaIndustryField<String>("IndustrySector");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IndustrySystemType</b></p>
     * 
     * @param industrySystemType
     *     
     * @return
     *     Industry System
     */
    @Key
    @SerializedName("IndustrySystemType")
    @JsonProperty("IndustrySystemType")
    @Nullable
    @ODataField(odataName = "IndustrySystemType")
    private String industrySystemType;
    /**
     * Use with available fluent helpers to apply the <b>IndustrySystemType</b> field to query operations.
     * 
     */
    public final static BuPaIndustryField<String> INDUSTRY_SYSTEM_TYPE = new BuPaIndustryField<String>("IndustrySystemType");
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
    public final static BuPaIndustryField<String> BUSINESS_PARTNER = new BuPaIndustryField<String>("BusinessPartner");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsStandardIndustry</b></p>
     * 
     * @param isStandardIndustry
     *     
     * @return
     *     Industry is Standard for BP in Industry System
     */
    @SerializedName("IsStandardIndustry")
    @JsonProperty("IsStandardIndustry")
    @Nullable
    @ODataField(odataName = "IsStandardIndustry")
    private String isStandardIndustry;
    /**
     * Use with available fluent helpers to apply the <b>IsStandardIndustry</b> field to query operations.
     * 
     */
    public final static BuPaIndustryField<String> IS_STANDARD_INDUSTRY = new BuPaIndustryField<String>("IsStandardIndustry");
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
    public Class<BuPaIndustry> getType() {
        return BuPaIndustry.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndustrySector</b></p>
     * 
     * @param industrySector
     *     Industry
     */
    public void setIndustrySector(
        @Nullable
        final String industrySector) {
        rememberChangedField("IndustrySector", this.industrySector);
        this.industrySector = industrySector;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>IndustrySystemType</b></p>
     * 
     * @param industrySystemType
     *     Industry System
     */
    public void setIndustrySystemType(
        @Nullable
        final String industrySystemType) {
        rememberChangedField("IndustrySystemType", this.industrySystemType);
        this.industrySystemType = industrySystemType;
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
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsStandardIndustry</b></p>
     * 
     * @param isStandardIndustry
     *     Industry is Standard for BP in Industry System
     */
    public void setIsStandardIndustry(
        @Nullable
        final String isStandardIndustry) {
        rememberChangedField("IsStandardIndustry", this.isStandardIndustry);
        this.isStandardIndustry = isStandardIndustry;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BuPaIndustry";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("IndustrySector", getIndustrySector());
        result.put("IndustrySystemType", getIndustrySystemType());
        result.put("BusinessPartner", getBusinessPartner());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("IndustrySector", getIndustrySector());
        values.put("IndustrySystemType", getIndustrySystemType());
        values.put("BusinessPartner", getBusinessPartner());
        values.put("IsStandardIndustry", getIsStandardIndustry());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("IndustrySector")) {
                final Object value = values.remove("IndustrySector");
                if ((value == null)||(!value.equals(getIndustrySector()))) {
                    setIndustrySector(((String) value));
                }
            }
            if (values.containsKey("IndustrySystemType")) {
                final Object value = values.remove("IndustrySystemType");
                if ((value == null)||(!value.equals(getIndustrySystemType()))) {
                    setIndustrySystemType(((String) value));
                }
            }
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("IsStandardIndustry")) {
                final Object value = values.remove("IsStandardIndustry");
                if ((value == null)||(!value.equals(getIsStandardIndustry()))) {
                    setIsStandardIndustry(((String) value));
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
    public static<T >BuPaIndustryField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BuPaIndustryField<T>(fieldName);
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
    public static<T,DomainT >BuPaIndustryField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BuPaIndustryField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
