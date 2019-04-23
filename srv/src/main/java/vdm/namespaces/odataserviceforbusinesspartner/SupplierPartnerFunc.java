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
import vdm.namespaces.odataserviceforbusinesspartner.field.SupplierPartnerFuncField;
import vdm.namespaces.odataserviceforbusinesspartner.selectable.SupplierPartnerFuncSelectable;


/**
 * Supplier Purchasing Partner Function<p></p><p>Original entity name from the Odata EDM: <b>A_SupplierPartnerFuncType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class SupplierPartnerFunc
    extends VdmEntity<SupplierPartnerFunc>
{

    /**
     * Selector for all available fields of SupplierPartnerFunc.
     * 
     */
    public final static SupplierPartnerFuncSelectable ALL_FIELDS = new SupplierPartnerFuncSelectable() {


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
    public final static SupplierPartnerFuncField<String> SUPPLIER = new SupplierPartnerFuncField<String>("Supplier");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @param purchasingOrganization
     *     
     * @return
     *     Purchasing Organization
     */
    @Key
    @SerializedName("PurchasingOrganization")
    @JsonProperty("PurchasingOrganization")
    @Nullable
    @ODataField(odataName = "PurchasingOrganization")
    private String purchasingOrganization;
    /**
     * Use with available fluent helpers to apply the <b>PurchasingOrganization</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> PURCHASING_ORGANIZATION = new SupplierPartnerFuncField<String>("PurchasingOrganization");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SupplierSubrange</b></p>
     * 
     * @param supplierSubrange
     *     
     * @return
     *     Supplier Subrange
     */
    @Key
    @SerializedName("SupplierSubrange")
    @JsonProperty("SupplierSubrange")
    @Nullable
    @ODataField(odataName = "SupplierSubrange")
    private String supplierSubrange;
    /**
     * Use with available fluent helpers to apply the <b>SupplierSubrange</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> SUPPLIER_SUBRANGE = new SupplierPartnerFuncField<String>("SupplierSubrange");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @param plant
     *     
     * @return
     *     Plant
     */
    @Key
    @SerializedName("Plant")
    @JsonProperty("Plant")
    @Nullable
    @ODataField(odataName = "Plant")
    private String plant;
    /**
     * Use with available fluent helpers to apply the <b>Plant</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> PLANT = new SupplierPartnerFuncField<String>("Plant");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PartnerFunction</b></p>
     * 
     * @param partnerFunction
     *     
     * @return
     *     Partner Function
     */
    @Key
    @SerializedName("PartnerFunction")
    @JsonProperty("PartnerFunction")
    @Nullable
    @ODataField(odataName = "PartnerFunction")
    private String partnerFunction;
    /**
     * Use with available fluent helpers to apply the <b>PartnerFunction</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> PARTNER_FUNCTION = new SupplierPartnerFuncField<String>("PartnerFunction");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PartnerCounter</b></p>
     * 
     * @param partnerCounter
     *     
     * @return
     *     Partner counter
     */
    @Key
    @SerializedName("PartnerCounter")
    @JsonProperty("PartnerCounter")
    @Nullable
    @ODataField(odataName = "PartnerCounter")
    private String partnerCounter;
    /**
     * Use with available fluent helpers to apply the <b>PartnerCounter</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> PARTNER_COUNTER = new SupplierPartnerFuncField<String>("PartnerCounter");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DefaultPartner</b></p>
     * 
     * @param defaultPartner
     *     
     * @return
     *     Default Partner
     */
    @SerializedName("DefaultPartner")
    @JsonProperty("DefaultPartner")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "DefaultPartner")
    private Boolean defaultPartner;
    /**
     * Use with available fluent helpers to apply the <b>DefaultPartner</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<Boolean> DEFAULT_PARTNER = new SupplierPartnerFuncField<Boolean>("DefaultPartner");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     
     * @return
     *     Date on Which Record Was Created
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
    public final static SupplierPartnerFuncField<LocalDateTime> CREATION_DATE = new SupplierPartnerFuncField<LocalDateTime>("CreationDate");
    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     
     * @return
     *     Name of Person Who Created Object
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
    public final static SupplierPartnerFuncField<String> CREATED_BY_USER = new SupplierPartnerFuncField<String>("CreatedByUser");
    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ReferenceSupplier</b></p>
     * 
     * @param referenceSupplier
     *     
     * @return
     *     Reference to other vendor
     */
    @SerializedName("ReferenceSupplier")
    @JsonProperty("ReferenceSupplier")
    @Nullable
    @ODataField(odataName = "ReferenceSupplier")
    private String referenceSupplier;
    /**
     * Use with available fluent helpers to apply the <b>ReferenceSupplier</b> field to query operations.
     * 
     */
    public final static SupplierPartnerFuncField<String> REFERENCE_SUPPLIER = new SupplierPartnerFuncField<String>("ReferenceSupplier");
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
    public final static SupplierPartnerFuncField<String> AUTHORIZATION_GROUP = new SupplierPartnerFuncField<String>("AuthorizationGroup");
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
    public Class<SupplierPartnerFunc> getType() {
        return SupplierPartnerFunc.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>PurchasingOrganization</b></p>
     * 
     * @param purchasingOrganization
     *     Purchasing Organization
     */
    public void setPurchasingOrganization(
        @Nullable
        final String purchasingOrganization) {
        rememberChangedField("PurchasingOrganization", this.purchasingOrganization);
        this.purchasingOrganization = purchasingOrganization;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 6 <p>Original property name from the Odata EDM: <b>SupplierSubrange</b></p>
     * 
     * @param supplierSubrange
     *     Supplier Subrange
     */
    public void setSupplierSubrange(
        @Nullable
        final String supplierSubrange) {
        rememberChangedField("SupplierSubrange", this.supplierSubrange);
        this.supplierSubrange = supplierSubrange;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>Plant</b></p>
     * 
     * @param plant
     *     Plant
     */
    public void setPlant(
        @Nullable
        final String plant) {
        rememberChangedField("Plant", this.plant);
        this.plant = plant;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>PartnerFunction</b></p>
     * 
     * @param partnerFunction
     *     Partner Function
     */
    public void setPartnerFunction(
        @Nullable
        final String partnerFunction) {
        rememberChangedField("PartnerFunction", this.partnerFunction);
        this.partnerFunction = partnerFunction;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 3 <p>Original property name from the Odata EDM: <b>PartnerCounter</b></p>
     * 
     * @param partnerCounter
     *     Partner counter
     */
    public void setPartnerCounter(
        @Nullable
        final String partnerCounter) {
        rememberChangedField("PartnerCounter", this.partnerCounter);
        this.partnerCounter = partnerCounter;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>DefaultPartner</b></p>
     * 
     * @param defaultPartner
     *     Default Partner
     */
    public void setDefaultPartner(
        @Nullable
        final Boolean defaultPartner) {
        rememberChangedField("DefaultPartner", this.defaultPartner);
        this.defaultPartner = defaultPartner;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>CreationDate</b></p>
     * 
     * @param creationDate
     *     Date on Which Record Was Created
     */
    public void setCreationDate(
        @Nullable
        final LocalDateTime creationDate) {
        rememberChangedField("CreationDate", this.creationDate);
        this.creationDate = creationDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 12 <p>Original property name from the Odata EDM: <b>CreatedByUser</b></p>
     * 
     * @param createdByUser
     *     Name of Person Who Created Object
     */
    public void setCreatedByUser(
        @Nullable
        final String createdByUser) {
        rememberChangedField("CreatedByUser", this.createdByUser);
        this.createdByUser = createdByUser;
    }

    /**
     * Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>ReferenceSupplier</b></p>
     * 
     * @param referenceSupplier
     *     Reference to other vendor
     */
    public void setReferenceSupplier(
        @Nullable
        final String referenceSupplier) {
        rememberChangedField("ReferenceSupplier", this.referenceSupplier);
        this.referenceSupplier = referenceSupplier;
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
        return "A_SupplierPartnerFunc";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Supplier", getSupplier());
        result.put("PurchasingOrganization", getPurchasingOrganization());
        result.put("SupplierSubrange", getSupplierSubrange());
        result.put("Plant", getPlant());
        result.put("PartnerFunction", getPartnerFunction());
        result.put("PartnerCounter", getPartnerCounter());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Supplier", getSupplier());
        values.put("PurchasingOrganization", getPurchasingOrganization());
        values.put("SupplierSubrange", getSupplierSubrange());
        values.put("Plant", getPlant());
        values.put("PartnerFunction", getPartnerFunction());
        values.put("PartnerCounter", getPartnerCounter());
        values.put("DefaultPartner", getDefaultPartner());
        values.put("CreationDate", getCreationDate());
        values.put("CreatedByUser", getCreatedByUser());
        values.put("ReferenceSupplier", getReferenceSupplier());
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
            if (values.containsKey("PurchasingOrganization")) {
                final Object value = values.remove("PurchasingOrganization");
                if ((value == null)||(!value.equals(getPurchasingOrganization()))) {
                    setPurchasingOrganization(((String) value));
                }
            }
            if (values.containsKey("SupplierSubrange")) {
                final Object value = values.remove("SupplierSubrange");
                if ((value == null)||(!value.equals(getSupplierSubrange()))) {
                    setSupplierSubrange(((String) value));
                }
            }
            if (values.containsKey("Plant")) {
                final Object value = values.remove("Plant");
                if ((value == null)||(!value.equals(getPlant()))) {
                    setPlant(((String) value));
                }
            }
            if (values.containsKey("PartnerFunction")) {
                final Object value = values.remove("PartnerFunction");
                if ((value == null)||(!value.equals(getPartnerFunction()))) {
                    setPartnerFunction(((String) value));
                }
            }
            if (values.containsKey("PartnerCounter")) {
                final Object value = values.remove("PartnerCounter");
                if ((value == null)||(!value.equals(getPartnerCounter()))) {
                    setPartnerCounter(((String) value));
                }
            }
            if (values.containsKey("DefaultPartner")) {
                final Object value = values.remove("DefaultPartner");
                if ((value == null)||(!value.equals(getDefaultPartner()))) {
                    setDefaultPartner(((Boolean) value));
                }
            }
            if (values.containsKey("CreationDate")) {
                final Object value = values.remove("CreationDate");
                if ((value == null)||(!value.equals(getCreationDate()))) {
                    setCreationDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("CreatedByUser")) {
                final Object value = values.remove("CreatedByUser");
                if ((value == null)||(!value.equals(getCreatedByUser()))) {
                    setCreatedByUser(((String) value));
                }
            }
            if (values.containsKey("ReferenceSupplier")) {
                final Object value = values.remove("ReferenceSupplier");
                if ((value == null)||(!value.equals(getReferenceSupplier()))) {
                    setReferenceSupplier(((String) value));
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
    public static<T >SupplierPartnerFuncField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new SupplierPartnerFuncField<T>(fieldName);
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
    public static<T,DomainT >SupplierPartnerFuncField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new SupplierPartnerFuncField<T>(fieldName, typeConverter);
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

}
