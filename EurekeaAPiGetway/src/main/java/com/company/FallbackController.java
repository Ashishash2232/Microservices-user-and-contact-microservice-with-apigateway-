package com.company;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	@RequestMapping("/orderFallBack")
	
	public Mono<String> orderServiceFallBack(){
		return Mono.just("order take to long time");
	}
	public Mono<String> paymentServiceFallBack(){
		return Mono.just("payment take to long time");
	}

}
