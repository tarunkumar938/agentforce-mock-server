package com.agentforce_mock_server.controller;

import com.agentforce_mock_server.dto.GeographyDTO;
import com.agentforce_mock_server.dto.ResponseDTO;
import com.agentforce_mock_server.dto.TechnologyDTO;
import com.agentforce_mock_server.service.AgentForceMockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/agent-force/mock")
public class AgentForceMockController {
    private final AgentForceMockService agentForceMockService;

    @GetMapping("/technology/filters")
    public Mono<ResponseDTO<TechnologyDTO>> getTechnologyFilters(){

        return agentForceMockService.getTechnologyFilters();
    }

    @GetMapping("/geography/filters")
    public Mono<ResponseDTO<GeographyDTO>> getGeographyFilters() {
        return agentForceMockService.getGeographyFilters();
    }

}
