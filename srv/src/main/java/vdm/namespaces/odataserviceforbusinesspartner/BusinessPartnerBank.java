/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerBankField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerBankSelectable;


/**
 * Business Partner Bank<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerBankType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerBank
    extends VdmEntity<BusinessPartnerBank>
{

    /**
     * Selector for all available fields of BusinessPartnerBank.
     * 
     */
    public final static BusinessPartnerBankSelectable ALL_FIELDS = new BusinessPartnerBankSelectable() {


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
    public final static BusinessPartnerBankField<String> BUSINESS_PARTNER = new BusinessPartnerBankField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BankIdentification</b></p>
     * 
     * @param bankIdentification
     *     
     * @return
     *     Bank details ID
     */
    @Key
    @SerializedName("BankIdentification")
    @JsonProperty("BankIdentification")
    @Nullable
    @ODataField(odataName = "BankIdentification")
    private String bankIdentification;
    /**
     * Use with available fluent helpers to apply the <b>BankIdentification</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_IDENTIFICATION = new BusinessPartnerBankField<String>("BankIdentification");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BankCountryKey</b></p>
     * 
     * @param bankCountryKey
     *     
     * @return
     *     Bank Country Key
     */
    @SerializedName("BankCountryKey")
    @JsonProperty("BankCountryKey")
    @Nullable
    @ODataField(odataName = "BankCountryKey")
    private String bankCountryKey;
    /**
     * Use with available fluent helpers to apply the <b>BankCountryKey</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_COUNTRY_KEY = new BusinessPartnerBankField<String>("BankCountryKey");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BankName</b></p>
     * 
     * @param bankName
     *     
     * @return
     *     Name of Bank
     */
    @SerializedName("BankName")
    @JsonProperty("BankName")
    @Nullable
    @ODataField(odataName = "BankName")
    private String bankName;
    /**
     * Use with available fluent helpers to apply the <b>BankName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_NAME = new BusinessPartnerBankField<String>("BankName");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>BankNumber</b></p>
     * 
     * @param bankNumber
     *     
     * @return
     *     Bank Key
     */
    @SerializedName("BankNumber")
    @JsonProperty("BankNumber")
    @Nullable
    @ODataField(odataName = "BankNumber")
    private String bankNumber;
    /**
     * Use with available fluent helpers to apply the <b>BankNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_NUMBER = new BusinessPartnerBankField<String>("BankNumber");
    /**
     * Constraints: Not nullable, Maximum length: 11 <p>Original property name from the Odata EDM: <b>SWIFTCode</b></p>
     * 
     * @param sWIFTCode
     *     
     * @return
     *     SWIFT/BIC for International Payments
     */
    @SerializedName("SWIFTCode")
    @JsonProperty("SWIFTCode")
    @Nullable
    @ODataField(odataName = "SWIFTCode")
    private String sWIFTCode;
    /**
     * Use with available fluent helpers to apply the <b>SWIFTCode</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> SWIFT_CODE = new BusinessPartnerBankField<String>("SWIFTCode");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BankControlKey</b></p>
     * 
     * @param bankControlKey
     *     
     * @return
     *     Bank Control Key
     */
    @SerializedName("BankControlKey")
    @JsonProperty("BankControlKey")
    @Nullable
    @ODataField(odataName = "BankControlKey")
    private String bankControlKey;
    /**
     * Use with available fluent helpers to apply the <b>BankControlKey</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_CONTROL_KEY = new BusinessPartnerBankField<String>("BankControlKey");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BankAccountHolderName</b></p>
     * 
     * @param bankAccountHolderName
     *     
     * @return
     *     Account Holder Name
     */
    @SerializedName("BankAccountHolderName")
    @JsonProperty("BankAccountHolderName")
    @Nullable
    @ODataField(odataName = "BankAccountHolderName")
    private String bankAccountHolderName;
    /**
     * Use with available fluent helpers to apply the <b>BankAccountHolderName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_ACCOUNT_HOLDER_NAME = new BusinessPartnerBankField<String>("BankAccountHolderName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BankAccountName</b></p>
     * 
     * @param bankAccountName
     *     
     * @return
     *     Name of Bank Account
     */
    @SerializedName("BankAccountName")
    @JsonProperty("BankAccountName")
    @Nullable
    @ODataField(odataName = "BankAccountName")
    private String bankAccountName;
    /**
     * Use with available fluent helpers to apply the <b>BankAccountName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_ACCOUNT_NAME = new BusinessPartnerBankField<String>("BankAccountName");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     
     * @return
     *     Validity Start of Business Partner Bank Details
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
    public final static BusinessPartnerBankField<ZonedDateTime> VALIDITY_START_DATE = new BusinessPartnerBankField<ZonedDateTime>("ValidityStartDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     
     * @return
     *     Validity End of Business Partner Bank Details
     */
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
    public final static BusinessPartnerBankField<ZonedDateTime> VALIDITY_END_DATE = new BusinessPartnerBankField<ZonedDateTime>("ValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 34 <p>Original property name from the Odata EDM: <b>IBAN</b></p>
     * 
     * @param iBAN
     *     
     * @return
     *     IBAN (International Bank Account Number)
     */
    @SerializedName("IBAN")
    @JsonProperty("IBAN")
    @Nullable
    @ODataField(odataName = "IBAN")
    private String iBAN;
    /**
     * Use with available fluent helpers to apply the <b>IBAN</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> IBAN = new BusinessPartnerBankField<String>("IBAN");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>IBANValidityStartDate</b></p>
     * 
     * @param iBANValidityStartDate
     *     
     * @return
     *     Validity start of IBAN
     */
    @SerializedName("IBANValidityStartDate")
    @JsonProperty("IBANValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "IBANValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime iBANValidityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>IBANValidityStartDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<LocalDateTime> IBAN_VALIDITY_START_DATE = new BusinessPartnerBankField<LocalDateTime>("IBANValidityStartDate");
    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>BankAccount</b></p>
     * 
     * @param bankAccount
     *     
     * @return
     *     Bank Account Number
     */
    @SerializedName("BankAccount")
    @JsonProperty("BankAccount")
    @Nullable
    @ODataField(odataName = "BankAccount")
    private String bankAccount;
    /**
     * Use with available fluent helpers to apply the <b>BankAccount</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_ACCOUNT = new BusinessPartnerBankField<String>("BankAccount");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BankAccountReferenceText</b></p>
     * 
     * @param bankAccountReferenceText
     *     
     * @return
     *     Reference Details for Bank Details
     */
    @SerializedName("BankAccountReferenceText")
    @JsonProperty("BankAccountReferenceText")
    @Nullable
    @ODataField(odataName = "BankAccountReferenceText")
    private String bankAccountReferenceText;
    /**
     * Use with available fluent helpers to apply the <b>BankAccountReferenceText</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> BANK_ACCOUNT_REFERENCE_TEXT = new BusinessPartnerBankField<String>("BankAccountReferenceText");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CollectionAuthInd</b></p>
     * 
     * @param collectionAuthInd
     *     
     * @return
     *     Indicator: Collection Authorization
     */
    @SerializedName("CollectionAuthInd")
    @JsonProperty("CollectionAuthInd")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "CollectionAuthInd")
    private Boolean collectionAuthInd;
    /**
     * Use with available fluent helpers to apply the <b>CollectionAuthInd</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<Boolean> COLLECTION_AUTH_IND = new BusinessPartnerBankField<Boolean>("CollectionAuthInd");
    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>CityName</b></p>
     * 
     * @param cityName
     *     
     * @return
     *     City
     */
    @SerializedName("CityName")
    @JsonProperty("CityName")
    @Nullable
    @ODataField(odataName = "CityName")
    private String cityName;
    /**
     * Use with available fluent helpers to apply the <b>CityName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerBankField<String> CITY_NAME = new BusinessPartnerBankField<String>("CityName");
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
    public final static BusinessPartnerBankField<String> AUTHORIZATION_GROUP = new BusinessPartnerBankField<String>("AuthorizationGroup");
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
    public Class<BusinessPartnerBank> getType() {
        return BusinessPartnerBank.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BankIdentification</b></p>
     * 
     * @param bankIdentification
     *     Bank details ID
     */
    public void setBankIdentification(
        @Nullable
        final String bankIdentification) {
        rememberChangedField("BankIdentification", this.bankIdentification);
        this.bankIdentification = bankIdentification;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>BankCountryKey</b></p>
     * 
     * @param bankCountryKey
     *     Bank Country Key
     */
    public void setBankCountryKey(
        @Nullable
        final String bankCountryKey) {
        rememberChangedField("BankCountryKey", this.bankCountryKey);
        this.bankCountryKey = bankCountryKey;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BankName</b></p>
     * 
     * @param bankName
     *     Name of Bank
     */
    public void setBankName(
        @Nullable
        final String bankName) {
        rememberChangedField("BankName", this.bankName);
        this.bankName = bankName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>BankNumber</b></p>
     * 
     * @param bankNumber
     *     Bank Key
     */
    public void setBankNumber(
        @Nullable
        final String bankNumber) {
        rememberChangedField("BankNumber", this.bankNumber);
        this.bankNumber = bankNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 11 <p>Original property name from the Odata EDM: <b>SWIFTCode</b></p>
     * 
     * @param sWIFTCode
     *     SWIFT/BIC for International Payments
     */
    public void setSWIFTCode(
        @Nullable
        final String sWIFTCode) {
        rememberChangedField("SWIFTCode", this.sWIFTCode);
        this.sWIFTCode = sWIFTCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>BankControlKey</b></p>
     * 
     * @param bankControlKey
     *     Bank Control Key
     */
    public void setBankControlKey(
        @Nullable
        final String bankControlKey) {
        rememberChangedField("BankControlKey", this.bankControlKey);
        this.bankControlKey = bankControlKey;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BankAccountHolderName</b></p>
     * 
     * @param bankAccountHolderName
     *     Account Holder Name
     */
    public void setBankAccountHolderName(
        @Nullable
        final String bankAccountHolderName) {
        rememberChangedField("BankAccountHolderName", this.bankAccountHolderName);
        this.bankAccountHolderName = bankAccountHolderName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>BankAccountName</b></p>
     * 
     * @param bankAccountName
     *     Name of Bank Account
     */
    public void setBankAccountName(
        @Nullable
        final String bankAccountName) {
        rememberChangedField("BankAccountName", this.bankAccountName);
        this.bankAccountName = bankAccountName;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     Validity Start of Business Partner Bank Details
     */
    public void setValidityStartDate(
        @Nullable
        final ZonedDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     Validity End of Business Partner Bank Details
     */
    public void setValidityEndDate(
        @Nullable
        final ZonedDateTime validityEndDate) {
        rememberChangedField("ValidityEndDate", this.validityEndDate);
        this.validityEndDate = validityEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 34 <p>Original property name from the Odata EDM: <b>IBAN</b></p>
     * 
     * @param iBAN
     *     IBAN (International Bank Account Number)
     */
    public void setIBAN(
        @Nullable
        final String iBAN) {
        rememberChangedField("IBAN", this.iBAN);
        this.iBAN = iBAN;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>IBANValidityStartDate</b></p>
     * 
     * @param iBANValidityStartDate
     *     Validity start of IBAN
     */
    public void setIBANValidityStartDate(
        @Nullable
        final LocalDateTime iBANValidityStartDate) {
        rememberChangedField("IBANValidityStartDate", this.iBANValidityStartDate);
        this.iBANValidityStartDate = iBANValidityStartDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 18 <p>Original property name from the Odata EDM: <b>BankAccount</b></p>
     * 
     * @param bankAccount
     *     Bank Account Number
     */
    public void setBankAccount(
        @Nullable
        final String bankAccount) {
        rememberChangedField("BankAccount", this.bankAccount);
        this.bankAccount = bankAccount;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BankAccountReferenceText</b></p>
     * 
     * @param bankAccountReferenceText
     *     Reference Details for Bank Details
     */
    public void setBankAccountReferenceText(
        @Nullable
        final String bankAccountReferenceText) {
        rememberChangedField("BankAccountReferenceText", this.bankAccountReferenceText);
        this.bankAccountReferenceText = bankAccountReferenceText;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>CollectionAuthInd</b></p>
     * 
     * @param collectionAuthInd
     *     Indicator: Collection Authorization
     */
    public void setCollectionAuthInd(
        @Nullable
        final Boolean collectionAuthInd) {
        rememberChangedField("CollectionAuthInd", this.collectionAuthInd);
        this.collectionAuthInd = collectionAuthInd;
    }

    /**
     * Constraints: Not nullable, Maximum length: 35 <p>Original property name from the Odata EDM: <b>CityName</b></p>
     * 
     * @param cityName
     *     City
     */
    public void setCityName(
        @Nullable
        final String cityName) {
        rememberChangedField("CityName", this.cityName);
        this.cityName = cityName;
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
        return "A_BusinessPartnerBank";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BankIdentification", getBankIdentification());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BankIdentification", getBankIdentification());
        values.put("BankCountryKey", getBankCountryKey());
        values.put("BankName", getBankName());
        values.put("BankNumber", getBankNumber());
        values.put("SWIFTCode", getSWIFTCode());
        values.put("BankControlKey", getBankControlKey());
        values.put("BankAccountHolderName", getBankAccountHolderName());
        values.put("BankAccountName", getBankAccountName());
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("ValidityEndDate", getValidityEndDate());
        values.put("IBAN", getIBAN());
        values.put("IBANValidityStartDate", getIBANValidityStartDate());
        values.put("BankAccount", getBankAccount());
        values.put("BankAccountReferenceText", getBankAccountReferenceText());
        values.put("CollectionAuthInd", getCollectionAuthInd());
        values.put("CityName", getCityName());
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
            if (values.containsKey("BankIdentification")) {
                final Object value = values.remove("BankIdentification");
                if ((value == null)||(!value.equals(getBankIdentification()))) {
                    setBankIdentification(((String) value));
                }
            }
            if (values.containsKey("BankCountryKey")) {
                final Object value = values.remove("BankCountryKey");
                if ((value == null)||(!value.equals(getBankCountryKey()))) {
                    setBankCountryKey(((String) value));
                }
            }
            if (values.containsKey("BankName")) {
                final Object value = values.remove("BankName");
                if ((value == null)||(!value.equals(getBankName()))) {
                    setBankName(((String) value));
                }
            }
            if (values.containsKey("BankNumber")) {
                final Object value = values.remove("BankNumber");
                if ((value == null)||(!value.equals(getBankNumber()))) {
                    setBankNumber(((String) value));
                }
            }
            if (values.containsKey("SWIFTCode")) {
                final Object value = values.remove("SWIFTCode");
                if ((value == null)||(!value.equals(getSWIFTCode()))) {
                    setSWIFTCode(((String) value));
                }
            }
            if (values.containsKey("BankControlKey")) {
                final Object value = values.remove("BankControlKey");
                if ((value == null)||(!value.equals(getBankControlKey()))) {
                    setBankControlKey(((String) value));
                }
            }
            if (values.containsKey("BankAccountHolderName")) {
                final Object value = values.remove("BankAccountHolderName");
                if ((value == null)||(!value.equals(getBankAccountHolderName()))) {
                    setBankAccountHolderName(((String) value));
                }
            }
            if (values.containsKey("BankAccountName")) {
                final Object value = values.remove("BankAccountName");
                if ((value == null)||(!value.equals(getBankAccountName()))) {
                    setBankAccountName(((String) value));
                }
            }
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("IBAN")) {
                final Object value = values.remove("IBAN");
                if ((value == null)||(!value.equals(getIBAN()))) {
                    setIBAN(((String) value));
                }
            }
            if (values.containsKey("IBANValidityStartDate")) {
                final Object value = values.remove("IBANValidityStartDate");
                if ((value == null)||(!value.equals(getIBANValidityStartDate()))) {
                    setIBANValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BankAccount")) {
                final Object value = values.remove("BankAccount");
                if ((value == null)||(!value.equals(getBankAccount()))) {
                    setBankAccount(((String) value));
                }
            }
            if (values.containsKey("BankAccountReferenceText")) {
                final Object value = values.remove("BankAccountReferenceText");
                if ((value == null)||(!value.equals(getBankAccountReferenceText()))) {
                    setBankAccountReferenceText(((String) value));
                }
            }
            if (values.containsKey("CollectionAuthInd")) {
                final Object value = values.remove("CollectionAuthInd");
                if ((value == null)||(!value.equals(getCollectionAuthInd()))) {
                    setCollectionAuthInd(((Boolean) value));
                }
            }
            if (values.containsKey("CityName")) {
                final Object value = values.remove("CityName");
                if ((value == null)||(!value.equals(getCityName()))) {
                    setCityName(((String) value));
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
    public static<T >BusinessPartnerBankField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerBankField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerBankField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerBankField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
