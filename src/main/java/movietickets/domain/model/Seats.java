package movietickets.domain.model;

import java.io.Serializable;

/**
 * Created by zeus on 9/29/17.
 */
public class Seats implements Serializable {
    private boolean enabled;
    private boolean reserved;

    public Seats(boolean enabled, boolean reserved) {
        this.enabled = enabled;
        this.reserved = reserved;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
