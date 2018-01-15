package com.daniccan.validator;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * JSON Validator
 * 
 * @author daniccan
 */
public class JsonValidator {

    public boolean isJsonValid(String jsonString) {

        boolean validJson = false;
        try {
            PersonPojo personPojo = new Gson().fromJson(jsonString, PersonPojo.class);

            if (personPojo.getName() != null) { // Mandatory as per proto
                validJson = true;
            }
        } catch (JsonSyntaxException e) {
            System.out.println("Invalid Json Format: " + e);
        }

        return validJson;
    }
}
