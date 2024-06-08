package com.zerofiltre.parkingbot.model;

import java.util.Date;

public class Tiket {
    private String amount;
    private Vehicul vehicul;
    private Date entringTime;
    private Date exitTime;


    /**
     * @return String return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(final String amount) {
        this.amount = amount;
    }

    /**
     * @return Vehicul return the vehicul
     */
    public Vehicul getVehicul() {
        return vehicul;
    }

    /**
     * @param vehicul the vehicul to set
     */
    public void setVehicul(final Vehicul vehicul) {
        this.vehicul = vehicul;
    }

    /**
     * @return Date return the entringTime
     */
    public Date getEntringTime() {
        return entringTime;
    }

    /**
     * @param entringTime the entringTime to set
     */
    public void setEntringTime(final Date entringTime) {
        this.entringTime = entringTime;
    }

    /**
     * @return Date return the exitTime
     */
    public Date getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime the exitTime to set
     */
    public void setExitTime(final Date exitTime) {
        this.exitTime = exitTime;
    }

	@Override
	public String toString() {
		return "Tiket [amount=" + amount + ", vehicul=" + vehicul + ", entringTime=" + entringTime + ", exitTime="
				+ exitTime + "]";
	}
    
}
