package store.items.factory.classes.name_class;

import java.util.Formatter;

public class StringFormat {

    public static  String writeDescription(String familyName, String name, int code) {

        return String.format("|%10s : %-8s Catalogue number : %-6d |",familyName,name,code);

    }
}
