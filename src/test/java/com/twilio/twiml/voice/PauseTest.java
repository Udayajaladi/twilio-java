/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Pause}
 */
public class PauseTest {
    @Test
    public void testEmptyElement() {
        Pause elem = new Pause.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Pause/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Pause elem = new Pause.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CPause%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Pause elem = new Pause.Builder().length(1).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Pause length=\"1\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Pause elem = new Pause.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Pause a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Pause.Builder builder = new Pause.Builder();

        builder.addText("Hey no tags!");

        Pause elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Pause>" +
            "Hey no tags!" +
            "</Pause>",
            elem.toXml()
        );
    }
}