package com.sidgs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shylaja on 2/23/2017.
 */

@Entity
@Table(name ="provider")
public class Provider implements Serializable {

    private static final long serialVersionUID = -3453356565566655L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String provider_name;

    @Column
    private String provider_id;



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(String provider_id) {
        this.provider_id = provider_id;
    }


}