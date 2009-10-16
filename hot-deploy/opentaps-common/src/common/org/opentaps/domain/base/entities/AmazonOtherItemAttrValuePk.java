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
public class AmazonOtherItemAttrValuePk implements Serializable {
    @Column(name="PRODUCT_ID")
    private String productId;
    @Column(name="OTHER_ITEM_ATTR_ID")
    private String otherItemAttrId;
    
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param otherItemAttrId the otherItemAttrId to set
     */
    public void setOtherItemAttrId(String otherItemAttrId) {
        this.otherItemAttrId = otherItemAttrId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */  
    public String getOtherItemAttrId() {
        return this.otherItemAttrId;
    }
}
