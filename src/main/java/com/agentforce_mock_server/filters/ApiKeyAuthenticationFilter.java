package com.agentforce_mock_server.filters;

import com.agentforce_mock_server.utils.AgentForceConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Component
public class ApiKeyAuthenticationFilter implements WebFilter {

  @Value("${apikey}")
  private String VALID_API_KEY;

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
    String apiKey = exchange.getRequest().getHeaders().getFirst(AgentForceConstants.API_KEY_HEADER);

    if (apiKey == null || !apiKey.equals(VALID_API_KEY)) {
      exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
      return exchange.getResponse().setComplete();
    }

    return chain.filter(exchange);
  }
}
