package com.example.demo.serializer;

import com.example.demo.model.Perro;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PerroSerializer extends StdSerializer<Perro> {

    public PerroSerializer() {
        this(null);
    }

    protected PerroSerializer(Class<Perro> t) {
        super(t);
    }

    @Override
    public void serialize(Perro perro,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectFieldStart("tipo");
        jsonGenerator.writeStringField("nombre", perro.getRaza());
        jsonGenerator.writeEndObject();
        jsonGenerator.writeEndObject();
    }
}
