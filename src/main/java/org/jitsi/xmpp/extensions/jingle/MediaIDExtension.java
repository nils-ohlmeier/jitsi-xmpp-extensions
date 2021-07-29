package org.jitsi.xmpp.extensions.jingle;

import org.jitsi.xmpp.extensions.*;

import java.nio.charset.StandardCharsets;

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

    public MediaIDExtension(String id)
    {
        super(NAMESPACE, ELEMENT_NAME);
        this.setID(id);
    }
    /**
     * Set the ID.
     *
     * @param id ID to set
     */
    public void setID(String id)
    {
        if (StandardCharsets.US_ASCII.newEncoder().canEncode(id))
        {
            if (id.length() > 16)
            {
                throw new IllegalArgumentException("id exceeds maximum length of 16 bytes");
            }
            setAttribute(ID_ATTR_NAME, id);
        } else
        {
            throw new IllegalArgumentException("id contains non-ASCII characters");
        }
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
