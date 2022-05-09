package Model;

import java.util.Date;

public class CarsImages {
    
    private Integer id;
    private Integer carId;
    private Byte image;
    private Date createdAt;

    public CarsImages(Integer id, Integer carId, Byte image, Date createdAt) {
        this.id = id;
        this.carId = carId;
        this.image = image;
        this.createdAt = createdAt;
    }

    public CarsImages() {
    }   
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }    
}
