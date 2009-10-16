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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity AmazonOrderItemPriceComp.
 */
@javax.persistence.Entity
@Table(name="AMAZON_ORDER_ITEM_PRICE_COMP")
public class AmazonOrderItemPriceComp extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("amazonOrderId", "AMAZON_ORDER_ID");
        fields.put("amazonOrderItemCode", "AMAZON_ORDER_ITEM_CODE");
        fields.put("componentType", "COMPONENT_TYPE");
        fields.put("componentCurrency", "COMPONENT_CURRENCY");
        fields.put("componentAmount", "COMPONENT_AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonOrderItemPriceComp", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonOrderItemPriceComp> {
    amazonOrderId("amazonOrderId"),
    amazonOrderItemCode("amazonOrderItemCode"),
    componentType("componentType"),
    componentCurrency("componentCurrency"),
    componentAmount("componentAmount"),
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

   @FieldBridge(impl = org.opentaps.domain.base.entities.bridge.AmazonOrderItemPriceCompPkBridge.class)
     private AmazonOrderItemPriceCompPk id = new AmazonOrderItemPriceCompPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AmazonOrderItemPriceCompPk</code>
     */
      public AmazonOrderItemPriceCompPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AmazonOrderItemPriceCompPk</code> value to set
    */   
      public void setId(AmazonOrderItemPriceCompPk id) {
         this.id = id;
      }
   @Column(name="COMPONENT_CURRENCY")
   private String componentCurrency;
   @Column(name="COMPONENT_AMOUNT")
   private BigDecimal componentAmount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient AmazonOrderItem amazonOrderItem = null;

  /**
   * Default constructor.
   */
  public AmazonOrderItemPriceComp() {
      super();
      this.baseEntityName = "AmazonOrderItemPriceComp";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("amazonOrderId");this.primaryKeyNames.add("amazonOrderItemCode");this.primaryKeyNames.add("componentType");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("amazonOrderId");this.allFieldsNames.add("amazonOrderItemCode");this.allFieldsNames.add("componentType");this.allFieldsNames.add("componentCurrency");this.allFieldsNames.add("componentAmount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonOrderItemPriceComp(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param amazonOrderId the amazonOrderId to set
     */
    public void setAmazonOrderId(String amazonOrderId) {
        id.setAmazonOrderId(amazonOrderId);
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemCode the amazonOrderItemCode to set
     */
    public void setAmazonOrderItemCode(String amazonOrderItemCode) {
        id.setAmazonOrderItemCode(amazonOrderItemCode);
    }
    /**
     * Auto generated value setter.
     * @param componentType the componentType to set
     */
    public void setComponentType(String componentType) {
        id.setComponentType(componentType);
    }
    /**
     * Auto generated value setter.
     * @param componentCurrency the componentCurrency to set
     */
    public void setComponentCurrency(String componentCurrency) {
        this.componentCurrency = componentCurrency;
    }
    /**
     * Auto generated value setter.
     * @param componentAmount the componentAmount to set
     */
    public void setComponentAmount(BigDecimal componentAmount) {
        this.componentAmount = componentAmount;
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
    public String getAmazonOrderId() {
        return this.id.getAmazonOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAmazonOrderItemCode() {
        return this.id.getAmazonOrderItemCode();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComponentType() {
        return this.id.getComponentType();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComponentCurrency() {
        return this.componentCurrency;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getComponentAmount() {
        return this.componentAmount;
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
     * Auto generated method that gets the related <code>AmazonOrderItem</code> by the relation named <code>AmazonOrderItem</code>.
     * @return the <code>AmazonOrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonOrderItem getAmazonOrderItem() throws RepositoryException {
        if (this.amazonOrderItem == null) {
            this.amazonOrderItem = getRelatedOne(AmazonOrderItem.class, "AmazonOrderItem");
        }
        return this.amazonOrderItem;
    }

    /**
     * Auto generated value setter.
     * @param amazonOrderItem the amazonOrderItem to set
    */
    public void setAmazonOrderItem(AmazonOrderItem amazonOrderItem) {
        this.amazonOrderItem = amazonOrderItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAmazonOrderId((String) mapValue.get("amazonOrderId"));
        setAmazonOrderItemCode((String) mapValue.get("amazonOrderItemCode"));
        setComponentType((String) mapValue.get("componentType"));
        setComponentCurrency((String) mapValue.get("componentCurrency"));
        setComponentAmount(convertToBigDecimal(mapValue.get("componentAmount")));
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
        mapValue.put("amazonOrderId", getAmazonOrderId());
        mapValue.put("amazonOrderItemCode", getAmazonOrderItemCode());
        mapValue.put("componentType", getComponentType());
        mapValue.put("componentCurrency", getComponentCurrency());
        mapValue.put("componentAmount", getComponentAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
