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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tThrowEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tThrowEvent">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEvent">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInput" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInputAssociation" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}inputSet" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}eventDefinition" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="eventDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("9aaee349-caa4-4b76-b0be-6ab43e482e50")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tThrowEvent", propOrder = {
    "dataInput",
    "dataInputAssociation",
    "inputSet",
    "eventDefinition",
    "eventDefinitionRef"
})
@XmlSeeAlso({
    TEndEvent.class,
    TIntermediateThrowEvent.class,
    TImplicitThrowEvent.class
})
public abstract class TThrowEvent extends TEvent {
    @objid ("c0cf8308-2b5b-4377-84d0-c790cc8a96b9")
    protected List<TDataInput> dataInput;

    @objid ("c9a6ca0a-dbd9-4150-88f8-aa3bacd11ba2")
    protected List<TDataInputAssociation> dataInputAssociation;

    @objid ("71378842-8d29-4cab-989b-a5e6dbaae4d5")
    protected TInputSet inputSet;

    @objid ("07060928-7535-451a-9cdd-673e87ebf7e4")
    @XmlElementRef(name = "eventDefinition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TEventDefinition>> eventDefinition;

    @objid ("4d76ff28-2c2a-4268-9ad9-39fbde100574")
    protected List<QName> eventDefinitionRef;

    /**
     * Gets the value of the dataInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDataInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataInput }
     */
    @objid ("6b6885cd-a920-4e28-83c2-72b4e3660d9c")
    public List<TDataInput> getDataInput() {
        if (this.dataInput == null) {
            this.dataInput = new ArrayList<>();
        }
        return this.dataInput;
    }

    /**
     * Gets the value of the dataInputAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDataInputAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataInputAssociation }
     */
    @objid ("44c9c8cb-fad0-4eb4-9d51-f55bbf971dbb")
    public List<TDataInputAssociation> getDataInputAssociation() {
        if (this.dataInputAssociation == null) {
            this.dataInputAssociation = new ArrayList<>();
        }
        return this.dataInputAssociation;
    }

    /**
     * Gets the value of the inputSet property.
     * @return
     * possible object is
     * {@link TInputSet }
     */
    @objid ("58815c26-365b-480a-99b5-f1cd724d21f5")
    public TInputSet getInputSet() {
        return this.inputSet;
    }

    /**
     * Sets the value of the inputSet property.
     * @param value allowed object is
     * {@link TInputSet }
     */
    @objid ("1ad65f44-de82-4117-80c5-e7ed440a9943")
    public void setInputSet(TInputSet value) {
        this.inputSet = value;
    }

    /**
     * Gets the value of the eventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     */
    @objid ("229bb59e-d235-4f03-a89f-b4b9674705fd")
    public List<JAXBElement<? extends TEventDefinition>> getEventDefinition() {
        if (this.eventDefinition == null) {
            this.eventDefinition = new ArrayList<>();
        }
        return this.eventDefinition;
    }

    /**
     * Gets the value of the eventDefinitionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinitionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getEventDefinitionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("9c638532-e7f3-439a-ae92-458547ccf71e")
    public List<QName> getEventDefinitionRef() {
        if (this.eventDefinitionRef == null) {
            this.eventDefinitionRef = new ArrayList<>();
        }
        return this.eventDefinitionRef;
    }

}