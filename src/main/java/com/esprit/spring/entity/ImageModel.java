package com.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_image")
public class ImageModel {
	public ImageModel() {
	       super();
		    }
		   public ImageModel(String name, String type, byte[] picByte) {
		        this.name = name;
		        this.type = type;
		        this.picByte = picByte;
		    }
		    @Id		
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;		
		    private String name;	
		    private String type;
		    //image bytes can have large lengths so we specify a value
		    //which is more than the default length for picByte column
		    @Column(name = "picByte", length = 1000)
		    private byte[] picByte;
		    
		    @ManyToOne
		    private Property pronerty;
		    
		    public String getName() {
		        return name;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }
		    public String getType() {
		        return type;
		    }
		   public void setType(String type) {
		        this.type = type;
		    }
		    public byte[] getPicByte() {
		        return picByte;
		    }
		    public void setPicByte(byte[] picByte) {
		       this.picByte = picByte;
		    }

}
