package rocks.zipcode;

public class Address {
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    public Address() {

    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
