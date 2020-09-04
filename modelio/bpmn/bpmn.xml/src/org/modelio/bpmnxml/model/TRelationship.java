/* 
 * Copyright 2013-2018 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRelationship">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/>
 * &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="direction" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRelationshipDirection" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("35f44c51-08d0-483b-a97d-f91d44d832a2")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRelationship", propOrder = {
    "source",
    "target"
})
public class TRelationship extends TBaseElement {
    @objid ("fddb7c99-8ff6-4281-a2bb-42035a7e6ecb")
    @XmlAttribute(name = "type", required = true)
    protected String type;

    @objid ("db096174-011d-4e0c-b65e-777e3afbb626")
    @XmlAttribute(name = "direction")
    protected TRelationshipDirection direction;

    @objid ("e961e7da-0040-45c5-abcf-1a74c002a72a")
    @XmlElement(required = true)
    protected List<QName> source;

    @objid ("45a8acfa-a26f-4c02-b04a-a68c91fa09ab")
    @XmlElement(required = true)
    protected List<QName> target;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("9acac125-24aa-42a3-aad2-cc2153900294")
    public List<QName> getSource() {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        return this.source;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("b12d51e3-c885-4755-a4f8-de59c696732f")
    public List<QName> getTarget() {
        if (this.target == null) {
            this.target = new ArrayList<>();
        }
        return this.target;
    }

    /**
     * Gets the value of the type property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("cc15362a-2f11-49c7-a49c-a11d19ddfab2")
    public String getType() {
        return this.type;
    }

    /**
     * Sets the value of the type property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("f8c8dda5-9657-4eb0-8c72-2d13d0e88b87")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the direction property.
     * @return
     * possible object is
     * {@link TRelationshipDirection }
     */
    @objid ("4b19a650-58cd-4779-9c6b-cc0f223ee1cd")
    public TRelationshipDirection getDirection() {
        return this.direction;
    }

    /**
     * Sets the value of the direction property.
     * @param value allowed object is
     * {@link TRelationshipDirection }
     */
    @objid ("1ce24e08-bdcf-4af4-8a24-b229e8456fca")
    public void setDirection(TRelationshipDirection value) {
        this.direction = value;
    }

}