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
import vdm.namespaces.odataserviceforbusinesspartner.field.BPContactToFuncAndDeptField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BPContactToFuncAndDeptSelectable;


/**
 * Business Partner Contact Function and Department<p></p><p>Original entity name from the Odata EDM: <b>A_BPContactToFuncAndDeptType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BPContactToFuncAndDept
    extends VdmEntity<BPContactToFuncAndDept>
{

    /**
     * Selector for all available fields of BPContactToFuncAndDept.
     * 
     */
    public final static BPContactToFuncAndDeptSelectable ALL_FIELDS = new BPContactToFuncAndDeptSelectable() {


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
     * (Key Field) Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>RelationshipNumber</b></p>
     * 
     * @param relationshipNumber
     *     
     * @return
     *     BP Relationship Number
     */
    @Key
    @SerializedName("RelationshipNumber")
    @JsonProperty("RelationshipNumber")
    @Nullable
    @ODataField(odataName = "RelationshipNumber")
    private String relationshipNumber;
    /**
     * Use with available fluent helpers to apply the <b>RelationshipNumber</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> RELATIONSHIP_NUMBER = new BPContactToFuncAndDeptField<String>("RelationshipNumber");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerCompany</b></p>
     * 
     * @param businessPartnerCompany
     *     
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartnerCompany")
    @JsonProperty("BusinessPartnerCompany")
    @Nullable
    @ODataField(odataName = "BusinessPartnerCompany")
    private String businessPartnerCompany;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerCompany</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> BUSINESS_PARTNER_COMPANY = new BPContactToFuncAndDeptField<String>("BusinessPartnerCompany");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerPerson</b></p>
     * 
     * @param businessPartnerPerson
     *     
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartnerPerson")
    @JsonProperty("BusinessPartnerPerson")
    @Nullable
    @ODataField(odataName = "BusinessPartnerPerson")
    private String businessPartnerPerson;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerPerson</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> BUSINESS_PARTNER_PERSON = new BPContactToFuncAndDeptField<String>("BusinessPartnerPerson");
    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     
     * @return
     *     Validity Date (Valid To)
     */
    @Key
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
    public final static BPContactToFuncAndDeptField<LocalDateTime> VALIDITY_END_DATE = new BPContactToFuncAndDeptField<LocalDateTime>("ValidityEndDate");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ContactPersonFunction</b></p>
     * 
     * @param contactPersonFunction
     *     
     * @return
     *     Function of partner
     */
    @SerializedName("ContactPersonFunction")
    @JsonProperty("ContactPersonFunction")
    @Nullable
    @ODataField(odataName = "ContactPersonFunction")
    private String contactPersonFunction;
    /**
     * Use with available fluent helpers to apply the <b>ContactPersonFunction</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> CONTACT_PERSON_FUNCTION = new BPContactToFuncAndDeptField<String>("ContactPersonFunction");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ContactPersonDepartment</b></p>
     * 
     * @param contactPersonDepartment
     *     
     * @return
     *     Department
     */
    @SerializedName("ContactPersonDepartment")
    @JsonProperty("ContactPersonDepartment")
    @Nullable
    @ODataField(odataName = "ContactPersonDepartment")
    private String contactPersonDepartment;
    /**
     * Use with available fluent helpers to apply the <b>ContactPersonDepartment</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> CONTACT_PERSON_DEPARTMENT = new BPContactToFuncAndDeptField<String>("ContactPersonDepartment");
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
    public final static BPContactToFuncAndDeptField<String> PHONE_NUMBER = new BPContactToFuncAndDeptField<String>("PhoneNumber");
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
    public final static BPContactToFuncAndDeptField<String> PHONE_NUMBER_EXTENSION = new BPContactToFuncAndDeptField<String>("PhoneNumberExtension");
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
    public final static BPContactToFuncAndDeptField<String> FAX_NUMBER = new BPContactToFuncAndDeptField<String>("FaxNumber");
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
    public final static BPContactToFuncAndDeptField<String> FAX_NUMBER_EXTENSION = new BPContactToFuncAndDeptField<String>("FaxNumberExtension");
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
    public final static BPContactToFuncAndDeptField<String> EMAIL_ADDRESS = new BPContactToFuncAndDeptField<String>("EmailAddress");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>RelationshipCategory</b></p>
     * 
     * @param relationshipCategory
     *     
     * @return
     *     Business Partner Relationship Category
     */
    @SerializedName("RelationshipCategory")
    @JsonProperty("RelationshipCategory")
    @Nullable
    @ODataField(odataName = "RelationshipCategory")
    private String relationshipCategory;
    /**
     * Use with available fluent helpers to apply the <b>RelationshipCategory</b> field to query operations.
     * 
     */
    public final static BPContactToFuncAndDeptField<String> RELATIONSHIP_CATEGORY = new BPContactToFuncAndDeptField<String>("RelationshipCategory");
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
    public Class<BPContactToFuncAndDept> getType() {
        return BPContactToFuncAndDept.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>RelationshipNumber</b></p>
     * 
     * @param relationshipNumber
     *     BP Relationship Number
     */
    public void setRelationshipNumber(
        @Nullable
        final String relationshipNumber) {
        rememberChangedField("RelationshipNumber", this.relationshipNumber);
        this.relationshipNumber = relationshipNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerCompany</b></p>
     * 
     * @param businessPartnerCompany
     *     Business Partner Number
     */
    public void setBusinessPartnerCompany(
        @Nullable
        final String businessPartnerCompany) {
        rememberChangedField("BusinessPartnerCompany", this.businessPartnerCompany);
        this.businessPartnerCompany = businessPartnerCompany;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartnerPerson</b></p>
     * 
     * @param businessPartnerPerson
     *     Business Partner Number
     */
    public void setBusinessPartnerPerson(
        @Nullable
        final String businessPartnerPerson) {
        rememberChangedField("BusinessPartnerPerson", this.businessPartnerPerson);
        this.businessPartnerPerson = businessPartnerPerson;
    }

    /**
     * (Key Field) Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityEndDate</b></p>
     * 
     * @param validityEndDate
     *     Validity Date (Valid To)
     */
    public void setValidityEndDate(
        @Nullable
        final LocalDateTime validityEndDate) {
        rememberChangedField("ValidityEndDate", this.validityEndDate);
        this.validityEndDate = validityEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ContactPersonFunction</b></p>
     * 
     * @param contactPersonFunction
     *     Function of partner
     */
    public void setContactPersonFunction(
        @Nullable
        final String contactPersonFunction) {
        rememberChangedField("ContactPersonFunction", this.contactPersonFunction);
        this.contactPersonFunction = contactPersonFunction;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>ContactPersonDepartment</b></p>
     * 
     * @param contactPersonDepartment
     *     Department
     */
    public void setContactPersonDepartment(
        @Nullable
        final String contactPersonDepartment) {
        rememberChangedField("ContactPersonDepartment", this.contactPersonDepartment);
        this.contactPersonDepartment = contactPersonDepartment;
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
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>RelationshipCategory</b></p>
     * 
     * @param relationshipCategory
     *     Business Partner Relationship Category
     */
    public void setRelationshipCategory(
        @Nullable
        final String relationshipCategory) {
        rememberChangedField("RelationshipCategory", this.relationshipCategory);
        this.relationshipCategory = relationshipCategory;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPContactToFuncAndDept";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("RelationshipNumber", getRelationshipNumber());
        result.put("BusinessPartnerCompany", getBusinessPartnerCompany());
        result.put("BusinessPartnerPerson", getBusinessPartnerPerson());
        result.put("ValidityEndDate", getValidityEndDate());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("RelationshipNumber", getRelationshipNumber());
        values.put("BusinessPartnerCompany", getBusinessPartnerCompany());
        values.put("BusinessPartnerPerson", getBusinessPartnerPerson());
        values.put("ValidityEndDate", getValidityEndDate());
        values.put("ContactPersonFunction", getContactPersonFunction());
        values.put("ContactPersonDepartment", getContactPersonDepartment());
        values.put("PhoneNumber", getPhoneNumber());
        values.put("PhoneNumberExtension", getPhoneNumberExtension());
        values.put("FaxNumber", getFaxNumber());
        values.put("FaxNumberExtension", getFaxNumberExtension());
        values.put("EmailAddress", getEmailAddress());
        values.put("RelationshipCategory", getRelationshipCategory());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("RelationshipNumber")) {
                final Object value = values.remove("RelationshipNumber");
                if ((value == null)||(!value.equals(getRelationshipNumber()))) {
                    setRelationshipNumber(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerCompany")) {
                final Object value = values.remove("BusinessPartnerCompany");
                if ((value == null)||(!value.equals(getBusinessPartnerCompany()))) {
                    setBusinessPartnerCompany(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerPerson")) {
                final Object value = values.remove("BusinessPartnerPerson");
                if ((value == null)||(!value.equals(getBusinessPartnerPerson()))) {
                    setBusinessPartnerPerson(((String) value));
                }
            }
            if (values.containsKey("ValidityEndDate")) {
                final Object value = values.remove("ValidityEndDate");
                if ((value == null)||(!value.equals(getValidityEndDate()))) {
                    setValidityEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ContactPersonFunction")) {
                final Object value = values.remove("ContactPersonFunction");
                if ((value == null)||(!value.equals(getContactPersonFunction()))) {
                    setContactPersonFunction(((String) value));
                }
            }
            if (values.containsKey("ContactPersonDepartment")) {
                final Object value = values.remove("ContactPersonDepartment");
                if ((value == null)||(!value.equals(getContactPersonDepartment()))) {
                    setContactPersonDepartment(((String) value));
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
            if (values.containsKey("EmailAddress")) {
                final Object value = values.remove("EmailAddress");
                if ((value == null)||(!value.equals(getEmailAddress()))) {
                    setEmailAddress(((String) value));
                }
            }
            if (values.containsKey("RelationshipCategory")) {
                final Object value = values.remove("RelationshipCategory");
                if ((value == null)||(!value.equals(getRelationshipCategory()))) {
                    setRelationshipCategory(((String) value));
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
    public static<T >BPContactToFuncAndDeptField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BPContactToFuncAndDeptField<T>(fieldName);
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
    public static<T,DomainT >BPContactToFuncAndDeptField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BPContactToFuncAndDeptField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
