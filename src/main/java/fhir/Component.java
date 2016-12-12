
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
    "code",
    "valueQuantity",
    "referenceRange"
})
public class Component {

    @JsonProperty("code")
    private Code_ code;
    @JsonProperty("valueQuantity")
    private ValueQuantity valueQuantity;
    @JsonProperty("referenceRange")
    private List<ReferenceRange> referenceRange = new ArrayList<ReferenceRange>();

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public Code_ getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(Code_ code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The valueQuantity
     */
    @JsonProperty("valueQuantity")
    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * 
     * @param valueQuantity
     *     The valueQuantity
     */
    @JsonProperty("valueQuantity")
    public void setValueQuantity(ValueQuantity valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    /**
     * 
     * @return
     *     The referenceRange
     */
    @JsonProperty("referenceRange")
    public List<ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    /**
     * 
     * @param referenceRange
     *     The referenceRange
     */
    @JsonProperty("referenceRange")
    public void setReferenceRange(List<ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }

}
