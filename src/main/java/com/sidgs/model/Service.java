package com.sidgs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shylaja on 2/23/2017.
 */

@Entity
@Table(name ="service")
public class Service implements Serializable {

    private static final long serialVersionUID = -3453356565566655L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String service_name;

    @Column
    private String service_id;




    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }




}