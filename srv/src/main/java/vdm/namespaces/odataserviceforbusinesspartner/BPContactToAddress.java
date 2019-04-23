/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
import vdm.namespaces.odataserviceforbusinesspartner.field.BPContactToAddressField;
import vdm.namespaces.odataserviceforbusinesspartner.link.BPContactToAddressLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BPContactToAddressSelectable;


/**
 * Business Partner Contact Address<p></p><p>Original entity name from the Odata EDM: <b>A_BPContactToAddressType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BPContactToAddress
    extends VdmEntity<BPContactToAddress>
{

    /**
     * Selector for all available fields of BPContactToAddress.
     * 
     */
    public final static BPContactToAddressSelectable ALL_FIELDS = new BPContactToAddressSelectable() {


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
    public final static BPContactToAddressField<String> RELATIONSHIP_NUMBER = new BPContactToAddressField<String>("RelationshipNumber");
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
    public final static BPContactToAddressField<String> BUSINESS_PARTNER_COMPANY = new BPContactToAddressField<String>("BusinessPartnerCompany");
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
    public final static BPContactToAddressField<String> BUSINESS_PARTNER_PERSON = new BPContactToAddressField<String>("BusinessPartnerPerson");
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
    public final static BPContactToAddressField<LocalDateTime> VALIDITY_END_DATE = new BPContactToAddressField<LocalDateTime>("ValidityEndDate");
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
    public final static BPContactToAddressField<String> ADDRESS_ID = new BPContactToAddressField<String>("AddressID");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressNumber</b></p>
     * 
     * @param addressNumber
     *     
     * @return
     *     Address Number
     */
    @SerializedName("AddressNumber")
    @JsonProperty("AddressNumber")
    @Nullable
    @ODataField(odataName = "AddressNumber")
    private String addressNumber;
    /**
     * Use with available fluent helpers to apply the <b>AddressNumber</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> ADDRESS_NUMBER = new BPContactToAddressField<String>("AddressNumber");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalStreetPrefixName</b></p>
     * 
     * @param additionalStreetPrefixName
     *     
     * @return
     *     Street 3
     */
    @SerializedName("AdditionalStreetPrefixName")
    @JsonProperty("AdditionalStreetPrefixName")
    @Nullable
    @ODataField(odataName = "AdditionalStreetPrefixName")
    private String additionalStreetPrefixName;
    /**
     * Use with available fluent helpers to apply the <b>AdditionalStreetPrefixName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> ADDITIONAL_STREET_PREFIX_NAME = new BPContactToAddressField<String>("AdditionalStreetPrefixName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalStreetSuffixName</b></p>
     * 
     * @param additionalStreetSuffixName
     *     
     * @return
     *     Street 5
     */
    @SerializedName("AdditionalStreetSuffixName")
    @JsonProperty("AdditionalStreetSuffixName")
    @Nullable
    @ODataField(odataName = "AdditionalStreetSuffixName")
    private String additionalStreetSuffixName;
    /**
     * Use with available fluent helpers to apply the <b>AdditionalStreetSuffixName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> ADDITIONAL_STREET_SUFFIX_NAME = new BPContactToAddressField<String>("AdditionalStreetSuffixName");
    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>AddressTimeZone</b></p>
     * 
     * @param addressTimeZone
     *     
     * @return
     *     Address time zone
     */
    @SerializedName("AddressTimeZone")
    @JsonProperty("AddressTimeZone")
    @Nullable
    @ODataField(odataName = "AddressTimeZone")
    private String addressTimeZone;
    /**
     * Use with available fluent helpers to apply the <b>AddressTimeZone</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> ADDRESS_TIME_ZONE = new BPContactToAddressField<String>("AddressTimeZone");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CareOfName</b></p>
     * 
     * @param careOfName
     *     
     * @return
     *     c/o name
     */
    @SerializedName("CareOfName")
    @JsonProperty("CareOfName")
    @Nullable
    @ODataField(odataName = "CareOfName")
    private String careOfName;
    /**
     * Use with available fluent helpers to apply the <b>CareOfName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> CARE_OF_NAME = new BPContactToAddressField<String>("CareOfName");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CityCode</b></p>
     * 
     * @param cityCode
     *     
     * @return
     *     City code for city/street file
     */
    @SerializedName("CityCode")
    @JsonProperty("CityCode")
    @Nullable
    @ODataField(odataName = "CityCode")
    private String cityCode;
    /**
     * Use with available fluent helpers to apply the <b>CityCode</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> CITY_CODE = new BPContactToAddressField<String>("CityCode");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CityName</b></p>
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
    public final static BPContactToAddressField<String> CITY_NAME = new BPContactToAddressField<String>("CityName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CompanyPostalCode</b></p>
     * 
     * @param companyPostalCode
     *     
     * @return
     *     Company Postal Code (for Large Customers)
     */
    @SerializedName("CompanyPostalCode")
    @JsonProperty("CompanyPostalCode")
    @Nullable
    @ODataField(odataName = "CompanyPostalCode")
    private String companyPostalCode;
    /**
     * Use with available fluent helpers to apply the <b>CompanyPostalCode</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> COMPANY_POSTAL_CODE = new BPContactToAddressField<String>("CompanyPostalCode");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Country</b></p>
     * 
     * @param country
     *     
     * @return
     *     Country Key
     */
    @SerializedName("Country")
    @JsonProperty("Country")
    @Nullable
    @ODataField(odataName = "Country")
    private String country;
    /**
     * Use with available fluent helpers to apply the <b>Country</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> COUNTRY = new BPContactToAddressField<String>("Country");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>County</b></p>
     * 
     * @param county
     *     
     * @return
     *     County
     */
    @SerializedName("County")
    @JsonProperty("County")
    @Nullable
    @ODataField(odataName = "County")
    private String county;
    /**
     * Use with available fluent helpers to apply the <b>County</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> COUNTY = new BPContactToAddressField<String>("County");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DeliveryServiceNumber</b></p>
     * 
     * @param deliveryServiceNumber
     *     
     * @return
     *     Number of Delivery Service
     */
    @SerializedName("DeliveryServiceNumber")
    @JsonProperty("DeliveryServiceNumber")
    @Nullable
    @ODataField(odataName = "DeliveryServiceNumber")
    private String deliveryServiceNumber;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryServiceNumber</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> DELIVERY_SERVICE_NUMBER = new BPContactToAddressField<String>("DeliveryServiceNumber");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DeliveryServiceTypeCode</b></p>
     * 
     * @param deliveryServiceTypeCode
     *     
     * @return
     *     Type of Delivery Service
     */
    @SerializedName("DeliveryServiceTypeCode")
    @JsonProperty("DeliveryServiceTypeCode")
    @Nullable
    @ODataField(odataName = "DeliveryServiceTypeCode")
    private String deliveryServiceTypeCode;
    /**
     * Use with available fluent helpers to apply the <b>DeliveryServiceTypeCode</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> DELIVERY_SERVICE_TYPE_CODE = new BPContactToAddressField<String>("DeliveryServiceTypeCode");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>District</b></p>
     * 
     * @param district
     *     
     * @return
     *     District
     */
    @SerializedName("District")
    @JsonProperty("District")
    @Nullable
    @ODataField(odataName = "District")
    private String district;
    /**
     * Use with available fluent helpers to apply the <b>District</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> DISTRICT = new BPContactToAddressField<String>("District");
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
    public final static BPContactToAddressField<String> FORM_OF_ADDRESS = new BPContactToAddressField<String>("FormOfAddress");
    /**
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>FullName</b></p>
     * 
     * @param fullName
     *     
     * @return
     *     Full name of a party (Bus. Partner, Org. Unit, Doc. address)
     */
    @SerializedName("FullName")
    @JsonProperty("FullName")
    @Nullable
    @ODataField(odataName = "FullName")
    private String fullName;
    /**
     * Use with available fluent helpers to apply the <b>FullName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> FULL_NAME = new BPContactToAddressField<String>("FullName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>HomeCityName</b></p>
     * 
     * @param homeCityName
     *     
     * @return
     *     City (different from postal city)
     */
    @SerializedName("HomeCityName")
    @JsonProperty("HomeCityName")
    @Nullable
    @ODataField(odataName = "HomeCityName")
    private String homeCityName;
    /**
     * Use with available fluent helpers to apply the <b>HomeCityName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> HOME_CITY_NAME = new BPContactToAddressField<String>("HomeCityName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>HouseNumber</b></p>
     * 
     * @param houseNumber
     *     
     * @return
     *     House Number
     */
    @SerializedName("HouseNumber")
    @JsonProperty("HouseNumber")
    @Nullable
    @ODataField(odataName = "HouseNumber")
    private String houseNumber;
    /**
     * Use with available fluent helpers to apply the <b>HouseNumber</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> HOUSE_NUMBER = new BPContactToAddressField<String>("HouseNumber");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>HouseNumberSupplementText</b></p>
     * 
     * @param houseNumberSupplementText
     *     
     * @return
     *     House number supplement
     */
    @SerializedName("HouseNumberSupplementText")
    @JsonProperty("HouseNumberSupplementText")
    @Nullable
    @ODataField(odataName = "HouseNumberSupplementText")
    private String houseNumberSupplementText;
    /**
     * Use with available fluent helpers to apply the <b>HouseNumberSupplementText</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> HOUSE_NUMBER_SUPPLEMENT_TEXT = new BPContactToAddressField<String>("HouseNumberSupplementText");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     
     * @return
     *     Language Key
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
    public final static BPContactToAddressField<String> LANGUAGE = new BPContactToAddressField<String>("Language");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>POBox</b></p>
     * 
     * @param pOBox
     *     
     * @return
     *     PO Box
     */
    @SerializedName("POBox")
    @JsonProperty("POBox")
    @Nullable
    @ODataField(odataName = "POBox")
    private String pOBox;
    /**
     * Use with available fluent helpers to apply the <b>POBox</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX = new BPContactToAddressField<String>("POBox");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>POBoxDeviatingCityName</b></p>
     * 
     * @param pOBoxDeviatingCityName
     *     
     * @return
     *     PO Box city
     */
    @SerializedName("POBoxDeviatingCityName")
    @JsonProperty("POBoxDeviatingCityName")
    @Nullable
    @ODataField(odataName = "POBoxDeviatingCityName")
    private String pOBoxDeviatingCityName;
    /**
     * Use with available fluent helpers to apply the <b>POBoxDeviatingCityName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX_DEVIATING_CITY_NAME = new BPContactToAddressField<String>("POBoxDeviatingCityName");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>POBoxDeviatingCountry</b></p>
     * 
     * @param pOBoxDeviatingCountry
     *     
     * @return
     *     PO box country
     */
    @SerializedName("POBoxDeviatingCountry")
    @JsonProperty("POBoxDeviatingCountry")
    @Nullable
    @ODataField(odataName = "POBoxDeviatingCountry")
    private String pOBoxDeviatingCountry;
    /**
     * Use with available fluent helpers to apply the <b>POBoxDeviatingCountry</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX_DEVIATING_COUNTRY = new BPContactToAddressField<String>("POBoxDeviatingCountry");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>POBoxDeviatingRegion</b></p>
     * 
     * @param pOBoxDeviatingRegion
     *     
     * @return
     *     Region for PO Box (Country, State, Province, ...)
     */
    @SerializedName("POBoxDeviatingRegion")
    @JsonProperty("POBoxDeviatingRegion")
    @Nullable
    @ODataField(odataName = "POBoxDeviatingRegion")
    private String pOBoxDeviatingRegion;
    /**
     * Use with available fluent helpers to apply the <b>POBoxDeviatingRegion</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX_DEVIATING_REGION = new BPContactToAddressField<String>("POBoxDeviatingRegion");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>POBoxIsWithoutNumber</b></p>
     * 
     * @param pOBoxIsWithoutNumber
     *     
     * @return
     *     Flag: PO Box Without Number
     */
    @SerializedName("POBoxIsWithoutNumber")
    @JsonProperty("POBoxIsWithoutNumber")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "POBoxIsWithoutNumber")
    private Boolean pOBoxIsWithoutNumber;
    /**
     * Use with available fluent helpers to apply the <b>POBoxIsWithoutNumber</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<Boolean> PO_BOX_IS_WITHOUT_NUMBER = new BPContactToAddressField<Boolean>("POBoxIsWithoutNumber");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>POBoxLobbyName</b></p>
     * 
     * @param pOBoxLobbyName
     *     
     * @return
     *     PO Box Lobby
     */
    @SerializedName("POBoxLobbyName")
    @JsonProperty("POBoxLobbyName")
    @Nullable
    @ODataField(odataName = "POBoxLobbyName")
    private String pOBoxLobbyName;
    /**
     * Use with available fluent helpers to apply the <b>POBoxLobbyName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX_LOBBY_NAME = new BPContactToAddressField<String>("POBoxLobbyName");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>POBoxPostalCode</b></p>
     * 
     * @param pOBoxPostalCode
     *     
     * @return
     *     PO Box Postal Code
     */
    @SerializedName("POBoxPostalCode")
    @JsonProperty("POBoxPostalCode")
    @Nullable
    @ODataField(odataName = "POBoxPostalCode")
    private String pOBoxPostalCode;
    /**
     * Use with available fluent helpers to apply the <b>POBoxPostalCode</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PO_BOX_POSTAL_CODE = new BPContactToAddressField<String>("POBoxPostalCode");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
     * 
     * @param person
     *     
     * @return
     *     Person number
     */
    @SerializedName("Person")
    @JsonProperty("Person")
    @Nullable
    @ODataField(odataName = "Person")
    private String person;
    /**
     * Use with available fluent helpers to apply the <b>Person</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PERSON = new BPContactToAddressField<String>("Person");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PostalCode</b></p>
     * 
     * @param postalCode
     *     
     * @return
     *     City Postal Code
     */
    @SerializedName("PostalCode")
    @JsonProperty("PostalCode")
    @Nullable
    @ODataField(odataName = "PostalCode")
    private String postalCode;
    /**
     * Use with available fluent helpers to apply the <b>PostalCode</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> POSTAL_CODE = new BPContactToAddressField<String>("PostalCode");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PrfrdCommMediumType</b></p>
     * 
     * @param prfrdCommMediumType
     *     
     * @return
     *     Communication Method (Key) (Business Address Services)
     */
    @SerializedName("PrfrdCommMediumType")
    @JsonProperty("PrfrdCommMediumType")
    @Nullable
    @ODataField(odataName = "PrfrdCommMediumType")
    private String prfrdCommMediumType;
    /**
     * Use with available fluent helpers to apply the <b>PrfrdCommMediumType</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> PRFRD_COMM_MEDIUM_TYPE = new BPContactToAddressField<String>("PrfrdCommMediumType");
    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Region</b></p>
     * 
     * @param region
     *     
     * @return
     *     Region (State, Province, County)
     */
    @SerializedName("Region")
    @JsonProperty("Region")
    @Nullable
    @ODataField(odataName = "Region")
    private String region;
    /**
     * Use with available fluent helpers to apply the <b>Region</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> REGION = new BPContactToAddressField<String>("Region");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>StreetName</b></p>
     * 
     * @param streetName
     *     
     * @return
     *     Street
     */
    @SerializedName("StreetName")
    @JsonProperty("StreetName")
    @Nullable
    @ODataField(odataName = "StreetName")
    private String streetName;
    /**
     * Use with available fluent helpers to apply the <b>StreetName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> STREET_NAME = new BPContactToAddressField<String>("StreetName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>StreetPrefixName</b></p>
     * 
     * @param streetPrefixName
     *     
     * @return
     *     Street 2
     */
    @SerializedName("StreetPrefixName")
    @JsonProperty("StreetPrefixName")
    @Nullable
    @ODataField(odataName = "StreetPrefixName")
    private String streetPrefixName;
    /**
     * Use with available fluent helpers to apply the <b>StreetPrefixName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> STREET_PREFIX_NAME = new BPContactToAddressField<String>("StreetPrefixName");
    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>StreetSuffixName</b></p>
     * 
     * @param streetSuffixName
     *     
     * @return
     *     Street 4
     */
    @SerializedName("StreetSuffixName")
    @JsonProperty("StreetSuffixName")
    @Nullable
    @ODataField(odataName = "StreetSuffixName")
    private String streetSuffixName;
    /**
     * Use with available fluent helpers to apply the <b>StreetSuffixName</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> STREET_SUFFIX_NAME = new BPContactToAddressField<String>("StreetSuffixName");
    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>TaxJurisdiction</b></p>
     * 
     * @param taxJurisdiction
     *     
     * @return
     *     Tax Jurisdiction
     */
    @SerializedName("TaxJurisdiction")
    @JsonProperty("TaxJurisdiction")
    @Nullable
    @ODataField(odataName = "TaxJurisdiction")
    private String taxJurisdiction;
    /**
     * Use with available fluent helpers to apply the <b>TaxJurisdiction</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> TAX_JURISDICTION = new BPContactToAddressField<String>("TaxJurisdiction");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TransportZone</b></p>
     * 
     * @param transportZone
     *     
     * @return
     *     Transportation zone to or from which the goods are delivered
     */
    @SerializedName("TransportZone")
    @JsonProperty("TransportZone")
    @Nullable
    @ODataField(odataName = "TransportZone")
    private String transportZone;
    /**
     * Use with available fluent helpers to apply the <b>TransportZone</b> field to query operations.
     * 
     */
    public final static BPContactToAddressField<String> TRANSPORT_ZONE = new BPContactToAddressField<String>("TransportZone");
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
     * Navigation property <b>to_EmailAddress</b> for <b>BPContactToAddress</b> to multiple <b>AddressEmailAddress</b>.
     * 
     */
    @SerializedName("to_EmailAddress")
    @JsonProperty("to_EmailAddress")
    @ODataField(odataName = "to_EmailAddress")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AddressEmailAddress> toEmailAddress;
    /**
     * Navigation property <b>to_FaxNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressFaxNumber</b>.
     * 
     */
    @SerializedName("to_FaxNumber")
    @JsonProperty("to_FaxNumber")
    @ODataField(odataName = "to_FaxNumber")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AddressFaxNumber> toFaxNumber;
    /**
     * Navigation property <b>to_MobilePhoneNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressPhoneNumber</b>.
     * 
     */
    @SerializedName("to_MobilePhoneNumber")
    @JsonProperty("to_MobilePhoneNumber")
    @ODataField(odataName = "to_MobilePhoneNumber")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AddressPhoneNumber> toMobilePhoneNumber;
    /**
     * Navigation property <b>to_PhoneNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressPhoneNumber</b>.
     * 
     */
    @SerializedName("to_PhoneNumber")
    @JsonProperty("to_PhoneNumber")
    @ODataField(odataName = "to_PhoneNumber")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AddressPhoneNumber> toPhoneNumber;
    /**
     * Navigation property <b>to_URLAddress</b> for <b>BPContactToAddress</b> to multiple <b>AddressHomePageURL</b>.
     * 
     */
    @SerializedName("to_URLAddress")
    @JsonProperty("to_URLAddress")
    @ODataField(odataName = "to_URLAddress")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<AddressHomePageURL> toURLAddress;
    /**
     * Use with available fluent helpers to apply the <b>to_EmailAddress</b> navigation property to query operations.
     * 
     */
    public final static BPContactToAddressLink<AddressEmailAddress> TO_EMAIL_ADDRESS = new BPContactToAddressLink<AddressEmailAddress>("to_EmailAddress");
    /**
     * Use with available fluent helpers to apply the <b>to_FaxNumber</b> navigation property to query operations.
     * 
     */
    public final static BPContactToAddressLink<AddressFaxNumber> TO_FAX_NUMBER = new BPContactToAddressLink<AddressFaxNumber>("to_FaxNumber");
    /**
     * Use with available fluent helpers to apply the <b>to_MobilePhoneNumber</b> navigation property to query operations.
     * 
     */
    public final static BPContactToAddressLink<AddressPhoneNumber> TO_MOBILE_PHONE_NUMBER = new BPContactToAddressLink<AddressPhoneNumber>("to_MobilePhoneNumber");
    /**
     * Use with available fluent helpers to apply the <b>to_PhoneNumber</b> navigation property to query operations.
     * 
     */
    public final static BPContactToAddressLink<AddressPhoneNumber> TO_PHONE_NUMBER = new BPContactToAddressLink<AddressPhoneNumber>("to_PhoneNumber");
    /**
     * Use with available fluent helpers to apply the <b>to_URLAddress</b> navigation property to query operations.
     * 
     */
    public final static BPContactToAddressLink<AddressHomePageURL> TO_URL_ADDRESS = new BPContactToAddressLink<AddressHomePageURL>("to_URLAddress");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<BPContactToAddress> getType() {
        return BPContactToAddress.class;
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressNumber</b></p>
     * 
     * @param addressNumber
     *     Address Number
     */
    public void setAddressNumber(
        @Nullable
        final String addressNumber) {
        rememberChangedField("AddressNumber", this.addressNumber);
        this.addressNumber = addressNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalStreetPrefixName</b></p>
     * 
     * @param additionalStreetPrefixName
     *     Street 3
     */
    public void setAdditionalStreetPrefixName(
        @Nullable
        final String additionalStreetPrefixName) {
        rememberChangedField("AdditionalStreetPrefixName", this.additionalStreetPrefixName);
        this.additionalStreetPrefixName = additionalStreetPrefixName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>AdditionalStreetSuffixName</b></p>
     * 
     * @param additionalStreetSuffixName
     *     Street 5
     */
    public void setAdditionalStreetSuffixName(
        @Nullable
        final String additionalStreetSuffixName) {
        rememberChangedField("AdditionalStreetSuffixName", this.additionalStreetSuffixName);
        this.additionalStreetSuffixName = additionalStreetSuffixName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>AddressTimeZone</b></p>
     * 
     * @param addressTimeZone
     *     Address time zone
     */
    public void setAddressTimeZone(
        @Nullable
        final String addressTimeZone) {
        rememberChangedField("AddressTimeZone", this.addressTimeZone);
        this.addressTimeZone = addressTimeZone;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CareOfName</b></p>
     * 
     * @param careOfName
     *     c/o name
     */
    public void setCareOfName(
        @Nullable
        final String careOfName) {
        rememberChangedField("CareOfName", this.careOfName);
        this.careOfName = careOfName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CityCode</b></p>
     * 
     * @param cityCode
     *     City code for city/street file
     */
    public void setCityCode(
        @Nullable
        final String cityCode) {
        rememberChangedField("CityCode", this.cityCode);
        this.cityCode = cityCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>CityName</b></p>
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>CompanyPostalCode</b></p>
     * 
     * @param companyPostalCode
     *     Company Postal Code (for Large Customers)
     */
    public void setCompanyPostalCode(
        @Nullable
        final String companyPostalCode) {
        rememberChangedField("CompanyPostalCode", this.companyPostalCode);
        this.companyPostalCode = companyPostalCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Country</b></p>
     * 
     * @param country
     *     Country Key
     */
    public void setCountry(
        @Nullable
        final String country) {
        rememberChangedField("Country", this.country);
        this.country = country;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>County</b></p>
     * 
     * @param county
     *     County
     */
    public void setCounty(
        @Nullable
        final String county) {
        rememberChangedField("County", this.county);
        this.county = county;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>DeliveryServiceNumber</b></p>
     * 
     * @param deliveryServiceNumber
     *     Number of Delivery Service
     */
    public void setDeliveryServiceNumber(
        @Nullable
        final String deliveryServiceNumber) {
        rememberChangedField("DeliveryServiceNumber", this.deliveryServiceNumber);
        this.deliveryServiceNumber = deliveryServiceNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>DeliveryServiceTypeCode</b></p>
     * 
     * @param deliveryServiceTypeCode
     *     Type of Delivery Service
     */
    public void setDeliveryServiceTypeCode(
        @Nullable
        final String deliveryServiceTypeCode) {
        rememberChangedField("DeliveryServiceTypeCode", this.deliveryServiceTypeCode);
        this.deliveryServiceTypeCode = deliveryServiceTypeCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>District</b></p>
     * 
     * @param district
     *     District
     */
    public void setDistrict(
        @Nullable
        final String district) {
        rememberChangedField("District", this.district);
        this.district = district;
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
     * Constraints: Not nullable, Maximum length: 80 <p>Original property name from the Odata EDM: <b>FullName</b></p>
     * 
     * @param fullName
     *     Full name of a party (Bus. Partner, Org. Unit, Doc. address)
     */
    public void setFullName(
        @Nullable
        final String fullName) {
        rememberChangedField("FullName", this.fullName);
        this.fullName = fullName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>HomeCityName</b></p>
     * 
     * @param homeCityName
     *     City (different from postal city)
     */
    public void setHomeCityName(
        @Nullable
        final String homeCityName) {
        rememberChangedField("HomeCityName", this.homeCityName);
        this.homeCityName = homeCityName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>HouseNumber</b></p>
     * 
     * @param houseNumber
     *     House Number
     */
    public void setHouseNumber(
        @Nullable
        final String houseNumber) {
        rememberChangedField("HouseNumber", this.houseNumber);
        this.houseNumber = houseNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>HouseNumberSupplementText</b></p>
     * 
     * @param houseNumberSupplementText
     *     House number supplement
     */
    public void setHouseNumberSupplementText(
        @Nullable
        final String houseNumberSupplementText) {
        rememberChangedField("HouseNumberSupplementText", this.houseNumberSupplementText);
        this.houseNumberSupplementText = houseNumberSupplementText;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     Language Key
     */
    public void setLanguage(
        @Nullable
        final String language) {
        rememberChangedField("Language", this.language);
        this.language = language;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>POBox</b></p>
     * 
     * @param pOBox
     *     PO Box
     */
    public void setPOBox(
        @Nullable
        final String pOBox) {
        rememberChangedField("POBox", this.pOBox);
        this.pOBox = pOBox;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>POBoxDeviatingCityName</b></p>
     * 
     * @param pOBoxDeviatingCityName
     *     PO Box city
     */
    public void setPOBoxDeviatingCityName(
        @Nullable
        final String pOBoxDeviatingCityName) {
        rememberChangedField("POBoxDeviatingCityName", this.pOBoxDeviatingCityName);
        this.pOBoxDeviatingCityName = pOBoxDeviatingCityName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>POBoxDeviatingCountry</b></p>
     * 
     * @param pOBoxDeviatingCountry
     *     PO box country
     */
    public void setPOBoxDeviatingCountry(
        @Nullable
        final String pOBoxDeviatingCountry) {
        rememberChangedField("POBoxDeviatingCountry", this.pOBoxDeviatingCountry);
        this.pOBoxDeviatingCountry = pOBoxDeviatingCountry;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>POBoxDeviatingRegion</b></p>
     * 
     * @param pOBoxDeviatingRegion
     *     Region for PO Box (Country, State, Province, ...)
     */
    public void setPOBoxDeviatingRegion(
        @Nullable
        final String pOBoxDeviatingRegion) {
        rememberChangedField("POBoxDeviatingRegion", this.pOBoxDeviatingRegion);
        this.pOBoxDeviatingRegion = pOBoxDeviatingRegion;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>POBoxIsWithoutNumber</b></p>
     * 
     * @param pOBoxIsWithoutNumber
     *     Flag: PO Box Without Number
     */
    public void setPOBoxIsWithoutNumber(
        @Nullable
        final Boolean pOBoxIsWithoutNumber) {
        rememberChangedField("POBoxIsWithoutNumber", this.pOBoxIsWithoutNumber);
        this.pOBoxIsWithoutNumber = pOBoxIsWithoutNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>POBoxLobbyName</b></p>
     * 
     * @param pOBoxLobbyName
     *     PO Box Lobby
     */
    public void setPOBoxLobbyName(
        @Nullable
        final String pOBoxLobbyName) {
        rememberChangedField("POBoxLobbyName", this.pOBoxLobbyName);
        this.pOBoxLobbyName = pOBoxLobbyName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>POBoxPostalCode</b></p>
     * 
     * @param pOBoxPostalCode
     *     PO Box Postal Code
     */
    public void setPOBoxPostalCode(
        @Nullable
        final String pOBoxPostalCode) {
        rememberChangedField("POBoxPostalCode", this.pOBoxPostalCode);
        this.pOBoxPostalCode = pOBoxPostalCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Person</b></p>
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
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>PostalCode</b></p>
     * 
     * @param postalCode
     *     City Postal Code
     */
    public void setPostalCode(
        @Nullable
        final String postalCode) {
        rememberChangedField("PostalCode", this.postalCode);
        this.postalCode = postalCode;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PrfrdCommMediumType</b></p>
     * 
     * @param prfrdCommMediumType
     *     Communication Method (Key) (Business Address Services)
     */
    public void setPrfrdCommMediumType(
        @Nullable
        final String prfrdCommMediumType) {
        rememberChangedField("PrfrdCommMediumType", this.prfrdCommMediumType);
        this.prfrdCommMediumType = prfrdCommMediumType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>Region</b></p>
     * 
     * @param region
     *     Region (State, Province, County)
     */
    public void setRegion(
        @Nullable
        final String region) {
        rememberChangedField("Region", this.region);
        this.region = region;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>StreetName</b></p>
     * 
     * @param streetName
     *     Street
     */
    public void setStreetName(
        @Nullable
        final String streetName) {
        rememberChangedField("StreetName", this.streetName);
        this.streetName = streetName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>StreetPrefixName</b></p>
     * 
     * @param streetPrefixName
     *     Street 2
     */
    public void setStreetPrefixName(
        @Nullable
        final String streetPrefixName) {
        rememberChangedField("StreetPrefixName", this.streetPrefixName);
        this.streetPrefixName = streetPrefixName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 40 <p>Original property name from the Odata EDM: <b>StreetSuffixName</b></p>
     * 
     * @param streetSuffixName
     *     Street 4
     */
    public void setStreetSuffixName(
        @Nullable
        final String streetSuffixName) {
        rememberChangedField("StreetSuffixName", this.streetSuffixName);
        this.streetSuffixName = streetSuffixName;
    }

    /**
     * Constraints: Not nullable, Maximum length: 15 <p>Original property name from the Odata EDM: <b>TaxJurisdiction</b></p>
     * 
     * @param taxJurisdiction
     *     Tax Jurisdiction
     */
    public void setTaxJurisdiction(
        @Nullable
        final String taxJurisdiction) {
        rememberChangedField("TaxJurisdiction", this.taxJurisdiction);
        this.taxJurisdiction = taxJurisdiction;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>TransportZone</b></p>
     * 
     * @param transportZone
     *     Transportation zone to or from which the goods are delivered
     */
    public void setTransportZone(
        @Nullable
        final String transportZone) {
        rememberChangedField("TransportZone", this.transportZone);
        this.transportZone = transportZone;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPContactToAddress";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("RelationshipNumber", getRelationshipNumber());
        result.put("BusinessPartnerCompany", getBusinessPartnerCompany());
        result.put("BusinessPartnerPerson", getBusinessPartnerPerson());
        result.put("ValidityEndDate", getValidityEndDate());
        result.put("AddressID", getAddressID());
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
        values.put("AddressID", getAddressID());
        values.put("AddressNumber", getAddressNumber());
        values.put("AdditionalStreetPrefixName", getAdditionalStreetPrefixName());
        values.put("AdditionalStreetSuffixName", getAdditionalStreetSuffixName());
        values.put("AddressTimeZone", getAddressTimeZone());
        values.put("CareOfName", getCareOfName());
        values.put("CityCode", getCityCode());
        values.put("CityName", getCityName());
        values.put("CompanyPostalCode", getCompanyPostalCode());
        values.put("Country", getCountry());
        values.put("County", getCounty());
        values.put("DeliveryServiceNumber", getDeliveryServiceNumber());
        values.put("DeliveryServiceTypeCode", getDeliveryServiceTypeCode());
        values.put("District", getDistrict());
        values.put("FormOfAddress", getFormOfAddress());
        values.put("FullName", getFullName());
        values.put("HomeCityName", getHomeCityName());
        values.put("HouseNumber", getHouseNumber());
        values.put("HouseNumberSupplementText", getHouseNumberSupplementText());
        values.put("Language", getLanguage());
        values.put("POBox", getPOBox());
        values.put("POBoxDeviatingCityName", getPOBoxDeviatingCityName());
        values.put("POBoxDeviatingCountry", getPOBoxDeviatingCountry());
        values.put("POBoxDeviatingRegion", getPOBoxDeviatingRegion());
        values.put("POBoxIsWithoutNumber", getPOBoxIsWithoutNumber());
        values.put("POBoxLobbyName", getPOBoxLobbyName());
        values.put("POBoxPostalCode", getPOBoxPostalCode());
        values.put("Person", getPerson());
        values.put("PostalCode", getPostalCode());
        values.put("PrfrdCommMediumType", getPrfrdCommMediumType());
        values.put("Region", getRegion());
        values.put("StreetName", getStreetName());
        values.put("StreetPrefixName", getStreetPrefixName());
        values.put("StreetSuffixName", getStreetSuffixName());
        values.put("TaxJurisdiction", getTaxJurisdiction());
        values.put("TransportZone", getTransportZone());
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
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressID()))) {
                    setAddressID(((String) value));
                }
            }
            if (values.containsKey("AddressNumber")) {
                final Object value = values.remove("AddressNumber");
                if ((value == null)||(!value.equals(getAddressNumber()))) {
                    setAddressNumber(((String) value));
                }
            }
            if (values.containsKey("AdditionalStreetPrefixName")) {
                final Object value = values.remove("AdditionalStreetPrefixName");
                if ((value == null)||(!value.equals(getAdditionalStreetPrefixName()))) {
                    setAdditionalStreetPrefixName(((String) value));
                }
            }
            if (values.containsKey("AdditionalStreetSuffixName")) {
                final Object value = values.remove("AdditionalStreetSuffixName");
                if ((value == null)||(!value.equals(getAdditionalStreetSuffixName()))) {
                    setAdditionalStreetSuffixName(((String) value));
                }
            }
            if (values.containsKey("AddressTimeZone")) {
                final Object value = values.remove("AddressTimeZone");
                if ((value == null)||(!value.equals(getAddressTimeZone()))) {
                    setAddressTimeZone(((String) value));
                }
            }
            if (values.containsKey("CareOfName")) {
                final Object value = values.remove("CareOfName");
                if ((value == null)||(!value.equals(getCareOfName()))) {
                    setCareOfName(((String) value));
                }
            }
            if (values.containsKey("CityCode")) {
                final Object value = values.remove("CityCode");
                if ((value == null)||(!value.equals(getCityCode()))) {
                    setCityCode(((String) value));
                }
            }
            if (values.containsKey("CityName")) {
                final Object value = values.remove("CityName");
                if ((value == null)||(!value.equals(getCityName()))) {
                    setCityName(((String) value));
                }
            }
            if (values.containsKey("CompanyPostalCode")) {
                final Object value = values.remove("CompanyPostalCode");
                if ((value == null)||(!value.equals(getCompanyPostalCode()))) {
                    setCompanyPostalCode(((String) value));
                }
            }
            if (values.containsKey("Country")) {
                final Object value = values.remove("Country");
                if ((value == null)||(!value.equals(getCountry()))) {
                    setCountry(((String) value));
                }
            }
            if (values.containsKey("County")) {
                final Object value = values.remove("County");
                if ((value == null)||(!value.equals(getCounty()))) {
                    setCounty(((String) value));
                }
            }
            if (values.containsKey("DeliveryServiceNumber")) {
                final Object value = values.remove("DeliveryServiceNumber");
                if ((value == null)||(!value.equals(getDeliveryServiceNumber()))) {
                    setDeliveryServiceNumber(((String) value));
                }
            }
            if (values.containsKey("DeliveryServiceTypeCode")) {
                final Object value = values.remove("DeliveryServiceTypeCode");
                if ((value == null)||(!value.equals(getDeliveryServiceTypeCode()))) {
                    setDeliveryServiceTypeCode(((String) value));
                }
            }
            if (values.containsKey("District")) {
                final Object value = values.remove("District");
                if ((value == null)||(!value.equals(getDistrict()))) {
                    setDistrict(((String) value));
                }
            }
            if (values.containsKey("FormOfAddress")) {
                final Object value = values.remove("FormOfAddress");
                if ((value == null)||(!value.equals(getFormOfAddress()))) {
                    setFormOfAddress(((String) value));
                }
            }
            if (values.containsKey("FullName")) {
                final Object value = values.remove("FullName");
                if ((value == null)||(!value.equals(getFullName()))) {
                    setFullName(((String) value));
                }
            }
            if (values.containsKey("HomeCityName")) {
                final Object value = values.remove("HomeCityName");
                if ((value == null)||(!value.equals(getHomeCityName()))) {
                    setHomeCityName(((String) value));
                }
            }
            if (values.containsKey("HouseNumber")) {
                final Object value = values.remove("HouseNumber");
                if ((value == null)||(!value.equals(getHouseNumber()))) {
                    setHouseNumber(((String) value));
                }
            }
            if (values.containsKey("HouseNumberSupplementText")) {
                final Object value = values.remove("HouseNumberSupplementText");
                if ((value == null)||(!value.equals(getHouseNumberSupplementText()))) {
                    setHouseNumberSupplementText(((String) value));
                }
            }
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("POBox")) {
                final Object value = values.remove("POBox");
                if ((value == null)||(!value.equals(getPOBox()))) {
                    setPOBox(((String) value));
                }
            }
            if (values.containsKey("POBoxDeviatingCityName")) {
                final Object value = values.remove("POBoxDeviatingCityName");
                if ((value == null)||(!value.equals(getPOBoxDeviatingCityName()))) {
                    setPOBoxDeviatingCityName(((String) value));
                }
            }
            if (values.containsKey("POBoxDeviatingCountry")) {
                final Object value = values.remove("POBoxDeviatingCountry");
                if ((value == null)||(!value.equals(getPOBoxDeviatingCountry()))) {
                    setPOBoxDeviatingCountry(((String) value));
                }
            }
            if (values.containsKey("POBoxDeviatingRegion")) {
                final Object value = values.remove("POBoxDeviatingRegion");
                if ((value == null)||(!value.equals(getPOBoxDeviatingRegion()))) {
                    setPOBoxDeviatingRegion(((String) value));
                }
            }
            if (values.containsKey("POBoxIsWithoutNumber")) {
                final Object value = values.remove("POBoxIsWithoutNumber");
                if ((value == null)||(!value.equals(getPOBoxIsWithoutNumber()))) {
                    setPOBoxIsWithoutNumber(((Boolean) value));
                }
            }
            if (values.containsKey("POBoxLobbyName")) {
                final Object value = values.remove("POBoxLobbyName");
                if ((value == null)||(!value.equals(getPOBoxLobbyName()))) {
                    setPOBoxLobbyName(((String) value));
                }
            }
            if (values.containsKey("POBoxPostalCode")) {
                final Object value = values.remove("POBoxPostalCode");
                if ((value == null)||(!value.equals(getPOBoxPostalCode()))) {
                    setPOBoxPostalCode(((String) value));
                }
            }
            if (values.containsKey("Person")) {
                final Object value = values.remove("Person");
                if ((value == null)||(!value.equals(getPerson()))) {
                    setPerson(((String) value));
                }
            }
            if (values.containsKey("PostalCode")) {
                final Object value = values.remove("PostalCode");
                if ((value == null)||(!value.equals(getPostalCode()))) {
                    setPostalCode(((String) value));
                }
            }
            if (values.containsKey("PrfrdCommMediumType")) {
                final Object value = values.remove("PrfrdCommMediumType");
                if ((value == null)||(!value.equals(getPrfrdCommMediumType()))) {
                    setPrfrdCommMediumType(((String) value));
                }
            }
            if (values.containsKey("Region")) {
                final Object value = values.remove("Region");
                if ((value == null)||(!value.equals(getRegion()))) {
                    setRegion(((String) value));
                }
            }
            if (values.containsKey("StreetName")) {
                final Object value = values.remove("StreetName");
                if ((value == null)||(!value.equals(getStreetName()))) {
                    setStreetName(((String) value));
                }
            }
            if (values.containsKey("StreetPrefixName")) {
                final Object value = values.remove("StreetPrefixName");
                if ((value == null)||(!value.equals(getStreetPrefixName()))) {
                    setStreetPrefixName(((String) value));
                }
            }
            if (values.containsKey("StreetSuffixName")) {
                final Object value = values.remove("StreetSuffixName");
                if ((value == null)||(!value.equals(getStreetSuffixName()))) {
                    setStreetSuffixName(((String) value));
                }
            }
            if (values.containsKey("TaxJurisdiction")) {
                final Object value = values.remove("TaxJurisdiction");
                if ((value == null)||(!value.equals(getTaxJurisdiction()))) {
                    setTaxJurisdiction(((String) value));
                }
            }
            if (values.containsKey("TransportZone")) {
                final Object value = values.remove("TransportZone");
                if ((value == null)||(!value.equals(getTransportZone()))) {
                    setTransportZone(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
            if ((values).containsKey("to_EmailAddress")) {
                final Object value = (values).remove("to_EmailAddress");
                if (value instanceof Iterable) {
                    if (toEmailAddress == null) {
                        toEmailAddress = Lists.newArrayList();
                    } else {
                        toEmailAddress = Lists.newArrayList(toEmailAddress);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AddressEmailAddress entity;
                        if (toEmailAddress.size()>i) {
                            entity = toEmailAddress.get(i);
                        } else {
                            entity = new AddressEmailAddress();
                            toEmailAddress.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_FaxNumber")) {
                final Object value = (values).remove("to_FaxNumber");
                if (value instanceof Iterable) {
                    if (toFaxNumber == null) {
                        toFaxNumber = Lists.newArrayList();
                    } else {
                        toFaxNumber = Lists.newArrayList(toFaxNumber);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AddressFaxNumber entity;
                        if (toFaxNumber.size()>i) {
                            entity = toFaxNumber.get(i);
                        } else {
                            entity = new AddressFaxNumber();
                            toFaxNumber.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_MobilePhoneNumber")) {
                final Object value = (values).remove("to_MobilePhoneNumber");
                if (value instanceof Iterable) {
                    if (toMobilePhoneNumber == null) {
                        toMobilePhoneNumber = Lists.newArrayList();
                    } else {
                        toMobilePhoneNumber = Lists.newArrayList(toMobilePhoneNumber);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AddressPhoneNumber entity;
                        if (toMobilePhoneNumber.size()>i) {
                            entity = toMobilePhoneNumber.get(i);
                        } else {
                            entity = new AddressPhoneNumber();
                            toMobilePhoneNumber.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_PhoneNumber")) {
                final Object value = (values).remove("to_PhoneNumber");
                if (value instanceof Iterable) {
                    if (toPhoneNumber == null) {
                        toPhoneNumber = Lists.newArrayList();
                    } else {
                        toPhoneNumber = Lists.newArrayList(toPhoneNumber);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AddressPhoneNumber entity;
                        if (toPhoneNumber.size()>i) {
                            entity = toPhoneNumber.get(i);
                        } else {
                            entity = new AddressPhoneNumber();
                            toPhoneNumber.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_URLAddress")) {
                final Object value = (values).remove("to_URLAddress");
                if (value instanceof Iterable) {
                    if (toURLAddress == null) {
                        toURLAddress = Lists.newArrayList();
                    } else {
                        toURLAddress = Lists.newArrayList(toURLAddress);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        AddressHomePageURL entity;
                        if (toURLAddress.size()>i) {
                            entity = toURLAddress.get(i);
                        } else {
                            entity = new AddressHomePageURL();
                            toURLAddress.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
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
    public static<T >BPContactToAddressField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BPContactToAddressField<T>(fieldName);
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
    public static<T,DomainT >BPContactToAddressField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BPContactToAddressField<T>(fieldName, typeConverter);
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
        if (toEmailAddress!= null) {
            (values).put("to_EmailAddress", toEmailAddress);
        }
        if (toFaxNumber!= null) {
            (values).put("to_FaxNumber", toFaxNumber);
        }
        if (toMobilePhoneNumber!= null) {
            (values).put("to_MobilePhoneNumber", toMobilePhoneNumber);
        }
        if (toPhoneNumber!= null) {
            (values).put("to_PhoneNumber", toPhoneNumber);
        }
        if (toURLAddress!= null) {
            (values).put("to_URLAddress", toURLAddress);
        }
        return values;
    }

    /**
     * Fetches the <b>AddressEmailAddress</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_EmailAddress</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AddressEmailAddress</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressEmailAddress> fetchEmailAddress()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AddressEmailAddress.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("RelationshipNumber=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(relationshipNumber));
        odataResourceUrl.append(",BusinessPartnerCompany=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerCompany));
        odataResourceUrl.append(",BusinessPartnerPerson=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerPerson));
        odataResourceUrl.append(",ValidityEndDate=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.DateTime).toUri(validityEndDate));
        odataResourceUrl.append(",AddressID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(addressID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_EmailAddress");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AddressEmailAddress> entityList = result.asList(AddressEmailAddress.class);
        for (AddressEmailAddress entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AddressEmailAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_EmailAddress</b>.
     * <p>
     * If the navigation property <b>to_EmailAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AddressEmailAddress</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressEmailAddress> getEmailAddressOrFetch()
        throws ODataException
    {
        if (toEmailAddress == null) {
            toEmailAddress = fetchEmailAddress();
        }
        return toEmailAddress;
    }

    /**
     * Retrieval of associated <b>AddressEmailAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_EmailAddress</b>.
     * <p>
     * If the navigation property for an entity <b>BPContactToAddress</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_EmailAddress</b> is already loaded, the result will contain the <b>AddressEmailAddress</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AddressEmailAddress>> getEmailAddressIfPresent() {
        return Optional.ofNullable(toEmailAddress);
    }

    /**
     * Overwrites the list of associated <b>AddressEmailAddress</b> entities for the loaded navigation property <b>to_EmailAddress</b>.
     * <p>
     * If the navigation property <b>to_EmailAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AddressEmailAddress</b> entities.
     */
    public void setEmailAddress(
        @Nonnull
        final List<AddressEmailAddress> value) {
        if (toEmailAddress == null) {
            toEmailAddress = Lists.newArrayList();
        }
        toEmailAddress.clear();
        toEmailAddress.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AddressEmailAddress</b> entities. This corresponds to the OData navigation property <b>to_EmailAddress</b>.
     * <p>
     * If the navigation property <b>to_EmailAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AddressEmailAddress</b> entities.
     */
    public void addEmailAddress(AddressEmailAddress... entity) {
        if (toEmailAddress == null) {
            toEmailAddress = Lists.newArrayList();
        }
        toEmailAddress.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>AddressFaxNumber</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_FaxNumber</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AddressFaxNumber</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressFaxNumber> fetchFaxNumber()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AddressFaxNumber.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("RelationshipNumber=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(relationshipNumber));
        odataResourceUrl.append(",BusinessPartnerCompany=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerCompany));
        odataResourceUrl.append(",BusinessPartnerPerson=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerPerson));
        odataResourceUrl.append(",ValidityEndDate=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.DateTime).toUri(validityEndDate));
        odataResourceUrl.append(",AddressID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(addressID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_FaxNumber");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AddressFaxNumber> entityList = result.asList(AddressFaxNumber.class);
        for (AddressFaxNumber entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AddressFaxNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_FaxNumber</b>.
     * <p>
     * If the navigation property <b>to_FaxNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AddressFaxNumber</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressFaxNumber> getFaxNumberOrFetch()
        throws ODataException
    {
        if (toFaxNumber == null) {
            toFaxNumber = fetchFaxNumber();
        }
        return toFaxNumber;
    }

    /**
     * Retrieval of associated <b>AddressFaxNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_FaxNumber</b>.
     * <p>
     * If the navigation property for an entity <b>BPContactToAddress</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_FaxNumber</b> is already loaded, the result will contain the <b>AddressFaxNumber</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AddressFaxNumber>> getFaxNumberIfPresent() {
        return Optional.ofNullable(toFaxNumber);
    }

    /**
     * Overwrites the list of associated <b>AddressFaxNumber</b> entities for the loaded navigation property <b>to_FaxNumber</b>.
     * <p>
     * If the navigation property <b>to_FaxNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AddressFaxNumber</b> entities.
     */
    public void setFaxNumber(
        @Nonnull
        final List<AddressFaxNumber> value) {
        if (toFaxNumber == null) {
            toFaxNumber = Lists.newArrayList();
        }
        toFaxNumber.clear();
        toFaxNumber.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AddressFaxNumber</b> entities. This corresponds to the OData navigation property <b>to_FaxNumber</b>.
     * <p>
     * If the navigation property <b>to_FaxNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AddressFaxNumber</b> entities.
     */
    public void addFaxNumber(AddressFaxNumber... entity) {
        if (toFaxNumber == null) {
            toFaxNumber = Lists.newArrayList();
        }
        toFaxNumber.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>AddressPhoneNumber</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_MobilePhoneNumber</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AddressPhoneNumber</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressPhoneNumber> fetchMobilePhoneNumber()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AddressPhoneNumber.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("RelationshipNumber=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(relationshipNumber));
        odataResourceUrl.append(",BusinessPartnerCompany=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerCompany));
        odataResourceUrl.append(",BusinessPartnerPerson=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerPerson));
        odataResourceUrl.append(",ValidityEndDate=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.DateTime).toUri(validityEndDate));
        odataResourceUrl.append(",AddressID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(addressID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_MobilePhoneNumber");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AddressPhoneNumber> entityList = result.asList(AddressPhoneNumber.class);
        for (AddressPhoneNumber entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AddressPhoneNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_MobilePhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_MobilePhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AddressPhoneNumber</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressPhoneNumber> getMobilePhoneNumberOrFetch()
        throws ODataException
    {
        if (toMobilePhoneNumber == null) {
            toMobilePhoneNumber = fetchMobilePhoneNumber();
        }
        return toMobilePhoneNumber;
    }

    /**
     * Retrieval of associated <b>AddressPhoneNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_MobilePhoneNumber</b>.
     * <p>
     * If the navigation property for an entity <b>BPContactToAddress</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_MobilePhoneNumber</b> is already loaded, the result will contain the <b>AddressPhoneNumber</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AddressPhoneNumber>> getMobilePhoneNumberIfPresent() {
        return Optional.ofNullable(toMobilePhoneNumber);
    }

    /**
     * Overwrites the list of associated <b>AddressPhoneNumber</b> entities for the loaded navigation property <b>to_MobilePhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_MobilePhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AddressPhoneNumber</b> entities.
     */
    public void setMobilePhoneNumber(
        @Nonnull
        final List<AddressPhoneNumber> value) {
        if (toMobilePhoneNumber == null) {
            toMobilePhoneNumber = Lists.newArrayList();
        }
        toMobilePhoneNumber.clear();
        toMobilePhoneNumber.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AddressPhoneNumber</b> entities. This corresponds to the OData navigation property <b>to_MobilePhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_MobilePhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AddressPhoneNumber</b> entities.
     */
    public void addMobilePhoneNumber(AddressPhoneNumber... entity) {
        if (toMobilePhoneNumber == null) {
            toMobilePhoneNumber = Lists.newArrayList();
        }
        toMobilePhoneNumber.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>AddressPhoneNumber</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_PhoneNumber</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AddressPhoneNumber</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressPhoneNumber> fetchPhoneNumber()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AddressPhoneNumber.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("RelationshipNumber=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(relationshipNumber));
        odataResourceUrl.append(",BusinessPartnerCompany=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerCompany));
        odataResourceUrl.append(",BusinessPartnerPerson=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerPerson));
        odataResourceUrl.append(",ValidityEndDate=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.DateTime).toUri(validityEndDate));
        odataResourceUrl.append(",AddressID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(addressID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_PhoneNumber");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AddressPhoneNumber> entityList = result.asList(AddressPhoneNumber.class);
        for (AddressPhoneNumber entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AddressPhoneNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_PhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_PhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AddressPhoneNumber</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressPhoneNumber> getPhoneNumberOrFetch()
        throws ODataException
    {
        if (toPhoneNumber == null) {
            toPhoneNumber = fetchPhoneNumber();
        }
        return toPhoneNumber;
    }

    /**
     * Retrieval of associated <b>AddressPhoneNumber</b> entities (one to many). This corresponds to the OData navigation property <b>to_PhoneNumber</b>.
     * <p>
     * If the navigation property for an entity <b>BPContactToAddress</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_PhoneNumber</b> is already loaded, the result will contain the <b>AddressPhoneNumber</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AddressPhoneNumber>> getPhoneNumberIfPresent() {
        return Optional.ofNullable(toPhoneNumber);
    }

    /**
     * Overwrites the list of associated <b>AddressPhoneNumber</b> entities for the loaded navigation property <b>to_PhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_PhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AddressPhoneNumber</b> entities.
     */
    public void setPhoneNumber(
        @Nonnull
        final List<AddressPhoneNumber> value) {
        if (toPhoneNumber == null) {
            toPhoneNumber = Lists.newArrayList();
        }
        toPhoneNumber.clear();
        toPhoneNumber.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AddressPhoneNumber</b> entities. This corresponds to the OData navigation property <b>to_PhoneNumber</b>.
     * <p>
     * If the navigation property <b>to_PhoneNumber</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AddressPhoneNumber</b> entities.
     */
    public void addPhoneNumber(AddressPhoneNumber... entity) {
        if (toPhoneNumber == null) {
            toPhoneNumber = Lists.newArrayList();
        }
        toPhoneNumber.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>AddressHomePageURL</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_URLAddress</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>AddressHomePageURL</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressHomePageURL> fetchURLAddress()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type AddressHomePageURL.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
        }
        final StringBuilder odataResourceUrl = new StringBuilder(getEntityCollection());
        odataResourceUrl.append("(");
        odataResourceUrl.append("RelationshipNumber=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(relationshipNumber));
        odataResourceUrl.append(",BusinessPartnerCompany=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerCompany));
        odataResourceUrl.append(",BusinessPartnerPerson=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(businessPartnerPerson));
        odataResourceUrl.append(",ValidityEndDate=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.DateTime).toUri(validityEndDate));
        odataResourceUrl.append(",AddressID=");
        odataResourceUrl.append(ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(addressID));
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_URLAddress");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<AddressHomePageURL> entityList = result.asList(AddressHomePageURL.class);
        for (AddressHomePageURL entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>AddressHomePageURL</b> entities (one to many). This corresponds to the OData navigation property <b>to_URLAddress</b>.
     * <p>
     * If the navigation property <b>to_URLAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>AddressHomePageURL</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<AddressHomePageURL> getURLAddressOrFetch()
        throws ODataException
    {
        if (toURLAddress == null) {
            toURLAddress = fetchURLAddress();
        }
        return toURLAddress;
    }

    /**
     * Retrieval of associated <b>AddressHomePageURL</b> entities (one to many). This corresponds to the OData navigation property <b>to_URLAddress</b>.
     * <p>
     * If the navigation property for an entity <b>BPContactToAddress</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_URLAddress</b> is already loaded, the result will contain the <b>AddressHomePageURL</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<AddressHomePageURL>> getURLAddressIfPresent() {
        return Optional.ofNullable(toURLAddress);
    }

    /**
     * Overwrites the list of associated <b>AddressHomePageURL</b> entities for the loaded navigation property <b>to_URLAddress</b>.
     * <p>
     * If the navigation property <b>to_URLAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>AddressHomePageURL</b> entities.
     */
    public void setURLAddress(
        @Nonnull
        final List<AddressHomePageURL> value) {
        if (toURLAddress == null) {
            toURLAddress = Lists.newArrayList();
        }
        toURLAddress.clear();
        toURLAddress.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>AddressHomePageURL</b> entities. This corresponds to the OData navigation property <b>to_URLAddress</b>.
     * <p>
     * If the navigation property <b>to_URLAddress</b> of a queried <b>BPContactToAddress</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>AddressHomePageURL</b> entities.
     */
    public void addURLAddress(AddressHomePageURL... entity) {
        if (toURLAddress == null) {
            toURLAddress = Lists.newArrayList();
        }
        toURLAddress.addAll(Lists.newArrayList(entity));
    }

    public final static class BPContactToAddressBuilder {

        private List<AddressEmailAddress> toEmailAddress = Lists.newArrayList();
        private List<AddressFaxNumber> toFaxNumber = Lists.newArrayList();
        private List<AddressPhoneNumber> toMobilePhoneNumber = Lists.newArrayList();
        private List<AddressPhoneNumber> toPhoneNumber = Lists.newArrayList();
        private List<AddressHomePageURL> toURLAddress = Lists.newArrayList();

        private BPContactToAddress.BPContactToAddressBuilder toEmailAddress(List<AddressEmailAddress> value) {
            toEmailAddress.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_EmailAddress</b> for <b>BPContactToAddress</b> to multiple <b>AddressEmailAddress</b>.
         * 
         */
        @Nonnull
        public BPContactToAddress.BPContactToAddressBuilder emailAddress(AddressEmailAddress... value) {
            return toEmailAddress(Lists.newArrayList(value));
        }

        private BPContactToAddress.BPContactToAddressBuilder toFaxNumber(List<AddressFaxNumber> value) {
            toFaxNumber.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_FaxNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressFaxNumber</b>.
         * 
         */
        @Nonnull
        public BPContactToAddress.BPContactToAddressBuilder faxNumber(AddressFaxNumber... value) {
            return toFaxNumber(Lists.newArrayList(value));
        }

        private BPContactToAddress.BPContactToAddressBuilder toMobilePhoneNumber(List<AddressPhoneNumber> value) {
            toMobilePhoneNumber.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_MobilePhoneNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressPhoneNumber</b>.
         * 
         */
        @Nonnull
        public BPContactToAddress.BPContactToAddressBuilder mobilePhoneNumber(AddressPhoneNumber... value) {
            return toMobilePhoneNumber(Lists.newArrayList(value));
        }

        private BPContactToAddress.BPContactToAddressBuilder toPhoneNumber(List<AddressPhoneNumber> value) {
            toPhoneNumber.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_PhoneNumber</b> for <b>BPContactToAddress</b> to multiple <b>AddressPhoneNumber</b>.
         * 
         */
        @Nonnull
        public BPContactToAddress.BPContactToAddressBuilder phoneNumber(AddressPhoneNumber... value) {
            return toPhoneNumber(Lists.newArrayList(value));
        }

        private BPContactToAddress.BPContactToAddressBuilder toURLAddress(List<AddressHomePageURL> value) {
            toURLAddress.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_URLAddress</b> for <b>BPContactToAddress</b> to multiple <b>AddressHomePageURL</b>.
         * 
         */
        @Nonnull
        public BPContactToAddress.BPContactToAddressBuilder urlAddress(AddressHomePageURL... value) {
            return toURLAddress(Lists.newArrayList(value));
        }

    }

}
