
package fhir;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "system",
    "code",
    "display"
})
public class Coding_ {

    @JsonProperty("system")
    private String system;
    @JsonProperty("code")
    private String code;
    @JsonProperty("display")
    private String display;

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
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The display
     */
    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    /**
     * 
     * @param display
     *     The display
     */
    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

}
