package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * The language targeted by the CodeQL query
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public enum CodeScanningVariantAnalysisLanguage {
    ACTIONS("actions"),

    CPP("cpp"),

    CSHARP("csharp"),

    GO("go"),

    JAVA("java"),

    JAVASCRIPT("javascript"),

    PYTHON("python"),

    RUBY("ruby"),

    RUST("rust"),

    SWIFT("swift");

    private final String value;

    CodeScanningVariantAnalysisLanguage(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CodeScanningVariantAnalysisLanguage fromValue(String value) {
        for (CodeScanningVariantAnalysisLanguage b : CodeScanningVariantAnalysisLanguage.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
