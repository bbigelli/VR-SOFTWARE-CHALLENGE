package Model;

public class CarsSpecifications {
    
    private Integer id;
    private Integer carId;
    private Integer specificationId;

    public CarsSpecifications(Integer id, Integer carId, Integer specificationId) {
        this.id = id;
        this.carId = carId;
        this.specificationId = specificationId;
    }

    public CarsSpecifications() {
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

    public Integer getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }    
}
