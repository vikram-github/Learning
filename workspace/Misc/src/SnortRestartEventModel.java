


/**
 * This represents the Snort Restart Event Model
 * 
 * @author viknagar
 *
 */
public class SnortRestartEventModel {

    private Long id;
    private String trafficIntVal;
    private int type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrafficIntVal() {
        return trafficIntVal;
    }

    public void setTrafficIntVal(String trafficIntVal) {
        this.trafficIntVal = trafficIntVal;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
