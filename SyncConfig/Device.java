public class Device {
    Integer id;
    String name;
    String model;
    Configuration configuration;
    public Device(Integer id, String name, String model,Configuration configuration) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.configuration=configuration;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }



}
