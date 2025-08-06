package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Rq {
    private final String actionName;
    private final String params;

    public Rq(String cmd) {
        String[] cmdBits = cmd.split(" ", 2);
        actionName = cmdBits[0].trim();

        String queryString = cmdBits.length == 2  ? cmdBits[1].trim() : "";

        params = queryString.isEmpty() ? "" : queryString;
    }

    public String getActionName() {return this.actionName;}
    public String getParam() {return this.params;}

}
