package com.Live.Mongo.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class Controller {

    @Autowired
    MongoService mongoService;
    private Repositorymongo repositorymongo;

    MongoTemplate mongoTemplate;

    @GetMapping("findAll")
    public List findAll(){
        return mongoService.findAll();
    }

    @GetMapping("getData/ByUserId/{userid}")
    public List getFile(@PathVariable("userid") String userid){
       return mongoService.getData(userid);

    }

    @GetMapping("getData/TwoArray/ByUseridAndIsactive/{userid}/{isactive}")
    public List array(@PathVariable("userid") String userid,
                      @PathVariable("isactive") Boolean isactive){
     return mongoService.getTwoArray(userid,isactive);

    }
    @GetMapping("getData/UserLivePnlAndResultName/{userlivepnl}/{resultname}")
    public List getResultName(@PathVariable("userlivepnl") Double userlivepnl,
                              @PathVariable("resultname") String resultname){
        return mongoService.getUserLivePnlAndResultName(userlivepnl,resultname);

    }
    @GetMapping("findByIsactiveAnd/UseridIsNotIn")
    public List getAllTrue(@RequestParam Boolean isactive,
                           @RequestParam ArrayList<String> userid){
       return mongoService.getIsactiveAndCheckNotEqualByUserid(isactive,userid);

    }

    @GetMapping("getAllIsactive/{isactive}")
    public List getAllIsactive(@PathVariable("isactive") Boolean isactive){
        return mongoService.getAllIsactive(isactive);
    }
}
