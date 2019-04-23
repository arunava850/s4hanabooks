/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.namespaces.odataserviceforbusinesspartner.selectable;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.EntitySelectable;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress;


/**
 * Interface to enable OData entity selectors for {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress}. This interface is used by {@link vdm.namespaces.odataserviceforbusinesspartner.field.AddressEmailAddressField AddressEmailAddressField} and {@link vdm.namespaces.odataserviceforbusinesspartner.link.AddressEmailAddressLink AddressEmailAddressLink}.
 * 
 * <p>Available instances:
 * <ul>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#ADDRESS_ID ADDRESS_ID}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#PERSON PERSON}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#ORDINAL_NUMBER ORDINAL_NUMBER}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#IS_DEFAULT_EMAIL_ADDRESS IS_DEFAULT_EMAIL_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#EMAIL_ADDRESS EMAIL_ADDRESS}</li>
 * <li>{@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress#SEARCH_EMAIL_ADDRESS SEARCH_EMAIL_ADDRESS}</li>
 * </ul>
 * 
 */
public interface AddressEmailAddressSelectable
    extends EntitySelectable<AddressEmailAddress>
{


}
