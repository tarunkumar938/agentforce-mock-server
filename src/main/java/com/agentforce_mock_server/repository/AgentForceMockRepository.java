package com.agentforce_mock_server.repository;

import com.agentforce_mock_server.dto.GeographyDTO;
import com.agentforce_mock_server.dto.TechnologyDTO;
import com.agentforce_mock_server.utils.AgentForceMockResponse;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AgentForceMockRepository {

    public Mono<List<TechnologyDTO>> getTechnologyFilters(){
        List<List<String>> technologyData = AgentForceMockResponse.technologyData;

        List<TechnologyDTO> technologyDTOList =
                technologyData.stream().map(
                        list -> {
                        return    TechnologyDTO.builder()
                                    .TechnologyGroup(list.get(0))
                                    .TechnologyCategory(list.get(1))
                                    .Technology(list.get(2))
                                    .TechnologyDetail(list.get(3))
                                    .build();
                        }
                ).collect(Collectors.toList());
        return Mono.just(technologyDTOList);
    }

    public Mono<List<GeographyDTO>> getGeographyFilters() {
        List<List<String>> geographyData = AgentForceMockResponse.geographyFilterData;

        List<GeographyDTO> geographyDTOList =
                geographyData.stream().map(
                        list -> {
                            return GeographyDTO.builder()
                                    .region(list.get(0))
                                    .country(list.get(1))
                                    .build();
                        }
                ).collect(Collectors.toList());
        return Mono.just(geographyDTOList);
    }

}
