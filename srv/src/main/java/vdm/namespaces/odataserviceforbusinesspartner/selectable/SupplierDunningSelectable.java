/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.SupplierDunningField SupplierDunningField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.SupplierDunningLink SupplierDunningLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#SUPPLIER SUPPLIER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#COMPANY_CODE COMPANY_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_AREA DUNNING_AREA}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_BLOCK DUNNING_BLOCK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_LEVEL DUNNING_LEVEL}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_PROCEDURE DUNNING_PROCEDURE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_RECIPIENT DUNNING_RECIPIENT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#LAST_DUNNED_ON LAST_DUNNED_ON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#LEG_DUNNING_PROCEDURE_ON LEG_DUNNING_PROCEDURE_ON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#DUNNING_CLERK DUNNING_CLERK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning#SUPPLIER_ACCOUNT_GROUP SUPPLIER_ACCOUNT_GROUP}</li>
 * </ul>
 * 
 */
public interface SupplierDunningSelectable
    extends EntitySelectable<SupplierDunning>
{


}
