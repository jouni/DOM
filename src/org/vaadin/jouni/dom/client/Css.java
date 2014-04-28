package org.vaadin.jouni.dom.client;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A simple class representing CSS property values
 * 
 * @author jouni@vaadin.com
 * 
 */
public class Css {

    /**
     * The CSS properties for this object, a simple name->value map
     */
    public HashMap<String, String> properties = new HashMap<String, String>();

    /**
     * A temporary variable for combining transform values
     */
    protected String transforms = "";

    /**
     * 
     * @param property
     *            CSS name of the property (e.g. background-color, not
     *            backgroundColor)
     * @param value
     *            the CSS value of the property
     * @return
     */
    public Css setProperty(String property, String value) {
        properties.put(property.toLowerCase(), value);
        return this;
    }

    public Css opacity(double value) {
        setProperty("opacity", "" + value);
        return this;
    }

    public Css resetTransform() {
        transforms = "";
        setProperty("transform", transforms);
        return this;
    }

    public Css translate(String x, String y) {
        transforms += " translate(" + x + "," + y + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css translateX(String x) {
        transforms += " translateX(" + x + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css translateY(String y) {
        transforms += " translateY(" + y + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css rotate(int deg) {
        transforms += " rotate(" + deg + "deg)";
        setProperty("transform", transforms);
        return this;
    }

    public Css scale(double scale) {
        transforms += " scale(" + scale + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css scaleX(double scaleX) {
        transforms += " scaleX(" + scaleX + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css scaleY(double scaleY) {
        transforms += " scaleY(" + scaleY + ")";
        setProperty("transform", transforms);
        return this;
    }

    public Css width(String width) {
        setProperty("width", width);
        return this;
    }

    public Css height(String height) {
        setProperty("height", height);
        return this;
    }

    @Override
    public String toString() {
        String val = "{";
        for (Entry<String, String> entry : properties.entrySet()) {
            val += entry.getKey() + ": " + entry.getValue() + ", ";
        }
        val += "}";
        return val;
    }
}
