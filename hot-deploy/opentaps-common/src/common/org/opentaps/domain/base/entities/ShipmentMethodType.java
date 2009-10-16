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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ShipmentMethodType.
 */
@javax.persistence.Entity
@Table(name="SHIPMENT_METHOD_TYPE")
public class ShipmentMethodType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("shipmentMethodTypeId", "SHIPMENT_METHOD_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ShipmentMethodType", fields);
}
  public static enum Fields implements EntityFieldInterface<ShipmentMethodType> {
    shipmentMethodTypeId("shipmentMethodTypeId"),
    description("description"),
    sequenceNum("sequenceNum"),
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

   @org.hibernate.annotations.GenericGenerator(name="ShipmentMethodType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ShipmentMethodType_GEN")
   @Id
   @Column(name="SHIPMENT_METHOD_TYPE_ID")
   private String shipmentMethodTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<AmazonOrderItemFulfillment> amazonOrderItemFulfillments = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<CarrierReturnService> carrierReturnServices = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="shipmentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<CarrierShipmentMethod> carrierShipmentMethods = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="shipmentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<FacilityCarrierShipment> facilityCarrierShipments = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<OldOrderShipmentPreference> oldOrderShipmentPreferences = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<OrderItemShipGroup> orderItemShipGroups = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<Picklist> picklists = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="DEFAULT_SHIP_METHOD_ID")
   
   private List<ProductStore> productStores = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="shipmentMethodType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<ProductStoreVendorShipment> productStoreVendorShipments = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID")
   
   private List<ShipmentRouteSegment> shipmentRouteSegments = null;

  /**
   * Default constructor.
   */
  public ShipmentMethodType() {
      super();
      this.baseEntityName = "ShipmentMethodType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shipmentMethodTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ShipmentMethodType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param shipmentMethodTypeId the shipmentMethodTypeId to set
     */
    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getShipmentMethodTypeId() {
        return this.shipmentMethodTypeId;
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>AmazonOrderItemFulfillment</code> by the relation named <code>AmazonOrderItemFulfillment</code>.
     * @return the list of <code>AmazonOrderItemFulfillment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrderItemFulfillment> getAmazonOrderItemFulfillments() throws RepositoryException {
        if (this.amazonOrderItemFulfillments == null) {
            this.amazonOrderItemFulfillments = getRelated(AmazonOrderItemFulfillment.class, "AmazonOrderItemFulfillment");
        }
        return this.amazonOrderItemFulfillments;
    }
    /**
     * Auto generated method that gets the related <code>CarrierReturnService</code> by the relation named <code>CarrierReturnService</code>.
     * @return the list of <code>CarrierReturnService</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CarrierReturnService> getCarrierReturnServices() throws RepositoryException {
        if (this.carrierReturnServices == null) {
            this.carrierReturnServices = getRelated(CarrierReturnService.class, "CarrierReturnService");
        }
        return this.carrierReturnServices;
    }
    /**
     * Auto generated method that gets the related <code>CarrierShipmentMethod</code> by the relation named <code>CarrierShipmentMethod</code>.
     * @return the list of <code>CarrierShipmentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CarrierShipmentMethod> getCarrierShipmentMethods() throws RepositoryException {
        if (this.carrierShipmentMethods == null) {
            this.carrierShipmentMethods = getRelated(CarrierShipmentMethod.class, "CarrierShipmentMethod");
        }
        return this.carrierShipmentMethods;
    }
    /**
     * Auto generated method that gets the related <code>FacilityCarrierShipment</code> by the relation named <code>FacilityCarrierShipment</code>.
     * @return the list of <code>FacilityCarrierShipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityCarrierShipment> getFacilityCarrierShipments() throws RepositoryException {
        if (this.facilityCarrierShipments == null) {
            this.facilityCarrierShipments = getRelated(FacilityCarrierShipment.class, "FacilityCarrierShipment");
        }
        return this.facilityCarrierShipments;
    }
    /**
     * Auto generated method that gets the related <code>OldOrderShipmentPreference</code> by the relation named <code>OldOrderShipmentPreference</code>.
     * @return the list of <code>OldOrderShipmentPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OldOrderShipmentPreference> getOldOrderShipmentPreferences() throws RepositoryException {
        if (this.oldOrderShipmentPreferences == null) {
            this.oldOrderShipmentPreferences = getRelated(OldOrderShipmentPreference.class, "OldOrderShipmentPreference");
        }
        return this.oldOrderShipmentPreferences;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGroup</code> by the relation named <code>OrderItemShipGroup</code>.
     * @return the list of <code>OrderItemShipGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemShipGroup> getOrderItemShipGroups() throws RepositoryException {
        if (this.orderItemShipGroups == null) {
            this.orderItemShipGroups = getRelated(OrderItemShipGroup.class, "OrderItemShipGroup");
        }
        return this.orderItemShipGroups;
    }
    /**
     * Auto generated method that gets the related <code>Picklist</code> by the relation named <code>Picklist</code>.
     * @return the list of <code>Picklist</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Picklist> getPicklists() throws RepositoryException {
        if (this.picklists == null) {
            this.picklists = getRelated(Picklist.class, "Picklist");
        }
        return this.picklists;
    }
    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>ProductStore</code>.
     * @return the list of <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStore> getProductStores() throws RepositoryException {
        if (this.productStores == null) {
            this.productStores = getRelated(ProductStore.class, "ProductStore");
        }
        return this.productStores;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreVendorShipment</code> by the relation named <code>ProductStoreVendorShipment</code>.
     * @return the list of <code>ProductStoreVendorShipment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStoreVendorShipment> getProductStoreVendorShipments() throws RepositoryException {
        if (this.productStoreVendorShipments == null) {
            this.productStoreVendorShipments = getRelated(ProductStoreVendorShipment.class, "ProductStoreVendorShipment");
        }
        return this.productStoreVendorShipments;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentRouteSegment</code> by the relation named <code>ShipmentRouteSegment</code>.
     * @return the list of <code>ShipmentRouteSegment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShipmentRouteSegment> getShipmentRouteSegments() throws RepositoryException {
        if (this.shipmentRouteSegments == null) {
            this.shipmentRouteSegments = getRelated(ShipmentRouteSegment.class, "ShipmentRouteSegment");
        }
        return this.shipmentRouteSegments;
    }

    /**
     * Auto generated value setter.
     * @param amazonOrderItemFulfillments the amazonOrderItemFulfillments to set
    */
    public void setAmazonOrderItemFulfillments(List<AmazonOrderItemFulfillment> amazonOrderItemFulfillments) {
        this.amazonOrderItemFulfillments = amazonOrderItemFulfillments;
    }
    /**
     * Auto generated value setter.
     * @param carrierReturnServices the carrierReturnServices to set
    */
    public void setCarrierReturnServices(List<CarrierReturnService> carrierReturnServices) {
        this.carrierReturnServices = carrierReturnServices;
    }
    /**
     * Auto generated value setter.
     * @param carrierShipmentMethods the carrierShipmentMethods to set
    */
    public void setCarrierShipmentMethods(List<CarrierShipmentMethod> carrierShipmentMethods) {
        this.carrierShipmentMethods = carrierShipmentMethods;
    }
    /**
     * Auto generated value setter.
     * @param facilityCarrierShipments the facilityCarrierShipments to set
    */
    public void setFacilityCarrierShipments(List<FacilityCarrierShipment> facilityCarrierShipments) {
        this.facilityCarrierShipments = facilityCarrierShipments;
    }
    /**
     * Auto generated value setter.
     * @param oldOrderShipmentPreferences the oldOrderShipmentPreferences to set
    */
    public void setOldOrderShipmentPreferences(List<OldOrderShipmentPreference> oldOrderShipmentPreferences) {
        this.oldOrderShipmentPreferences = oldOrderShipmentPreferences;
    }
    /**
     * Auto generated value setter.
     * @param orderItemShipGroups the orderItemShipGroups to set
    */
    public void setOrderItemShipGroups(List<OrderItemShipGroup> orderItemShipGroups) {
        this.orderItemShipGroups = orderItemShipGroups;
    }
    /**
     * Auto generated value setter.
     * @param picklists the picklists to set
    */
    public void setPicklists(List<Picklist> picklists) {
        this.picklists = picklists;
    }
    /**
     * Auto generated value setter.
     * @param productStores the productStores to set
    */
    public void setProductStores(List<ProductStore> productStores) {
        this.productStores = productStores;
    }
    /**
     * Auto generated value setter.
     * @param productStoreVendorShipments the productStoreVendorShipments to set
    */
    public void setProductStoreVendorShipments(List<ProductStoreVendorShipment> productStoreVendorShipments) {
        this.productStoreVendorShipments = productStoreVendorShipments;
    }
    /**
     * Auto generated value setter.
     * @param shipmentRouteSegments the shipmentRouteSegments to set
    */
    public void setShipmentRouteSegments(List<ShipmentRouteSegment> shipmentRouteSegments) {
        this.shipmentRouteSegments = shipmentRouteSegments;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
        if (this.carrierShipmentMethods == null) {
            this.carrierShipmentMethods = new ArrayList<CarrierShipmentMethod>();
        }
        this.carrierShipmentMethods.add(carrierShipmentMethod);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
        if (this.carrierShipmentMethods == null) {
            return;
        }
        this.carrierShipmentMethods.remove(carrierShipmentMethod);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCarrierShipmentMethod() {
        if (this.carrierShipmentMethods == null) {
            return;
        }
        this.carrierShipmentMethods.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addFacilityCarrierShipment(FacilityCarrierShipment facilityCarrierShipment) {
        if (this.facilityCarrierShipments == null) {
            this.facilityCarrierShipments = new ArrayList<FacilityCarrierShipment>();
        }
        this.facilityCarrierShipments.add(facilityCarrierShipment);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFacilityCarrierShipment(FacilityCarrierShipment facilityCarrierShipment) {
        if (this.facilityCarrierShipments == null) {
            return;
        }
        this.facilityCarrierShipments.remove(facilityCarrierShipment);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFacilityCarrierShipment() {
        if (this.facilityCarrierShipments == null) {
            return;
        }
        this.facilityCarrierShipments.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductStoreVendorShipment(ProductStoreVendorShipment productStoreVendorShipment) {
        if (this.productStoreVendorShipments == null) {
            this.productStoreVendorShipments = new ArrayList<ProductStoreVendorShipment>();
        }
        this.productStoreVendorShipments.add(productStoreVendorShipment);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductStoreVendorShipment(ProductStoreVendorShipment productStoreVendorShipment) {
        if (this.productStoreVendorShipments == null) {
            return;
        }
        this.productStoreVendorShipments.remove(productStoreVendorShipment);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductStoreVendorShipment() {
        if (this.productStoreVendorShipments == null) {
            return;
        }
        this.productStoreVendorShipments.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setDescription((String) mapValue.get("description"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
