package com.agentforce_mock_server.service;

import com.agentforce_mock_server.dto.GeographyDTO;
import com.agentforce_mock_server.dto.IndustryDTO;
import com.agentforce_mock_server.dto.ResponseDTO;
import com.agentforce_mock_server.dto.TechnologyDTO;
import com.agentforce_mock_server.repository.AgentForceMockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class AgentForceMockService {
    private final AgentForceMockRepository agentForceMockRepository;

    public Mono<ResponseDTO<TechnologyDTO>> getTechnologyFilters(){
        return
                agentForceMockRepository.
                        getTechnologyFilters()
                        .map(
                                technologyDTOS -> ResponseDTO.<TechnologyDTO>builder()
                                        .result(technologyDTOS)
                                        .build()
                        );
    }

    public Mono<ResponseDTO<GeographyDTO>> getGeographyFilters() {
        return
                agentForceMockRepository.getGeographyFilters().map(
                        geographyDTOS -> ResponseDTO.<GeographyDTO>builder()
                                .result(geographyDTOS)
                                .build()
                );
    }

    public Mono<ResponseDTO<IndustryDTO>> getIndustryFilters() {
        return
                agentForceMockRepository.getIndustryFilters().map(
                        industryDTOS -> ResponseDTO.<IndustryDTO>builder()
                                .result(industryDTOS)
                                .build()
                );
    }
}
