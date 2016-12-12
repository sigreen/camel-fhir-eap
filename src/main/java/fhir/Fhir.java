
package fhir;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "resourceType",
    "contained",
    "identifier",
    "status",
    "category",
    "code",
    "subject",
    "encounter",
    "issued",
    "component"
})
public class Fhir {

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("contained")
    private List<Contained> contained = new ArrayList<Contained>();
    @JsonProperty("identifier")
    private List<Identifier_> identifier = new ArrayList<Identifier_>();
    @JsonProperty("status")
    private String status;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("code")
    private Code code;
    @JsonProperty("subject")
    private Subject subject;
    @JsonProperty("encounter")
    private Encounter encounter;
    @JsonProperty("issued")
    private String issued;
    @JsonProperty("component")
    private List<Component> component = new ArrayList<Component>();

    /**
     * 
     * @return
     *     The resourceType
     */
    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 
     * @param resourceType
     *     The resourceType
     */
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 
     * @return
     *     The contained
     */
    @JsonProperty("contained")
    public List<Contained> getContained() {
        return contained;
    }

    /**
     * 
     * @param contained
     *     The contained
     */
    @JsonProperty("contained")
    public void setContained(List<Contained> contained) {
        this.contained = contained;
    }

    /**
     * 
     * @return
     *     The identifier
     */
    @JsonProperty("identifier")
    public List<Identifier_> getIdentifier() {
        return identifier;
    }

    /**
     * 
     * @param identifier
     *     The identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier_> identifier) {
        this.identifier = identifier;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Code getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The subject
     */
    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The encounter
     */
    @JsonProperty("encounter")
    public Encounter getEncounter() {
        return encounter;
    }

    /**
     * 
     * @param encounter
     *     The encounter
     */
    @JsonProperty("encounter")
    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    /**
     * 
     * @return
     *     The issued
     */
    @JsonProperty("issued")
    public String getIssued() {
        return issued;
    }

    /**
     * 
     * @param issued
     *     The issued
     */
    @JsonProperty("issued")
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * 
     * @return
     *     The component
     */
    @JsonProperty("component")
    public List<Component> getComponent() {
        return component;
    }

    /**
     * 
     * @param component
     *     The component
     */
    @JsonProperty("component")
    public void setComponent(List<Component> component) {
        this.component = component;
    }

}
