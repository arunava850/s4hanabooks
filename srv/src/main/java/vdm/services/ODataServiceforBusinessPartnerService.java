/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.annotation.Nonnull;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddressByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddressFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.Customer;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.Supplier;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierUpdateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxByKeyFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxCreateFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxDeleteFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxFluentHelper;
import vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxUpdateFluentHelper;


/**
 * <h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>ODataServiceforBusinessPartner</td></tr></table>
 * 
 */
public interface ODataServiceforBusinessPartnerService {

    /**
     * If no other path was provided via the {@link #withServicePath(String)} method, this is the default service path used to access the endpoint.
     * 
     */
    String DEFAULT_SERVICE_PATH = "/apihub_sandbox/s4hanacloud/sap/opu/odata/sap/API_BUSINESS_PARTNER/ODataServiceforBusinessPartner";

    /**
     * Overrides the default service path and returns a new service instance with the specified service path. Also adjusts the respective entity URLs.
     * 
     * @param servicePath
     *     Service path that will override the default.
     * @return
     *     A new service instance with the specified service path.
     */
    @Nonnull
    ODataServiceforBusinessPartnerService withServicePath(
        @Nonnull
        final String servicePath);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressEmailAddressFluentHelper getAllAddressEmailAddress();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity using key fields.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressEmailAddressByKeyFluentHelper getAddressEmailAddressByKey(final String addressID, final String person, final String ordinalNumber);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity and save it to the S/4HANA system.
     * 
     * @param addressEmailAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressEmailAddressCreateFluentHelper createAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity and save it to the S/4HANA system.
     * 
     * @param addressEmailAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressEmailAddressUpdateFluentHelper updateAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity in the S/4HANA system.
     * 
     * @param addressEmailAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddress AddressEmailAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressEmailAddressDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressEmailAddressDeleteFluentHelper deleteAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressFaxNumberFluentHelper getAllAddressFaxNumber();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity using key fields.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressFaxNumberByKeyFluentHelper getAddressFaxNumberByKey(final String addressID, final String person, final String ordinalNumber);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity and save it to the S/4HANA system.
     * 
     * @param addressFaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressFaxNumberCreateFluentHelper createAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity and save it to the S/4HANA system.
     * 
     * @param addressFaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressFaxNumberUpdateFluentHelper updateAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity in the S/4HANA system.
     * 
     * @param addressFaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumber AddressFaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressFaxNumberDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressFaxNumberDeleteFluentHelper deleteAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressHomePageURLFluentHelper getAllAddressHomePageURL();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity using key fields.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param validityStartDate
     *     Valid-from date - in current Release only 00010101 possible<p>Constraints: Not nullable, Precision: 0</p>
     * @param isDefaultURLAddress
     *     Flag: this address is the default address<p>Constraints: Not nullable</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressHomePageURLByKeyFluentHelper getAddressHomePageURLByKey(final String addressID, final String person, final String ordinalNumber, final LocalDateTime validityStartDate, final Boolean isDefaultURLAddress);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity and save it to the S/4HANA system.
     * 
     * @param addressHomePageURL
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressHomePageURLCreateFluentHelper createAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity and save it to the S/4HANA system.
     * 
     * @param addressHomePageURL
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressHomePageURLUpdateFluentHelper updateAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity in the S/4HANA system.
     * 
     * @param addressHomePageURL
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURL AddressHomePageURL} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressHomePageURLDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressHomePageURLDeleteFluentHelper deleteAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressPhoneNumberFluentHelper getAllAddressPhoneNumber();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity using key fields.
     * 
     * @param ordinalNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param person
     *     Person number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressPhoneNumberByKeyFluentHelper getAddressPhoneNumberByKey(final String addressID, final String person, final String ordinalNumber);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity and save it to the S/4HANA system.
     * 
     * @param addressPhoneNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressPhoneNumberCreateFluentHelper createAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity and save it to the S/4HANA system.
     * 
     * @param addressPhoneNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressPhoneNumberUpdateFluentHelper updateAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity in the S/4HANA system.
     * 
     * @param addressPhoneNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumber AddressPhoneNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.AddressPhoneNumberDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    AddressPhoneNumberDeleteFluentHelper deleteAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddressFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BPContactToAddressFluentHelper getAllBPContactToAddress();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entity using key fields.
     * 
     * @param businessPartnerPerson
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartnerCompany
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param validityEndDate
     *     Validity Date (Valid To)<p>Constraints: Not nullable, Precision: 0</p>
     * @param relationshipNumber
     *     BP Relationship Number<p>Constraints: Not nullable, Maximum length: 12</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddress BPContactToAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToAddressByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BPContactToAddressByKeyFluentHelper getBPContactToAddressByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate, final String addressID);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BPContactToFuncAndDeptFluentHelper getAllBPContactToFuncAndDept();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entity using key fields.
     * 
     * @param businessPartnerPerson
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartnerCompany
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param validityEndDate
     *     Validity Date (Valid To)<p>Constraints: Not nullable, Precision: 0</p>
     * @param relationshipNumber
     *     BP Relationship Number<p>Constraints: Not nullable, Maximum length: 12</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BPContactToFuncAndDeptByKeyFluentHelper getBPContactToFuncAndDeptByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entity and save it to the S/4HANA system.
     * 
     * @param bPContactToFuncAndDept
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDept BPContactToFuncAndDept} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BPContactToFuncAndDeptUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BPContactToFuncAndDeptUpdateFluentHelper updateBPContactToFuncAndDept(
        @Nonnull
        final BPContactToFuncAndDept bPContactToFuncAndDept);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaAddressUsageFluentHelper getAllBuPaAddressUsage();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param validityEndDate
     *     Validity End of a Business Partner Address Usage<p>Constraints: Not nullable, Precision: 0</p>
     * @param addressUsage
     *     Address Type<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaAddressUsageByKeyFluentHelper getBuPaAddressUsageByKey(final String businessPartner, final ZonedDateTime validityEndDate, final String addressUsage, final String addressID);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity and save it to the S/4HANA system.
     * 
     * @param buPaAddressUsage
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaAddressUsageCreateFluentHelper createBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity and save it to the S/4HANA system.
     * 
     * @param buPaAddressUsage
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaAddressUsageUpdateFluentHelper updateBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity in the S/4HANA system.
     * 
     * @param buPaAddressUsage
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsage BuPaAddressUsage} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaAddressUsageDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaAddressUsageDeleteFluentHelper deleteBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIdentificationFluentHelper getAllBuPaIdentification();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param bPIdentificationNumber
     *     Identification Number<p>Constraints: Not nullable, Maximum length: 60</p>
     * @param bPIdentificationType
     *     Identification Type<p>Constraints: Not nullable, Maximum length: 6</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIdentificationByKeyFluentHelper getBuPaIdentificationByKey(final String businessPartner, final String bPIdentificationType, final String bPIdentificationNumber);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity and save it to the S/4HANA system.
     * 
     * @param buPaIdentification
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIdentificationCreateFluentHelper createBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity and save it to the S/4HANA system.
     * 
     * @param buPaIdentification
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIdentificationUpdateFluentHelper updateBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity in the S/4HANA system.
     * 
     * @param buPaIdentification
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentification BuPaIdentification} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIdentificationDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIdentificationDeleteFluentHelper deleteBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIndustryFluentHelper getAllBuPaIndustry();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity using key fields.
     * 
     * @param industrySector
     *     Industry<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param industrySystemType
     *     Industry System<p>Constraints: Not nullable, Maximum length: 4</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIndustryByKeyFluentHelper getBuPaIndustryByKey(final String industrySector, final String industrySystemType, final String businessPartner);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity and save it to the S/4HANA system.
     * 
     * @param buPaIndustry
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIndustryCreateFluentHelper createBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity and save it to the S/4HANA system.
     * 
     * @param buPaIndustry
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIndustryUpdateFluentHelper updateBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity in the S/4HANA system.
     * 
     * @param buPaIndustry
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustry BuPaIndustry} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BuPaIndustryDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BuPaIndustryDeleteFluentHelper deleteBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerFluentHelper getAllBusinessPartner();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerByKeyFluentHelper getBusinessPartnerByKey(final String businessPartner);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity and save it to the S/4HANA system.
     * 
     * @param businessPartner
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerCreateFluentHelper createBusinessPartner(
        @Nonnull
        final BusinessPartner businessPartner);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity and save it to the S/4HANA system.
     * 
     * @param businessPartner
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartner BusinessPartner} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerUpdateFluentHelper updateBusinessPartner(
        @Nonnull
        final BusinessPartner businessPartner);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerAddressFluentHelper getAllBusinessPartnerAddress();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param addressID
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerAddressByKeyFluentHelper getBusinessPartnerAddressByKey(final String businessPartner, final String addressID);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerAddressCreateFluentHelper createBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerAddressUpdateFluentHelper updateBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity in the S/4HANA system.
     * 
     * @param businessPartnerAddress
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddress BusinessPartnerAddress} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerAddressDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerAddressDeleteFluentHelper deleteBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerBankFluentHelper getAllBusinessPartnerBank();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param bankIdentification
     *     Bank details ID<p>Constraints: Not nullable, Maximum length: 4</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerBankByKeyFluentHelper getBusinessPartnerBankByKey(final String businessPartner, final String bankIdentification);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerBank
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerBankCreateFluentHelper createBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerBank
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerBankUpdateFluentHelper updateBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity in the S/4HANA system.
     * 
     * @param businessPartnerBank
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBank BusinessPartnerBank} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerBankDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerBankDeleteFluentHelper deleteBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerContactFluentHelper getAllBusinessPartnerContact();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity using key fields.
     * 
     * @param businessPartnerPerson
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartnerCompany
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param validityEndDate
     *     Validity Date (Valid To)<p>Constraints: Not nullable, Precision: 0</p>
     * @param relationshipNumber
     *     BP Relationship Number<p>Constraints: Not nullable, Maximum length: 12</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerContactByKeyFluentHelper getBusinessPartnerContactByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerContact
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerContactCreateFluentHelper createBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerContact
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerContactUpdateFluentHelper updateBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity in the S/4HANA system.
     * 
     * @param businessPartnerContact
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContact BusinessPartnerContact} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerContactDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerContactDeleteFluentHelper deleteBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerRoleFluentHelper getAllBusinessPartnerRole();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity using key fields.
     * 
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param businessPartnerRole
     *     BP Role<p>Constraints: Not nullable, Maximum length: 6</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerRoleByKeyFluentHelper getBusinessPartnerRoleByKey(final String businessPartner, final String businessPartnerRole);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerRole
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerRoleCreateFluentHelper createBusinessPartnerRole(
        @Nonnull
        final BusinessPartnerRole businessPartnerRole);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerRole
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRole BusinessPartnerRole} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerRoleUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerRoleUpdateFluentHelper updateBusinessPartnerRole(
        @Nonnull
        final BusinessPartnerRole businessPartnerRole);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerTaxNumberFluentHelper getAllBusinessPartnerTaxNumber();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity using key fields.
     * 
     * @param bPTaxType
     *     Tax Number Category<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerTaxNumberByKeyFluentHelper getBusinessPartnerTaxNumberByKey(final String businessPartner, final String bPTaxType);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerTaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerTaxNumberCreateFluentHelper createBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity and save it to the S/4HANA system.
     * 
     * @param businessPartnerTaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerTaxNumberUpdateFluentHelper updateBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity in the S/4HANA system.
     * 
     * @param businessPartnerTaxNumber
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumber BusinessPartnerTaxNumber} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.BusinessPartnerTaxNumberDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    BusinessPartnerTaxNumberDeleteFluentHelper deleteBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerFluentHelper getAllCustomer();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entity using key fields.
     * 
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerByKeyFluentHelper getCustomerByKey(final String customer);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entity and save it to the S/4HANA system.
     * 
     * @param customer
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.Customer Customer} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerUpdateFluentHelper updateCustomer(
        @Nonnull
        final Customer customer);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerCompanyFluentHelper getAllCustomerCompany();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerCompanyByKeyFluentHelper getCustomerCompanyByKey(final String customer, final String companyCode);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity and save it to the S/4HANA system.
     * 
     * @param customerCompany
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerCompanyCreateFluentHelper createCustomerCompany(
        @Nonnull
        final CustomerCompany customerCompany);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity and save it to the S/4HANA system.
     * 
     * @param customerCompany
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompany CustomerCompany} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerCompanyUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerCompanyUpdateFluentHelper updateCustomerCompany(
        @Nonnull
        final CustomerCompany customerCompany);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDunningFluentHelper getAllCustomerDunning();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param dunningArea
     *     Dunning Area<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDunningByKeyFluentHelper getCustomerDunningByKey(final String customer, final String companyCode, final String dunningArea);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity and save it to the S/4HANA system.
     * 
     * @param customerDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDunningCreateFluentHelper createCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity and save it to the S/4HANA system.
     * 
     * @param customerDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDunningUpdateFluentHelper updateCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity in the S/4HANA system.
     * 
     * @param customerDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunning CustomerDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerDunningDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerDunningDeleteFluentHelper deleteCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaFluentHelper getAllCustomerSalesArea();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity using key fields.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param distributionChannel
     *     Distribution Channel<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaByKeyFluentHelper getCustomerSalesAreaByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity and save it to the S/4HANA system.
     * 
     * @param customerSalesArea
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaCreateFluentHelper createCustomerSalesArea(
        @Nonnull
        final CustomerSalesArea customerSalesArea);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity and save it to the S/4HANA system.
     * 
     * @param customerSalesArea
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesArea CustomerSalesArea} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaUpdateFluentHelper updateCustomerSalesArea(
        @Nonnull
        final CustomerSalesArea customerSalesArea);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaTaxFluentHelper getAllCustomerSalesAreaTax();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity using key fields.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param departureCountry
     *     Departure country (country from which the goods are sent)<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param distributionChannel
     *     Reference distrib.channel for cust.and material masters<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param customerTaxCategory
     *     Tax category (sales tax, federal sales tax,...)<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaTaxByKeyFluentHelper getCustomerSalesAreaTaxByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division, final String departureCountry, final String customerTaxCategory);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity and save it to the S/4HANA system.
     * 
     * @param customerSalesAreaTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaTaxCreateFluentHelper createCustomerSalesAreaTax(
        @Nonnull
        final CustomerSalesAreaTax customerSalesAreaTax);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity and save it to the S/4HANA system.
     * 
     * @param customerSalesAreaTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTax CustomerSalesAreaTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerSalesAreaTaxUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerSalesAreaTaxUpdateFluentHelper updateCustomerSalesAreaTax(
        @Nonnull
        final CustomerSalesAreaTax customerSalesAreaTax);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerWithHoldingTaxFluentHelper getAllCustomerWithHoldingTax();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param withholdingTaxType
     *     Indicator for Withholding Tax Type<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerWithHoldingTaxByKeyFluentHelper getCustomerWithHoldingTaxByKey(final String customer, final String companyCode, final String withholdingTaxType);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity and save it to the S/4HANA system.
     * 
     * @param customerWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerWithHoldingTaxCreateFluentHelper createCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity and save it to the S/4HANA system.
     * 
     * @param customerWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerWithHoldingTaxUpdateFluentHelper updateCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity in the S/4HANA system.
     * 
     * @param customerWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTax CustomerWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustomerWithHoldingTaxDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustomerWithHoldingTaxDeleteFluentHelper deleteCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustSalesPartnerFuncFluentHelper getAllCustSalesPartnerFunc();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity using key fields.
     * 
     * @param division
     *     Division<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param partnerCounter
     *     Partner counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param distributionChannel
     *     Distribution Channel<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param salesOrganization
     *     Sales Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustSalesPartnerFuncByKeyFluentHelper getCustSalesPartnerFuncByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division, final String partnerCounter, final String partnerFunction);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity and save it to the S/4HANA system.
     * 
     * @param custSalesPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustSalesPartnerFuncCreateFluentHelper createCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity and save it to the S/4HANA system.
     * 
     * @param custSalesPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustSalesPartnerFuncUpdateFluentHelper updateCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity in the S/4HANA system.
     * 
     * @param custSalesPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFunc CustSalesPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.CustSalesPartnerFuncDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    CustSalesPartnerFuncDeleteFluentHelper deleteCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierFluentHelper getAllSupplier();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity using key fields.
     * 
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierByKeyFluentHelper getSupplierByKey(final String supplier);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity and save it to the S/4HANA system.
     * 
     * @param supplier
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.Supplier Supplier} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierUpdateFluentHelper updateSupplier(
        @Nonnull
        final Supplier supplier);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierCompanyFluentHelper getAllSupplierCompany();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierCompanyByKeyFluentHelper getSupplierCompanyByKey(final String supplier, final String companyCode);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity and save it to the S/4HANA system.
     * 
     * @param supplierCompany
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierCompanyCreateFluentHelper createSupplierCompany(
        @Nonnull
        final SupplierCompany supplierCompany);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity and save it to the S/4HANA system.
     * 
     * @param supplierCompany
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompany SupplierCompany} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierCompanyUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierCompanyUpdateFluentHelper updateSupplierCompany(
        @Nonnull
        final SupplierCompany supplierCompany);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierDunningFluentHelper getAllSupplierDunning();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param dunningArea
     *     Dunning Area<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierDunningByKeyFluentHelper getSupplierDunningByKey(final String supplier, final String companyCode, final String dunningArea);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity and save it to the S/4HANA system.
     * 
     * @param supplierDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierDunningCreateFluentHelper createSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity and save it to the S/4HANA system.
     * 
     * @param supplierDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierDunningUpdateFluentHelper updateSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity in the S/4HANA system.
     * 
     * @param supplierDunning
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunning SupplierDunning} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierDunningDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierDunningDeleteFluentHelper deleteSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPartnerFuncFluentHelper getAllSupplierPartnerFunc();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity using key fields.
     * 
     * @param partnerFunction
     *     Partner Function<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param plant
     *     Plant<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param purchasingOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param partnerCounter
     *     Partner counter<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param supplierSubrange
     *     Supplier Subrange<p>Constraints: Not nullable, Maximum length: 6</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPartnerFuncByKeyFluentHelper getSupplierPartnerFuncByKey(final String supplier, final String purchasingOrganization, final String supplierSubrange, final String plant, final String partnerFunction, final String partnerCounter);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity and save it to the S/4HANA system.
     * 
     * @param supplierPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPartnerFuncCreateFluentHelper createSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity and save it to the S/4HANA system.
     * 
     * @param supplierPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPartnerFuncUpdateFluentHelper updateSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity in the S/4HANA system.
     * 
     * @param supplierPartnerFunc
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFunc SupplierPartnerFunc} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPartnerFuncDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPartnerFuncDeleteFluentHelper deleteSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPurchasingOrgFluentHelper getAllSupplierPurchasingOrg();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity using key fields.
     * 
     * @param supplier
     *     Vendor Account Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param purchasingOrganization
     *     Purchasing Organization<p>Constraints: Not nullable, Maximum length: 4</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPurchasingOrgByKeyFluentHelper getSupplierPurchasingOrgByKey(final String supplier, final String purchasingOrganization);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity and save it to the S/4HANA system.
     * 
     * @param supplierPurchasingOrg
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPurchasingOrgCreateFluentHelper createSupplierPurchasingOrg(
        @Nonnull
        final SupplierPurchasingOrg supplierPurchasingOrg);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity and save it to the S/4HANA system.
     * 
     * @param supplierPurchasingOrg
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrg SupplierPurchasingOrg} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierPurchasingOrgUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierPurchasingOrgUpdateFluentHelper updateSupplierPurchasingOrg(
        @Nonnull
        final SupplierPurchasingOrg supplierPurchasingOrg);

    /**
     * Fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entities.
     * 
     * @return
     *     A fluent helper to fetch multiple {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierWithHoldingTaxFluentHelper getAllSupplierWithHoldingTax();

    /**
     * Fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity using key fields.
     * 
     * @param companyCode
     *     Company Code<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param withholdingTaxType
     *     Indicator for Withholding Tax Type<p>Constraints: Not nullable, Maximum length: 2</p>
     * @param supplier
     *     Account Number of Supplier<p>Constraints: Not nullable, Maximum length: 10</p>
     * @return
     *     A fluent helper to fetch a single {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxByKeyFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierWithHoldingTaxByKeyFluentHelper getSupplierWithHoldingTaxByKey(final String supplier, final String companyCode, final String withholdingTaxType);

    /**
     * Create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity and save it to the S/4HANA system.
     * 
     * @param supplierWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity object that will be created in the S/4HANA system.
     * @return
     *     A fluent helper to create a new {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxCreateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierWithHoldingTaxCreateFluentHelper createSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax);

    /**
     * Update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity and save it to the S/4HANA system.
     * 
     * @param supplierWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity object that will be updated in the S/4HANA system.
     * @return
     *     A fluent helper to update an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxUpdateFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierWithHoldingTaxUpdateFluentHelper updateSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax);

    /**
     * Deletes an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity in the S/4HANA system.
     * 
     * @param supplierWithHoldingTax
     *     {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity object that will be deleted in the S/4HANA system.
     * @return
     *     A fluent helper to delete an existing {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTax SupplierWithHoldingTax} entity. To perform execution, call the {@link vdm.namespaces.odataserviceforbusinesspartner.SupplierWithHoldingTaxDeleteFluentHelper#execute execute} method on the fluent helper object. 
     */
    @Nonnull
    SupplierWithHoldingTaxDeleteFluentHelper deleteSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax);

}
