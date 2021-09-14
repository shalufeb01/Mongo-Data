package com.Live.Mongo.Data;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Getter
@Setter
//@JsonIgnoreProperties
@Component
@Document(collection ="modelMongo")
public class MongoModel {

    //@Expose(serialize = true, deserialize = true)
    @Indexed
    private String id;


    @Indexed
    private String userid;

    @Indexed
   // @JsonIgnore
    private String dealerid;

    @Indexed
    private String masterid;

    @Indexed
    private String adminid;
    @Indexed
    private String sstid;

    @Indexed
    private Double sportid;

    @Indexed
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String date;

    private Double totalpnl;
    private Double liability;

    @Indexed
    private String marketid;

    @Indexed
    private Double matchid;

    @Indexed
    private String type;

    private Double selection1;
    private Double selection2;
    private Double selection3;
    private Double selection4;

    private String adminpartnership;
    private String masterpartnership;
    private String dealerpartnership;
    private String sstpartnership;

    private Double pnl1;
    private Double pnl2;
    private Double pnl3;
    private Double pnl4;
    @Indexed
    @JsonInclude(JsonInclude.Include.NON_NULL)
   // @JsonIgnore
    private Object createdon;

    private String matchname;

    @Indexed
    private Boolean isactive;
    private Double netpnl;
    private Double adminpnl;
    private Double dealerpnl;
    private Double sstpnl;
    private Double masterpnl;

    private Double adminfancypnl;
    private Double dealerfancypnl;
    private Double sstfancypnl;
    private Double masterfancypnl;
    private Double userFancyPnl;


    private Double adminlivepnl;
    private Double dealerlivepnl;
    private Double sstlivepnl;
    private Double masterlivepnl;
    private Double userlivepnl;

    private Double usercommission;
    private Double dealercommission;
    private Double sstcommission;
    private Double mastercommission;

    private Double userfancycommission;
    private Double dealerfancycommission;
    private Double sstfancycommission;
    private Double masterfancycommission;

    private Double betcount;
    private Double cheatBetBundle;

    private String adminuserid;
    private String sstuserid;
    private String masteruserid;
    private String dealeruserid;

    //@JsonIgnore
    private Boolean isSstSettled;
    private Boolean isMasterSettled;
    private Boolean isDealerSettled;
    private Boolean isUserSettled;

    private String resultName;
    private String resultTime;

    @Indexed
   // @JsonIgnore
    private Object resultsetTime;
    @Indexed
    private String resultid;


    private String username;
    private String adminUsername;
    private String sstUsername;
    private String masterUsername;
    private String dealerUsername;

    private String declared;

    @Indexed
    private Boolean isSuspended;

public MongoModel(){

}


}
