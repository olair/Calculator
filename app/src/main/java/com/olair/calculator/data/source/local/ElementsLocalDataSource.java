package com.olair.calculator.data.source.local;

import com.olair.calculator.data.Element;
import com.olair.calculator.data.source.ElementsDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by oLair on 2020/1/12.
 */
public class ElementsLocalDataSource implements ElementsDataSource {

    private static final List<Element> elements = new ArrayList<>();

    {
        elements.add(new Element("C", "", null, "", true));
        elements.add(new Element("()", "", null, "", true));
        elements.add(new Element("%", "", null, "", true));
        elements.add(new Element("÷", "", null, "", true));

        elements.add(new Element("7", "", null, "", false));
        elements.add(new Element("8", "", null, "", false));
        elements.add(new Element("9", "", null, "", false));
        elements.add(new Element("×", "", null, "", true));

        elements.add(new Element("4", "", null, "", false));
        elements.add(new Element("5", "", null, "", false));
        elements.add(new Element("6", "", null, "", false));
        elements.add(new Element("-", "", null, "", true));

        elements.add(new Element("1", "", null, "", false));
        elements.add(new Element("2", "", null, "", false));
        elements.add(new Element("3", "", null, "", false));
        elements.add(new Element("+", "", null, "", true));

        elements.add(new Element("0", "", null, "", false));
        elements.add(new Element("00", "", null, "", false));
        elements.add(new Element(".", "", null, "", false));
        elements.add(new Element("=", "", null, "", true));


    }

    @Override
    public List<Element> getElements() {
        return elements;
    }
}
