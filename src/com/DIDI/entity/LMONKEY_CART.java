package com.DIDI.entity;

public class LMONKEY_CART {
	public int didi_id;
	public String didi_p_filename;
	public String didi_p_name;
	public String didi_p_phone;
	public String didi_price;
	public String didi_p_address;
	public int didi_p_id;
	public String didi_u_id;
	public int didi_valid;

	public LMONKEY_CART(int didi_id, String didi_p_filename,
						String didi_p_name, String didi_p_phone, String didi_price,
						String didi_p_address, int didi_p_id, String didi_u_id, int didi_valid) {
		super();
		this.didi_id = didi_id;
		this.didi_p_filename = didi_p_filename;
		this.didi_p_name = didi_p_name;
		this.didi_p_phone = didi_p_phone;
		this.didi_price = didi_price;
		this.didi_p_address = didi_p_address;
		this.didi_p_id = didi_p_id;
		this.didi_u_id = didi_u_id;
		this.didi_valid = didi_valid;
	}

	public int getDidi_id() {
		return didi_id;
	}

	public void setDidi_id(int didi_id) {
		this.didi_id = didi_id;
	}

	public String getDidi_p_filename() {
		return didi_p_filename;
	}

	public void setDidi_p_filename(String didi_p_filename) {
		this.didi_p_filename = didi_p_filename;
	}

	public String getDidi_p_name() {
		return didi_p_name;
	}

	public void setDidi_p_name(String didi_p_name) {
		this.didi_p_name = didi_p_name;
	}

	public String getDidi_p_phone() {
		return didi_p_phone;
	}

	public void setDidi_p_phone(String didi_p_phone) {
		this.didi_p_phone = didi_p_phone;
	}

	public String getDidi_price() {
		return didi_price;
	}

	public void setDidi_price(String didi_price) {
		this.didi_price = didi_price;
	}

	public String getDidi_p_address() {
		return didi_p_address;
	}

	public void setDidi_p_address(String didi_p_address) {
		this.didi_p_address = didi_p_address;
	}

	public int getDidi_p_id() {
		return didi_p_id;
	}

	public void setDidi_p_id(int didi_p_id) {
		this.didi_p_id = didi_p_id;
	}

	public String getDidi_u_id() {
		return didi_u_id;
	}

	public void setDidi_u_id(String didi_u_id) {
		this.didi_u_id = didi_u_id;
	}

	public int getDidi_valid() {
		return didi_valid;
	}

	public void setDidi_valid(int didi_valid) {
		this.didi_valid = didi_valid;
	}

}
