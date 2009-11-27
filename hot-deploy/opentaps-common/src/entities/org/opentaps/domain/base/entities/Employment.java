package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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
 * Auto generated base entity Employment.
 */
@javax.persistence.Entity
@Table(name="EMPLOYMENT")
public class Employment extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("roleTypeIdFrom", "ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "ROLE_TYPE_ID_TO");
        fields.put("partyIdFrom", "PARTY_ID_FROM");
        fields.put("partyIdTo", "PARTY_ID_TO");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("terminationReasonId", "TERMINATION_REASON_ID");
        fields.put("terminationTypeId", "TERMINATION_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Employment", fields);
}
  public static enum Fields implements EntityFieldInterface<Employment> {
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    terminationReasonId("terminationReasonId"),
    terminationTypeId("terminationTypeId"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.EmploymentPkBridge.class)
     private EmploymentPk id = new EmploymentPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>EmploymentPk</code>
     */
      public EmploymentPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>EmploymentPk</code> value to set
    */   
      public void setId(EmploymentPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="TERMINATION_REASON_ID")
   private String terminationReasonId;
   @Column(name="TERMINATION_TYPE_ID")
   private String terminationTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party toParty = null;
   private transient PartyRole toPartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party fromParty = null;
   private transient PartyRole fromPartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERMINATION_REASON_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TerminationReason terminationReason = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TERMINATION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TerminationType terminationType = null;
   private transient List<Agreement> agreements = null;
   private transient List<AgreementEmploymentAppl> agreementEmploymentAppls = null;
   private transient PayHistory payHistory = null;
   private transient List<UnemploymentClaim> unemploymentClaims = null;

  /**
   * Default constructor.
   */
  public Employment() {
      super();
      this.baseEntityName = "Employment";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("roleTypeIdTo");this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("terminationReasonId");this.allFieldsNames.add("terminationTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Employment(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        id.setRoleTypeIdFrom(roleTypeIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    public void setRoleTypeIdTo(String roleTypeIdTo) {
        id.setRoleTypeIdTo(roleTypeIdTo);
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        id.setPartyIdFrom(partyIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        id.setPartyIdTo(partyIdTo);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param terminationReasonId the terminationReasonId to set
     */
    public void setTerminationReasonId(String terminationReasonId) {
        this.terminationReasonId = terminationReasonId;
    }
    /**
     * Auto generated value setter.
     * @param terminationTypeId the terminationTypeId to set
     */
    public void setTerminationTypeId(String terminationTypeId) {
        this.terminationTypeId = terminationTypeId;
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
    public String getRoleTypeIdFrom() {
        return this.id.getRoleTypeIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.id.getRoleTypeIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.id.getPartyIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.id.getPartyIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTerminationReasonId() {
        return this.terminationReasonId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTerminationTypeId() {
        return this.terminationTypeId;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>ToParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getToParty() throws RepositoryException {
        if (this.toParty == null) {
            this.toParty = getRelatedOne(Party.class, "ToParty");
        }
        return this.toParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>ToPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getToPartyRole() throws RepositoryException {
        if (this.toPartyRole == null) {
            this.toPartyRole = getRelatedOne(PartyRole.class, "ToPartyRole");
        }
        return this.toPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>FromParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getFromParty() throws RepositoryException {
        if (this.fromParty == null) {
            this.fromParty = getRelatedOne(Party.class, "FromParty");
        }
        return this.fromParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>FromPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getFromPartyRole() throws RepositoryException {
        if (this.fromPartyRole == null) {
            this.fromPartyRole = getRelatedOne(PartyRole.class, "FromPartyRole");
        }
        return this.fromPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>TerminationReason</code> by the relation named <code>TerminationReason</code>.
     * @return the <code>TerminationReason</code>
     * @throws RepositoryException if an error occurs
     */
    public TerminationReason getTerminationReason() throws RepositoryException {
        if (this.terminationReason == null) {
            this.terminationReason = getRelatedOne(TerminationReason.class, "TerminationReason");
        }
        return this.terminationReason;
    }
    /**
     * Auto generated method that gets the related <code>TerminationType</code> by the relation named <code>TerminationType</code>.
     * @return the <code>TerminationType</code>
     * @throws RepositoryException if an error occurs
     */
    public TerminationType getTerminationType() throws RepositoryException {
        if (this.terminationType == null) {
            this.terminationType = getRelatedOne(TerminationType.class, "TerminationType");
        }
        return this.terminationType;
    }
    /**
     * Auto generated method that gets the related <code>Agreement</code> by the relation named <code>Agreement</code>.
     * @return the list of <code>Agreement</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Agreement> getAgreements() throws RepositoryException {
        if (this.agreements == null) {
            this.agreements = getRelated(Agreement.class, "Agreement");
        }
        return this.agreements;
    }
    /**
     * Auto generated method that gets the related <code>AgreementEmploymentAppl</code> by the relation named <code>AgreementEmploymentAppl</code>.
     * @return the list of <code>AgreementEmploymentAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementEmploymentAppl> getAgreementEmploymentAppls() throws RepositoryException {
        if (this.agreementEmploymentAppls == null) {
            this.agreementEmploymentAppls = getRelated(AgreementEmploymentAppl.class, "AgreementEmploymentAppl");
        }
        return this.agreementEmploymentAppls;
    }
    /**
     * Auto generated method that gets the related <code>PayHistory</code> by the relation named <code>PayHistory</code>.
     * @return the <code>PayHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public PayHistory getPayHistory() throws RepositoryException {
        if (this.payHistory == null) {
            this.payHistory = getRelatedOne(PayHistory.class, "PayHistory");
        }
        return this.payHistory;
    }
    /**
     * Auto generated method that gets the related <code>UnemploymentClaim</code> by the relation named <code>UnemploymentClaim</code>.
     * @return the list of <code>UnemploymentClaim</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UnemploymentClaim> getUnemploymentClaims() throws RepositoryException {
        if (this.unemploymentClaims == null) {
            this.unemploymentClaims = getRelated(UnemploymentClaim.class, "UnemploymentClaim");
        }
        return this.unemploymentClaims;
    }

    /**
     * Auto generated value setter.
     * @param toParty the toParty to set
    */
    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }
    /**
     * Auto generated value setter.
     * @param toPartyRole the toPartyRole to set
    */
    public void setToPartyRole(PartyRole toPartyRole) {
        this.toPartyRole = toPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param fromParty the fromParty to set
    */
    public void setFromParty(Party fromParty) {
        this.fromParty = fromParty;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyRole the fromPartyRole to set
    */
    public void setFromPartyRole(PartyRole fromPartyRole) {
        this.fromPartyRole = fromPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param terminationReason the terminationReason to set
    */
    public void setTerminationReason(TerminationReason terminationReason) {
        this.terminationReason = terminationReason;
    }
    /**
     * Auto generated value setter.
     * @param terminationType the terminationType to set
    */
    public void setTerminationType(TerminationType terminationType) {
        this.terminationType = terminationType;
    }
    /**
     * Auto generated value setter.
     * @param agreements the agreements to set
    */
    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }
    /**
     * Auto generated value setter.
     * @param agreementEmploymentAppls the agreementEmploymentAppls to set
    */
    public void setAgreementEmploymentAppls(List<AgreementEmploymentAppl> agreementEmploymentAppls) {
        this.agreementEmploymentAppls = agreementEmploymentAppls;
    }
    /**
     * Auto generated value setter.
     * @param payHistory the payHistory to set
    */
    public void setPayHistory(PayHistory payHistory) {
        this.payHistory = payHistory;
    }
    /**
     * Auto generated value setter.
     * @param unemploymentClaims the unemploymentClaims to set
    */
    public void setUnemploymentClaims(List<UnemploymentClaim> unemploymentClaims) {
        this.unemploymentClaims = unemploymentClaims;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setTerminationReasonId((String) mapValue.get("terminationReasonId"));
        setTerminationTypeId((String) mapValue.get("terminationTypeId"));
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
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("terminationReasonId", getTerminationReasonId());
        mapValue.put("terminationTypeId", getTerminationTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}