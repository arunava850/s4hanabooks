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
import vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerContactField;
import vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerContactLink;
import vdm.namespaces.odataserviceforbusinesspartner.link.BusinessPartnerContactOneToOneLink;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerContactSelectable;


/**
 * Business Partner Contact<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerContactType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerContact
    extends VdmEntity<BusinessPartnerContact>
{

    /**
     * Selector for all available fields of BusinessPartnerContact.
     * 
     */
    public final static BusinessPartnerContactSelectable ALL_FIELDS = new BusinessPartnerContactSelectable() {


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
    public final static BusinessPartnerContactField<String> RELATIONSHIP_NUMBER = new BusinessPartnerContactField<String>("RelationshipNumber");
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
    public final static BusinessPartnerContactField<String> BUSINESS_PARTNER_COMPANY = new BusinessPartnerContactField<String>("BusinessPartnerCompany");
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
    public final static BusinessPartnerContactField<String> BUSINESS_PARTNER_PERSON = new BusinessPartnerContactField<String>("BusinessPartnerPerson");
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
    public final static BusinessPartnerContactField<LocalDateTime> VALIDITY_END_DATE = new BusinessPartnerContactField<LocalDateTime>("ValidityEndDate");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     
     * @return
     *     Validity Date (Valid From)
     */
    @SerializedName("ValidityStartDate")
    @JsonProperty("ValidityStartDate")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ValidityStartDate", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime validityStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ValidityStartDate</b> field to query operations.
     * 
     */
    public final static BusinessPartnerContactField<LocalDateTime> VALIDITY_START_DATE = new BusinessPartnerContactField<LocalDateTime>("ValidityStartDate");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsStandardRelationship</b></p>
     * 
     * @param isStandardRelationship
     *     
     * @return
     *     Standard Relationship
     */
    @SerializedName("IsStandardRelationship")
    @JsonProperty("IsStandardRelationship")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "IsStandardRelationship")
    private Boolean isStandardRelationship;
    /**
     * Use with available fluent helpers to apply the <b>IsStandardRelationship</b> field to query operations.
     * 
     */
    public final static BusinessPartnerContactField<Boolean> IS_STANDARD_RELATIONSHIP = new BusinessPartnerContactField<Boolean>("IsStandardRelationship");
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
    public final static BusinessPartnerContactField<String> RELATIONSHIP_CATEGORY = new BusinessPartnerContactField<String>("RelationshipCategory");
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
     * Navigation property <b>to_ContactAddress</b> for <b>BusinessPartnerContact</b> to multiple <b>BPContactToAddress</b>.
     * 
     */
    @SerializedName("to_ContactAddress")
    @JsonProperty("to_ContactAddress")
    @ODataField(odataName = "to_ContactAddress")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<BPContactToAddress> toContactAddress;
    /**
     * Navigation property <b>to_ContactRelationship</b> for <b>BusinessPartnerContact</b> to single <b>BPContactToFuncAndDept</b>.
     * 
     */
    @SerializedName("to_ContactRelationship")
    @JsonProperty("to_ContactRelationship")
    @ODataField(odataName = "to_ContactRelationship")
    @Nullable
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private BPContactToFuncAndDept toContactRelationship;
    /**
     * Use with available fluent helpers to apply the <b>to_ContactAddress</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerContactLink<BPContactToAddress> TO_CONTACT_ADDRESS = new BusinessPartnerContactLink<BPContactToAddress>("to_ContactAddress");
    /**
     * Use with available fluent helpers to apply the <b>to_ContactRelationship</b> navigation property to query operations.
     * 
     */
    public final static BusinessPartnerContactOneToOneLink<BPContactToFuncAndDept> TO_CONTACT_RELATIONSHIP = new BusinessPartnerContactOneToOneLink<BPContactToFuncAndDept>("to_ContactRelationship");

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<BusinessPartnerContact> getType() {
        return BusinessPartnerContact.class;
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
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidityStartDate</b></p>
     * 
     * @param validityStartDate
     *     Validity Date (Valid From)
     */
    public void setValidityStartDate(
        @Nullable
        final LocalDateTime validityStartDate) {
        rememberChangedField("ValidityStartDate", this.validityStartDate);
        this.validityStartDate = validityStartDate;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>IsStandardRelationship</b></p>
     * 
     * @param isStandardRelationship
     *     Standard Relationship
     */
    public void setIsStandardRelationship(
        @Nullable
        final Boolean isStandardRelationship) {
        rememberChangedField("IsStandardRelationship", this.isStandardRelationship);
        this.isStandardRelationship = isStandardRelationship;
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
        return "A_BusinessPartnerContact";
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
        values.put("ValidityStartDate", getValidityStartDate());
        values.put("IsStandardRelationship", getIsStandardRelationship());
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
            if (values.containsKey("ValidityStartDate")) {
                final Object value = values.remove("ValidityStartDate");
                if ((value == null)||(!value.equals(getValidityStartDate()))) {
                    setValidityStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("IsStandardRelationship")) {
                final Object value = values.remove("IsStandardRelationship");
                if ((value == null)||(!value.equals(getIsStandardRelationship()))) {
                    setIsStandardRelationship(((Boolean) value));
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
            if ((values).containsKey("to_ContactAddress")) {
                final Object value = (values).remove("to_ContactAddress");
                if (value instanceof Iterable) {
                    if (toContactAddress == null) {
                        toContactAddress = Lists.newArrayList();
                    } else {
                        toContactAddress = Lists.newArrayList(toContactAddress);
                    }
                    int i = 0;
                    for (Object item: ((Iterable<?> ) value)) {
                        if (!(item instanceof Map)) {
                            continue;
                        }
                        BPContactToAddress entity;
                        if (toContactAddress.size()>i) {
                            entity = toContactAddress.get(i);
                        } else {
                            entity = new BPContactToAddress();
                            toContactAddress.add(entity);
                        }
                        i = (i + 1);
                        @SuppressWarnings("unchecked")
                        final Map<String, Object> inputMap = ((Map<String, Object> ) item);
                        entity.fromMap(inputMap);
                    }
                }
            }
            if ((values).containsKey("to_ContactRelationship")) {
                final Object value = (values).remove("to_ContactRelationship");
                if (value instanceof Map) {
                    if (toContactRelationship == null) {
                        toContactRelationship = new BPContactToFuncAndDept();
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    toContactRelationship.fromMap(inputMap);
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
    public static<T >BusinessPartnerContactField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerContactField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerContactField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerContactField<T>(fieldName, typeConverter);
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
        if (toContactAddress!= null) {
            (values).put("to_ContactAddress", toContactAddress);
        }
        if (toContactRelationship!= null) {
            (values).put("to_ContactRelationship", toContactRelationship);
        }
        return values;
    }

    /**
     * Fetches the <b>BPContactToAddress</b> entities (one to many) associated with this entity. This corresponds to the OData navigation property <b>to_ContactAddress</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     List containing one or more associated <b>BPContactToAddress</b> entities. If no entities are associated then an empty list is returned. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BPContactToAddress> fetchContactAddress()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BPContactToAddress.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
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
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_ContactAddress");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final List<BPContactToAddress> entityList = result.asList(BPContactToAddress.class);
        for (BPContactToAddress entity: entityList) {
            entity.setErpConfigContext(erpConfigContext);
            entity.setServicePathForFetch(getServicePathForFetch());
        }
        return entityList;
    }

    /**
     * Retrieval of associated <b>BPContactToAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_ContactAddress</b>.
     * <p>
     * If the navigation property <b>to_ContactAddress</b> of a queried <b>BusinessPartnerContact</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BPContactToAddress</b> entities.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nonnull
    public List<BPContactToAddress> getContactAddressOrFetch()
        throws ODataException
    {
        if (toContactAddress == null) {
            toContactAddress = fetchContactAddress();
        }
        return toContactAddress;
    }

    /**
     * Retrieval of associated <b>BPContactToAddress</b> entities (one to many). This corresponds to the OData navigation property <b>to_ContactAddress</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartnerContact</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_ContactAddress</b> is already loaded, the result will contain the <b>BPContactToAddress</b> entities. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<List<BPContactToAddress>> getContactAddressIfPresent() {
        return Optional.ofNullable(toContactAddress);
    }

    /**
     * Overwrites the list of associated <b>BPContactToAddress</b> entities for the loaded navigation property <b>to_ContactAddress</b>.
     * <p>
     * If the navigation property <b>to_ContactAddress</b> of a queried <b>BusinessPartnerContact</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param value
     *     List of <b>BPContactToAddress</b> entities.
     */
    public void setContactAddress(
        @Nonnull
        final List<BPContactToAddress> value) {
        if (toContactAddress == null) {
            toContactAddress = Lists.newArrayList();
        }
        toContactAddress.clear();
        toContactAddress.addAll(value);
    }

    /**
     * Adds elements to the list of associated <b>BPContactToAddress</b> entities. This corresponds to the OData navigation property <b>to_ContactAddress</b>.
     * <p>
     * If the navigation property <b>to_ContactAddress</b> of a queried <b>BusinessPartnerContact</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @param entity
     *     Array of <b>BPContactToAddress</b> entities.
     */
    public void addContactAddress(BPContactToAddress... entity) {
        if (toContactAddress == null) {
            toContactAddress = Lists.newArrayList();
        }
        toContactAddress.addAll(Lists.newArrayList(entity));
    }

    /**
     * Fetches the <b>BPContactToFuncAndDept</b> entity (one to one) associated with this entity. This corresponds to the OData navigation property <b>to_ContactRelationship</b>.
     * <p>
     * Please note: This method will not cache or persist the query results.
     * 
     * @return
     *     The single associated <b>BPContactToFuncAndDept</b> entity, or {@code null} if an entity is not associated. 
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public BPContactToFuncAndDept fetchContactRelationship()
        throws ODataException
    {
        if (erpConfigContext == null) {
            throw new ODataException(ODataExceptionType.OTHER, "Failed to fetch related objects of type BPContactToFuncAndDept.", new IllegalStateException("Unable to execute OData query. The entity was created locally without an assigned ERP configuration context. This method is applicable only on entities which were retrieved or created using the OData VDM."));
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
        odataResourceUrl.append(")/");
        odataResourceUrl.append("to_ContactRelationship");
        final ODataQueryBuilder builder = ODataQueryBuilder.withEntity(getServicePathForFetch(), odataResourceUrl.toString()).withoutMetadata();
        final ODataQuery query = builder.build();
        final ODataQueryResult result = query.execute(erpConfigContext);
        final BPContactToFuncAndDept entity = result.as(BPContactToFuncAndDept.class);
        entity.setErpConfigContext(erpConfigContext);
        entity.setServicePathForFetch(getServicePathForFetch());
        return entity;
    }

    /**
     * Retrieval of associated <b>BPContactToFuncAndDept</b> entity (one to one). This corresponds to the OData navigation property <b>to_ContactRelationship</b>.
     * <p>
     * If the navigation property <b>to_ContactRelationship</b> of a queried <b>BusinessPartnerContact</b> is operated lazily, an <b>ODataException</b> can be thrown in case of an OData query error.
     * <p>
     * Please note: <i>Lazy</i> loading of OData entity associations is the process of asynchronous retrieval and persisting of items from a navigation property. If a <i>lazy</i> property is requested by the application for the first time and it has not yet been loaded, an OData query will be run in order to load the missing information and its result will get cached for future invocations.
     * 
     * @return
     *     List of associated <b>BPContactToFuncAndDept</b> entity.
     * @throws ODataException
     *     If the entity is unmanaged, i.e. it has not been retrieved using the OData VDM's services and therefore has no ERP configuration context assigned. An entity is managed if it has been either retrieved using the VDM's services or returned from the VDM's services as the result of a CREATE or UPDATE call. 
     */
    @Nullable
    public BPContactToFuncAndDept getContactRelationshipOrFetch()
        throws ODataException
    {
        if (toContactRelationship == null) {
            toContactRelationship = fetchContactRelationship();
        }
        return toContactRelationship;
    }

    /**
     * Retrieval of associated <b>BPContactToFuncAndDept</b> entity (one to one). This corresponds to the OData navigation property <b>to_ContactRelationship</b>.
     * <p>
     * If the navigation property for an entity <b>BusinessPartnerContact</b> has not been resolved yet, this method will <b>not query</b> further information. Instead its <code>Optional</code> result state will be <code>empty</code>.
     * 
     * @return
     *     If the information for navigation property <b>to_ContactRelationship</b> is already loaded, the result will contain the <b>BPContactToFuncAndDept</b> entity. If not, an <code>Optional</code> with result state <code>empty</code> is returned.
     */
    @Nonnull
    public Optional<BPContactToFuncAndDept> getContactRelationshipIfPresent() {
        return Optional.ofNullable(toContactRelationship);
    }

    /**
     * Overwrites the associated <b>BPContactToFuncAndDept</b> entity for the loaded navigation property <b>to_ContactRelationship</b>.
     * 
     * @param value
     *     New <b>BPContactToFuncAndDept</b> entity.
     */
    public void setContactRelationship(final BPContactToFuncAndDept value) {
        toContactRelationship = value;
    }

    public final static class BusinessPartnerContactBuilder {

        private List<BPContactToAddress> toContactAddress = Lists.newArrayList();
        private BPContactToFuncAndDept toContactRelationship;

        private BusinessPartnerContact.BusinessPartnerContactBuilder toContactAddress(List<BPContactToAddress> value) {
            toContactAddress.addAll(value);
            return this;
        }

        /**
         * Navigation property <b>to_ContactAddress</b> for <b>BusinessPartnerContact</b> to multiple <b>BPContactToAddress</b>.
         * 
         */
        @Nonnull
        public BusinessPartnerContact.BusinessPartnerContactBuilder contactAddress(BPContactToAddress... value) {
            return toContactAddress(Lists.newArrayList(value));
        }

        private BusinessPartnerContact.BusinessPartnerContactBuilder toContactRelationship(BPContactToFuncAndDept value) {
            toContactRelationship = value;
            return this;
        }

        /**
         * Navigation property <b>to_ContactRelationship</b> for <b>BusinessPartnerContact</b> to single <b>BPContactToFuncAndDept</b>.
         * 
         */
        @Nonnull
        public BusinessPartnerContact.BusinessPartnerContactBuilder contactRelationship(final BPContactToFuncAndDept value) {
            return toContactRelationship(value);
        }

    }

}
