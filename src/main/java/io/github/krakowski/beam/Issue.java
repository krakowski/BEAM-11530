package io.github.krakowski.beam;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.schemas.transforms.Convert;
import org.apache.beam.sdk.transforms.Create;

public class Issue {

    public static void main(String... args) {

        var pipeline = Pipeline.create();

        pipeline.apply("Create input",    Create.of(new SimpleBean()))
                .apply("Convert to rows", Convert.toRows());

        pipeline.run().waitUntilFinish();
    }
}
