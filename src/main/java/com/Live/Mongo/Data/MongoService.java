package com.Live.Mongo.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MongoService {

    @Autowired
    MongoTemplate mongoTemplate;

  @Autowired
  private MongoModel mongoModel;

    public MongoService(MongoModel mongoModel) {
        this.mongoModel = mongoModel;
    }

    public List findAll(){

        return mongoTemplate.findAll(MongoModel.class);
    }

    public List getData(String userid){
        Query query = new Query();
        query.addCriteria(Criteria.where("userid").is(userid));
        return mongoTemplate.find(query,MongoModel.class);
    }
    public List getTwoArray(String userid,Boolean isactive){
       Query query = new Query();
        query.addCriteria(Criteria.where("userid").is(userid).orOperator(
                          Criteria.where("isactive").is(isactive)));
        return mongoTemplate.find(query,MongoModel.class);
    }

    public List getUserLivePnlAndResultName(Double userlivepnl,String resultname){
        Query query = new Query();
        query.addCriteria(Criteria.where("userlivepnl").lt(userlivepnl).orOperator(
                Criteria.where("resultName").is(resultname)));
       return mongoTemplate.find(query,MongoModel.class);
    }

    public List getIsactiveAndCheckNotEqualByUserid(Boolean isactive,ArrayList<String> userid){

        Query query = new Query();
        query.addCriteria(Criteria.where("isactive").is(isactive).orOperator(Criteria.where("userid").not().in(userid)));
        return mongoTemplate.find(query,MongoModel.class);
    }
    public List getAllIsactive(Boolean isactive){
      Query query = new Query();
      query.addCriteria(Criteria.where("isactive").is(isactive));
         return mongoTemplate.find(query,MongoModel.class);
    }

}
