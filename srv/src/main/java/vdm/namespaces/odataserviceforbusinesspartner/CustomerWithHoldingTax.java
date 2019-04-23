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
import vdm.namespaces.odataserviceforbusinesspartner.field.CustomerWithHoldingTaxField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.CustomerWithHoldingTaxSelectable;


/**
 * Customer WithHolding Tax<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerWithHoldingTaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerWithHoldingTax
    extends VdmEntity<CustomerWithHoldingTax>
{

    /**
     * Selector for all available fields of CustomerWithHoldingTax.
     * 
     */
    public final static CustomerWithHoldingTaxSelectable ALL_FIELDS = new CustomerWithHoldingTaxSelectable() {


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
    public final static CustomerWithHoldingTaxField<String> CUSTOMER = new CustomerWithHoldingTaxField<String>("Customer");
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
    public final static CustomerWithHoldingTaxField<String> COMPANY_CODE = new CustomerWithHoldingTaxField<String>("CompanyCode");
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
    public final static CustomerWithHoldingTaxField<String> WITHHOLDING_TAX_TYPE = new CustomerWithHoldingTaxField<String>("WithholdingTaxType");
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
    public final static CustomerWithHoldingTaxField<String> WITHHOLDING_TAX_CODE = new CustomerWithHoldingTaxField<String>("WithholdingTaxCode");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>WithholdingTaxAgent</b></p>
     * 
     * @param withholdingTaxAgent
     *     
     * @return
     *     Indicator: Withholding tax agent?
     */
    @SerializedName("WithholdingTaxAgent")
    @JsonProperty("WithholdingTaxAgent")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "WithholdingTaxAgent")
    private Boolean withholdingTaxAgent;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxAgent</b> field to query operations.
     * 
     */
    public final static CustomerWithHoldingTaxField<Boolean> WITHHOLDING_TAX_AGENT = new CustomerWithHoldingTaxField<Boolean>("WithholdingTaxAgent");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateBegin</b></p>
     * 
     * @param obligationDateBegin
     *     
     * @return
     *     Obligated to withhold tax from
     */
    @SerializedName("ObligationDateBegin")
    @JsonProperty("ObligationDateBegin")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ObligationDateBegin", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime obligationDateBegin;
    /**
     * Use with available fluent helpers to apply the <b>ObligationDateBegin</b> field to query operations.
     * 
     */
    public final static CustomerWithHoldingTaxField<LocalDateTime> OBLIGATION_DATE_BEGIN = new CustomerWithHoldingTaxField<LocalDateTime>("ObligationDateBegin");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateEnd</b></p>
     * 
     * @param obligationDateEnd
     *     
     * @return
     *     Obligated to withhold tax until
     */
    @SerializedName("ObligationDateEnd")
    @JsonProperty("ObligationDateEnd")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ObligationDateEnd", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime obligationDateEnd;
    /**
     * Use with available fluent helpers to apply the <b>ObligationDateEnd</b> field to query operations.
     * 
     */
    public final static CustomerWithHoldingTaxField<LocalDateTime> OBLIGATION_DATE_END = new CustomerWithHoldingTaxField<LocalDateTime>("ObligationDateEnd");
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
    public final static CustomerWithHoldingTaxField<String> WITHHOLDING_TAX_NUMBER = new CustomerWithHoldingTaxField<String>("WithholdingTaxNumber");
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
    public final static CustomerWithHoldingTaxField<String> WITHHOLDING_TAX_CERTIFICATE = new CustomerWithHoldingTaxField<String>("WithholdingTaxCertificate");
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
    public final static CustomerWithHoldingTaxField<BigDecimal> WITHHOLDING_TAX_EXMPT_PERCENT = new CustomerWithHoldingTaxField<BigDecimal>("WithholdingTaxExmptPercent");
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
    public final static CustomerWithHoldingTaxField<LocalDateTime> EXEMPTION_DATE_BEGIN = new CustomerWithHoldingTaxField<LocalDateTime>("ExemptionDateBegin");
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
    public final static CustomerWithHoldingTaxField<LocalDateTime> EXEMPTION_DATE_END = new CustomerWithHoldingTaxField<LocalDateTime>("ExemptionDateEnd");
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
    public final static CustomerWithHoldingTaxField<String> EXEMPTION_REASON = new CustomerWithHoldingTaxField<String>("ExemptionReason");
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
    public final static CustomerWithHoldingTaxField<String> AUTHORIZATION_GROUP = new CustomerWithHoldingTaxField<String>("AuthorizationGroup");
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
    public Class<CustomerWithHoldingTax> getType() {
        return CustomerWithHoldingTax.class;
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
     * Constraints: none<p>Original property name from the Odata EDM: <b>WithholdingTaxAgent</b></p>
     * 
     * @param withholdingTaxAgent
     *     Indicator: Withholding tax agent?
     */
    public void setWithholdingTaxAgent(
        @Nullable
        final Boolean withholdingTaxAgent) {
        rememberChangedField("WithholdingTaxAgent", this.withholdingTaxAgent);
        this.withholdingTaxAgent = withholdingTaxAgent;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateBegin</b></p>
     * 
     * @param obligationDateBegin
     *     Obligated to withhold tax from
     */
    public void setObligationDateBegin(
        @Nullable
        final LocalDateTime obligationDateBegin) {
        rememberChangedField("ObligationDateBegin", this.obligationDateBegin);
        this.obligationDateBegin = obligationDateBegin;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateEnd</b></p>
     * 
     * @param obligationDateEnd
     *     Obligated to withhold tax until
     */
    public void setObligationDateEnd(
        @Nullable
        final LocalDateTime obligationDateEnd) {
        rememberChangedField("ObligationDateEnd", this.obligationDateEnd);
        this.obligationDateEnd = obligationDateEnd;
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
        return "A_CustomerWithHoldingTax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CompanyCode", getCompanyCode());
        result.put("WithholdingTaxType", getWithholdingTaxType());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CompanyCode", getCompanyCode());
        values.put("WithholdingTaxType", getWithholdingTaxType());
        values.put("WithholdingTaxCode", getWithholdingTaxCode());
        values.put("WithholdingTaxAgent", getWithholdingTaxAgent());
        values.put("ObligationDateBegin", getObligationDateBegin());
        values.put("ObligationDateEnd", getObligationDateEnd());
        values.put("WithholdingTaxNumber", getWithholdingTaxNumber());
        values.put("WithholdingTaxCertificate", getWithholdingTaxCertificate());
        values.put("WithholdingTaxExmptPercent", getWithholdingTaxExmptPercent());
        values.put("ExemptionDateBegin", getExemptionDateBegin());
        values.put("ExemptionDateEnd", getExemptionDateEnd());
        values.put("ExemptionReason", getExemptionReason());
        values.put("AuthorizationGroup", getAuthorizationGroup());
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
            if (values.containsKey("WithholdingTaxType")) {
                final Object value = values.remove("WithholdingTaxType");
                if ((value == null)||(!value.equals(getWithholdingTaxType()))) {
                    setWithholdingTaxType(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCode")) {
                final Object value = values.remove("WithholdingTaxCode");
                if ((value == null)||(!value.equals(getWithholdingTaxCode()))) {
                    setWithholdingTaxCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxAgent")) {
                final Object value = values.remove("WithholdingTaxAgent");
                if ((value == null)||(!value.equals(getWithholdingTaxAgent()))) {
                    setWithholdingTaxAgent(((Boolean) value));
                }
            }
            if (values.containsKey("ObligationDateBegin")) {
                final Object value = values.remove("ObligationDateBegin");
                if ((value == null)||(!value.equals(getObligationDateBegin()))) {
                    setObligationDateBegin(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ObligationDateEnd")) {
                final Object value = values.remove("ObligationDateEnd");
                if ((value == null)||(!value.equals(getObligationDateEnd()))) {
                    setObligationDateEnd(((LocalDateTime) value));
                }
            }
            if (values.containsKey("WithholdingTaxNumber")) {
                final Object value = values.remove("WithholdingTaxNumber");
                if ((value == null)||(!value.equals(getWithholdingTaxNumber()))) {
                    setWithholdingTaxNumber(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCertificate")) {
                final Object value = values.remove("WithholdingTaxCertificate");
                if ((value == null)||(!value.equals(getWithholdingTaxCertificate()))) {
                    setWithholdingTaxCertificate(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxExmptPercent")) {
                final Object value = values.remove("WithholdingTaxExmptPercent");
                if ((value == null)||(!value.equals(getWithholdingTaxExmptPercent()))) {
                    setWithholdingTaxExmptPercent(((BigDecimal) value));
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
    public static<T >CustomerWithHoldingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerWithHoldingTaxField<T>(fieldName);
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
    public static<T,DomainT >CustomerWithHoldingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerWithHoldingTaxField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
