/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.CustomerDunningField CustomerDunningField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.CustomerDunningLink CustomerDunningLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#CUSTOMER CUSTOMER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#COMPANY_CODE COMPANY_CODE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_AREA DUNNING_AREA}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_BLOCK DUNNING_BLOCK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_LEVEL DUNNING_LEVEL}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_PROCEDURE DUNNING_PROCEDURE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_RECIPIENT DUNNING_RECIPIENT}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#LAST_DUNNED_ON LAST_DUNNED_ON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#LEG_DUNNING_PROCEDURE_ON LEG_DUNNING_PROCEDURE_ON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#DUNNING_CLERK DUNNING_CLERK}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning#CUSTOMER_ACCOUNT_GROUP CUSTOMER_ACCOUNT_GROUP}</li>
 * </ul>
 * 
 */
public interface CustomerDunningSelectable
    extends EntitySelectable<CustomerDunning>
{


}
