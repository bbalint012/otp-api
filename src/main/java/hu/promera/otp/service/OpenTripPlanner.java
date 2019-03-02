package hu.promera.otp.service;

import org.opentripplanner.api.ws.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface OpenTripPlanner {
    //http://localhost:8081/otp/routers/default/plan?
    // fromPlace=47.52253,19.07229& //TODO: vessző
    // toPlace=47.51473,19.04157&  //TODO: vessző
    // time=1:02pm&     //TODO: format
    // date=02-05-2019& //TODO: format
    // mode=TRANSIT,WALK&   //TODO: vessző
    // maxWalkDistance=500& TODO: mértékegység?
    // arriveBy=false

    /*@Query("fromPlace") String fromPlace, @Query("toPlace") String toPlace,
    @Query("time") String time, @Query("date") String date, @Query("mode") String mode,
    @Query("maxWalkDistance") String maxWalkDistance, @Query("arriveBy") String arriveBy*/
    
    @GET("otp/routers/default/plan")
    Call<Response> getTripPlan(@QueryMap Map<String, String> query);
}
