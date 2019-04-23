/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQuery;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryResult;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;
import vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerField;
import vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerLink;
import vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerOneToOneLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerSelectable;


/**
 * Business Partner<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartner
    extends VdmEntity<BusinessPartner>
{

    /**
     * Selector for all available fields of BusinessPartner.
     * 
     */
    public final static BusinessPartnerSelectable ALL_FIELDS = new BusinessPartnerSelectable() {


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
    public final static BusinessPartnerField<String> BUSINESS_PARTNER = new BusinessPartnerField<String>("BusinessPartner");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     
     * @return
     *     Customer Number
     */
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> CUSTOMER = new BusinessPartnerField<String>("Customer");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
     * 
     * @param supplier
     *     
     * @return
     *     Account Number of Supplier
     */
    @SerializedName("Supplier")
    @JsonProperty("Supplier")
    @Nullable
    @ODataField(odataName = "Supplier")
    private String supplier;
    /**
     * Use with available fluent helpers to apply the <b>Supplier</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> SUPPLIER = new BusinessPartnerField<String>("Supplier");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AcademicTitle</b></p>
     * 
     * @param academicTitle
     *     
     * @return
     *     Academic Title: Key
     */
    @SerializedName("AcademicTitle")
    @JsonProperty("AcademicTitle")
    @Nullable
    @ODataField(odataName = "AcademicTitle")
    private String academicTitle;
    /**
     * Use with available fluent helpers to apply the <b>AcademicTitle</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ACADEMIC_TITLE = new BusinessPartnerField<String>("AcademicTitle");
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
    public final static BusinessPartnerField<String> AUTHORIZATION_GROUP = new BusinessPartnerField<String>("AuthorizationGroup");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BusinessPartnerCategory</b></p>
     * 
     * @param businessPartnerCategory
     *     
     * @return
     *     Business Partner Category
     */
    @SerializedName("BusinessPartnerCategory")
    @JsonProperty("BusinessPartnerCategory")
    @Nullable
    @ODataField(odataName = "BusinessPartnerCategory")
    private String businessPartnerCategory;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerCategory</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_CATEGORY = new BusinessPartnerField<String>("BusinessPartnerCategory");
    /**
     * Constraints: Not nullable, Maximum length: 81 <p>Original property name from the Odata EDM: <b>BusinessPartnerFullName</b></p>
     * 
     * @param businessPartnerFullName
     *     
     */
    @SerializedName("BusinessPartnerFullName")
    @JsonProperty("BusinessPartnerFullName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerFullName")
    private String businessPartnerFullName;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerFullName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_FULL_NAME = new BusinessPartnerField<String>("BusinessPartnerFullName");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerGrouping</b></p>
     * 
     * @param businessPartnerGrouping
     *     
     * @return
     *     Business Partner Grouping
     */
    @SerializedName("BusinessPartnerGrouping")
    @JsonProperty("BusinessPartnerGrouping")
    @Nullable
    @ODataField(odataName = "BusinessPartnerGrouping")
    private String businessPartnerGrouping;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerGrouping</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_GROUPING = new BusinessPartnerField<String>("BusinessPartnerGrouping");
    /**
     * Constraints: Not nullable, Maximum length: 81 <p>Original property name from the Odata EDM: <b>BusinessPartnerName</b></p>
     * 
     * @param businessPartnerName
     *     
     */
    @SerializedName("BusinessPartnerName")
    @JsonProperty("BusinessPartnerName")
    @Nullable
    @ODataField(odataName = "BusinessPartnerName")
    private String businessPartnerName;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_NAME = new BusinessPartnerField<String>("BusinessPartnerName");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerUUID</b></p>
     * 
     * @param businessPartnerUUID
     *     
     * @return
     *     Business Partner GUID
     */
    @SerializedName("BusinessPartnerUUID")
    @JsonProperty("BusinessPartnerUUID")
    @Nullable
    @ODataField(odataName = "BusinessPartnerUUID")
    private UUID businessPartnerUUID;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerUUID</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<UUID> BUSINESS_PARTNER_UUID = new BusinessPartnerField<UUID>("BusinessPartnerUUID");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CorrespondenceLanguage</b></p>
     * 
     * @param correspondenceLanguage
     *     
     * @return
     *     Business Partner: Correspondence Language
     */
    @SerializedName("CorrespondenceLanguage")
    @JsonProperty("CorrespondenceLanguage")
    @Nullable
    @ODataField(odataName = "CorrespondenceLanguage")
    private String correspondenceLanguage;
    /**
     * Use with available fluent helpers to apply the <b>CorrespondenceLanguage</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> CORRESPONDENCE_LANGUAGE = new BusinessPartnerField<String>("CorrespondenceLanguage");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     
     * @return
     *     User who created the object
     */
    @SerializedName("CreatedByUser")
    @JsonProperty("CreatedByUser")
    @Nullable
    @ODataField(odataName = "CreatedByUser")
    private String createdByUser;
    /**
     * Use with available fluent helpers to apply the <b>CreatedByUser</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> CREATED_BY_USER = new BusinessPartnerField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     
     * @return
     *     Date on which the object was created
     */
    @SerializedName("CreationDate")
    @JsonProperty("CreationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "CreationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime creationDate;
    /**
     * Use with available fluent helpers to apply the <b>CreationDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalDateTime> CREATION_DATE = new BusinessPartnerField<LocalDateTime>("CreationDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationTime</b></p>
     * 
     * @param creationTime
     *     
     * @return
     *     Time at which the object was created
     */
    @SerializedName("CreationTime")
    @JsonProperty("CreationTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalTimeAdapter.class)
    @ODataField(odataName = "CreationTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalTimeCalendarConverter.class)
    private LocalTime creationTime;
    /**
     * Use with available fluent helpers to apply the <b>CreationTime</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalTime> CREATION_TIME = new BusinessPartnerField<LocalTime>("CreationTime");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>FirstName</b></p>
     * 
     * @param firstName
     *     
     * @return
     *     First Name of Business Partner (Person)
     */
    @SerializedName("FirstName")
    @JsonProperty("FirstName")
    @Nullable
    @ODataField(odataName = "FirstName")
    private String firstName;
    /**
     * Use with available fluent helpers to apply the <b>FirstName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> FIRST_NAME = new BusinessPartnerField<String>("FirstName");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>FormOfAddress</b></p>
     * 
     * @param formOfAddress
     *     
     * @return
     *     Form-of-Address Key
     */
    @SerializedName("FormOfAddress")
    @JsonProperty("FormOfAddress")
    @Nullable
    @ODataField(odataName = "FormOfAddress")
    private String formOfAddress;
    /**
     * Use with available fluent helpers to apply the <b>FormOfAddress</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> FORM_OF_ADDRESS = new BusinessPartnerField<String>("FormOfAddress");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Industry</b></p>
     * 
     * @param industry
     *     
     * @return
     *     Industry sector
     */
    @SerializedName("Industry")
    @JsonProperty("Industry")
    @Nullable
    @ODataField(odataName = "Industry")
    private String industry;
    /**
     * Use with available fluent helpers to apply the <b>Industry</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> INDUSTRY = new BusinessPartnerField<String>("Industry");
    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @param internationalLocationNumber1
     *     
     * @return
     *     International location number  (part 1)
     */
    @SerializedName("InternationalLocationNumber1")
    @JsonProperty("InternationalLocationNumber1")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber1")
    private String internationalLocationNumber1;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber1</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> INTERNATIONAL_LOCATION_NUMBER1 = new BusinessPartnerField<String>("InternationalLocationNumber1");
    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @param internationalLocationNumber2
     *     
     * @return
     *     International location number (Part 2)
     */
    @SerializedName("InternationalLocationNumber2")
    @JsonProperty("InternationalLocationNumber2")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber2")
    private String internationalLocationNumber2;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber2</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> INTERNATIONAL_LOCATION_NUMBER2 = new BusinessPartnerField<String>("InternationalLocationNumber2");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsFemale</b></p>
     * 
     * @param isFemale
     *     
     * @return
     *     Selection: Business partner is female
     */
    @SerializedName("IsFemale")
    @JsonProperty("IsFemale")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsFemale")
    private Boolean isFemale;
    /**
     * Use with available fluent helpers to apply the <b>IsFemale</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<Boolean> IS_FEMALE = new BusinessPartnerField<Boolean>("IsFemale");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsMale</b></p>
     * 
     * @param isMale
     *     
     * @return
     *     Selection: Business partner is male
     */
    @SerializedName("IsMale")
    @JsonProperty("IsMale")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsMale")
    private Boolean isMale;
    /**
     * Use with available fluent helpers to apply the <b>IsMale</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<Boolean> IS_MALE = new BusinessPartnerField<Boolean>("IsMale");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsNaturalPerson</b></p>
     * 
     * @param isNaturalPerson
     *     
     * @return
     *     Business Partner Is a Natural Person Under the Tax Laws
     */
    @SerializedName("IsNaturalPerson")
    @JsonProperty("IsNaturalPerson")
    @Nullable
    @ODataField(odataName = "IsNaturalPerson")
    private String isNaturalPerson;
    /**
     * Use with available fluent helpers to apply the <b>IsNaturalPerson</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> IS_NATURAL_PERSON = new BusinessPartnerField<String>("IsNaturalPerson");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsSexUnknown</b></p>
     * 
     * @param isSexUnknown
     *     
     * @return
     *     Selection: Sex of business partner is not known
     */
    @SerializedName("IsSexUnknown")
    @JsonProperty("IsSexUnknown")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsSexUnknown")
    private Boolean isSexUnknown;
    /**
     * Use with available fluent helpers to apply the <b>IsSexUnknown</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<Boolean> IS_SEX_UNKNOWN = new BusinessPartnerField<Boolean>("IsSexUnknown");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     
     * @return
     *     Business partner: Language
     */
    @SerializedName("Language")
    @JsonProperty("Language")
    @Nullable
    @ODataField(odataName = "Language")
    private String language;
    /**
     * Use with available fluent helpers to apply the <b>Language</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> LANGUAGE = new BusinessPartnerField<String>("Language");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeDate</b></p>
     * 
     * @param lastChangeDate
     *     
     * @return
     *     Date when object was last changed
     */
    @SerializedName("LastChangeDate")
    @JsonProperty("LastChangeDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "LastChangeDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime lastChangeDate;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalDateTime> LAST_CHANGE_DATE = new BusinessPartnerField<LocalDateTime>("LastChangeDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeTime</b></p>
     * 
     * @param lastChangeTime
     *     
     * @return
     *     Time at which object was last changed
     */
    @SerializedName("LastChangeTime")
    @JsonProperty("LastChangeTime")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalTimeAdapter.class)
    @ODataField(odataName = "LastChangeTime", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalTimeCalendarConverter.class)
    private LocalTime lastChangeTime;
    /**
     * Use with available fluent helpers to apply the <b>LastChangeTime</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalTime> LAST_CHANGE_TIME = new BusinessPartnerField<LocalTime>("LastChangeTime");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     
     * @return
     *     Last user to change object
     */
    @SerializedName("LastChangedByUser")
    @JsonProperty("LastChangedByUser")
    @Nullable
    @ODataField(odataName = "LastChangedByUser")
    private String lastChangedByUser;
    /**
     * Use with available fluent helpers to apply the <b>LastChangedByUser</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> LAST_CHANGED_BY_USER = new BusinessPartnerField<String>("LastChangedByUser");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>LastName</b></p>
     * 
     * @param lastName
     *     
     * @return
     *     Last Name of Business Partner (Person)
     */
    @SerializedName("LastName")
    @JsonProperty("LastName")
    @Nullable
    @ODataField(odataName = "LastName")
    private String lastName;
    /**
     * Use with available fluent helpers to apply the <b>LastName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> LAST_NAME = new BusinessPartnerField<String>("LastName");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>LegalForm</b></p>
     * 
     * @param legalForm
     *     
     * @return
     *     BP: Legal form of organization
     */
    @SerializedName("LegalForm")
    @JsonProperty("LegalForm")
    @Nullable
    @ODataField(odataName = "LegalForm")
    private String legalForm;
    /**
     * Use with available fluent helpers to apply the <b>LegalForm</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> LEGAL_FORM = new BusinessPartnerField<String>("LegalForm");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName1</b></p>
     * 
     * @param organizationBPName1
     *     
     * @return
     *     Name 1 of organization
     */
    @SerializedName("OrganizationBPName1")
    @JsonProperty("OrganizationBPName1")
    @Nullable
    @ODataField(odataName = "OrganizationBPName1")
    private String organizationBPName1;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationBPName1</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ORGANIZATION_BP_NAME1 = new BusinessPartnerField<String>("OrganizationBPName1");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName2</b></p>
     * 
     * @param organizationBPName2
     *     
     * @return
     *     Name 2 of organization
     */
    @SerializedName("OrganizationBPName2")
    @JsonProperty("OrganizationBPName2")
    @Nullable
    @ODataField(odataName = "OrganizationBPName2")
    private String organizationBPName2;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationBPName2</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ORGANIZATION_BP_NAME2 = new BusinessPartnerField<String>("OrganizationBPName2");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName3</b></p>
     * 
     * @param organizationBPName3
     *     
     * @return
     *     Name 3 of organization
     */
    @SerializedName("OrganizationBPName3")
    @JsonProperty("OrganizationBPName3")
    @Nullable
    @ODataField(odataName = "OrganizationBPName3")
    private String organizationBPName3;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationBPName3</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ORGANIZATION_BP_NAME3 = new BusinessPartnerField<String>("OrganizationBPName3");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName4</b></p>
     * 
     * @param organizationBPName4
     *     
     * @return
     *     Name 4 of organization
     */
    @SerializedName("OrganizationBPName4")
    @JsonProperty("OrganizationBPName4")
    @Nullable
    @ODataField(odataName = "OrganizationBPName4")
    private String organizationBPName4;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationBPName4</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ORGANIZATION_BP_NAME4 = new BusinessPartnerField<String>("OrganizationBPName4");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>OrganizationFoundationDate</b></p>
     * 
     * @param organizationFoundationDate
     *     
     * @return
     *     Date organization founded
     */
    @SerializedName("OrganizationFoundationDate")
    @JsonProperty("OrganizationFoundationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "OrganizationFoundationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime organizationFoundationDate;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationFoundationDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalDateTime> ORGANIZATION_FOUNDATION_DATE = new BusinessPartnerField<LocalDateTime>("OrganizationFoundationDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>OrganizationLiquidationDate</b></p>
     * 
     * @param organizationLiquidationDate
     *     
     * @return
     *     Liquidation date of organization
     */
    @SerializedName("OrganizationLiquidationDate")
    @JsonProperty("OrganizationLiquidationDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "OrganizationLiquidationDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime organizationLiquidationDate;
    /**
     * Use with available fluent helpers to apply the <b>OrganizationLiquidationDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalDateTime> ORGANIZATION_LIQUIDATION_DATE = new BusinessPartnerField<LocalDateTime>("OrganizationLiquidationDate");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SearchTerm1</b></p>
     * 
     * @param searchTerm1
     *     
     * @return
     *     Search term 1 for business partner
     */
    @SerializedName("SearchTerm1")
    @JsonProperty("SearchTerm1")
    @Nullable
    @ODataField(odataName = "SearchTerm1")
    private String searchTerm1;
    /**
     * Use with available fluent helpers to apply the <b>SearchTerm1</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> SEARCH_TERM1 = new BusinessPartnerField<String>("SearchTerm1");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalLastName</b></p>
     * 
     * @param additionalLastName
     *     
     * @return
     *     Other Last Name of a Person
     */
    @SerializedName("AdditionalLastName")
    @JsonProperty("AdditionalLastName")
    @Nullable
    @ODataField(odataName = "AdditionalLastName")
    private String additionalLastName;
    /**
     * Use with available fluent helpers to apply the <b>AdditionalLastName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> ADDITIONAL_LAST_NAME = new BusinessPartnerField<String>("AdditionalLastName");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BirthDate</b></p>
     * 
     * @param birthDate
     *     
     * @return
     *     Date of Birth of Business Partner
     */
    @SerializedName("BirthDate")
    @JsonProperty("BirthDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "BirthDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime birthDate;
    /**
     * Use with available fluent helpers to apply the <b>BirthDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<LocalDateTime> BIRTH_DATE = new BusinessPartnerField<LocalDateTime>("BirthDate");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerIsBlocked</b></p>
     * 
     * @param businessPartnerIsBlocked
     *     
     * @return
     *     Central Block for Business Partner
     */
    @SerializedName("BusinessPartnerIsBlocked")
    @JsonProperty("BusinessPartnerIsBlocked")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "BusinessPartnerIsBlocked")
    private Boolean businessPartnerIsBlocked;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerIsBlocked</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<Boolean> BUSINESS_PARTNER_IS_BLOCKED = new BusinessPartnerField<Boolean>("BusinessPartnerIsBlocked");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerType</b></p>
     * 
     * @param businessPartnerType
     *     
     * @return
     *     Business Partner Type
     */
    @SerializedName("BusinessPartnerType")
    @JsonProperty("BusinessPartnerType")
    @Nullable
    @ODataField(odataName = "BusinessPartnerType")
    private String businessPartnerType;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerType</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_TYPE = new BusinessPartnerField<String>("BusinessPartnerType");
    /**
     * Constraints: Not nullable, Maximum length: 26 <p>Original property name from the Odata EDM: <b>ETag</b></p>
     * 
     * @param eTag
     *     
     */
    @SerializedName("ETag")
    @JsonProperty("ETag")
    @Nullable
    @ODataField(odataName = "ETag")
    private String eTag;
    /**
     * Use with available fluent helpers to apply the <b>ETag</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> E_TAG = new BusinessPartnerField<String>("ETag");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GroupBusinessPartnerName1</b></p>
     * 
     * @param groupBusinessPartnerName1
     *     
     * @return
     *     Name 1 (group)
     */
    @SerializedName("GroupBusinessPartnerName1")
    @JsonProperty("GroupBusinessPartnerName1")
    @Nullable
    @ODataField(odataName = "GroupBusinessPartnerName1")
    private String groupBusinessPartnerName1;
    /**
     * Use with available fluent helpers to apply the <b>GroupBusinessPartnerName1</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> GROUP_BUSINESS_PARTNER_NAME1 = new BusinessPartnerField<String>("GroupBusinessPartnerName1");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GroupBusinessPartnerName2</b></p>
     * 
     * @param groupBusinessPartnerName2
     *     
     * @return
     *     Name 2 (group)
     */
    @SerializedName("GroupBusinessPartnerName2")
    @JsonProperty("GroupBusinessPartnerName2")
    @Nullable
    @ODataField(odataName = "GroupBusinessPartnerName2")
    private String groupBusinessPartnerName2;
    /**
     * Use with available fluent helpers to apply the <b>GroupBusinessPartnerName2</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> GROUP_BUSINESS_PARTNER_NAME2 = new BusinessPartnerField<String>("GroupBusinessPartnerName2");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndependentAddressID</b></p>
     * 
     * @param independentAddressID
     *     
     * @return
     *     Address Number
     */
    @SerializedName("IndependentAddressID")
    @JsonProperty("IndependentAddressID")
    @Nullable
    @ODataField(odataName = "IndependentAddressID")
    private String independentAddressID;
    /**
     * Use with available fluent helpers to apply the <b>IndependentAddressID</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> INDEPENDENT_ADDRESS_ID = new BusinessPartnerField<String>("IndependentAddressID");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @param internationalLocationNumber3
     *     
     * @return
     *     Check digit for the international location number
     */
    @SerializedName("InternationalLocationNumber3")
    @JsonProperty("InternationalLocationNumber3")
    @Nullable
    @ODataField(odataName = "InternationalLocationNumber3")
    private String internationalLocationNumber3;
    /**
     * Use with available fluent helpers to apply the <b>InternationalLocationNumber3</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> INTERNATIONAL_LOCATION_NUMBER3 = new BusinessPartnerField<String>("InternationalLocationNumber3");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MiddleName</b></p>
     * 
     * @param middleName
     *     
     * @return
     *     Middle Name or Second Forename of a Person
     */
    @SerializedName("MiddleName")
    @JsonProperty("MiddleName")
    @Nullable
    @ODataField(odataName = "MiddleName")
    private String middleName;
    /**
     * Use with available fluent helpers to apply the <b>MiddleName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> MIDDLE_NAME = new BusinessPartnerField<String>("MiddleName");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>NameCountry</b></p>
     * 
     * @param nameCountry
     *     
     * @return
     *     Country for Name Format Rule
     */
    @SerializedName("NameCountry")
    @JsonProperty("NameCountry")
    @Nullable
    @ODataField(odataName = "NameCountry")
    private String nameCountry;
    /**
     * Use with available fluent helpers to apply the <b>NameCountry</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> NAME_COUNTRY = new BusinessPartnerField<String>("NameCountry");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>NameFormat</b></p>
     * 
     * @param nameFormat
     *     
     * @return
     *     Name format
     */
    @SerializedName("NameFormat")
    @JsonProperty("NameFormat")
    @Nullable
    @ODataField(odataName = "NameFormat")
    private String nameFormat;
    /**
     * Use with available fluent helpers to apply the <b>NameFormat</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> NAME_FORMAT = new BusinessPartnerField<String>("NameFormat");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>PersonFullName</b></p>
     * 
     * @param personFullName
     *     
     * @return
     *     Full Name
     */
    @SerializedName("PersonFullName")
    @JsonProperty("PersonFullName")
    @Nullable
    @ODataField(odataName = "PersonFullName")
    private String personFullName;
    /**
     * Use with available fluent helpers to apply the <b>PersonFullName</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> PERSON_FULL_NAME = new BusinessPartnerField<String>("PersonFullName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PersonNumber</b></p>
     * 
     * @param personNumber
     *     
     * @return
     *     Person number
     */
    @SerializedName("PersonNumber")
    @JsonProperty("PersonNumber")
    @Nullable
    @ODataField(odataName = "PersonNumber")
    private String personNumber;
    /**
     * Use with available fluent helpers to apply the <b>PersonNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> PERSON_NUMBER = new BusinessPartnerField<String>("PersonNumber");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsMarkedForArchiving</b></p>
     * 
     * @param isMarkedForArchiving
     *     
     * @return
     *     Central Archiving Flag
     */
    @SerializedName("IsMarkedForArchiving")
    @JsonProperty("IsMarkedForArchiving")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsMarkedForArchiving")
    private Boolean isMarkedForArchiving;
    /**
     * Use with available fluent helpers to apply the <b>IsMarkedForArchiving</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<Boolean> IS_MARKED_FOR_ARCHIVING = new BusinessPartnerField<Boolean>("IsMarkedForArchiving");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BusinessPartnerIDByExtSystem</b></p>
     * 
     * @param businessPartnerIDByExtSystem
     *     
     * @return
     *     Business Partner Number in External System
     */
    @SerializedName("BusinessPartnerIDByExtSystem")
    @JsonProperty("BusinessPartnerIDByExtSystem")
    @Nullable
    @ODataField(odataName = "BusinessPartnerIDByExtSystem")
    private String businessPartnerIDByExtSystem;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerIDByExtSystem</b> field to query operations.
     * 
     */
    public final static BusinessPartnerField<String> BUSINESS_PARTNER_ID_BY_EXT_SYSTEM = new BusinessPartnerField<String>("BusinessPartnerIDByExtSystem");
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
     * Navigation property <b>to_BuPaIdentification</b> for <b>BusinessPartner</b> to multiple <b>BuPaIdentification</b>.
     * 
     */
    @SerializedName("to_BuPaIdentification")
    @JsonProperty("to_BuPaIdentification")
    @ODataField(odataName = "to_BuPaIdentification")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BuPaIdentification> toBuPaIdentification;
    /**
     * Navigation property <b>to_BuPaIndustry</b> for <b>BusinessPartner</b> to multiple <b>BuPaIndustry</b>.
     * 
     */
    @SerializedName("to_BuPaIndustry")
    @JsonProperty("to_BuPaIndustry")
    @ODataField(odataName = "to_BuPaIndustry")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BuPaIndustry> toBuPaIndustry;
    /**
     * Navigation property <b>to_BusinessPartnerAddress</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerAddress</b>.
     * 
     */
    @SerializedName("to_BusinessPartnerAddress")
    @JsonProperty("to_BusinessPartnerAddress")
    @ODataField(odataName = "to_BusinessPartnerAddress")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BusinessPartnerAddress> toBusinessPartnerAddress;
    /**
     * Navigation property <b>to_BusinessPartnerBank</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerBank</b>.
     * 
     */
    @SerializedName("to_BusinessPartnerBank")
    @JsonProperty("to_BusinessPartnerBank")
    @ODataField(odataName = "to_BusinessPartnerBank")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BusinessPartnerBank> toBusinessPartnerBank;
    /**
     * Navigation property <b>to_BusinessPartnerContact</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerContact</b>.
     * 
     */
    @SerializedName("to_BusinessPartnerContact")
    @JsonProperty("to_BusinessPartnerContact")
    @ODataField(odataName = "to_BusinessPartnerContact")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BusinessPartnerContact> toBusinessPartnerContact;
    /**
     * Navigation property <b>to_BusinessPartnerRole</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerRole</b>.
     * 
     */
    @SerializedName("to_BusinessPartnerRole")
    @JsonProperty("to_BusinessPartnerRole")
    @ODataField(odataName = "to_BusinessPartnerRole")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BusinessPartnerRole> toBusinessPartnerRole;
    /**
     * Navigation property <b>to_BusinessPartnerTax</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerTaxNumber</b>.
     * 
     */
    @SerializedName("to_BusinessPartnerTax")
    @JsonProperty("to_BusinessPartnerTax")
    @ODataField(odataName = "to_BusinessPartnerTax")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BusinessPartnerTaxNumber> toBusinessPartnerTax;
    /**
     * Navigation property <b>to_Customer</b> for <b>BusinessPartner</b> to single <b>Customer</b>.
     * 
     */
    @SerializedName("to_Customer")
    @JsonProperty("to_Customer")
    @ODataField(odataName = "to_Customer")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Customer toCustomer;
    /**
     * Navigation property <b>to_Supplier</b> for <b>BusinessPartner</b> to single <b>Supplier</b>.
     * 
     */
    @SerializedName("to_Supplier")
    @JsonProperty("to_Supplier")
    @ODataField(odataName = "to_Supplier")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Supplier toSupplier;
    /**
     * Use with available fluent helpers to apply the <b>to_BuPaIdentification</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BuPaIdentification> TO_BU_PA_IDENTIFICATION = new BusinessPartnerLink<BuPaIdentification>("to_BuPaIdentification");
    /**
     * Use with available fluent helpers to apply the <b>to_BuPaIndustry</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BuPaIndustry> TO_BU_PA_INDUSTRY = new BusinessPartnerLink<BuPaIndustry>("to_BuPaIndustry");
    /**
     * Use with available fluent helpers to apply the <b>to_BusinessPartnerAddress</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BusinessPartnerAddress> TO_BUSINESS_PARTNER_ADDRESS = new BusinessPartnerLink<BusinessPartnerAddress>("to_BusinessPartnerAddress");
    /**
     * Use with available fluent helpers to apply the <b>to_BusinessPartnerBank</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BusinessPartnerBank> TO_BUSINESS_PARTNER_BANK = new BusinessPartnerLink<BusinessPartnerBank>("to_BusinessPartnerBank");
    /**
     * Use with available fluent helpers to apply the <b>to_BusinessPartnerContact</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BusinessPartnerContact> TO_BUSINESS_PARTNER_CONTACT = new BusinessPartnerLink<BusinessPartnerContact>("to_BusinessPartnerContact");
    /**
     * Use with available fluent helpers to apply the <b>to_BusinessPartnerRole</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BusinessPartnerRole> TO_BUSINESS_PARTNER_ROLE = new BusinessPartnerLink<BusinessPartnerRole>("to_BusinessPartnerRole");
    /**
     * Use with available fluent helpers to apply the <b>to_BusinessPartnerTax</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerLink<BusinessPartnerTaxNumber> TO_BUSINESS_PARTNER_TAX = new BusinessPartnerLink<BusinessPartnerTaxNumber>("to_BusinessPartnerTax");
    /**
     * Use with available fluent helpers to apply the <b>to_Customer</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerOneToOneLink<Customer> TO_CUSTOMER = new BusinessPartnerOneToOneLink<Customer>("to_Customer");
    /**
     * Use with available fluent helpers to apply the <b>to_Supplier</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerOneToOneLink<Supplier> TO_SUPPLIER = new BusinessPartnerOneToOneLink<Supplier>("to_Supplier");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<BusinessPartner> getType() {
        return BusinessPartner.class;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
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
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AcademicTitle</b></p>
     * 
     * @param academicTitle
     *     Academic Title: Key
     */
    public void setAcademicTitle(
        @Nullable
        final String academicTitle) {
        rememberChangedField("AcademicTitle", this.academicTitle);
        this.academicTitle = academicTitle;
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

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BusinessPartnerCategory</b></p>
     * 
     * @param businessPartnerCategory
     *     Business Partner Category
     */
    public void setBusinessPartnerCategory(
        @Nullable
        final String businessPartnerCategory) {
        rememberChangedField("BusinessPartnerCategory", this.businessPartnerCategory);
        this.businessPartnerCategory = businessPartnerCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 81 <p>Original property name from the Odata EDM: <b>BusinessPartnerFullName</b></p>
     * 
     * @param businessPartnerFullName
     *     
     */
    public void setBusinessPartnerFullName(
        @Nullable
        final String businessPartnerFullName) {
        rememberChangedField("BusinessPartnerFullName", this.businessPartnerFullName);
        this.businessPartnerFullName = businessPartnerFullName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerGrouping</b></p>
     * 
     * @param businessPartnerGrouping
     *     Business Partner Grouping
     */
    public void setBusinessPartnerGrouping(
        @Nullable
        final String businessPartnerGrouping) {
        rememberChangedField("BusinessPartnerGrouping", this.businessPartnerGrouping);
        this.businessPartnerGrouping = businessPartnerGrouping;
    }

    /**
     * Constraints: Not nullable, Maximum length: 81 <p>Original property name from the Odata EDM: <b>BusinessPartnerName</b></p>
     * 
     * @param businessPartnerName
     *     
     */
    public void setBusinessPartnerName(
        @Nullable
        final String businessPartnerName) {
        rememberChangedField("BusinessPartnerName", this.businessPartnerName);
        this.businessPartnerName = businessPartnerName;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerUUID</b></p>
     * 
     * @param businessPartnerUUID
     *     Business Partner GUID
     */
    public void setBusinessPartnerUUID(
        @Nullable
        final UUID businessPartnerUUID) {
        rememberChangedField("BusinessPartnerUUID", this.businessPartnerUUID);
        this.businessPartnerUUID = businessPartnerUUID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>CorrespondenceLanguage</b></p>
     * 
     * @param correspondenceLanguage
     *     Business Partner: Correspondence Language
     */
    public void setCorrespondenceLanguage(
        @Nullable
        final String correspondenceLanguage) {
        rememberChangedField("CorrespondenceLanguage", this.correspondenceLanguage);
        this.correspondenceLanguage = correspondenceLanguage;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     User who created the object
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     Date on which the object was created
     */
    public void setCreationDate(
        @Nullable
        final LocalDateTime creationDate) {
        rememberChangedField("CreationDate", this.creationDate);
        this.creationDate = creationDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationTime</b></p>
     * 
     * @param creationTime
     *     Time at which the object was created
     */
    public void setCreationTime(
        @Nullable
        final LocalTime creationTime) {
        rememberChangedField("CreationTime", this.creationTime);
        this.creationTime = creationTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>FirstName</b></p>
     * 
     * @param firstName
     *     First Name of Business Partner (Person)
     */
    public void setFirstName(
        @Nullable
        final String firstName) {
        rememberChangedField("FirstName", this.firstName);
        this.firstName = firstName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>FormOfAddress</b></p>
     * 
     * @param formOfAddress
     *     Form-of-Address Key
     */
    public void setFormOfAddress(
        @Nullable
        final String formOfAddress) {
        rememberChangedField("FormOfAddress", this.formOfAddress);
        this.formOfAddress = formOfAddress;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Industry</b></p>
     * 
     * @param industry
     *     Industry sector
     */
    public void setIndustry(
        @Nullable
        final String industry) {
        rememberChangedField("Industry", this.industry);
        this.industry = industry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 7 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber1</b></p>
     * 
     * @param internationalLocationNumber1
     *     International location number  (part 1)
     */
    public void setInternationalLocationNumber1(
        @Nullable
        final String internationalLocationNumber1) {
        rememberChangedField("InternationalLocationNumber1", this.internationalLocationNumber1);
        this.internationalLocationNumber1 = internationalLocationNumber1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 5 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber2</b></p>
     * 
     * @param internationalLocationNumber2
     *     International location number (Part 2)
     */
    public void setInternationalLocationNumber2(
        @Nullable
        final String internationalLocationNumber2) {
        rememberChangedField("InternationalLocationNumber2", this.internationalLocationNumber2);
        this.internationalLocationNumber2 = internationalLocationNumber2;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsFemale</b></p>
     * 
     * @param isFemale
     *     Selection: Business partner is female
     */
    public void setIsFemale(
        @Nullable
        final Boolean isFemale) {
        rememberChangedField("IsFemale", this.isFemale);
        this.isFemale = isFemale;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsMale</b></p>
     * 
     * @param isMale
     *     Selection: Business partner is male
     */
    public void setIsMale(
        @Nullable
        final Boolean isMale) {
        rememberChangedField("IsMale", this.isMale);
        this.isMale = isMale;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>IsNaturalPerson</b></p>
     * 
     * @param isNaturalPerson
     *     Business Partner Is a Natural Person Under the Tax Laws
     */
    public void setIsNaturalPerson(
        @Nullable
        final String isNaturalPerson) {
        rememberChangedField("IsNaturalPerson", this.isNaturalPerson);
        this.isNaturalPerson = isNaturalPerson;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsSexUnknown</b></p>
     * 
     * @param isSexUnknown
     *     Selection: Sex of business partner is not known
     */
    public void setIsSexUnknown(
        @Nullable
        final Boolean isSexUnknown) {
        rememberChangedField("IsSexUnknown", this.isSexUnknown);
        this.isSexUnknown = isSexUnknown;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     Business partner: Language
     */
    public void setLanguage(
        @Nullable
        final String language) {
        rememberChangedField("Language", this.language);
        this.language = language;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeDate</b></p>
     * 
     * @param lastChangeDate
     *     Date when object was last changed
     */
    public void setLastChangeDate(
        @Nullable
        final LocalDateTime lastChangeDate) {
        rememberChangedField("LastChangeDate", this.lastChangeDate);
        this.lastChangeDate = lastChangeDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>LastChangeTime</b></p>
     * 
     * @param lastChangeTime
     *     Time at which object was last changed
     */
    public void setLastChangeTime(
        @Nullable
        final LocalTime lastChangeTime) {
        rememberChangedField("LastChangeTime", this.lastChangeTime);
        this.lastChangeTime = lastChangeTime;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>LastChangedByUser</b></p>
     * 
     * @param lastChangedByUser
     *     Last user to change object
     */
    public void setLastChangedByUser(
        @Nullable
        final String lastChangedByUser) {
        rememberChangedField("LastChangedByUser", this.lastChangedByUser);
        this.lastChangedByUser = lastChangedByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>LastName</b></p>
     * 
     * @param lastName
     *     Last Name of Business Partner (Person)
     */
    public void setLastName(
        @Nullable
        final String lastName) {
        rememberChangedField("LastName", this.lastName);
        this.lastName = lastName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>LegalForm</b></p>
     * 
     * @param legalForm
     *     BP: Legal form of organization
     */
    public void setLegalForm(
        @Nullable
        final String legalForm) {
        rememberChangedField("LegalForm", this.legalForm);
        this.legalForm = legalForm;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName1</b></p>
     * 
     * @param organizationBPName1
     *     Name 1 of organization
     */
    public void setOrganizationBPName1(
        @Nullable
        final String organizationBPName1) {
        rememberChangedField("OrganizationBPName1", this.organizationBPName1);
        this.organizationBPName1 = organizationBPName1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName2</b></p>
     * 
     * @param organizationBPName2
     *     Name 2 of organization
     */
    public void setOrganizationBPName2(
        @Nullable
        final String organizationBPName2) {
        rememberChangedField("OrganizationBPName2", this.organizationBPName2);
        this.organizationBPName2 = organizationBPName2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName3</b></p>
     * 
     * @param organizationBPName3
     *     Name 3 of organization
     */
    public void setOrganizationBPName3(
        @Nullable
        final String organizationBPName3) {
        rememberChangedField("OrganizationBPName3", this.organizationBPName3);
        this.organizationBPName3 = organizationBPName3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>OrganizationBPName4</b></p>
     * 
     * @param organizationBPName4
     *     Name 4 of organization
     */
    public void setOrganizationBPName4(
        @Nullable
        final String organizationBPName4) {
        rememberChangedField("OrganizationBPName4", this.organizationBPName4);
        this.organizationBPName4 = organizationBPName4;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>OrganizationFoundationDate</b></p>
     * 
     * @param organizationFoundationDate
     *     Date organization founded
     */
    public void setOrganizationFoundationDate(
        @Nullable
        final LocalDateTime organizationFoundationDate) {
        rememberChangedField("OrganizationFoundationDate", this.organizationFoundationDate);
        this.organizationFoundationDate = organizationFoundationDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>OrganizationLiquidationDate</b></p>
     * 
     * @param organizationLiquidationDate
     *     Liquidation date of organization
     */
    public void setOrganizationLiquidationDate(
        @Nullable
        final LocalDateTime organizationLiquidationDate) {
        rememberChangedField("OrganizationLiquidationDate", this.organizationLiquidationDate);
        this.organizationLiquidationDate = organizationLiquidationDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>SearchTerm1</b></p>
     * 
     * @param searchTerm1
     *     Search term 1 for business partner
     */
    public void setSearchTerm1(
        @Nullable
        final String searchTerm1) {
        rememberChangedField("SearchTerm1", this.searchTerm1);
        this.searchTerm1 = searchTerm1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalLastName</b></p>
     * 
     * @param additionalLastName
     *     Other Last Name of a Person
     */
    public void setAdditionalLastName(
        @Nullable
        final String additionalLastName) {
        rememberChangedField("AdditionalLastName", this.additionalLastName);
        this.additionalLastName = additionalLastName;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>BirthDate</b></p>
     * 
     * @param birthDate
     *     Date of Birth of Business Partner
     */
    public void setBirthDate(
        @Nullable
        final LocalDateTime birthDate) {
        rememberChangedField("BirthDate", this.birthDate);
        this.birthDate = birthDate;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>BusinessPartnerIsBlocked</b></p>
     * 
     * @param businessPartnerIsBlocked
     *     Central Block for Business Partner
     */
    public void setBusinessPartnerIsBlocked(
        @Nullable
        final Boolean businessPartnerIsBlocked) {
        rememberChangedField("BusinessPartnerIsBlocked", this.businessPartnerIsBlocked);
        this.businessPartnerIsBlocked = businessPartnerIsBlocked;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BusinessPartnerType</b></p>
     * 
     * @param businessPartnerType
     *     Business Partner Type
     */
    public void setBusinessPartnerType(
        @Nullable
        final String businessPartnerType) {
        rememberChangedField("BusinessPartnerType", this.businessPartnerType);
        this.businessPartnerType = businessPartnerType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 26 <p>Original property name from the Odata EDM: <b>ETag</b></p>
     * 
     * @param eTag
     *     
     */
    public void setETag(
        @Nullable
        final String eTag) {
        rememberChangedField("ETag", this.eTag);
        this.eTag = eTag;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GroupBusinessPartnerName1</b></p>
     * 
     * @param groupBusinessPartnerName1
     *     Name 1 (group)
     */
    public void setGroupBusinessPartnerName1(
        @Nullable
        final String groupBusinessPartnerName1) {
        rememberChangedField("GroupBusinessPartnerName1", this.groupBusinessPartnerName1);
        this.groupBusinessPartnerName1 = groupBusinessPartnerName1;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>GroupBusinessPartnerName2</b></p>
     * 
     * @param groupBusinessPartnerName2
     *     Name 2 (group)
     */
    public void setGroupBusinessPartnerName2(
        @Nullable
        final String groupBusinessPartnerName2) {
        rememberChangedField("GroupBusinessPartnerName2", this.groupBusinessPartnerName2);
        this.groupBusinessPartnerName2 = groupBusinessPartnerName2;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>IndependentAddressID</b></p>
     * 
     * @param independentAddressID
     *     Address Number
     */
    public void setIndependentAddressID(
        @Nullable
        final String independentAddressID) {
        rememberChangedField("IndependentAddressID", this.independentAddressID);
        this.independentAddressID = independentAddressID;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>InternationalLocationNumber3</b></p>
     * 
     * @param internationalLocationNumber3
     *     Check digit for the international location number
     */
    public void setInternationalLocationNumber3(
        @Nullable
        final String internationalLocationNumber3) {
        rememberChangedField("InternationalLocationNumber3", this.internationalLocationNumber3);
        this.internationalLocationNumber3 = internationalLocationNumber3;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>MiddleName</b></p>
     * 
     * @param middleName
     *     Middle Name or Second Forename of a Person
     */
    public void setMiddleName(
        @Nullable
        final String middleName) {
        rememberChangedField("MiddleName", this.middleName);
        this.middleName = middleName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>NameCountry</b></p>
     * 
     * @param nameCountry
     *     Country for Name Format Rule
     */
    public void setNameCountry(
        @Nullable
        final String nameCountry) {
        rememberChangedField("NameCountry", this.nameCountry);
        this.nameCountry = nameCountry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>NameFormat</b></p>
     * 
     * @param nameFormat
     *     Name format
     */
    public void setNameFormat(
        @Nullable
        final String nameFormat) {
        rememberChangedField("NameFormat", this.nameFormat);
        this.nameFormat = nameFormat;
    }

    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>PersonFullName</b></p>
     * 
     * @param personFullName
     *     Full Name
     */
    public void setPersonFullName(
        @Nullable
        final String personFullName) {
        rememberChangedField("PersonFullName", this.personFullName);
        this.personFullName = personFullName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PersonNumber</b></p>
     * 
     * @param personNumber
     *     Person number
     */
    public void setPersonNumber(
        @Nullable
        final String personNumber) {
        rememberChangedField("PersonNumber", this.personNumber);
        this.personNumber = personNumber;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsMarkedForArchiving</b></p>
     * 
     * @param isMarkedForArchiving
     *     Central Archiving Flag
     */
    public void setIsMarkedForArchiving(
        @Nullable
        final Boolean isMarkedForArchiving) {
        rememberChangedField("IsMarkedForArchiving", this.isMarkedForArchiving);
        this.isMarkedForArchiving = isMarkedForArchiving;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BusinessPartnerIDByExtSystem</b></p>
     * 
     * @param businessPartnerIDByExtSystem
     *     Business Partner Number in External System
     */
    public void setBusinessPartnerIDByExtSystem(
        @Nullable
        final String businessPartnerIDByExtSystem) {
        rememberChangedField("BusinessPartnerIDByExtSystem", this.businessPartnerIDByExtSystem);
        this.businessPartnerIDByExtSystem = businessPartnerIDByExtSystem;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusinessPartner";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("Customer", getCustomer());
        values.put("Supplier", getSupplier());
        values.put("AcademicTitle", getAcademicTitle());
        values.put("AuthorizationGroup", getAuthorizationGroup());
        values.put("BusinessPartnerCategory", getBusinessPartnerCategory());
        values.put("BusinessPartnerFullName", getBusinessPartnerFullName());
        values.put("BusinessPartnerGrouping", getBusinessPartnerGrouping());
        values.put("BusinessPartnerName", getBusinessPartnerName());
        values.put("BusinessPartnerUUID", getBusinessPartnerUUID());
        values.put("CorrespondenceLanguage", getCorrespondenceLanguage());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("CreationDate", getCreationDate());
        values.put("CreationTime", getCreationTime());
        values.put("FirstName", getFirstName());
        values.put("FormOfAddress", getFormOfAddress());
        values.put("Industry", getIndustry());
        values.put("InternationalLocationNumber1", getInternationalLocationNumber1());
        values.put("InternationalLocationNumber2", getInternationalLocationNumber2());
        values.put("IsFemale", getIsFemale());
        values.put("IsMale", getIsMale());
        values.put("IsNaturalPerson", getIsNaturalPerson());
        values.put("IsSexUnknown", getIsSexUnknown());
        values.put("Language", getLanguage());
        values.put("LastChangeDate", getLastChangeDate());
        values.put("LastChangeTime", getLastChangeTime());
        values.put("LastChangedByUser", getLastChangedByUser());
        values.put("LastName", getLastName());
        values.put("LegalForm", getLegalForm());
        values.put("OrganizationBPName1", getOrganizationBPName1());
        values.put("OrganizationBPName2", getOrganizationBPName2());
        values.put("OrganizationBPName3", getOrganizationBPName3());
        values.put("OrganizationBPName4", getOrganizationBPName4());
        values.put("OrganizationFoundationDate", getOrganizationFoundationDate());
        values.put("OrganizationLiquidationDate", getOrganizationLiquidationDate());
        values.put("SearchTerm1", getSearchTerm1());
        values.put("AdditionalLastName", getAdditionalLastName());
        values.put("BirthDate", getBirthDate());
        values.put("BusinessPartnerIsBlocked", getBusinessPartnerIsBlocked());
        values.put("BusinessPartnerType", getBusinessPartnerType());
        values.put("ETag", getETag());
        values.put("GroupBusinessPartnerName1", getGroupBusinessPartnerName1());
        values.put("GroupBusinessPartnerName2", getGroupBusinessPartnerName2());
        values.put("IndependentAddressID", getIndependentAddressID());
        values.put("InternationalLocationNumber3", getInternationalLocationNumber3());
        values.put("MiddleName", getMiddleName());
        values.put("NameCountry", getNameCountry());
        values.put("NameFormat", getNameFormat());
        values.put("PersonFullName", getPersonFullName());
        values.put("PersonNumber", getPersonNumber());
        values.put("IsMarkedForArchiving", getIsMarkedForArchiving());
        values.put("BusinessPartnerIDByExtSystem", getBusinessPartnerIDByExtSystem());
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
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("Supplier")) {
                final Object value = values.remove("Supplier");
                if ((value == null)||(!value.equals(getSupplier()))) {
                    setSupplier(((String) value));
                }
            }
            if (values.containsKey("AcademicTitle")) {
                final Object value = values.remove("AcademicTitle");
                if ((value == null)||(!value.equals(getAcademicTitle()))) {
                    setAcademicTitle(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerCategory")) {
                final Object value = values.remove("BusinessPartnerCategory");
                if ((value == null)||(!value.equals(getBusinessPartnerCategory()))) {
                    setBusinessPartnerCategory(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerFullName")) {
                final Object value = values.remove("BusinessPartnerFullName");
                if ((value == null)||(!value.equals(getBusinessPartnerFullName()))) {
                    setBusinessPartnerFullName(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerGrouping")) {
                final Object value = values.remove("BusinessPartnerGrouping");
                if ((value == null)||(!value.equals(getBusinessPartnerGrouping()))) {
                    setBusinessPartnerGrouping(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerName")) {
                final Object value = values.remove("BusinessPartnerName");
                if ((value == null)||(!value.equals(getBusinessPartnerName()))) {
                    setBusinessPartnerName(((String) value));
                }
            }
            if (values.containsKey("BusinessPartnerUUID")) {
                final Object value = values.remove("BusinessPartnerUUID");
                if ((value == null)||(!value.equals(getBusinessPartnerUUID()))) {
                    setBusinessPartnerUUID(((UUID) value));
                }
            }
            if (values.containsKey("CorrespondenceLanguage")) {
                final Object value = values.remove("CorrespondenceLanguage");
                if ((value == null)||(!value.equals(getCorrespondenceLanguage()))) {
                    setCorrespondenceLanguage(((String) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("CreationDate")) {
                final Object value = values.remove("CreationDate");
                if ((value == null)||(!value.equals(getCreationDate()))) {
                    setCreationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CreationTime")) {
                final Object value = values.remove("CreationTime");
                if ((value == null)||(!value.equals(getCreationTime()))) {
                    setCreationTime(((LocalTime) value));
                }
            }
            if (values.containsKey("FirstName")) {
                final Object value = values.remove("FirstName");
                if ((value == null)||(!value.equals(getFirstName()))) {
                    setFirstName(((String) value));
                }
            }
            if (values.containsKey("FormOfAddress")) {
                final Object value = values.remove("FormOfAddress");
                if ((value == null)||(!value.equals(getFormOfAddress()))) {
                    setFormOfAddress(((String) value));
                }
            }
            if (values.containsKey("Industry")) {
                final Object value = values.remove("Industry");
                if ((value == null)||(!value.equals(getIndustry()))) {
                    setIndustry(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber1")) {
                final Object value = values.remove("InternationalLocationNumber1");
                if ((value == null)||(!value.equals(getInternationalLocationNumber1()))) {
                    setInternationalLocationNumber1(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber2")) {
                final Object value = values.remove("InternationalLocationNumber2");
                if ((value == null)||(!value.equals(getInternationalLocationNumber2()))) {
                    setInternationalLocationNumber2(((String) value));
                }
            }
            if (values.containsKey("IsFemale")) {
                final Object value = values.remove("IsFemale");
                if ((value == null)||(!value.equals(getIsFemale()))) {
                    setIsFemale(((Boolean) value));
                }
            }
            if (values.containsKey("IsMale")) {
                final Object value = values.remove("IsMale");
                if ((value == null)||(!value.equals(getIsMale()))) {
                    setIsMale(((Boolean) value));
                }
            }
            if (values.containsKey("IsNaturalPerson")) {
                final Object value = values.remove("IsNaturalPerson");
                if ((value == null)||(!value.equals(getIsNaturalPerson()))) {
                    setIsNaturalPerson(((String) value));
                }
            }
            if (values.containsKey("IsSexUnknown")) {
                final Object value = values.remove("IsSexUnknown");
                if ((value == null)||(!value.equals(getIsSexUnknown()))) {
                    setIsSexUnknown(((Boolean) value));
                }
            }
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("LastChangeDate")) {
                final Object value = values.remove("LastChangeDate");
                if ((value == null)||(!value.equals(getLastChangeDate()))) {
                    setLastChangeDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("LastChangeTime")) {
                final Object value = values.remove("LastChangeTime");
                if ((value == null)||(!value.equals(getLastChangeTime()))) {
                    setLastChangeTime(((LocalTime) value));
                }
            }
            if (values.containsKey("LastChangedByUser")) {
                final Object value = values.remove("LastChangedByUser");
                if ((value == null)||(!value.equals(getLastChangedByUser()))) {
                    setLastChangedByUser(((String) value));
                }
            }
            if (values.containsKey("LastName")) {
                final Object value = values.remove("LastName");
                if ((value == null)||(!value.equals(getLastName()))) {
                    setLastName(((String) value));
                }
            }
            if (values.containsKey("LegalForm")) {
                final Object value = values.remove("LegalForm");
                if ((value == null)||(!value.equals(getLegalForm()))) {
                    setLegalForm(((String) value));
                }
            }
            if (values.containsKey("OrganizationBPName1")) {
                final Object value = values.remove("OrganizationBPName1");
                if ((value == null)||(!value.equals(getOrganizationBPName1()))) {
                    setOrganizationBPName1(((String) value));
                }
            }
            if (values.containsKey("OrganizationBPName2")) {
                final Object value = values.remove("OrganizationBPName2");
                if ((value == null)||(!value.equals(getOrganizationBPName2()))) {
                    setOrganizationBPName2(((String) value));
                }
            }
            if (values.containsKey("OrganizationBPName3")) {
                final Object value = values.remove("OrganizationBPName3");
                if ((value == null)||(!value.equals(getOrganizationBPName3()))) {
                    setOrganizationBPName3(((String) value));
                }
            }
            if (values.containsKey("OrganizationBPName4")) {
                final Object value = values.remove("OrganizationBPName4");
                if ((value == null)||(!value.equals(getOrganizationBPName4()))) {
                    setOrganizationBPName4(((String) value));
                }
            }
            if (values.containsKey("OrganizationFoundationDate")) {
                final Object value = values.remove("OrganizationFoundationDate");
                if ((value == null)||(!value.equals(getOrganizationFoundationDate()))) {
                    setOrganizationFoundationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("OrganizationLiquidationDate")) {
                final Object value = values.remove("OrganizationLiquidationDate");
                if ((value == null)||(!value.equals(getOrganizationLiquidationDate()))) {
                    setOrganizationLiquidationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("SearchTerm1")) {
                final Object value = values.remove("SearchTerm1");
                if ((value == null)||(!value.equals(getSearchTerm1()))) {
                    setSearchTerm1(((String) value));
                }
            }
            if (values.containsKey("AdditionalLastName")) {
                final Object value = values.remove("AdditionalLastName");
                if ((value == null)||(!value.equals(getAdditionalLastName()))) {
                    setAdditionalLastName(((String) value));
                }
            }
            if (values.containsKey("BirthDate")) {
                final Object value = values.remove("BirthDate");
                if ((value == null)||(!value.equals(getBirthDate()))) {
                    setBirthDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("BusinessPartnerIsBlocked")) {
                final Object value = values.remove("BusinessPartnerIsBlocked");
                if ((value == null)||(!value.equals(getBusinessPartnerIsBlocked()))) {
                    setBusinessPartnerIsBlocked(((Boolean) value));
                }
            }
            if (values.containsKey("BusinessPartnerType")) {
                final Object value = values.remove("BusinessPartnerType");
                if ((value == null)||(!value.equals(getBusinessPartnerType()))) {
                    setBusinessPartnerType(((String) value));
                }
            }
            if (values.containsKey("ETag")) {
                final Object value = values.remove("ETag");
                if ((value == null)||(!value.equals(getETag()))) {
                    setETag(((String) value));
                }
            }
            if (values.containsKey("GroupBusinessPartnerName1")) {
                final Object value = values.remove("GroupBusinessPartnerName1");
                if ((value == null)||(!value.equals(getGroupBusinessPartnerName1()))) {
                    setGroupBusinessPartnerName1(((String) value));
                }
            }
            if (values.containsKey("GroupBusinessPartnerName2")) {
                final Object value = values.remove("GroupBusinessPartnerName2");
                if ((value == null)||(!value.equals(getGroupBusinessPartnerName2()))) {
                    setGroupBusinessPartnerName2(((String) value));
                }
            }
            if (values.containsKey("IndependentAddressID")) {
                final Object value = values.remove("IndependentAddressID");
                if ((value == null)||(!value.equals(getIndependentAddressID()))) {
                    setIndependentAddressID(((String) value));
                }
            }
            if (values.containsKey("InternationalLocationNumber3")) {
                final Object value = values.remove("InternationalLocationNumber3");
                if ((value == null)||(!value.equals(getInternationalLocationNumber3()))) {
                    setInternationalLocationNumber3(((String) value));
                }
            }
            if (values.containsKey("MiddleName")) {
                final Object value = values.remove("MiddleName");
                if ((value == null)||(!value.equals(getMiddleName()))) {
                    setMiddleName(((String) value));
                }
            }
            if (values.containsKey("NameCountry")) {
                final Object value = values.remove("NameCountry");
                if ((value == null)||(!value.equals(getNameCountry()))) {
                    setNameCountry(((String) value));
                }
            }
            if (values.containsKey("NameFormat")) {
                final Object value = values.remove("NameFormat");
                if ((value == null)||(!value.equals(getNameFormat()))) {
                    setNameFormat(((String) value));
                }
            }
            if (values.containsKey("PersonFullName")) {
                final Object value = values.remove("PersonFullName");
                if ((value == null)||(!value.equals(getPersonFullName()))) {
                    setPersonFullName(((String) value));
                }
            }
            if (values.containsKey("PersonNumber")) {
                final Object value = values.remove("PersonNumber");
                if ((value == null)||(!value.equals(getPersonNumber()))) {
                    setPersonNumber(((String) value));
                }
            }
            if (values.containsKey("IsMarkedForArchiving")) {
                final Object value = values.remove("IsMarkedForArchiving");
                if ((value == null)||(!value.equals(getIsMarkedForArchiving()))) {
                    setIsMarkedForArchiving(((Boolean) value));
                }
            }
            if (values.containsKey("BusinessPartnerIDByExtSystem")) {
                final Object value = values.remove("BusinessPartnerIDByExtSystem");
                if ((value == null)||(!value.equals(getBusinessPartnerIDByExtSystem()))) {
                    setBusinessPartnerIDByExtSystem(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_BuPaIdentification")) {
                final Object value = (values).remove("to_BuPaIdentification");
                if (value instanceof Iterable) {
                    if (toBuPaIdentification == null) {
                        toBuPaIdentification = Lists.newArrayList();
                    } else {
                        toBuPaIdentification = Lists.newArrayList(toBuPaIdentification);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BuPaIdentification entity;
                        if (toBuPaIdentification.size()>i) {
                            entity = toBuPaIdentification.get(i);
                        } else {
                            entity = new BuPaIdentification();
                            toBuPaIdentification.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BuPaIndustry")) {
                final Object value = (values).remove("to_BuPaIndustry");
                if (value instanceof Iterable) {
                    if (toBuPaIndustry == null) {
                        toBuPaIndustry = Lists.newArrayList();
                    } else {
                        toBuPaIndustry = Lists.newArrayList(toBuPaIndustry);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BuPaIndustry entity;
                        if (toBuPaIndustry.size()>i) {
                            entity = toBuPaIndustry.get(i);
                        } else {
                            entity = new BuPaIndustry();
                            toBuPaIndustry.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BusinessPartnerAddress")) {
                final Object value = (values).remove("to_BusinessPartnerAddress");
                if (value instanceof Iterable) {
                    if (toBusinessPartnerAddress == null) {
                        toBusinessPartnerAddress = Lists.newArrayList();
                    } else {
                        toBusinessPartnerAddress = Lists.newArrayList(toBusinessPartnerAddress);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BusinessPartnerAddress entity;
                        if (toBusinessPartnerAddress.size()>i) {
                            entity = toBusinessPartnerAddress.get(i);
                        } else {
                            entity = new BusinessPartnerAddress();
                            toBusinessPartnerAddress.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BusinessPartnerBank")) {
                final Object value = (values).remove("to_BusinessPartnerBank");
                if (value instanceof Iterable) {
                    if (toBusinessPartnerBank == null) {
                        toBusinessPartnerBank = Lists.newArrayList();
                    } else {
                        toBusinessPartnerBank = Lists.newArrayList(toBusinessPartnerBank);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BusinessPartnerBank entity;
                        if (toBusinessPartnerBank.size()>i) {
                            entity = toBusinessPartnerBank.get(i);
                        } else {
                            entity = new BusinessPartnerBank();
                            toBusinessPartnerBank.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BusinessPartnerContact")) {
                final Object value = (values).remove("to_BusinessPartnerContact");
                if (value instanceof Iterable) {
                    if (toBusinessPartnerContact == null) {
                        toBusinessPartnerContact = Lists.newArrayList();
                    } else {
                        toBusinessPartnerContact = Lists.newArrayList(toBusinessPartnerContact);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BusinessPartnerContact entity;
                        if (toBusinessPartnerContact.size()>i) {
                            entity = toBusinessPartnerContact.get(i);
                        } else {
                            entity = new BusinessPartnerContact();
                            toBusinessPartnerContact.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BusinessPartnerRole")) {
                final Object value = (values).remove("to_BusinessPartnerRole");
                if (value instanceof Iterable) {
                    if (toBusinessPartnerRole == null) {
                        toBusinessPartnerRole = Lists.newArrayList();
                    } else {
                        toBusinessPartnerRole = Lists.newArrayList(toBusinessPartnerRole);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BusinessPartnerRole entity;
                        if (toBusinessPartnerRole.size()>i) {
                            entity = toBusinessPartnerRole.get(i);
                        } else {
                            entity = new BusinessPartnerRole();
                            toBusinessPartnerRole.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_BusinessPartnerTax")) {
                final Object value = (values).remove("to_BusinessPartnerTax");
                if (value instanceof Iterable) {
                    if (toBusinessPartnerTax == null) {
                        toBusinessPartnerTax = Lists.newArrayList();
                    } else {
                        toBusinessPartnerTax = Lists.newArrayList(toBusinessPartnerTax);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BusinessPartnerTaxNumber entity;
                        if (toBusinessPartnerTax.size()>i) {
                            entity = toBusinessPartnerTax.get(i);
                        } else {
                            entity = new BusinessPartnerTaxNumber();
                            toBusinessPartnerTax.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_Customer")) {
                final Object value = (values).remove("to_Customer");
                if (value instanceof Map) {
                    if (toCustomer == null) {
                        toCustomer = new Customer();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toCustomer.fromMap(inputMap);
                }
            }
            if ((values).containsKey("to_Supplier")) {
                final Object value = (values).remove("to_Supplier");
                if (value instanceof Map) {
                    if (toSupplier == null) {
                        toSupplier = new Supplier();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toSupplier.fromMap(inputMap);
                }
            }
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
    public static<T >BusinessPartnerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfNavigationProperties() {
        final Map<String, Object> values = super.toMapOfNavigationProperties();
        if (toBuPaIdentification!= null) {
            (values).put("to_BuPaIdentification", toBuPaIdentification);
        }
        if (toBuPaIndustry!= null) {
            (values).put("to_BuPaIndustry", toBuPaIndustry);
        }
        if (toBusinessPartnerAddress!= null) {
            (values).put("to_BusinessPartnerAddress", toBusinessPartnerAddress);
        }
        if (toBusinessPartnerBank!= null) {
            (values).put("to_BusinessPartnerBank", toBusinessPartnerBank);
        }
        if (toBusinessPartnerContact!= null) {
            (values).put("to_BusinessPartnerContact", toBusinessPartnerContact);
        }
        if (toBusinessPartnerRole!= null) {
            (values).put("to_BusinessPartnerRole", toBusinessPartnerRole);
        }
        if (toBusinessPartnerTax!= null) {
            (values).put("to_BusinessPartnerTax", toBusinessPartnerTax);
        }
        if (toCustomer!= null) {
            (values).put("to_Customer", toCustomer);
        }
        if (toSupplier!= null) {
            (values).put("to_Supplier", toSupplier);
        }
        return values;
    }

    /**
     * Fetches the <b>BuPaIdentification</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BuPaIdentification</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BuPaIdentification</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BuPaIdentification> fetchBuPaIdentification()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BuPaIdentification.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BuPaIdentification");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BuPaIdentification> entityList = result.asList(BuPaIdentification.class);
        for (BuPaIdentification entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BuPaIdentification</b> entities (one to many). This corresponds to the OData navigation property <b>to_BuPaIdentification</b>.
     * <p>
     * If the navigation property <b>to_BuPaIdentification</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BuPaIdentification</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BuPaIdentification> getBuPaIdentificationOrFetch()
        throws ODataException
    {
        if (toBuPaIdentification == null) {
            toBuPaIdentification = fetchBuPaIdentification();
        }
        return toBuPaIdentification;
    }

    /**
     * Retrieval of associated <b>BuPaIdentification</b> entities (one to many). This corresponds to the OData navigation property <b>to_BuPaIdentification</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BuPaIdentification</b> is already loaded, the result will contain the <b>BuPaIdentification</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BuPaIdentification>> getBuPaIdentificationIfPresent() {
        return Optional.ofNullable(toBuPaIdentification);
    }

    /**
     * Overwrites the list of associated <b>BuPaIdentification</b> entities for the loaded navigation property <b>to_BuPaIdentification</b>.
     * <p>
     * If the navigation property <b>to_BuPaIdentification</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BuPaIdentification</b> entities.
     */
    public void setBuPaIdentification(
        @Nonnull
        final List<BuPaIdentification> value) {
        if (toBuPaIdentification == null) {
            toBuPaIdentification = Lists.newArrayList();
        }
        toBuPaIdentification.clear();
        toBuPaIdentification.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BuPaIdentification</b> entities. This corresponds to the OData navigation property <b>to_BuPaIdentification</b>.
     * <p>
     * If the navigation property <b>to_BuPaIdentification</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BuPaIdentification</b> entities.
     */
    public void addBuPaIdentification(BuPaIdentification... entity) {
        if (toBuPaIdentification == null) {
            toBuPaIdentification = Lists.newArrayList();
        }
        toBuPaIdentification.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BuPaIndustry</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BuPaIndustry</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BuPaIndustry</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BuPaIndustry> fetchBuPaIndustry()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BuPaIndustry.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BuPaIndustry");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BuPaIndustry> entityList = result.asList(BuPaIndustry.class);
        for (BuPaIndustry entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BuPaIndustry</b> entities (one to many). This corresponds to the OData navigation property <b>to_BuPaIndustry</b>.
     * <p>
     * If the navigation property <b>to_BuPaIndustry</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BuPaIndustry</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BuPaIndustry> getBuPaIndustryOrFetch()
        throws ODataException
    {
        if (toBuPaIndustry == null) {
            toBuPaIndustry = fetchBuPaIndustry();
        }
        return toBuPaIndustry;
    }

    /**
     * Retrieval of associated <b>BuPaIndustry</b> entities (one to many). This corresponds to the OData navigation property <b>to_BuPaIndustry</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BuPaIndustry</b> is already loaded, the result will contain the <b>BuPaIndustry</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BuPaIndustry>> getBuPaIndustryIfPresent() {
        return Optional.ofNullable(toBuPaIndustry);
    }

    /**
     * Overwrites the list of associated <b>BuPaIndustry</b> entities for the loaded navigation property <b>to_BuPaIndustry</b>.
     * <p>
     * If the navigation property <b>to_BuPaIndustry</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BuPaIndustry</b> entities.
     */
    public void setBuPaIndustry(
        @Nonnull
        final List<BuPaIndustry> value) {
        if (toBuPaIndustry == null) {
            toBuPaIndustry = Lists.newArrayList();
        }
        toBuPaIndustry.clear();
        toBuPaIndustry.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BuPaIndustry</b> entities. This corresponds to the OData navigation property <b>to_BuPaIndustry</b>.
     * <p>
     * If the navigation property <b>to_BuPaIndustry</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BuPaIndustry</b> entities.
     */
    public void addBuPaIndustry(BuPaIndustry... entity) {
        if (toBuPaIndustry == null) {
            toBuPaIndustry = Lists.newArrayList();
        }
        toBuPaIndustry.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BusinessPartnerAddress</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BusinessPartnerAddress</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BusinessPartnerAddress</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerAddress> fetchBusinessPartnerAddress()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BusinessPartnerAddress.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BusinessPartnerAddress");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BusinessPartnerAddress> entityList = result.asList(BusinessPartnerAddress.class);
        for (BusinessPartnerAddress entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerAddress</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerAddress</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BusinessPartnerAddress</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerAddress> getBusinessPartnerAddressOrFetch()
        throws ODataException
    {
        if (toBusinessPartnerAddress == null) {
            toBusinessPartnerAddress = fetchBusinessPartnerAddress();
        }
        return toBusinessPartnerAddress;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerAddress</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BusinessPartnerAddress</b> is already loaded, the result will contain the <b>BusinessPartnerAddress</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BusinessPartnerAddress>> getBusinessPartnerAddressIfPresent() {
        return Optional.ofNullable(toBusinessPartnerAddress);
    }

    /**
     * Overwrites the list of associated <b>BusinessPartnerAddress</b> entities for the loaded navigation property <b>to_BusinessPartnerAddress</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerAddress</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BusinessPartnerAddress</b> entities.
     */
    public void setBusinessPartnerAddress(
        @Nonnull
        final List<BusinessPartnerAddress> value) {
        if (toBusinessPartnerAddress == null) {
            toBusinessPartnerAddress = Lists.newArrayList();
        }
        toBusinessPartnerAddress.clear();
        toBusinessPartnerAddress.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BusinessPartnerAddress</b> entities. This corresponds to the OData navigation property <b>to_BusinessPartnerAddress</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerAddress</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BusinessPartnerAddress</b> entities.
     */
    public void addBusinessPartnerAddress(BusinessPartnerAddress... entity) {
        if (toBusinessPartnerAddress == null) {
            toBusinessPartnerAddress = Lists.newArrayList();
        }
        toBusinessPartnerAddress.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BusinessPartnerBank</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BusinessPartnerBank</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BusinessPartnerBank</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerBank> fetchBusinessPartnerBank()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BusinessPartnerBank.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BusinessPartnerBank");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BusinessPartnerBank> entityList = result.asList(BusinessPartnerBank.class);
        for (BusinessPartnerBank entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerBank</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerBank</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerBank</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BusinessPartnerBank</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerBank> getBusinessPartnerBankOrFetch()
        throws ODataException
    {
        if (toBusinessPartnerBank == null) {
            toBusinessPartnerBank = fetchBusinessPartnerBank();
        }
        return toBusinessPartnerBank;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerBank</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerBank</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BusinessPartnerBank</b> is already loaded, the result will contain the <b>BusinessPartnerBank</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BusinessPartnerBank>> getBusinessPartnerBankIfPresent() {
        return Optional.ofNullable(toBusinessPartnerBank);
    }

    /**
     * Overwrites the list of associated <b>BusinessPartnerBank</b> entities for the loaded navigation property <b>to_BusinessPartnerBank</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerBank</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BusinessPartnerBank</b> entities.
     */
    public void setBusinessPartnerBank(
        @Nonnull
        final List<BusinessPartnerBank> value) {
        if (toBusinessPartnerBank == null) {
            toBusinessPartnerBank = Lists.newArrayList();
        }
        toBusinessPartnerBank.clear();
        toBusinessPartnerBank.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BusinessPartnerBank</b> entities. This corresponds to the OData navigation property <b>to_BusinessPartnerBank</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerBank</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BusinessPartnerBank</b> entities.
     */
    public void addBusinessPartnerBank(BusinessPartnerBank... entity) {
        if (toBusinessPartnerBank == null) {
            toBusinessPartnerBank = Lists.newArrayList();
        }
        toBusinessPartnerBank.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BusinessPartnerContact</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BusinessPartnerContact</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BusinessPartnerContact</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerContact> fetchBusinessPartnerContact()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BusinessPartnerContact.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BusinessPartnerContact");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BusinessPartnerContact> entityList = result.asList(BusinessPartnerContact.class);
        for (BusinessPartnerContact entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerContact</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerContact</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerContact</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BusinessPartnerContact</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerContact> getBusinessPartnerContactOrFetch()
        throws ODataException
    {
        if (toBusinessPartnerContact == null) {
            toBusinessPartnerContact = fetchBusinessPartnerContact();
        }
        return toBusinessPartnerContact;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerContact</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerContact</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BusinessPartnerContact</b> is already loaded, the result will contain the <b>BusinessPartnerContact</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BusinessPartnerContact>> getBusinessPartnerContactIfPresent() {
        return Optional.ofNullable(toBusinessPartnerContact);
    }

    /**
     * Overwrites the list of associated <b>BusinessPartnerContact</b> entities for the loaded navigation property <b>to_BusinessPartnerContact</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerContact</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BusinessPartnerContact</b> entities.
     */
    public void setBusinessPartnerContact(
        @Nonnull
        final List<BusinessPartnerContact> value) {
        if (toBusinessPartnerContact == null) {
            toBusinessPartnerContact = Lists.newArrayList();
        }
        toBusinessPartnerContact.clear();
        toBusinessPartnerContact.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BusinessPartnerContact</b> entities. This corresponds to the OData navigation property <b>to_BusinessPartnerContact</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerContact</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BusinessPartnerContact</b> entities.
     */
    public void addBusinessPartnerContact(BusinessPartnerContact... entity) {
        if (toBusinessPartnerContact == null) {
            toBusinessPartnerContact = Lists.newArrayList();
        }
        toBusinessPartnerContact.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BusinessPartnerRole</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BusinessPartnerRole</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BusinessPartnerRole</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerRole> fetchBusinessPartnerRole()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BusinessPartnerRole.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BusinessPartnerRole");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BusinessPartnerRole> entityList = result.asList(BusinessPartnerRole.class);
        for (BusinessPartnerRole entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerRole</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerRole</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerRole</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BusinessPartnerRole</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerRole> getBusinessPartnerRoleOrFetch()
        throws ODataException
    {
        if (toBusinessPartnerRole == null) {
            toBusinessPartnerRole = fetchBusinessPartnerRole();
        }
        return toBusinessPartnerRole;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerRole</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerRole</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BusinessPartnerRole</b> is already loaded, the result will contain the <b>BusinessPartnerRole</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BusinessPartnerRole>> getBusinessPartnerRoleIfPresent() {
        return Optional.ofNullable(toBusinessPartnerRole);
    }

    /**
     * Overwrites the list of associated <b>BusinessPartnerRole</b> entities for the loaded navigation property <b>to_BusinessPartnerRole</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerRole</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BusinessPartnerRole</b> entities.
     */
    public void setBusinessPartnerRole(
        @Nonnull
        final List<BusinessPartnerRole> value) {
        if (toBusinessPartnerRole == null) {
            toBusinessPartnerRole = Lists.newArrayList();
        }
        toBusinessPartnerRole.clear();
        toBusinessPartnerRole.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BusinessPartnerRole</b> entities. This corresponds to the OData navigation property <b>to_BusinessPartnerRole</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerRole</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BusinessPartnerRole</b> entities.
     */
    public void addBusinessPartnerRole(BusinessPartnerRole... entity) {
        if (toBusinessPartnerRole == null) {
            toBusinessPartnerRole = Lists.newArrayList();
        }
        toBusinessPartnerRole.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BusinessPartnerTaxNumber</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_BusinessPartnerTax</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BusinessPartnerTaxNumber</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerTaxNumber> fetchBusinessPartnerTax()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BusinessPartnerTaxNumber.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_BusinessPartnerTax");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BusinessPartnerTaxNumber> entityList = result.asList(BusinessPartnerTaxNumber.class);
        for (BusinessPartnerTaxNumber entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerTaxNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerTax</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerTax</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BusinessPartnerTaxNumber</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BusinessPartnerTaxNumber> getBusinessPartnerTaxOrFetch()
        throws ODataException
    {
        if (toBusinessPartnerTax == null) {
            toBusinessPartnerTax = fetchBusinessPartnerTax();
        }
        return toBusinessPartnerTax;
    }

    /**
     * Retrieval of associated <b>BusinessPartnerTaxNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_BusinessPartnerTax</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_BusinessPartnerTax</b> is already loaded, the result will contain the <b>BusinessPartnerTaxNumber</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BusinessPartnerTaxNumber>> getBusinessPartnerTaxIfPresent() {
        return Optional.ofNullable(toBusinessPartnerTax);
    }

    /**
     * Overwrites the list of associated <b>BusinessPartnerTaxNumber</b> entities for the loaded navigation property <b>to_BusinessPartnerTax</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerTax</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BusinessPartnerTaxNumber</b> entities.
     */
    public void setBusinessPartnerTax(
        @Nonnull
        final List<BusinessPartnerTaxNumber> value) {
        if (toBusinessPartnerTax == null) {
            toBusinessPartnerTax = Lists.newArrayList();
        }
        toBusinessPartnerTax.clear();
        toBusinessPartnerTax.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BusinessPartnerTaxNumber</b> entities. This corresponds to the OData navigation property <b>to_BusinessPartnerTax</b>.
     * <p>
     * If the navigation property <b>to_BusinessPartnerTax</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BusinessPartnerTaxNumber</b> entities.
     */
    public void addBusinessPartnerTax(BusinessPartnerTaxNumber... entity) {
        if (toBusinessPartnerTax == null) {
            toBusinessPartnerTax = Lists.newArrayList();
        }
        toBusinessPartnerTax.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>Customer</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_Customer</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>Customer</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Customer fetchCustomer()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Customer.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Customer");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final Customer entity = result.as(Customer.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>Customer</b> entity (one to one). This corresponds to the OData navigation property <b>to_Customer</b>.
     * <p>
     * If the navigation property <b>to_Customer</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Customer</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Customer getCustomerOrFetch()
        throws ODataException
    {
        if (toCustomer == null) {
            toCustomer = fetchCustomer();
        }
        return toCustomer;
    }

    /**
     * Retrieval of associated <b>Customer</b> entity (one to one). This corresponds to the OData navigation property <b>to_Customer</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_Customer</b> is already loaded, the result will contain the <b>Customer</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<Customer> getCustomerIfPresent() {
        return Optional.ofNullable(toCustomer);
    }

    /**
     * Overwrites the associated <b>Customer</b> entity for the loaded navigation property <b>to_Customer</b>.
     * 
     * @param value
     *     New <b>Customer</b> entity.
     */
    public void setCustomer(final Customer value) {
        toCustomer = value;
    }

    /**
     * Fetches the <b>Supplier</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_Supplier</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>Supplier</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Supplier fetchSupplier()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type Supplier.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("BusinessPartner=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartner));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_Supplier");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final Supplier entity = result.as(Supplier.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>Supplier</b> entity (one to one). This corresponds to the OData navigation property <b>to_Supplier</b>.
     * <p>
     * If the navigation property <b>to_Supplier</b> of a queried <b>BusinessPartner</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>Supplier</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public Supplier getSupplierOrFetch()
        throws ODataException
    {
        if (toSupplier == null) {
            toSupplier = fetchSupplier();
        }
        return toSupplier;
    }

    /**
     * Retrieval of associated <b>Supplier</b> entity (one to one). This corresponds to the OData navigation property <b>to_Supplier</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartner</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_Supplier</b> is already loaded, the result will contain the <b>Supplier</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<Supplier> getSupplierIfPresent() {
        return Optional.ofNullable(toSupplier);
    }

    /**
     * Overwrites the associated <b>Supplier</b> entity for the loaded navigation property <b>to_Supplier</b>.
     * 
     * @param value
     *     New <b>Supplier</b> entity.
     */
    public void setSupplier(final Supplier value) {
        toSupplier = value;
    }

    public final static class BusinessPartnerBuilder {

        private List<BuPaIdentification> toBuPaIdentification = Lists.newArrayList();
        private List<BuPaIndustry> toBuPaIndustry = Lists.newArrayList();
        private List<BusinessPartnerAddress> toBusinessPartnerAddress = Lists.newArrayList();
        private List<BusinessPartnerBank> toBusinessPartnerBank = Lists.newArrayList();
        private List<BusinessPartnerContact> toBusinessPartnerContact = Lists.newArrayList();
        private List<BusinessPartnerRole> toBusinessPartnerRole = Lists.newArrayList();
        private List<BusinessPartnerTaxNumber> toBusinessPartnerTax = Lists.newArrayList();
        private Customer toCustomer;
        private String customer = null;
        private Supplier toSupplier;
        private String supplier = null;

        private BusinessPartner.BusinessPartnerBuilder toBuPaIdentification(List<BuPaIdentification> value) {
            toBuPaIdentification.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BuPaIdentification</b> for <b>BusinessPartner</b> to multiple <b>BuPaIdentification</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder buPaIdentification(BuPaIdentification... value) {
            return toBuPaIdentification(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBuPaIndustry(List<BuPaIndustry> value) {
            toBuPaIndustry.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BuPaIndustry</b> for <b>BusinessPartner</b> to multiple <b>BuPaIndustry</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder buPaIndustry(BuPaIndustry... value) {
            return toBuPaIndustry(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBusinessPartnerAddress(List<BusinessPartnerAddress> value) {
            toBusinessPartnerAddress.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BusinessPartnerAddress</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerAddress</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder businessPartnerAddress(BusinessPartnerAddress... value) {
            return toBusinessPartnerAddress(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBusinessPartnerBank(List<BusinessPartnerBank> value) {
            toBusinessPartnerBank.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BusinessPartnerBank</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerBank</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder businessPartnerBank(BusinessPartnerBank... value) {
            return toBusinessPartnerBank(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBusinessPartnerContact(List<BusinessPartnerContact> value) {
            toBusinessPartnerContact.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BusinessPartnerContact</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerContact</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder businessPartnerContact(BusinessPartnerContact... value) {
            return toBusinessPartnerContact(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBusinessPartnerRole(List<BusinessPartnerRole> value) {
            toBusinessPartnerRole.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BusinessPartnerRole</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerRole</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder businessPartnerRole(BusinessPartnerRole... value) {
            return toBusinessPartnerRole(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toBusinessPartnerTax(List<BusinessPartnerTaxNumber> value) {
            toBusinessPartnerTax.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_BusinessPartnerTax</b> for <b>BusinessPartner</b> to multiple <b>BusinessPartnerTaxNumber</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder businessPartnerTax(BusinessPartnerTaxNumber... value) {
            return toBusinessPartnerTax(Lists.newArrayList(value));
        }

        private BusinessPartner.BusinessPartnerBuilder toCustomer(Customer value) {
            toCustomer = value;
            return this;
        }

        /**
         * Navigation property <b>to_Customer</b> for <b>BusinessPartner</b> to single <b>Customer</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder customer(final Customer value) {
            return toCustomer(value);
        }

        /**
         * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
         * 
         */
        public BusinessPartner.BusinessPartnerBuilder customer(final String value) {
            customer = value;
            return this;
        }

        private BusinessPartner.BusinessPartnerBuilder toSupplier(Supplier value) {
            toSupplier = value;
            return this;
        }

        /**
         * Navigation property <b>to_Supplier</b> for <b>BusinessPartner</b> to single <b>Supplier</b>.
         * 
         */
        @Nonnull
        public BusinessPartner.BusinessPartnerBuilder supplier(final Supplier value) {
            return toSupplier(value);
        }

        /**
         * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Supplier</b></p>
         * 
         */
        public BusinessPartner.BusinessPartnerBuilder supplier(final String value) {
            supplier = value;
            return this;
        }

    }

}
