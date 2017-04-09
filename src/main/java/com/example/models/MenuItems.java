package com.example.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Ben on 4/7/17.
 */
@XmlRootElement
public class MenuItems {
    @XmlElement
    List<MenuItem> menuItem;
}
