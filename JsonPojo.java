package org.learn.java;

import java.io.Serializable;
import java.util.List;

public class JsonPojo implements Serializable{
	
	
	 /**
	 * 
	 */
	//private static final long serialVersionUID = 8602677991812865541L;
	// this class is representing the json obj 
		private Integer id;
		private String name;
		
	
		
		public JsonPojo() {
			super();
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "JsonPojo [id=" + id + ", name=" + name + "," + "]";
		}
		

}
