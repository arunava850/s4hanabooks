/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.BuPaIdentificationField BuPaIdentificationField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.BuPaIdentificationLink BuPaIdentificationLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#BUSINESS_PARTNER BUSINESS_PARTNER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#BP_IDENTIFICATION_TYPE BP_IDENTIFICATION_TYPE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#BP_IDENTIFICATION_NUMBER BP_IDENTIFICATION_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#BP_IDN_NMBR_ISSUING_INSTITUTE BP_IDN_NMBR_ISSUING_INSTITUTE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#BP_IDENTIFICATION_ENTRY_DATE BP_IDENTIFICATION_ENTRY_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#COUNTRY COUNTRY}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#REGION REGION}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#VALIDITY_START_DATE VALIDITY_START_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#VALIDITY_END_DATE VALIDITY_END_DATE}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification#AUTHORIZATION_GROUP AUTHORIZATION_GROUP}</li>
 * </ul>
 * 
 */
public interface BuPaIdentificationSelectable
    extends EntitySelectable<BuPaIdentification>
{


}
