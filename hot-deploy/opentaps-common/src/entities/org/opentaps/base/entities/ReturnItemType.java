package org.opentaps.base.entities;

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
 * Auto generated base entity ReturnItemType.
 */
@javax.persistence.Entity
@Table(name="RETURN_ITEM_TYPE")
public class ReturnItemType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnItemTypeId", "RETURN_ITEM_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReturnItemType", fields);
}
  public static enum Fields implements EntityFieldInterface<ReturnItemType> {
    returnItemTypeId("returnItemTypeId"),
    parentTypeId("parentTypeId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="ReturnItemType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ReturnItemType_GEN")
   @Id
   @Column(name="RETURN_ITEM_TYPE_ID")
   private String returnItemTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnItemType parentReturnItemType = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_TYPE_ID")
   
   private List<ReturnItem> returnItems = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<ReturnItemType> childReturnItemTypes = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ITEM_TYPE_ID")
   
   private List<ReturnItemTypeMap> returnItemTypeMaps = null;

  /**
   * Default constructor.
   */
  public ReturnItemType() {
      super();
      this.baseEntityName = "ReturnItemType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnItemTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReturnItemType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnItemTypeId the returnItemTypeId to set
     */
    public void setReturnItemTypeId(String returnItemTypeId) {
        this.returnItemTypeId = returnItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
    public String getReturnItemTypeId() {
        return this.returnItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
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
     * Auto generated method that gets the related <code>ReturnItemType</code> by the relation named <code>ParentReturnItemType</code>.
     * @return the <code>ReturnItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnItemType getParentReturnItemType() throws RepositoryException {
        if (this.parentReturnItemType == null) {
            this.parentReturnItemType = getRelatedOne(ReturnItemType.class, "ParentReturnItemType");
        }
        return this.parentReturnItemType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItem</code> by the relation named <code>ReturnItem</code>.
     * @return the list of <code>ReturnItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItem> getReturnItems() throws RepositoryException {
        if (this.returnItems == null) {
            this.returnItems = getRelated(ReturnItem.class, "ReturnItem");
        }
        return this.returnItems;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemType</code> by the relation named <code>ChildReturnItemType</code>.
     * @return the list of <code>ReturnItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemType> getChildReturnItemTypes() throws RepositoryException {
        if (this.childReturnItemTypes == null) {
            this.childReturnItemTypes = getRelated(ReturnItemType.class, "ChildReturnItemType");
        }
        return this.childReturnItemTypes;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemTypeMap</code> by the relation named <code>ReturnItemTypeMap</code>.
     * @return the list of <code>ReturnItemTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemTypeMap> getReturnItemTypeMaps() throws RepositoryException {
        if (this.returnItemTypeMaps == null) {
            this.returnItemTypeMaps = getRelated(ReturnItemTypeMap.class, "ReturnItemTypeMap");
        }
        return this.returnItemTypeMaps;
    }

    /**
     * Auto generated value setter.
     * @param parentReturnItemType the parentReturnItemType to set
    */
    public void setParentReturnItemType(ReturnItemType parentReturnItemType) {
        this.parentReturnItemType = parentReturnItemType;
    }
    /**
     * Auto generated value setter.
     * @param returnItems the returnItems to set
    */
    public void setReturnItems(List<ReturnItem> returnItems) {
        this.returnItems = returnItems;
    }
    /**
     * Auto generated value setter.
     * @param childReturnItemTypes the childReturnItemTypes to set
    */
    public void setChildReturnItemTypes(List<ReturnItemType> childReturnItemTypes) {
        this.childReturnItemTypes = childReturnItemTypes;
    }
    /**
     * Auto generated value setter.
     * @param returnItemTypeMaps the returnItemTypeMaps to set
    */
    public void setReturnItemTypeMaps(List<ReturnItemTypeMap> returnItemTypeMaps) {
        this.returnItemTypeMaps = returnItemTypeMaps;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnItemTypeId((String) mapValue.get("returnItemTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("returnItemTypeId", getReturnItemTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}