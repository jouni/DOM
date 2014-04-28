package org.vaadin.jouni.dom;

import org.vaadin.jouni.dom.client.Css;
import org.vaadin.jouni.dom.client.DomState;

import com.vaadin.server.AbstractClientConnector;
import com.vaadin.server.AbstractExtension;

/**
 * An extension that makes it possible to manipulate the DOM attributes of any
 * Vaadin connector element.
 * 
 * @author jouni@vaadin.com
 * 
 */
public class Dom extends AbstractExtension {

    private static final long serialVersionUID = 2729039463017815457L;

    public Dom(AbstractClientConnector target) {
        extend(target);
    }

    @Override
    public void extend(AbstractClientConnector target) {
        super.extend(target);
    }

    @Override
    public DomState getState() {
        return (DomState) super.getState();
    }

    /**
     * Set an attribute value
     * 
     * @param attribute
     *            the JavaScript name of the attribute
     * @param value
     *            the value of the attribute. Use <code>null</code> to unset the
     *            attribute
     * @return
     */
    public Dom setAttribute(String attribute, String value) {
        getState().attributes.put(attribute.toLowerCase(), value);
        getState().increment++;
        return this;
    }

    public Dom setTabIndex(int tabIndex) {
        return setAttribute("tabIndex", "" + tabIndex);
    }

    /**
     * Get the Css properties for this extension. Any CSS properties you set
     * will be added to the inline style of the target connector.
     * 
     * @return
     */
    public Css getStyle() {
        getState().increment++;
        return getState().css;
    }

}
