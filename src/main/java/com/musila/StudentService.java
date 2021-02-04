package com.musila;
import io.RoutingContext;
import io.vertx.core.AbstractVerticle;


public class StudentService extends AbstractVerticle {

    @Override
    public void start() {
            
        Router r  = Router.router(this.vertx);

        r.get("/").handler(this::ping);

        this.vertx.createHttpServer()
        .requestHandler(r)
        .listen(8080);
    }

    private void ping(final RoutingContext rc){
        Student s =new Student("joseph musila", "scii/02308/2018");
        rc.response.end(JsonObject.mapFrom(s).encode());
    }
    public boolean isOfDrivingAge(final int age){
        return age >18;
      /*   if (age>18){
            return true;
        }else{
            return false;
        } */
    }
    public int sumOnetoTen(){
        int sum=0;
        int counter=1;

        while (counter>11){
            sum=sum+counter;
            counter ++;
        }
        return sum;
    }
}
