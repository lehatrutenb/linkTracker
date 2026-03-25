package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MigrationsSetLfsPreferenceRequest
 */
@JsonTypeName("migrations_set_lfs_preference_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsSetLfsPreferenceRequest {

    /**
     * Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out` means large files will be removed during the import.
     */
    public enum UseLfsEnum {
        OPT_IN("opt_in"),

        OPT_OUT("opt_out");

        private final String value;

        UseLfsEnum(String value) {
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
        public static UseLfsEnum fromValue(String value) {
            for (UseLfsEnum b : UseLfsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private UseLfsEnum useLfs;

    public MigrationsSetLfsPreferenceRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MigrationsSetLfsPreferenceRequest(UseLfsEnum useLfs) {
        this.useLfs = useLfs;
    }

    public MigrationsSetLfsPreferenceRequest useLfs(UseLfsEnum useLfs) {
        this.useLfs = useLfs;
        return this;
    }

    /**
     * Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out` means large files will be removed during the import.
     * @return useLfs
     */
    @NotNull
    @Schema(
            name = "use_lfs",
            description =
                    "Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out` means large files will be removed during the import.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("use_lfs")
    public UseLfsEnum getUseLfs() {
        return useLfs;
    }

    public void setUseLfs(UseLfsEnum useLfs) {
        this.useLfs = useLfs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationsSetLfsPreferenceRequest migrationsSetLfsPreferenceRequest = (MigrationsSetLfsPreferenceRequest) o;
        return Objects.equals(this.useLfs, migrationsSetLfsPreferenceRequest.useLfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useLfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsSetLfsPreferenceRequest {\n");
        sb.append("    useLfs: ").append(toIndentedString(useLfs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
