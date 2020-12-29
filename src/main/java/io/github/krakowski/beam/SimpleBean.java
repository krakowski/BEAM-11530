package io.github.krakowski.beam;

import org.apache.avro.reflect.Nullable;
import org.apache.beam.sdk.schemas.JavaBeanSchema;
import org.apache.beam.sdk.schemas.annotations.DefaultSchema;

@DefaultSchema(JavaBeanSchema.class)
public final class SimpleBean {

    @Nullable
    private Float value;

    public @Nullable Float getValue() {
        return value;
    }

    public void setValue(@Nullable Float value) {
        this.value = value;
    }
}
