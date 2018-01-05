// Import this package:
//
//     import com.jimdo.unionderhelden.dieunion.Converter;
//
// Then you can deserialize a JSON string with
//
//     SwgohGildenAPI data = Converter.fromJsonString(jsonString);

package com.jimdo.unionderhelden.dieunion;

import java.util.Map;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Converter {
    // Serialize/deserialize helpers

    public static SwgohGildenAPI fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(SwgohGildenAPI obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(SwgohGildenAPI.class);
        writer = mapper.writerFor(SwgohGildenAPI.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}
