package org.opentaps.domain.base.entities;

/*
* Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the Honest Public License.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* Honest Public License for more details.
*
* You should have received a copy of the Honest Public License
* along with this program; if not, write to Funambol,
* 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity TaxAuthority.
 */
@javax.persistence.Entity
@Table(name="TAX_AUTHORITY")
public class TaxAuthority extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("taxAuthGeoId", "TAX_AUTH_GEO_ID");
        fields.put("taxAuthPartyId", "TAX_AUTH_PARTY_ID");
        fields.put("requireTaxIdForExemption", "REQUIRE_TAX_ID_FOR_EXEMPTION");
        fields.put("taxIdFormatPattern", "TAX_ID_FORMAT_PATTERN");
        fields.put("includeTaxInPrice", "INCLUDE_TAX_IN_PRICE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TaxAuthority", fields);
}
  public static enum Fields implements EntityFieldInterface<TaxAuthority> {
    taxAuthGeoId("taxAuthGeoId"),
    taxAuthPartyId("taxAuthPartyId"),
    requireTaxIdForExemption("requireTaxIdForExemption"),
    taxIdFormatPattern("taxIdFormatPattern"),
    includeTaxInPrice("includeTaxInPrice"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.TaxAuthorityPkBridge.class)
     private TaxAuthorityPk id = new TaxAuthorityPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>TaxAuthorityPk</code>
     */
      public TaxAuthorityPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>TaxAuthorityPk</code> value to set
    */   
      public void setId(TaxAuthorityPk id) {
         this.id = id;
      }
   @Column(name="REQUIRE_TAX_ID_FOR_EXEMPTION")
   private String requireTaxIdForExemption;
   @Column(name="TAX_ID_FORMAT_PATTERN")
   private String taxIdFormatPattern;
   @Column(name="INCLUDE_TAX_IN_PRICE")
   private String includeTaxInPrice;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TAX_AUTH_GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo taxAuthGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TAX_AUTH_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party taxAuthParty = null;
   private transient List<AmazonOrderTaxJurisToAuth> amazonOrderTaxJurisToAuths = null;
   private transient List<OrderAdjustment> orderAdjustments = null;
   private transient List<PartyTaxAuthInfo> partyTaxAuthInfoes = null;
   private transient List<ProductStore> vatProductStores = null;
   private transient List<QuoteAdjustment> quoteAdjustments = null;
   private transient List<ReturnAdjustment> returnAdjustments = null;
   private transient List<TaxAuthorityAssoc> taxAuthorityAssocs = null;
   private transient List<TaxAuthorityAssoc> toTaxAuthorityAssocs = null;
   private transient List<TaxAuthorityCategory> taxAuthorityCategorys = null;
   private transient List<TaxAuthorityGlAccount> taxAuthorityGlAccounts = null;
   private transient List<TaxAuthorityRateProduct> taxAuthorityRateProducts = null;

  /**
   * Default constructor.
   */
  public TaxAuthority() {
      super();
      this.baseEntityName = "TaxAuthority";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("taxAuthGeoId");this.primaryKeyNames.add("taxAuthPartyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("requireTaxIdForExemption");this.allFieldsNames.add("taxIdFormatPattern");this.allFieldsNames.add("includeTaxInPrice");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TaxAuthority(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        id.setTaxAuthGeoId(taxAuthGeoId);
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        id.setTaxAuthPartyId(taxAuthPartyId);
    }
    /**
     * Auto generated value setter.
     * @param requireTaxIdForExemption the requireTaxIdForExemption to set
     */
    public void setRequireTaxIdForExemption(String requireTaxIdForExemption) {
        this.requireTaxIdForExemption = requireTaxIdForExemption;
    }
    /**
     * Auto generated value setter.
     * @param taxIdFormatPattern the taxIdFormatPattern to set
     */
    public void setTaxIdFormatPattern(String taxIdFormatPattern) {
        this.taxIdFormatPattern = taxIdFormatPattern;
    }
    /**
     * Auto generated value setter.
     * @param includeTaxInPrice the includeTaxInPrice to set
     */
    public void setIncludeTaxInPrice(String includeTaxInPrice) {
        this.includeTaxInPrice = includeTaxInPrice;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.id.getTaxAuthGeoId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.id.getTaxAuthPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireTaxIdForExemption() {
        return this.requireTaxIdForExemption;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxIdFormatPattern() {
        return this.taxIdFormatPattern;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIncludeTaxInPrice() {
        return this.includeTaxInPrice;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>TaxAuthGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getTaxAuthGeo() throws RepositoryException {
        if (this.taxAuthGeo == null) {
            this.taxAuthGeo = getRelatedOne(Geo.class, "TaxAuthGeo");
        }
        return this.taxAuthGeo;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>TaxAuthParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getTaxAuthParty() throws RepositoryException {
        if (this.taxAuthParty == null) {
            this.taxAuthParty = getRelatedOne(Party.class, "TaxAuthParty");
        }
        return this.taxAuthParty;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderTaxJurisToAuth</code> by the relation named <code>AmazonOrderTaxJurisToAuth</code>.
     * @return the list of <code>AmazonOrderTaxJurisToAuth</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrderTaxJurisToAuth> getAmazonOrderTaxJurisToAuths() throws RepositoryException {
        if (this.amazonOrderTaxJurisToAuths == null) {
            this.amazonOrderTaxJurisToAuths = getRelated(AmazonOrderTaxJurisToAuth.class, "AmazonOrderTaxJurisToAuth");
        }
        return this.amazonOrderTaxJurisToAuths;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustment</code> by the relation named <code>OrderAdjustment</code>.
     * @return the list of <code>OrderAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustment> getOrderAdjustments() throws RepositoryException {
        if (this.orderAdjustments == null) {
            this.orderAdjustments = getRelated(OrderAdjustment.class, "OrderAdjustment");
        }
        return this.orderAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>PartyTaxAuthInfo</code> by the relation named <code>PartyTaxAuthInfo</code>.
     * @return the list of <code>PartyTaxAuthInfo</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyTaxAuthInfo> getPartyTaxAuthInfoes() throws RepositoryException {
        if (this.partyTaxAuthInfoes == null) {
            this.partyTaxAuthInfoes = getRelated(PartyTaxAuthInfo.class, "PartyTaxAuthInfo");
        }
        return this.partyTaxAuthInfoes;
    }
    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>VatProductStore</code>.
     * @return the list of <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStore> getVatProductStores() throws RepositoryException {
        if (this.vatProductStores == null) {
            this.vatProductStores = getRelated(ProductStore.class, "VatProductStore");
        }
        return this.vatProductStores;
    }
    /**
     * Auto generated method that gets the related <code>QuoteAdjustment</code> by the relation named <code>QuoteAdjustment</code>.
     * @return the list of <code>QuoteAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteAdjustment> getQuoteAdjustments() throws RepositoryException {
        if (this.quoteAdjustments == null) {
            this.quoteAdjustments = getRelated(QuoteAdjustment.class, "QuoteAdjustment");
        }
        return this.quoteAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnAdjustment</code> by the relation named <code>ReturnAdjustment</code>.
     * @return the list of <code>ReturnAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnAdjustment> getReturnAdjustments() throws RepositoryException {
        if (this.returnAdjustments == null) {
            this.returnAdjustments = getRelated(ReturnAdjustment.class, "ReturnAdjustment");
        }
        return this.returnAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>TaxAuthorityAssoc</code> by the relation named <code>TaxAuthorityAssoc</code>.
     * @return the list of <code>TaxAuthorityAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TaxAuthorityAssoc> getTaxAuthorityAssocs() throws RepositoryException {
        if (this.taxAuthorityAssocs == null) {
            this.taxAuthorityAssocs = getRelated(TaxAuthorityAssoc.class, "TaxAuthorityAssoc");
        }
        return this.taxAuthorityAssocs;
    }
    /**
     * Auto generated method that gets the related <code>TaxAuthorityAssoc</code> by the relation named <code>ToTaxAuthorityAssoc</code>.
     * @return the list of <code>TaxAuthorityAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TaxAuthorityAssoc> getToTaxAuthorityAssocs() throws RepositoryException {
        if (this.toTaxAuthorityAssocs == null) {
            this.toTaxAuthorityAssocs = getRelated(TaxAuthorityAssoc.class, "ToTaxAuthorityAssoc");
        }
        return this.toTaxAuthorityAssocs;
    }
    /**
     * Auto generated method that gets the related <code>TaxAuthorityCategory</code> by the relation named <code>TaxAuthorityCategory</code>.
     * @return the list of <code>TaxAuthorityCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TaxAuthorityCategory> getTaxAuthorityCategorys() throws RepositoryException {
        if (this.taxAuthorityCategorys == null) {
            this.taxAuthorityCategorys = getRelated(TaxAuthorityCategory.class, "TaxAuthorityCategory");
        }
        return this.taxAuthorityCategorys;
    }
    /**
     * Auto generated method that gets the related <code>TaxAuthorityGlAccount</code> by the relation named <code>TaxAuthorityGlAccount</code>.
     * @return the list of <code>TaxAuthorityGlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TaxAuthorityGlAccount> getTaxAuthorityGlAccounts() throws RepositoryException {
        if (this.taxAuthorityGlAccounts == null) {
            this.taxAuthorityGlAccounts = getRelated(TaxAuthorityGlAccount.class, "TaxAuthorityGlAccount");
        }
        return this.taxAuthorityGlAccounts;
    }
    /**
     * Auto generated method that gets the related <code>TaxAuthorityRateProduct</code> by the relation named <code>TaxAuthorityRateProduct</code>.
     * @return the list of <code>TaxAuthorityRateProduct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TaxAuthorityRateProduct> getTaxAuthorityRateProducts() throws RepositoryException {
        if (this.taxAuthorityRateProducts == null) {
            this.taxAuthorityRateProducts = getRelated(TaxAuthorityRateProduct.class, "TaxAuthorityRateProduct");
        }
        return this.taxAuthorityRateProducts;
    }

    /**
     * Auto generated value setter.
     * @param taxAuthGeo the taxAuthGeo to set
    */
    public void setTaxAuthGeo(Geo taxAuthGeo) {
        this.taxAuthGeo = taxAuthGeo;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthParty the taxAuthParty to set
    */
    public void setTaxAuthParty(Party taxAuthParty) {
        this.taxAuthParty = taxAuthParty;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderTaxJurisToAuths the amazonOrderTaxJurisToAuths to set
    */
    public void setAmazonOrderTaxJurisToAuths(List<AmazonOrderTaxJurisToAuth> amazonOrderTaxJurisToAuths) {
        this.amazonOrderTaxJurisToAuths = amazonOrderTaxJurisToAuths;
    }
    /**
     * Auto generated value setter.
     * @param orderAdjustments the orderAdjustments to set
    */
    public void setOrderAdjustments(List<OrderAdjustment> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param partyTaxAuthInfoes the partyTaxAuthInfoes to set
    */
    public void setPartyTaxAuthInfoes(List<PartyTaxAuthInfo> partyTaxAuthInfoes) {
        this.partyTaxAuthInfoes = partyTaxAuthInfoes;
    }
    /**
     * Auto generated value setter.
     * @param vatProductStores the vatProductStores to set
    */
    public void setVatProductStores(List<ProductStore> vatProductStores) {
        this.vatProductStores = vatProductStores;
    }
    /**
     * Auto generated value setter.
     * @param quoteAdjustments the quoteAdjustments to set
    */
    public void setQuoteAdjustments(List<QuoteAdjustment> quoteAdjustments) {
        this.quoteAdjustments = quoteAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param returnAdjustments the returnAdjustments to set
    */
    public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
        this.returnAdjustments = returnAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthorityAssocs the taxAuthorityAssocs to set
    */
    public void setTaxAuthorityAssocs(List<TaxAuthorityAssoc> taxAuthorityAssocs) {
        this.taxAuthorityAssocs = taxAuthorityAssocs;
    }
    /**
     * Auto generated value setter.
     * @param toTaxAuthorityAssocs the toTaxAuthorityAssocs to set
    */
    public void setToTaxAuthorityAssocs(List<TaxAuthorityAssoc> toTaxAuthorityAssocs) {
        this.toTaxAuthorityAssocs = toTaxAuthorityAssocs;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthorityCategorys the taxAuthorityCategorys to set
    */
    public void setTaxAuthorityCategorys(List<TaxAuthorityCategory> taxAuthorityCategorys) {
        this.taxAuthorityCategorys = taxAuthorityCategorys;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthorityGlAccounts the taxAuthorityGlAccounts to set
    */
    public void setTaxAuthorityGlAccounts(List<TaxAuthorityGlAccount> taxAuthorityGlAccounts) {
        this.taxAuthorityGlAccounts = taxAuthorityGlAccounts;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthorityRateProducts the taxAuthorityRateProducts to set
    */
    public void setTaxAuthorityRateProducts(List<TaxAuthorityRateProduct> taxAuthorityRateProducts) {
        this.taxAuthorityRateProducts = taxAuthorityRateProducts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setRequireTaxIdForExemption((String) mapValue.get("requireTaxIdForExemption"));
        setTaxIdFormatPattern((String) mapValue.get("taxIdFormatPattern"));
        setIncludeTaxInPrice((String) mapValue.get("includeTaxInPrice"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("requireTaxIdForExemption", getRequireTaxIdForExemption());
        mapValue.put("taxIdFormatPattern", getTaxIdFormatPattern());
        mapValue.put("includeTaxInPrice", getIncludeTaxInPrice());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
