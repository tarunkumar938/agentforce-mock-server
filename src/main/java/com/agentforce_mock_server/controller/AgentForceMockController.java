package com.agentforce_mock_server.controller;

import com.agentforce_mock_server.dto.*;
import com.agentforce_mock_server.service.AgentForceMockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("result")
    public Mono<ResponseDTO<AccountsDTO>> getAccounts(@RequestBody AccountsReq accountsReq){
        return agentForceMockService.getAccounts(accountsReq);
    }

}
