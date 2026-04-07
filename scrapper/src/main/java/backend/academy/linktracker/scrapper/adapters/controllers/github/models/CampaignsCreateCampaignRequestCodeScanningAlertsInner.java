package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CampaignsCreateCampaignRequestCodeScanningAlertsInner
 */
@JsonTypeName("campaigns_create_campaign_request_code_scanning_alerts_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CampaignsCreateCampaignRequestCodeScanningAlertsInner {

    private Long repositoryId;

    @Valid
    private List<Long> alertNumbers = new ArrayList<>();

    public CampaignsCreateCampaignRequestCodeScanningAlertsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CampaignsCreateCampaignRequestCodeScanningAlertsInner(Long repositoryId, List<Long> alertNumbers) {
        this.repositoryId = repositoryId;
        this.alertNumbers = alertNumbers;
    }

    public CampaignsCreateCampaignRequestCodeScanningAlertsInner repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * The repository id
     * @return repositoryId
     */
    @NotNull
    @Schema(name = "repository_id", description = "The repository id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public CampaignsCreateCampaignRequestCodeScanningAlertsInner alertNumbers(List<Long> alertNumbers) {
        this.alertNumbers = alertNumbers;
        return this;
    }

    public CampaignsCreateCampaignRequestCodeScanningAlertsInner addAlertNumbersItem(Long alertNumbersItem) {
        if (this.alertNumbers == null) {
            this.alertNumbers = new ArrayList<>();
        }
        this.alertNumbers.add(alertNumbersItem);
        return this;
    }

    /**
     * The alert numbers
     * @return alertNumbers
     */
    @NotNull
    @Size(min = 1)
    @Schema(name = "alert_numbers", description = "The alert numbers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alert_numbers")
    public List<Long> getAlertNumbers() {
        return alertNumbers;
    }

    public void setAlertNumbers(List<Long> alertNumbers) {
        this.alertNumbers = alertNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignsCreateCampaignRequestCodeScanningAlertsInner campaignsCreateCampaignRequestCodeScanningAlertsInner =
                (CampaignsCreateCampaignRequestCodeScanningAlertsInner) o;
        return Objects.equals(this.repositoryId, campaignsCreateCampaignRequestCodeScanningAlertsInner.repositoryId)
                && Objects.equals(
                        this.alertNumbers, campaignsCreateCampaignRequestCodeScanningAlertsInner.alertNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, alertNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignsCreateCampaignRequestCodeScanningAlertsInner {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    alertNumbers: ").append(toIndentedString(alertNumbers)).append("\n");
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
