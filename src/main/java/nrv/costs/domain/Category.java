package nrv.costs.domain;

public class Category {
    private Integer id;
    private String tags = "";
    private Type type;

    public Category() {
    }

    public Category(Type type, String tags) {
        this.type = type;
        this.tags = tags;
    }

    public static enum Type {
        PUBLIC_SERVICE,
        FOOD,
        ENTERTAINMENT,
        CAR,
        HOUSEHOLD_CHEMICALS,
        CLOTHES,
        TRANSPORT,
        CELEBRATION,
        INTERNET,
        MOBILE_NET,
        SPORT
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
