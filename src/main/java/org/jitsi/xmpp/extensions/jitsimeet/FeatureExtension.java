/*
 * Copyright @ 2021 - present 8x8, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.xmpp.extensions.jitsimeet;

import org.jitsi.xmpp.extensions.*;

public class FeatureExtension extends AbstractPacketExtension
{
    public static final String NAMESPACE = "jabber:client";
    public static final String ELEMENT_NAME = "feature";

    public FeatureExtension()
    {
        super(NAMESPACE, ELEMENT_NAME);
    }

    public String getVar()
    {
        return getAttributeAsString("var");
    }
}
