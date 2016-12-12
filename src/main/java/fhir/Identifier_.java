
package fhir;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "system",
    "value"
})
public class Identifier_ {

    @JsonProperty("system")
    private String system;
    @JsonProperty("value")
    private String value;

    /**
     * 
     * @return
     *     The system
     */
    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    /**
     * 
     * @param system
     *     The system
     */
    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
