/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner;

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
import vdm.namespaces.odataserviceforbusinesspartner.field.BusinessPartnerRoleField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.BusinessPartnerRoleSelectable;


/**
 * Business Partner Role<p></p><p>Original entity name from the Odata EDM: <b>A_BusinessPartnerRoleType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerRole
    extends VdmEntity<BusinessPartnerRole>
{

    /**
     * Selector for all available fields of BusinessPartnerRole.
     * 
     */
    public final static BusinessPartnerRoleSelectable ALL_FIELDS = new BusinessPartnerRoleSelectable() {


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
    public final static BusinessPartnerRoleField<String> BUSINESS_PARTNER = new BusinessPartnerRoleField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>BusinessPartnerRole</b></p>
     * 
     * @param businessPartnerRole
     *     
     * @return
     *     BP Role
     */
    @Key
    @SerializedName("BusinessPartnerRole")
    @JsonProperty("BusinessPartnerRole")
    @Nullable
    @ODataField(odataName = "BusinessPartnerRole")
    private String businessPartnerRole;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartnerRole</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRoleField<String> BUSINESS_PARTNER_ROLE = new BusinessPartnerRoleField<String>("BusinessPartnerRole");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidFrom</b></p>
     * 
     * @param validFrom
     *     
     * @return
     *     Validity Start of a BP Role
     */
    @SerializedName("ValidFrom")
    @JsonProperty("ValidFrom")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidFrom", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validFrom;
    /**
     * Use with available fluent helpers to apply the <b>ValidFrom</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRoleField<ZonedDateTime> VALID_FROM = new BusinessPartnerRoleField<ZonedDateTime>("ValidFrom");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidTo</b></p>
     * 
     * @param validTo
     *     
     * @return
     *     Validity End of a BP Role
     */
    @SerializedName("ValidTo")
    @JsonProperty("ValidTo")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonZonedDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeAdapter.class)
    @ODataField(odataName = "ValidTo", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ZonedDateTimeCalendarConverter.class)
    private ZonedDateTime validTo;
    /**
     * Use with available fluent helpers to apply the <b>ValidTo</b> field to query operations.
     * 
     */
    public final static BusinessPartnerRoleField<ZonedDateTime> VALID_TO = new BusinessPartnerRoleField<ZonedDateTime>("ValidTo");
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
    public final static BusinessPartnerRoleField<String> AUTHORIZATION_GROUP = new BusinessPartnerRoleField<String>("AuthorizationGroup");
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
    public Class<BusinessPartnerRole> getType() {
        return BusinessPartnerRole.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>BusinessPartnerRole</b></p>
     * 
     * @param businessPartnerRole
     *     BP Role
     */
    public void setBusinessPartnerRole(
        @Nullable
        final String businessPartnerRole) {
        rememberChangedField("BusinessPartnerRole", this.businessPartnerRole);
        this.businessPartnerRole = businessPartnerRole;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidFrom</b></p>
     * 
     * @param validFrom
     *     Validity Start of a BP Role
     */
    public void setValidFrom(
        @Nullable
        final ZonedDateTime validFrom) {
        rememberChangedField("ValidFrom", this.validFrom);
        this.validFrom = validFrom;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ValidTo</b></p>
     * 
     * @param validTo
     *     Validity End of a BP Role
     */
    public void setValidTo(
        @Nullable
        final ZonedDateTime validTo) {
        rememberChangedField("ValidTo", this.validTo);
        this.validTo = validTo;
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
        return "A_BusinessPartnerRole";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("BusinessPartnerRole", getBusinessPartnerRole());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("BusinessPartnerRole", getBusinessPartnerRole());
        values.put("ValidFrom", getValidFrom());
        values.put("ValidTo", getValidTo());
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
            if (values.containsKey("BusinessPartnerRole")) {
                final Object value = values.remove("BusinessPartnerRole");
                if ((value == null)||(!value.equals(getBusinessPartnerRole()))) {
                    setBusinessPartnerRole(((String) value));
                }
            }
            if (values.containsKey("ValidFrom")) {
                final Object value = values.remove("ValidFrom");
                if ((value == null)||(!value.equals(getValidFrom()))) {
                    setValidFrom(((ZonedDateTime) value));
                }
            }
            if (values.containsKey("ValidTo")) {
                final Object value = values.remove("ValidTo");
                if ((value == null)||(!value.equals(getValidTo()))) {
                    setValidTo(((ZonedDateTime) value));
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
    public static<T >BusinessPartnerRoleField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerRoleField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerRoleField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerRoleField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
