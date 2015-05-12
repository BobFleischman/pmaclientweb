package com.automateddocsys.pma.pmaclientdata.model;

// Generated May 10, 2015 12:25:20 AM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PermissionsId generated by hbm2java
 */
@Embeddable
public class PermissionsId implements java.io.Serializable {

	private Integer validAccounts;
	private Integer portalAccounts;

	public PermissionsId() {
	}

	public PermissionsId(Integer validAccounts, Integer portalAccounts) {
		this.validAccounts = validAccounts;
		this.portalAccounts = portalAccounts;
	}

	@Column(name = "ValidAccounts")
	public Integer getValidAccounts() {
		return this.validAccounts;
	}

	public void setValidAccounts(Integer validAccounts) {
		this.validAccounts = validAccounts;
	}

	@Column(name = "PortalAccounts")
	public Integer getPortalAccounts() {
		return this.portalAccounts;
	}

	public void setPortalAccounts(Integer portalAccounts) {
		this.portalAccounts = portalAccounts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PermissionsId))
			return false;
		PermissionsId castOther = (PermissionsId) other;

		return ((this.getValidAccounts() == castOther.getValidAccounts()) || (this.getValidAccounts() != null
				&& castOther.getValidAccounts() != null && this.getValidAccounts().equals(castOther.getValidAccounts())))
				&& ((this.getPortalAccounts() == castOther.getPortalAccounts()) || (this.getPortalAccounts() != null
						&& castOther.getPortalAccounts() != null && this.getPortalAccounts().equals(castOther.getPortalAccounts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getValidAccounts() == null ? 0 : this.getValidAccounts().hashCode());
		result = 37 * result + (getPortalAccounts() == null ? 0 : this.getPortalAccounts().hashCode());
		return result;
	}

}
