
package fhir;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "value",
    "unit"
})
public class ValueQuantity {

    @JsonProperty("value")
    private int value;
    @JsonProperty("unit")
    private String unit;

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public int getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

}
