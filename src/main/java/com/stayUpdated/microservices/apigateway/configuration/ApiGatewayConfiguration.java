package com.stayUpdated.microservices.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
              .route(r -> r.path("/get")
                .filters(f ->f.addRequestHeader("myHeader1", "application/json")
                             .addRequestHeader("myHeader2", "application/xml"))
                      .uri("http://httpbin.org:80"))
                .route(r -> r.path("/currency-exchange/**")
                        .uri("lb://currency-exchange-service"))
                .route(r -> r.path("/currency-conversion-new/**")
                        .filters(f ->f.rewritePath("/currency-conversion-new/(?<segment>.*)",
                                        "/currency-conversion/feign/${segment}"))
                        .uri("lb://currency-conversion-service"))
              .build();
    }

}
