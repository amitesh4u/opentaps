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

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class AmazonOrderItemPriceCompPk implements Serializable {
    @Column(name="AMAZON_ORDER_ID")
    private String amazonOrderId;
    @Column(name="AMAZON_ORDER_ITEM_CODE")
    private String amazonOrderItemCode;
    @Column(name="COMPONENT_TYPE")
    private String componentType;
    
    /**
     * Auto generated value setter.
     * @param amazonOrderId the amazonOrderId to set
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemCode the amazonOrderItemCode to set
     */
    public void setAmazonOrderItemCode(String amazonOrderItemCode) {
        this.amazonOrderItemCode = amazonOrderItemCode;
    }
    /**
     * Auto generated value setter.
     * @param componentType the componentType to set
     */
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getAmazonOrderId() {
        return this.amazonOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getAmazonOrderItemCode() {
        return this.amazonOrderItemCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getComponentType() {
        return this.componentType;
    }
}
