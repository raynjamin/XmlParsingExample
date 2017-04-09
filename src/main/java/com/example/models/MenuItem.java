package com.example.models;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Ben on 4/9/17.
 */
public class MenuItem {
    @XmlElement
    public String text;

    @XmlElement
    public String value;
}
