
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
    "coding"
})
public class Category {

    @JsonProperty("coding")
    private List<Coding> coding = new ArrayList<Coding>();

    /**
     * 
     * @return
     *     The coding
     */
    @JsonProperty("coding")
    public List<Coding> getCoding() {
        return coding;
    }

    /**
     * 
     * @param coding
     *     The coding
     */
    @JsonProperty("coding")
    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

}
