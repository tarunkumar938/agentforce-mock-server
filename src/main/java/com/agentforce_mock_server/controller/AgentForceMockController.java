package com.agentforce_mock_server.controller;

import com.agentforce_mock_server.dto.ResponseDTO;
import com.agentforce_mock_server.dto.TechnologyDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/agent-force/mock")
public class AgentForceMockController {

    @GetMapping("/technology/filters")
    public ResponseDTO getTechnologyFilters(){
        return new ResponseDTO();
    }
    
}
