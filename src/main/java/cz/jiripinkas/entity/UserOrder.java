package cz.jiripinkas.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_ORDER")
@NamedQuery(name = UserOrder.FIND_ALL_FETCH, query = "select distinct o from UserOrder o left join fetch o.orderedItems")
public class UserOrder implements Serializable {

	public static final String FIND_ALL_FETCH = "UserOrder.findAllFetch";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ORDER_ID")
	private int userOrderId;

	private String name;

	private String street;

	private String zip;

	private String city;

	@Column(name = "ORDER_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;

	@OneToMany(mappedBy = "userOrder")
	private List<OrderedItem> orderedItems;

	private static final long serialVersionUID = 1L;

	public List<OrderedItem> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<OrderedItem> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public int getUserOrderId() {
		return this.userOrderId;
	}

	public void setUserOrderId(int orderId) {
		this.userOrderId = orderId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}