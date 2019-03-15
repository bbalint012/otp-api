package hu.unideb.otp.service;

import org.opentripplanner.api.ws.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * API for OpenTripPlanner.
 *
 * <p>
 * Common used query params with examples:
 * http://localhost:8081/otp/routers/default/plan?
 * fromPlace=47.52253,19.07229&
 * toPlace=47.51473,19.04157&
 * time=1:02pm&
 * date=02-05-2019&
 * mode=TRANSIT,WALK&
 * maxWalkDistance=500&
 * arriveBy=false
 *
 * @see <a href="http://docs.opentripplanner.org">http://docs.opentripplanner.org</a>
 */
public interface OpenTripPlanner {
    @GET("otp/routers/default/plan")
    Call<Response> getTripPlan(@QueryMap Map<String, String> query);
}
