/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Nitish
 */
public class NGO {
    public static int ngo_id; 
    String ngo_name;
     String address;
    String zipcode;
    int user_id;
    String contact;

    public String getNgo_name() {
        return ngo_name;
    }

    public void setNgo_name(String ngo_name) {
        this.ngo_name = ngo_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    

    public static int getNgo_id() {
        return ngo_id;
    }

    public static void setNgo_id(int ngo_id) {
        NGO.ngo_id = ngo_id;
    }
    
}
