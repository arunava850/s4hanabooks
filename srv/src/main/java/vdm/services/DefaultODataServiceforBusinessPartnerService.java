/*
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */

package vdm.services;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.annotation.Nonnull;
import javax.inject.Named;
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
@Named("vdm.services.DefaultODataServiceforBusinessPartnerService")
public class DefaultODataServiceforBusinessPartnerService
    implements ODataServiceforBusinessPartnerService
{

    @Nonnull
    private final String servicePath;

    /**
     * Creates a service using {@link ODataServiceforBusinessPartnerService#DEFAULT_SERVICE_PATH} to send the requests.
     * 
     */
    public DefaultODataServiceforBusinessPartnerService() {
        servicePath = ODataServiceforBusinessPartnerService.DEFAULT_SERVICE_PATH;
    }

    /**
     * Creates a service using the provided service path to send the requests.
     * <p>
     * Used by the fluent {@link #withServicePath(String)} method.
     * 
     */
    private DefaultODataServiceforBusinessPartnerService(
        @Nonnull
        final String servicePath) {
        this.servicePath = servicePath;
    }

    @Override
    @Nonnull
    public DefaultODataServiceforBusinessPartnerService withServicePath(
        @Nonnull
        final String servicePath) {
        return new DefaultODataServiceforBusinessPartnerService(servicePath);
    }

    @Override
    @Nonnull
    public AddressEmailAddressFluentHelper getAllAddressEmailAddress() {
        return new AddressEmailAddressFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public AddressEmailAddressByKeyFluentHelper getAddressEmailAddressByKey(final String addressID, final String person, final String ordinalNumber) {
        return new AddressEmailAddressByKeyFluentHelper(servicePath, addressID, person, ordinalNumber);
    }

    @Override
    @Nonnull
    public AddressEmailAddressCreateFluentHelper createAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress) {
        return new AddressEmailAddressCreateFluentHelper(servicePath, addressEmailAddress);
    }

    @Override
    @Nonnull
    public AddressEmailAddressUpdateFluentHelper updateAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress) {
        return new AddressEmailAddressUpdateFluentHelper(servicePath, addressEmailAddress);
    }

    @Override
    @Nonnull
    public AddressEmailAddressDeleteFluentHelper deleteAddressEmailAddress(
        @Nonnull
        final AddressEmailAddress addressEmailAddress) {
        return new AddressEmailAddressDeleteFluentHelper(servicePath, addressEmailAddress);
    }

    @Override
    @Nonnull
    public AddressFaxNumberFluentHelper getAllAddressFaxNumber() {
        return new AddressFaxNumberFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public AddressFaxNumberByKeyFluentHelper getAddressFaxNumberByKey(final String addressID, final String person, final String ordinalNumber) {
        return new AddressFaxNumberByKeyFluentHelper(servicePath, addressID, person, ordinalNumber);
    }

    @Override
    @Nonnull
    public AddressFaxNumberCreateFluentHelper createAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber) {
        return new AddressFaxNumberCreateFluentHelper(servicePath, addressFaxNumber);
    }

    @Override
    @Nonnull
    public AddressFaxNumberUpdateFluentHelper updateAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber) {
        return new AddressFaxNumberUpdateFluentHelper(servicePath, addressFaxNumber);
    }

    @Override
    @Nonnull
    public AddressFaxNumberDeleteFluentHelper deleteAddressFaxNumber(
        @Nonnull
        final AddressFaxNumber addressFaxNumber) {
        return new AddressFaxNumberDeleteFluentHelper(servicePath, addressFaxNumber);
    }

    @Override
    @Nonnull
    public AddressHomePageURLFluentHelper getAllAddressHomePageURL() {
        return new AddressHomePageURLFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public AddressHomePageURLByKeyFluentHelper getAddressHomePageURLByKey(final String addressID, final String person, final String ordinalNumber, final LocalDateTime validityStartDate, final Boolean isDefaultURLAddress) {
        return new AddressHomePageURLByKeyFluentHelper(servicePath, addressID, person, ordinalNumber, validityStartDate, isDefaultURLAddress);
    }

    @Override
    @Nonnull
    public AddressHomePageURLCreateFluentHelper createAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL) {
        return new AddressHomePageURLCreateFluentHelper(servicePath, addressHomePageURL);
    }

    @Override
    @Nonnull
    public AddressHomePageURLUpdateFluentHelper updateAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL) {
        return new AddressHomePageURLUpdateFluentHelper(servicePath, addressHomePageURL);
    }

    @Override
    @Nonnull
    public AddressHomePageURLDeleteFluentHelper deleteAddressHomePageURL(
        @Nonnull
        final AddressHomePageURL addressHomePageURL) {
        return new AddressHomePageURLDeleteFluentHelper(servicePath, addressHomePageURL);
    }

    @Override
    @Nonnull
    public AddressPhoneNumberFluentHelper getAllAddressPhoneNumber() {
        return new AddressPhoneNumberFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public AddressPhoneNumberByKeyFluentHelper getAddressPhoneNumberByKey(final String addressID, final String person, final String ordinalNumber) {
        return new AddressPhoneNumberByKeyFluentHelper(servicePath, addressID, person, ordinalNumber);
    }

    @Override
    @Nonnull
    public AddressPhoneNumberCreateFluentHelper createAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber) {
        return new AddressPhoneNumberCreateFluentHelper(servicePath, addressPhoneNumber);
    }

    @Override
    @Nonnull
    public AddressPhoneNumberUpdateFluentHelper updateAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber) {
        return new AddressPhoneNumberUpdateFluentHelper(servicePath, addressPhoneNumber);
    }

    @Override
    @Nonnull
    public AddressPhoneNumberDeleteFluentHelper deleteAddressPhoneNumber(
        @Nonnull
        final AddressPhoneNumber addressPhoneNumber) {
        return new AddressPhoneNumberDeleteFluentHelper(servicePath, addressPhoneNumber);
    }

    @Override
    @Nonnull
    public BPContactToAddressFluentHelper getAllBPContactToAddress() {
        return new BPContactToAddressFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BPContactToAddressByKeyFluentHelper getBPContactToAddressByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate, final String addressID) {
        return new BPContactToAddressByKeyFluentHelper(servicePath, relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate, addressID);
    }

    @Override
    @Nonnull
    public BPContactToFuncAndDeptFluentHelper getAllBPContactToFuncAndDept() {
        return new BPContactToFuncAndDeptFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BPContactToFuncAndDeptByKeyFluentHelper getBPContactToFuncAndDeptByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate) {
        return new BPContactToFuncAndDeptByKeyFluentHelper(servicePath, relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate);
    }

    @Override
    @Nonnull
    public BPContactToFuncAndDeptUpdateFluentHelper updateBPContactToFuncAndDept(
        @Nonnull
        final BPContactToFuncAndDept bPContactToFuncAndDept) {
        return new BPContactToFuncAndDeptUpdateFluentHelper(servicePath, bPContactToFuncAndDept);
    }

    @Override
    @Nonnull
    public BuPaAddressUsageFluentHelper getAllBuPaAddressUsage() {
        return new BuPaAddressUsageFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BuPaAddressUsageByKeyFluentHelper getBuPaAddressUsageByKey(final String businessPartner, final ZonedDateTime validityEndDate, final String addressUsage, final String addressID) {
        return new BuPaAddressUsageByKeyFluentHelper(servicePath, businessPartner, validityEndDate, addressUsage, addressID);
    }

    @Override
    @Nonnull
    public BuPaAddressUsageCreateFluentHelper createBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage) {
        return new BuPaAddressUsageCreateFluentHelper(servicePath, buPaAddressUsage);
    }

    @Override
    @Nonnull
    public BuPaAddressUsageUpdateFluentHelper updateBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage) {
        return new BuPaAddressUsageUpdateFluentHelper(servicePath, buPaAddressUsage);
    }

    @Override
    @Nonnull
    public BuPaAddressUsageDeleteFluentHelper deleteBuPaAddressUsage(
        @Nonnull
        final BuPaAddressUsage buPaAddressUsage) {
        return new BuPaAddressUsageDeleteFluentHelper(servicePath, buPaAddressUsage);
    }

    @Override
    @Nonnull
    public BuPaIdentificationFluentHelper getAllBuPaIdentification() {
        return new BuPaIdentificationFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BuPaIdentificationByKeyFluentHelper getBuPaIdentificationByKey(final String businessPartner, final String bPIdentificationType, final String bPIdentificationNumber) {
        return new BuPaIdentificationByKeyFluentHelper(servicePath, businessPartner, bPIdentificationType, bPIdentificationNumber);
    }

    @Override
    @Nonnull
    public BuPaIdentificationCreateFluentHelper createBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification) {
        return new BuPaIdentificationCreateFluentHelper(servicePath, buPaIdentification);
    }

    @Override
    @Nonnull
    public BuPaIdentificationUpdateFluentHelper updateBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification) {
        return new BuPaIdentificationUpdateFluentHelper(servicePath, buPaIdentification);
    }

    @Override
    @Nonnull
    public BuPaIdentificationDeleteFluentHelper deleteBuPaIdentification(
        @Nonnull
        final BuPaIdentification buPaIdentification) {
        return new BuPaIdentificationDeleteFluentHelper(servicePath, buPaIdentification);
    }

    @Override
    @Nonnull
    public BuPaIndustryFluentHelper getAllBuPaIndustry() {
        return new BuPaIndustryFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BuPaIndustryByKeyFluentHelper getBuPaIndustryByKey(final String industrySector, final String industrySystemType, final String businessPartner) {
        return new BuPaIndustryByKeyFluentHelper(servicePath, industrySector, industrySystemType, businessPartner);
    }

    @Override
    @Nonnull
    public BuPaIndustryCreateFluentHelper createBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry) {
        return new BuPaIndustryCreateFluentHelper(servicePath, buPaIndustry);
    }

    @Override
    @Nonnull
    public BuPaIndustryUpdateFluentHelper updateBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry) {
        return new BuPaIndustryUpdateFluentHelper(servicePath, buPaIndustry);
    }

    @Override
    @Nonnull
    public BuPaIndustryDeleteFluentHelper deleteBuPaIndustry(
        @Nonnull
        final BuPaIndustry buPaIndustry) {
        return new BuPaIndustryDeleteFluentHelper(servicePath, buPaIndustry);
    }

    @Override
    @Nonnull
    public BusinessPartnerFluentHelper getAllBusinessPartner() {
        return new BusinessPartnerFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerByKeyFluentHelper getBusinessPartnerByKey(final String businessPartner) {
        return new BusinessPartnerByKeyFluentHelper(servicePath, businessPartner);
    }

    @Override
    @Nonnull
    public BusinessPartnerCreateFluentHelper createBusinessPartner(
        @Nonnull
        final BusinessPartner businessPartner) {
        return new BusinessPartnerCreateFluentHelper(servicePath, businessPartner);
    }

    @Override
    @Nonnull
    public BusinessPartnerUpdateFluentHelper updateBusinessPartner(
        @Nonnull
        final BusinessPartner businessPartner) {
        return new BusinessPartnerUpdateFluentHelper(servicePath, businessPartner);
    }

    @Override
    @Nonnull
    public BusinessPartnerAddressFluentHelper getAllBusinessPartnerAddress() {
        return new BusinessPartnerAddressFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerAddressByKeyFluentHelper getBusinessPartnerAddressByKey(final String businessPartner, final String addressID) {
        return new BusinessPartnerAddressByKeyFluentHelper(servicePath, businessPartner, addressID);
    }

    @Override
    @Nonnull
    public BusinessPartnerAddressCreateFluentHelper createBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress) {
        return new BusinessPartnerAddressCreateFluentHelper(servicePath, businessPartnerAddress);
    }

    @Override
    @Nonnull
    public BusinessPartnerAddressUpdateFluentHelper updateBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress) {
        return new BusinessPartnerAddressUpdateFluentHelper(servicePath, businessPartnerAddress);
    }

    @Override
    @Nonnull
    public BusinessPartnerAddressDeleteFluentHelper deleteBusinessPartnerAddress(
        @Nonnull
        final BusinessPartnerAddress businessPartnerAddress) {
        return new BusinessPartnerAddressDeleteFluentHelper(servicePath, businessPartnerAddress);
    }

    @Override
    @Nonnull
    public BusinessPartnerBankFluentHelper getAllBusinessPartnerBank() {
        return new BusinessPartnerBankFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerBankByKeyFluentHelper getBusinessPartnerBankByKey(final String businessPartner, final String bankIdentification) {
        return new BusinessPartnerBankByKeyFluentHelper(servicePath, businessPartner, bankIdentification);
    }

    @Override
    @Nonnull
    public BusinessPartnerBankCreateFluentHelper createBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank) {
        return new BusinessPartnerBankCreateFluentHelper(servicePath, businessPartnerBank);
    }

    @Override
    @Nonnull
    public BusinessPartnerBankUpdateFluentHelper updateBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank) {
        return new BusinessPartnerBankUpdateFluentHelper(servicePath, businessPartnerBank);
    }

    @Override
    @Nonnull
    public BusinessPartnerBankDeleteFluentHelper deleteBusinessPartnerBank(
        @Nonnull
        final BusinessPartnerBank businessPartnerBank) {
        return new BusinessPartnerBankDeleteFluentHelper(servicePath, businessPartnerBank);
    }

    @Override
    @Nonnull
    public BusinessPartnerContactFluentHelper getAllBusinessPartnerContact() {
        return new BusinessPartnerContactFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerContactByKeyFluentHelper getBusinessPartnerContactByKey(final String relationshipNumber, final String businessPartnerCompany, final String businessPartnerPerson, final LocalDateTime validityEndDate) {
        return new BusinessPartnerContactByKeyFluentHelper(servicePath, relationshipNumber, businessPartnerCompany, businessPartnerPerson, validityEndDate);
    }

    @Override
    @Nonnull
    public BusinessPartnerContactCreateFluentHelper createBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact) {
        return new BusinessPartnerContactCreateFluentHelper(servicePath, businessPartnerContact);
    }

    @Override
    @Nonnull
    public BusinessPartnerContactUpdateFluentHelper updateBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact) {
        return new BusinessPartnerContactUpdateFluentHelper(servicePath, businessPartnerContact);
    }

    @Override
    @Nonnull
    public BusinessPartnerContactDeleteFluentHelper deleteBusinessPartnerContact(
        @Nonnull
        final BusinessPartnerContact businessPartnerContact) {
        return new BusinessPartnerContactDeleteFluentHelper(servicePath, businessPartnerContact);
    }

    @Override
    @Nonnull
    public BusinessPartnerRoleFluentHelper getAllBusinessPartnerRole() {
        return new BusinessPartnerRoleFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerRoleByKeyFluentHelper getBusinessPartnerRoleByKey(final String businessPartner, final String businessPartnerRole) {
        return new BusinessPartnerRoleByKeyFluentHelper(servicePath, businessPartner, businessPartnerRole);
    }

    @Override
    @Nonnull
    public BusinessPartnerRoleCreateFluentHelper createBusinessPartnerRole(
        @Nonnull
        final BusinessPartnerRole businessPartnerRole) {
        return new BusinessPartnerRoleCreateFluentHelper(servicePath, businessPartnerRole);
    }

    @Override
    @Nonnull
    public BusinessPartnerRoleUpdateFluentHelper updateBusinessPartnerRole(
        @Nonnull
        final BusinessPartnerRole businessPartnerRole) {
        return new BusinessPartnerRoleUpdateFluentHelper(servicePath, businessPartnerRole);
    }

    @Override
    @Nonnull
    public BusinessPartnerTaxNumberFluentHelper getAllBusinessPartnerTaxNumber() {
        return new BusinessPartnerTaxNumberFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public BusinessPartnerTaxNumberByKeyFluentHelper getBusinessPartnerTaxNumberByKey(final String businessPartner, final String bPTaxType) {
        return new BusinessPartnerTaxNumberByKeyFluentHelper(servicePath, businessPartner, bPTaxType);
    }

    @Override
    @Nonnull
    public BusinessPartnerTaxNumberCreateFluentHelper createBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber) {
        return new BusinessPartnerTaxNumberCreateFluentHelper(servicePath, businessPartnerTaxNumber);
    }

    @Override
    @Nonnull
    public BusinessPartnerTaxNumberUpdateFluentHelper updateBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber) {
        return new BusinessPartnerTaxNumberUpdateFluentHelper(servicePath, businessPartnerTaxNumber);
    }

    @Override
    @Nonnull
    public BusinessPartnerTaxNumberDeleteFluentHelper deleteBusinessPartnerTaxNumber(
        @Nonnull
        final BusinessPartnerTaxNumber businessPartnerTaxNumber) {
        return new BusinessPartnerTaxNumberDeleteFluentHelper(servicePath, businessPartnerTaxNumber);
    }

    @Override
    @Nonnull
    public CustomerFluentHelper getAllCustomer() {
        return new CustomerFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerByKeyFluentHelper getCustomerByKey(final String customer) {
        return new CustomerByKeyFluentHelper(servicePath, customer);
    }

    @Override
    @Nonnull
    public CustomerUpdateFluentHelper updateCustomer(
        @Nonnull
        final Customer customer) {
        return new CustomerUpdateFluentHelper(servicePath, customer);
    }

    @Override
    @Nonnull
    public CustomerCompanyFluentHelper getAllCustomerCompany() {
        return new CustomerCompanyFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerCompanyByKeyFluentHelper getCustomerCompanyByKey(final String customer, final String companyCode) {
        return new CustomerCompanyByKeyFluentHelper(servicePath, customer, companyCode);
    }

    @Override
    @Nonnull
    public CustomerCompanyCreateFluentHelper createCustomerCompany(
        @Nonnull
        final CustomerCompany customerCompany) {
        return new CustomerCompanyCreateFluentHelper(servicePath, customerCompany);
    }

    @Override
    @Nonnull
    public CustomerCompanyUpdateFluentHelper updateCustomerCompany(
        @Nonnull
        final CustomerCompany customerCompany) {
        return new CustomerCompanyUpdateFluentHelper(servicePath, customerCompany);
    }

    @Override
    @Nonnull
    public CustomerDunningFluentHelper getAllCustomerDunning() {
        return new CustomerDunningFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerDunningByKeyFluentHelper getCustomerDunningByKey(final String customer, final String companyCode, final String dunningArea) {
        return new CustomerDunningByKeyFluentHelper(servicePath, customer, companyCode, dunningArea);
    }

    @Override
    @Nonnull
    public CustomerDunningCreateFluentHelper createCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning) {
        return new CustomerDunningCreateFluentHelper(servicePath, customerDunning);
    }

    @Override
    @Nonnull
    public CustomerDunningUpdateFluentHelper updateCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning) {
        return new CustomerDunningUpdateFluentHelper(servicePath, customerDunning);
    }

    @Override
    @Nonnull
    public CustomerDunningDeleteFluentHelper deleteCustomerDunning(
        @Nonnull
        final CustomerDunning customerDunning) {
        return new CustomerDunningDeleteFluentHelper(servicePath, customerDunning);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaFluentHelper getAllCustomerSalesArea() {
        return new CustomerSalesAreaFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaByKeyFluentHelper getCustomerSalesAreaByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division) {
        return new CustomerSalesAreaByKeyFluentHelper(servicePath, customer, salesOrganization, distributionChannel, division);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaCreateFluentHelper createCustomerSalesArea(
        @Nonnull
        final CustomerSalesArea customerSalesArea) {
        return new CustomerSalesAreaCreateFluentHelper(servicePath, customerSalesArea);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaUpdateFluentHelper updateCustomerSalesArea(
        @Nonnull
        final CustomerSalesArea customerSalesArea) {
        return new CustomerSalesAreaUpdateFluentHelper(servicePath, customerSalesArea);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaTaxFluentHelper getAllCustomerSalesAreaTax() {
        return new CustomerSalesAreaTaxFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaTaxByKeyFluentHelper getCustomerSalesAreaTaxByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division, final String departureCountry, final String customerTaxCategory) {
        return new CustomerSalesAreaTaxByKeyFluentHelper(servicePath, customer, salesOrganization, distributionChannel, division, departureCountry, customerTaxCategory);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaTaxCreateFluentHelper createCustomerSalesAreaTax(
        @Nonnull
        final CustomerSalesAreaTax customerSalesAreaTax) {
        return new CustomerSalesAreaTaxCreateFluentHelper(servicePath, customerSalesAreaTax);
    }

    @Override
    @Nonnull
    public CustomerSalesAreaTaxUpdateFluentHelper updateCustomerSalesAreaTax(
        @Nonnull
        final CustomerSalesAreaTax customerSalesAreaTax) {
        return new CustomerSalesAreaTaxUpdateFluentHelper(servicePath, customerSalesAreaTax);
    }

    @Override
    @Nonnull
    public CustomerWithHoldingTaxFluentHelper getAllCustomerWithHoldingTax() {
        return new CustomerWithHoldingTaxFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustomerWithHoldingTaxByKeyFluentHelper getCustomerWithHoldingTaxByKey(final String customer, final String companyCode, final String withholdingTaxType) {
        return new CustomerWithHoldingTaxByKeyFluentHelper(servicePath, customer, companyCode, withholdingTaxType);
    }

    @Override
    @Nonnull
    public CustomerWithHoldingTaxCreateFluentHelper createCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax) {
        return new CustomerWithHoldingTaxCreateFluentHelper(servicePath, customerWithHoldingTax);
    }

    @Override
    @Nonnull
    public CustomerWithHoldingTaxUpdateFluentHelper updateCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax) {
        return new CustomerWithHoldingTaxUpdateFluentHelper(servicePath, customerWithHoldingTax);
    }

    @Override
    @Nonnull
    public CustomerWithHoldingTaxDeleteFluentHelper deleteCustomerWithHoldingTax(
        @Nonnull
        final CustomerWithHoldingTax customerWithHoldingTax) {
        return new CustomerWithHoldingTaxDeleteFluentHelper(servicePath, customerWithHoldingTax);
    }

    @Override
    @Nonnull
    public CustSalesPartnerFuncFluentHelper getAllCustSalesPartnerFunc() {
        return new CustSalesPartnerFuncFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public CustSalesPartnerFuncByKeyFluentHelper getCustSalesPartnerFuncByKey(final String customer, final String salesOrganization, final String distributionChannel, final String division, final String partnerCounter, final String partnerFunction) {
        return new CustSalesPartnerFuncByKeyFluentHelper(servicePath, customer, salesOrganization, distributionChannel, division, partnerCounter, partnerFunction);
    }

    @Override
    @Nonnull
    public CustSalesPartnerFuncCreateFluentHelper createCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc) {
        return new CustSalesPartnerFuncCreateFluentHelper(servicePath, custSalesPartnerFunc);
    }

    @Override
    @Nonnull
    public CustSalesPartnerFuncUpdateFluentHelper updateCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc) {
        return new CustSalesPartnerFuncUpdateFluentHelper(servicePath, custSalesPartnerFunc);
    }

    @Override
    @Nonnull
    public CustSalesPartnerFuncDeleteFluentHelper deleteCustSalesPartnerFunc(
        @Nonnull
        final CustSalesPartnerFunc custSalesPartnerFunc) {
        return new CustSalesPartnerFuncDeleteFluentHelper(servicePath, custSalesPartnerFunc);
    }

    @Override
    @Nonnull
    public SupplierFluentHelper getAllSupplier() {
        return new SupplierFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierByKeyFluentHelper getSupplierByKey(final String supplier) {
        return new SupplierByKeyFluentHelper(servicePath, supplier);
    }

    @Override
    @Nonnull
    public SupplierUpdateFluentHelper updateSupplier(
        @Nonnull
        final Supplier supplier) {
        return new SupplierUpdateFluentHelper(servicePath, supplier);
    }

    @Override
    @Nonnull
    public SupplierCompanyFluentHelper getAllSupplierCompany() {
        return new SupplierCompanyFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierCompanyByKeyFluentHelper getSupplierCompanyByKey(final String supplier, final String companyCode) {
        return new SupplierCompanyByKeyFluentHelper(servicePath, supplier, companyCode);
    }

    @Override
    @Nonnull
    public SupplierCompanyCreateFluentHelper createSupplierCompany(
        @Nonnull
        final SupplierCompany supplierCompany) {
        return new SupplierCompanyCreateFluentHelper(servicePath, supplierCompany);
    }

    @Override
    @Nonnull
    public SupplierCompanyUpdateFluentHelper updateSupplierCompany(
        @Nonnull
        final SupplierCompany supplierCompany) {
        return new SupplierCompanyUpdateFluentHelper(servicePath, supplierCompany);
    }

    @Override
    @Nonnull
    public SupplierDunningFluentHelper getAllSupplierDunning() {
        return new SupplierDunningFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierDunningByKeyFluentHelper getSupplierDunningByKey(final String supplier, final String companyCode, final String dunningArea) {
        return new SupplierDunningByKeyFluentHelper(servicePath, supplier, companyCode, dunningArea);
    }

    @Override
    @Nonnull
    public SupplierDunningCreateFluentHelper createSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning) {
        return new SupplierDunningCreateFluentHelper(servicePath, supplierDunning);
    }

    @Override
    @Nonnull
    public SupplierDunningUpdateFluentHelper updateSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning) {
        return new SupplierDunningUpdateFluentHelper(servicePath, supplierDunning);
    }

    @Override
    @Nonnull
    public SupplierDunningDeleteFluentHelper deleteSupplierDunning(
        @Nonnull
        final SupplierDunning supplierDunning) {
        return new SupplierDunningDeleteFluentHelper(servicePath, supplierDunning);
    }

    @Override
    @Nonnull
    public SupplierPartnerFuncFluentHelper getAllSupplierPartnerFunc() {
        return new SupplierPartnerFuncFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierPartnerFuncByKeyFluentHelper getSupplierPartnerFuncByKey(final String supplier, final String purchasingOrganization, final String supplierSubrange, final String plant, final String partnerFunction, final String partnerCounter) {
        return new SupplierPartnerFuncByKeyFluentHelper(servicePath, supplier, purchasingOrganization, supplierSubrange, plant, partnerFunction, partnerCounter);
    }

    @Override
    @Nonnull
    public SupplierPartnerFuncCreateFluentHelper createSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc) {
        return new SupplierPartnerFuncCreateFluentHelper(servicePath, supplierPartnerFunc);
    }

    @Override
    @Nonnull
    public SupplierPartnerFuncUpdateFluentHelper updateSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc) {
        return new SupplierPartnerFuncUpdateFluentHelper(servicePath, supplierPartnerFunc);
    }

    @Override
    @Nonnull
    public SupplierPartnerFuncDeleteFluentHelper deleteSupplierPartnerFunc(
        @Nonnull
        final SupplierPartnerFunc supplierPartnerFunc) {
        return new SupplierPartnerFuncDeleteFluentHelper(servicePath, supplierPartnerFunc);
    }

    @Override
    @Nonnull
    public SupplierPurchasingOrgFluentHelper getAllSupplierPurchasingOrg() {
        return new SupplierPurchasingOrgFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierPurchasingOrgByKeyFluentHelper getSupplierPurchasingOrgByKey(final String supplier, final String purchasingOrganization) {
        return new SupplierPurchasingOrgByKeyFluentHelper(servicePath, supplier, purchasingOrganization);
    }

    @Override
    @Nonnull
    public SupplierPurchasingOrgCreateFluentHelper createSupplierPurchasingOrg(
        @Nonnull
        final SupplierPurchasingOrg supplierPurchasingOrg) {
        return new SupplierPurchasingOrgCreateFluentHelper(servicePath, supplierPurchasingOrg);
    }

    @Override
    @Nonnull
    public SupplierPurchasingOrgUpdateFluentHelper updateSupplierPurchasingOrg(
        @Nonnull
        final SupplierPurchasingOrg supplierPurchasingOrg) {
        return new SupplierPurchasingOrgUpdateFluentHelper(servicePath, supplierPurchasingOrg);
    }

    @Override
    @Nonnull
    public SupplierWithHoldingTaxFluentHelper getAllSupplierWithHoldingTax() {
        return new SupplierWithHoldingTaxFluentHelper(servicePath);
    }

    @Override
    @Nonnull
    public SupplierWithHoldingTaxByKeyFluentHelper getSupplierWithHoldingTaxByKey(final String supplier, final String companyCode, final String withholdingTaxType) {
        return new SupplierWithHoldingTaxByKeyFluentHelper(servicePath, supplier, companyCode, withholdingTaxType);
    }

    @Override
    @Nonnull
    public SupplierWithHoldingTaxCreateFluentHelper createSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax) {
        return new SupplierWithHoldingTaxCreateFluentHelper(servicePath, supplierWithHoldingTax);
    }

    @Override
    @Nonnull
    public SupplierWithHoldingTaxUpdateFluentHelper updateSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax) {
        return new SupplierWithHoldingTaxUpdateFluentHelper(servicePath, supplierWithHoldingTax);
    }

    @Override
    @Nonnull
    public SupplierWithHoldingTaxDeleteFluentHelper deleteSupplierWithHoldingTax(
        @Nonnull
        final SupplierWithHoldingTax supplierWithHoldingTax) {
        return new SupplierWithHoldingTaxDeleteFluentHelper(servicePath, supplierWithHoldingTax);
    }

}
