/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.SupplierPartnerFuncField SupplierPartnerFuncField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.SupplierPartnerFuncLink SupplierPartnerFuncLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#SUPPLIER SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#PURCHASING_ORGANIZATION PURCHASING_ORGANIZATION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#SUPPLIER_SUBRANGE SUPPLIER_SUBRANGE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#PLANT PLANT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#PARTNER_FUNCTION PARTNER_FUNCTION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#PARTNER_COUNTER PARTNER_COUNTER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#DEFAULT_PARTNER DEFAULT_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#CREATION_DATE CREATION_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#CREATED_BY_USER CREATED_BY_USER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#REFERENCE_SUPPLIER REFERENCE_SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * </ul>
 * 
 */
public interface SupplierPartnerFuncSelectable
    extends EntitySelectable<SupplierPartnerFunc>
{


}
