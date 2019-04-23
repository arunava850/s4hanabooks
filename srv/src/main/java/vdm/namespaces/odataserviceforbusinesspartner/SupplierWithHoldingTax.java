/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.math.BigDecimal;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.SupplierWithHoldingTaxField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierWithHoldingTaxSelectable;


/**
 * Supplier Company WithHolding Tax<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierWithHoldingTaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SupplierWithHoldingTax
    extends VdmEntity<SupplierWithHoldingTax>
{

    /**
     * Selector for all available fields of SupplierWithHoldingTax.
     * 
     */
    public final static SupplierWithHoldingTaxSelectable ALL_FIELDS = new SupplierWithHoldingTaxSelectable() {


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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     
     * @return
     *     Account Number of Supplier
     */
    @Key
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> SUPPLIER = new SupplierWithHoldingTaxField<String>("Supplier");
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
    public final static SupplierWithHoldingTaxField<String> COMPANY_CODE = new SupplierWithHoldingTaxField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @param withholdingTaxType
     *     
     * @return
     *     Indicator for Withholding Tax Type
     */
    @Key
    @SerializedName("WithholdingTaxType")
    @JsonProperty("WithholdingTaxType")
    @Nullable
    @ODataField(odataName = "WithholdingTaxType")
    private String withholdingTaxType;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxType</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> WITHHOLDING_TAX_TYPE = new SupplierWithHoldingTaxField<String>("WithholdingTaxType");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @param exemptionDateBegin
     *     
     * @return
     *     Date on which exemption begins
     */
    @SerializedName("ExemptionDateBegin")
    @JsonProperty("ExemptionDateBegin")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateBegin", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionDateBegin;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateBegin</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<LocalDateTime> EXEMPTION_DATE_BEGIN = new SupplierWithHoldingTaxField<LocalDateTime>("ExemptionDateBegin");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @param exemptionDateEnd
     *     
     * @return
     *     Date on which exemption ends
     */
    @SerializedName("ExemptionDateEnd")
    @JsonProperty("ExemptionDateEnd")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateEnd", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionDateEnd;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateEnd</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<LocalDateTime> EXEMPTION_DATE_END = new SupplierWithHoldingTaxField<LocalDateTime>("ExemptionDateEnd");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @param exemptionReason
     *     
     * @return
     *     Reason for exemption
     */
    @SerializedName("ExemptionReason")
    @JsonProperty("ExemptionReason")
    @Nullable
    @ODataField(odataName = "ExemptionReason")
    private String exemptionReason;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionReason</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> EXEMPTION_REASON = new SupplierWithHoldingTaxField<String>("ExemptionReason");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsWithholdingTaxSubject</b></p>
     * 
     * @param isWithholdingTaxSubject
     *     
     * @return
     *     Indicator: Subject to withholding tax?
     */
    @SerializedName("IsWithholdingTaxSubject")
    @JsonProperty("IsWithholdingTaxSubject")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsWithholdingTaxSubject")
    private Boolean isWithholdingTaxSubject;
    /**
     * Use with available fluent helpers to apply the <b>IsWithholdingTaxSubject</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<Boolean> IS_WITHHOLDING_TAX_SUBJECT = new SupplierWithHoldingTaxField<Boolean>("IsWithholdingTaxSubject");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>RecipientType</b></p>
     * 
     * @param recipientType
     *     
     * @return
     *     Type of recipient
     */
    @SerializedName("RecipientType")
    @JsonProperty("RecipientType")
    @Nullable
    @ODataField(odataName = "RecipientType")
    private String recipientType;
    /**
     * Use with available fluent helpers to apply the <b>RecipientType</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> RECIPIENT_TYPE = new SupplierWithHoldingTaxField<String>("RecipientType");
    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @param withholdingTaxCertificate
     *     
     * @return
     *     Exemption certificate number
     */
    @SerializedName("WithholdingTaxCertificate")
    @JsonProperty("WithholdingTaxCertificate")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCertificate")
    private String withholdingTaxCertificate;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCertificate</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> WITHHOLDING_TAX_CERTIFICATE = new SupplierWithHoldingTaxField<String>("WithholdingTaxCertificate");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @param withholdingTaxCode
     *     
     * @return
     *     Withholding tax code
     */
    @SerializedName("WithholdingTaxCode")
    @JsonProperty("WithholdingTaxCode")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCode")
    private String withholdingTaxCode;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCode</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> WITHHOLDING_TAX_CODE = new SupplierWithHoldingTaxField<String>("WithholdingTaxCode");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @param withholdingTaxExmptPercent
     *     
     * @return
     *     Exemption rate
     */
    @SerializedName("WithholdingTaxExmptPercent")
    @JsonProperty("WithholdingTaxExmptPercent")
    @Nullable
    @ODataField(odataName = "WithholdingTaxExmptPercent")
    private BigDecimal withholdingTaxExmptPercent;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxExmptPercent</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<BigDecimal> WITHHOLDING_TAX_EXMPT_PERCENT = new SupplierWithHoldingTaxField<BigDecimal>("WithholdingTaxExmptPercent");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @param withholdingTaxNumber
     *     
     * @return
     *     Withholding tax identification number
     */
    @SerializedName("WithholdingTaxNumber")
    @JsonProperty("WithholdingTaxNumber")
    @Nullable
    @ODataField(odataName = "WithholdingTaxNumber")
    private String withholdingTaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxNumber</b> field to query operations.
     * 
     */
    public final static SupplierWithHoldingTaxField<String> WITHHOLDING_TAX_NUMBER = new SupplierWithHoldingTaxField<String>("WithholdingTaxNumber");
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
    public final static SupplierWithHoldingTaxField<String> AUTHORIZATION_GROUP = new SupplierWithHoldingTaxField<String>("AuthorizationGroup");
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
    public Class<SupplierWithHoldingTax> getType() {
        return SupplierWithHoldingTax.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     Account Number of Supplier
     */
    public void setSupplier(
        @Nullable
        final String supplier) {
        rememberChangedField("Supplier", this.supplier);
        this.supplier = supplier;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @param withholdingTaxType
     *     Indicator for Withholding Tax Type
     */
    public void setWithholdingTaxType(
        @Nullable
        final String withholdingTaxType) {
        rememberChangedField("WithholdingTaxType", this.withholdingTaxType);
        this.withholdingTaxType = withholdingTaxType;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @param exemptionDateBegin
     *     Date on which exemption begins
     */
    public void setExemptionDateBegin(
        @Nullable
        final LocalDateTime exemptionDateBegin) {
        rememberChangedField("ExemptionDateBegin", this.exemptionDateBegin);
        this.exemptionDateBegin = exemptionDateBegin;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @param exemptionDateEnd
     *     Date on which exemption ends
     */
    public void setExemptionDateEnd(
        @Nullable
        final LocalDateTime exemptionDateEnd) {
        rememberChangedField("ExemptionDateEnd", this.exemptionDateEnd);
        this.exemptionDateEnd = exemptionDateEnd;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @param exemptionReason
     *     Reason for exemption
     */
    public void setExemptionReason(
        @Nullable
        final String exemptionReason) {
        rememberChangedField("ExemptionReason", this.exemptionReason);
        this.exemptionReason = exemptionReason;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsWithholdingTaxSubject</b></p>
     * 
     * @param isWithholdingTaxSubject
     *     Indicator: Subject to withholding tax?
     */
    public void setIsWithholdingTaxSubject(
        @Nullable
        final Boolean isWithholdingTaxSubject) {
        rememberChangedField("IsWithholdingTaxSubject", this.isWithholdingTaxSubject);
        this.isWithholdingTaxSubject = isWithholdingTaxSubject;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>RecipientType</b></p>
     * 
     * @param recipientType
     *     Type of recipient
     */
    public void setRecipientType(
        @Nullable
        final String recipientType) {
        rememberChangedField("RecipientType", this.recipientType);
        this.recipientType = recipientType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @param withholdingTaxCertificate
     *     Exemption certificate number
     */
    public void setWithholdingTaxCertificate(
        @Nullable
        final String withholdingTaxCertificate) {
        rememberChangedField("WithholdingTaxCertificate", this.withholdingTaxCertificate);
        this.withholdingTaxCertificate = withholdingTaxCertificate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @param withholdingTaxCode
     *     Withholding tax code
     */
    public void setWithholdingTaxCode(
        @Nullable
        final String withholdingTaxCode) {
        rememberChangedField("WithholdingTaxCode", this.withholdingTaxCode);
        this.withholdingTaxCode = withholdingTaxCode;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @param withholdingTaxExmptPercent
     *     Exemption rate
     */
    public void setWithholdingTaxExmptPercent(
        @Nullable
        final BigDecimal withholdingTaxExmptPercent) {
        rememberChangedField("WithholdingTaxExmptPercent", this.withholdingTaxExmptPercent);
        this.withholdingTaxExmptPercent = withholdingTaxExmptPercent;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @param withholdingTaxNumber
     *     Withholding tax identification number
     */
    public void setWithholdingTaxNumber(
        @Nullable
        final String withholdingTaxNumber) {
        rememberChangedField("WithholdingTaxNumber", this.withholdingTaxNumber);
        this.withholdingTaxNumber = withholdingTaxNumber;
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
        return "A_SupplierWithHoldingTax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("CompanyCode", getCompanyCode());
        result.put("WithholdingTaxType", getWithholdingTaxType());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("CompanyCode", getCompanyCode());
        values.put("WithholdingTaxType", getWithholdingTaxType());
        values.put("ExemptionDateBegin", getExemptionDateBegin());
        values.put("ExemptionDateEnd", getExemptionDateEnd());
        values.put("ExemptionReason", getExemptionReason());
        values.put("IsWithholdingTaxSubject", getIsWithholdingTaxSubject());
        values.put("RecipientType", getRecipientType());
        values.put("WithholdingTaxCertificate", getWithholdingTaxCertificate());
        values.put("WithholdingTaxCode", getWithholdingTaxCode());
        values.put("WithholdingTaxExmptPercent", getWithholdingTaxExmptPercent());
        values.put("WithholdingTaxNumber", getWithholdingTaxNumber());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxType")) {
                final Object value = values.remove("WithholdingTaxType");
                if ((value == null)||(!value.equals(getWithholdingTaxType()))) {
                    setWithholdingTaxType(((String) value));
                }
            }
            if (values.containsKey("ExemptionDateBegin")) {
                final Object value = values.remove("ExemptionDateBegin");
                if ((value == null)||(!value.equals(getExemptionDateBegin()))) {
                    setExemptionDateBegin(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionDateEnd")) {
                final Object value = values.remove("ExemptionDateEnd");
                if ((value == null)||(!value.equals(getExemptionDateEnd()))) {
                    setExemptionDateEnd(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionReason")) {
                final Object value = values.remove("ExemptionReason");
                if ((value == null)||(!value.equals(getExemptionReason()))) {
                    setExemptionReason(((String) value));
                }
            }
            if (values.containsKey("IsWithholdingTaxSubject")) {
                final Object value = values.remove("IsWithholdingTaxSubject");
                if ((value == null)||(!value.equals(getIsWithholdingTaxSubject()))) {
                    setIsWithholdingTaxSubject(((Boolean) value));
                }
            }
            if (values.containsKey("RecipientType")) {
                final Object value = values.remove("RecipientType");
                if ((value == null)||(!value.equals(getRecipientType()))) {
                    setRecipientType(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCertificate")) {
                final Object value = values.remove("WithholdingTaxCertificate");
                if ((value == null)||(!value.equals(getWithholdingTaxCertificate()))) {
                    setWithholdingTaxCertificate(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCode")) {
                final Object value = values.remove("WithholdingTaxCode");
                if ((value == null)||(!value.equals(getWithholdingTaxCode()))) {
                    setWithholdingTaxCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxExmptPercent")) {
                final Object value = values.remove("WithholdingTaxExmptPercent");
                if ((value == null)||(!value.equals(getWithholdingTaxExmptPercent()))) {
                    setWithholdingTaxExmptPercent(((BigDecimal) value));
                }
            }
            if (values.containsKey("WithholdingTaxNumber")) {
                final Object value = values.remove("WithholdingTaxNumber");
                if ((value == null)||(!value.equals(getWithholdingTaxNumber()))) {
                    setWithholdingTaxNumber(((String) value));
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
    public static<T >SupplierWithHoldingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierWithHoldingTaxField<T>(fieldName);
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
    public static<T,DomainT >SupplierWithHoldingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierWithHoldingTaxField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
