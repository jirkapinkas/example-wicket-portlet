package cz.jiripinkas.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity implementation class for Entity: Item
 * 
 */
@Entity
@NamedQueries({ @NamedQuery(name = Item.FIND_ALL, query = "select i from Item i") })
public class Item implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ITEM_ID")
        private int itemId;

        private String name;

        private String description;

        private double price;

        private static final long serialVersionUID = 1L;

        public static final String FIND_ALL = "Item.findAll";

        public int getItemId() {
                return this.itemId;
        }

        public void setItemId(int itemId) {
                this.itemId = itemId;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return this.description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                return this.price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

}