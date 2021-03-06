package org.opentaps.base.constants;

/*
 * Copyright (c) Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA CHANGE

/**
 * OpentapsConfigurationType constant values.
 */
public final class OpentapsConfigurationTypeConstants {

    private OpentapsConfigurationTypeConstants() { }

    /** Color for new activities on the activities dashboard. */
    public static final String ACTIVITIES_DASHBOARD_LEADS_NEW_COLOR = "ACTIVITIES_DASHBOARD_LEADS_NEW_COLOR";
    /** Color for no activities on the activities dashboard. */
    public static final String ACTIVITIES_DASHBOARD_LEADS_NO_ACTIVITY_COLOR = "ACTIVITIES_DASHBOARD_LEADS_NO_ACTIVITY_COLOR";
    /** Color for older activities on the activities dashboard. */
    public static final String ACTIVITIES_DASHBOARD_LEADS_OLD_COLOR = "ACTIVITIES_DASHBOARD_LEADS_OLD_COLOR";
    /** Cut off in number of days for old versus new activities on the dashboard. */
    public static final String ACTIVITIES_DASHBOARD_LEADS_OLD_NEW_CUTOFF = "ACTIVITIES_DASHBOARD_LEADS_OLD_NEW_CUTOFF";
    /** If it is 'Y' then if the user is not the owner of the activity, then the user cannot update or delete the activity. */
    public static final String ACTIVITY_OWNER_CHANGE_ONLY = "ACTIVITY_OWNER_CHANGE_ONLY";
    /** Filter CRMSFA search and find results by security permission.. */
    public static final String CRMSFA_FIND_SEC_FILTER = "CRMSFA_FIND_SEC_FILTER";
    /** If it is 'Y' then show only the owned ones as before, otherwise show all them. */
    public static final String CRMSFA_MYLEADS_SHOW_OWNED_ONLY = "CRMSFA_MYLEADS_SHOW_OWNED_ONLY";
    /** Default parameters for data import services. */
    public static final String DATAIMPORT_SERVICE_PARAM_DEFAULTS = "DATAIMPORT_SERVICE_PARAM_DEFAULTS";
    /** Accounts Receivable GL account based on default chart of accounts for customer balances. */
    public static final String IMPORTCUSTOMERS__ARGLACCOUNTID = "importCustomers::arGlAccountId";
    /** Party ID for the user who will be responsible for the customers. */
    public static final String IMPORTCUSTOMERS__INITIALRESPONSIBLEPARTYID = "importCustomers::initialResponsiblePartyId";
    /** GL account to offset Accounts Receivable GL account for customer balances. */
    public static final String IMPORTCUSTOMERS__OFFSETTINGGLACCOUNTID = "importCustomers::offsettingGlAccountId";
    /** Your organization's party ID. */
    public static final String IMPORTCUSTOMERS__ORGANIZATIONPARTYID = "importCustomers::organizationPartyId";
    /** Your organization's party ID.  Leave blank if you don't want these GL accounts associated with your organization. */
    public static final String IMPORTGLACCOUNTS__ORGANIZATIONPARTYID = "importGlAccounts::organizationPartyId";
    /** Enter TRUE to calculate order grand totals based on imports or FALSE to use the values in the DataImportOrderHeader bridge table.. */
    public static final String IMPORTORDERS__CALCULATEGRANDTOTAL = "importOrders::calculateGrandTotal";
    /** Your company(organization)'s party ID. */
    public static final String IMPORTORDERS__COMPANYPARTYID = "importOrders::companyPartyId";
    /** Enter TRUE to import order headers without any items or FALSE to skip them.. */
    public static final String IMPORTORDERS__IMPORTEMPTYORDERS = "importOrders::importEmptyOrders";
    /** Enter the ID of the product catalog to associate the sales orders with or leave blank to skip it.. */
    public static final String IMPORTORDERS__PRODCATALOGID = "importOrders::prodCatalogId";
    /** Enter the ID of the product store to associate the sales orders with or leave blank to skip it.. */
    public static final String IMPORTORDERS__PRODUCTSTOREID = "importOrders::productStoreId";
    /** Enter PostalAddress.contactMechId to set as Purchase Orders' destination ship-to address.. */
    public static final String IMPORTORDERS__PURCHASEORDERSHIPTOCONTACTMECHID = "importOrders::purchaseOrderShipToContactMechId";
    /** Enter TRUE to reserve inventory for open sales orders imported or FALSE to skip them.. */
    public static final String IMPORTORDERS__RESERVEINVENTORY = "importOrders::reserveInventory";
    /** Inventory GL account based on default chart of accounts for inventory values. */
    public static final String IMPORTPRODUCTINVENTORY__INVENTORYGLACCOUNTID = "importProductInventory::inventoryGlAccountId";
    /** GL account to offset Inventory GL account for inventory values. */
    public static final String IMPORTPRODUCTINVENTORY__OFFSETTINGGLACCOUNTID = "importProductInventory::offsettingGlAccountId";
    /** Type ID (SKU, UPC, ISBN, ASIN, etc.) for your first special product ID. */
    public static final String IMPORTPRODUCTS__GOODIDENTIFICATIONTYPEID1 = "importProducts::goodIdentificationTypeId1";
    /** Type ID (SKU, UPC, ISBN, ASIN, etc.) for your second special product ID. */
    public static final String IMPORTPRODUCTS__GOODIDENTIFICATIONTYPEID2 = "importProducts::goodIdentificationTypeId2";
    /** Your organization's party ID. */
    public static final String IMPORTSUPPLIERS__ORGANIZATIONPARTYID = "importSuppliers::organizationPartyId";
    /** If it is 'Y' then if the user is not the owner of the note, then the user cannot update or delete the note. */
    public static final String NOTE_OWNER_CHANGE_ONLY = "NOTE_OWNER_CHANGE_ONLY";
    /** For testing set configuration. */
    public static final String TEST_CONFIG_SET_CONFIG_TYPE = "TEST_CONFIG_SET_CONFIG_TYPE";
    /** For testing. */
    public static final String TEST_CONFIG_TYPE = "TEST_CONFIG_TYPE";
    /** For testing. */
    public static final String TEST_CONFIG_UNCONFIGURED_TYPE = "TEST_CONFIG_UNCONFIGURED_TYPE";
    /** Parent configuration type for UI elements. */
    public static final String UI = "UI";
    /** Configures whether the help link will be shown or not. */
    public static final String UI_HELP_LINK_SHOW = "UI_HELP_LINK_SHOW";
    /** Configures the image URI used for the main logo. */
    public static final String UI_LOGO_IMG = "UI_LOGO_IMG";
    /** Configures whether the main logo will be shown or not. */
    public static final String UI_LOGO_SHOW = "UI_LOGO_SHOW";
    /** Configures whether the support link will be shown or not. */
    public static final String UI_SUPPORT_LINK_SHOW = "UI_SUPPORT_LINK_SHOW";
    /** Configures whether the top navigation menu will be shown or not. */
    public static final String UI_TOP_NAV_MENU_SHOW = "UI_TOP_NAV_MENU_SHOW";

}
