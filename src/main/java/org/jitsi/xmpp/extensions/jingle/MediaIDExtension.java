package org.jitsi.xmpp.extensions.jingle;

import org.jitsi.xmpp.extensions.*;

public class MediaIDExtension
        extends AbstractPacketExtension
{
    /**
     * The namespace.
     */
    public static final String NAMESPACE =
            "urn:xmpp:jingle:apps:rtp:media-id:0";
    /**
     * The name of the "candidate" element.
     */
    public static final String ELEMENT_NAME = "media-id";

    /**
     * The name of the ID attribute.
     */
    public static final String ID_ATTR_NAME = "id";

    /**
     * Constructor.
     */
    public MediaIDExtension()
    {
        super(NAMESPACE, ELEMENT_NAME);
    }

    /**
     * Set the ID.
     *
     * @param id ID to set
     */
    public void setID(String id)
    {
        setAttribute(ID_ATTR_NAME, id);
    }

    /**
     * Get the ID.
     *
     * @return the ID
     */
    public String getID()
    {
        return getAttributeAsString(ID_ATTR_NAME);
    }
}
