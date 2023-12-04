package dto;

public class CustomerDTO {
    private int idCustomer;
    private String customerIdNumber;
    private String customerName;
    private String customerSurnames;
    private String customerCountry;

    public CustomerDTO(int idCustomer, String customerName, String customerCountry, String customerSurnames, String customerIdNumber) {
        this.idCustomer = idCustomer;
        this.customerIdNumber = customerIdNumber;
        this.customerName = customerName;
        this.customerSurnames = customerSurnames;
        this.customerCountry = customerCountry;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getCustomerSurnames() {
        return customerSurnames;
    }

    public void setCustomerSurnames(String customerSurnames) {
        this.customerSurnames = customerSurnames;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

}
