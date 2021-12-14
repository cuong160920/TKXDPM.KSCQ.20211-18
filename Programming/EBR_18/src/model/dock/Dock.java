package model.dock;

import java.sql.Timestamp;
import model.bike.Bike;

import java.util.ArrayList;

public class Dock {
	private String id;
	private String name;
    private String location;
    private String imageURL;
    private int capacity;
    private Timestamp createdAt;
    private int availability;
    
    public ArrayList<Bike> getBikeList() {
		return bikeList;
	}
	private final ArrayList<Bike> bikeList;
    
    public Dock(String id, String name, String location, String imageURL, int capacity) {
    	this.id = id;
    	this.name = name;
    	this.location = location;
    	this.imageURL = imageURL;
    	this.capacity = capacity;
    	this.availability = capacity;
    	this.createdAt = new Timestamp(System.currentTimeMillis());
    	this.bikeList = new ArrayList<>();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dock) {
            Dock dock = (Dock) obj;
            return dock.getId().equals(this.id);
        }
        return false;
    }
    
    public void addBike(Bike bike) {
    	if (this.availability < this.capacity) {
    		this.bikeList.add(bike);
            bike.setDockId(this.id);
            this.availability = this.availability - 1;	
    	}    
    }
    
    public void removeBike(Bike bike) {
        this.bikeList.remove(bike);
        bike.setDockId(utils.Configs.DOCK_NILL_STRING);
        this.availability = this.availability + 1;
    }
    
    public void clearBikeList() {
        this.bikeList.clear();
    }
    
    public void addListOfBikes(ArrayList<Bike> list) {
        this.bikeList.addAll(list);
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
    
    
}
