package com.example.search_recview.route;

public class MyModel {
    private String RouteNo;
    private String RouteName;


    public MyModel(String RouteNo, String RouteName) {
        this.RouteNo = RouteNo;
        this.RouteName = RouteName;
    }

    public String getRouteNo() {
        return RouteNo;
    }

    public String getRouteName() {
        return RouteName;
    }
}
