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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkEffortAssoc.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_ASSOC")
public class WorkEffortAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortIdFrom", "WORK_EFFORT_ID_FROM");
        fields.put("workEffortIdTo", "WORK_EFFORT_ID_TO");
        fields.put("workEffortAssocTypeId", "WORK_EFFORT_ASSOC_TYPE_ID");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortAssoc> {
    workEffortIdFrom("workEffortIdFrom"),
    workEffortIdTo("workEffortIdTo"),
    workEffortAssocTypeId("workEffortAssocTypeId"),
    sequenceNum("sequenceNum"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.WorkEffortAssocPkBridge.class)
     private WorkEffortAssocPk id = new WorkEffortAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkEffortAssocPk</code>
     */
      public WorkEffortAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkEffortAssocPk</code> value to set
    */   
      public void setId(WorkEffortAssocPk id) {
         this.id = id;
      }
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ASSOC_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffortAssocType workEffortAssocType = null;
   private transient List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort fromWorkEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort toWorkEffort = null;
   private transient List<WorkEffortAssocAttribute> workEffortAssocAttributes = null;

  /**
   * Default constructor.
   */
  public WorkEffortAssoc() {
      super();
      this.baseEntityName = "WorkEffortAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortIdFrom");this.primaryKeyNames.add("workEffortIdTo");this.primaryKeyNames.add("workEffortAssocTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortIdFrom");this.allFieldsNames.add("workEffortIdTo");this.allFieldsNames.add("workEffortAssocTypeId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortIdFrom the workEffortIdFrom to set
     */
    public void setWorkEffortIdFrom(String workEffortIdFrom) {
        id.setWorkEffortIdFrom(workEffortIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param workEffortIdTo the workEffortIdTo to set
     */
    public void setWorkEffortIdTo(String workEffortIdTo) {
        id.setWorkEffortIdTo(workEffortIdTo);
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeId the workEffortAssocTypeId to set
     */
    public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        id.setWorkEffortAssocTypeId(workEffortAssocTypeId);
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getWorkEffortIdFrom() {
        return this.id.getWorkEffortIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortIdTo() {
        return this.id.getWorkEffortIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortAssocTypeId() {
        return this.id.getWorkEffortAssocTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>WorkEffortAssocType</code> by the relation named <code>WorkEffortAssocType</code>.
     * @return the <code>WorkEffortAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortAssocType getWorkEffortAssocType() throws RepositoryException {
        if (this.workEffortAssocType == null) {
            this.workEffortAssocType = getRelatedOne(WorkEffortAssocType.class, "WorkEffortAssocType");
        }
        return this.workEffortAssocType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssocTypeAttr</code> by the relation named <code>WorkEffortAssocTypeAttr</code>.
     * @return the list of <code>WorkEffortAssocTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssocTypeAttr> getWorkEffortAssocTypeAttrs() throws RepositoryException {
        if (this.workEffortAssocTypeAttrs == null) {
            this.workEffortAssocTypeAttrs = getRelated(WorkEffortAssocTypeAttr.class, "WorkEffortAssocTypeAttr");
        }
        return this.workEffortAssocTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>FromWorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getFromWorkEffort() throws RepositoryException {
        if (this.fromWorkEffort == null) {
            this.fromWorkEffort = getRelatedOne(WorkEffort.class, "FromWorkEffort");
        }
        return this.fromWorkEffort;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>ToWorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getToWorkEffort() throws RepositoryException {
        if (this.toWorkEffort == null) {
            this.toWorkEffort = getRelatedOne(WorkEffort.class, "ToWorkEffort");
        }
        return this.toWorkEffort;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortAssocAttribute</code> by the relation named <code>WorkEffortAssocAttribute</code>.
     * @return the list of <code>WorkEffortAssocAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortAssocAttribute> getWorkEffortAssocAttributes() throws RepositoryException {
        if (this.workEffortAssocAttributes == null) {
            this.workEffortAssocAttributes = getRelated(WorkEffortAssocAttribute.class, "WorkEffortAssocAttribute");
        }
        return this.workEffortAssocAttributes;
    }

    /**
     * Auto generated value setter.
     * @param workEffortAssocType the workEffortAssocType to set
    */
    public void setWorkEffortAssocType(WorkEffortAssocType workEffortAssocType) {
        this.workEffortAssocType = workEffortAssocType;
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocTypeAttrs the workEffortAssocTypeAttrs to set
    */
    public void setWorkEffortAssocTypeAttrs(List<WorkEffortAssocTypeAttr> workEffortAssocTypeAttrs) {
        this.workEffortAssocTypeAttrs = workEffortAssocTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param fromWorkEffort the fromWorkEffort to set
    */
    public void setFromWorkEffort(WorkEffort fromWorkEffort) {
        this.fromWorkEffort = fromWorkEffort;
    }
    /**
     * Auto generated value setter.
     * @param toWorkEffort the toWorkEffort to set
    */
    public void setToWorkEffort(WorkEffort toWorkEffort) {
        this.toWorkEffort = toWorkEffort;
    }
    /**
     * Auto generated value setter.
     * @param workEffortAssocAttributes the workEffortAssocAttributes to set
    */
    public void setWorkEffortAssocAttributes(List<WorkEffortAssocAttribute> workEffortAssocAttributes) {
        this.workEffortAssocAttributes = workEffortAssocAttributes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortIdFrom((String) mapValue.get("workEffortIdFrom"));
        setWorkEffortIdTo((String) mapValue.get("workEffortIdTo"));
        setWorkEffortAssocTypeId((String) mapValue.get("workEffortAssocTypeId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("workEffortIdFrom", getWorkEffortIdFrom());
        mapValue.put("workEffortIdTo", getWorkEffortIdTo());
        mapValue.put("workEffortAssocTypeId", getWorkEffortAssocTypeId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}