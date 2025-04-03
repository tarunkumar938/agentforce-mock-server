package com.agentforce_mock_server.repository;

import com.agentforce_mock_server.dto.GeographyDTO;
import com.agentforce_mock_server.dto.IndustryDTO;
import com.agentforce_mock_server.dto.AccountsDTO;
import com.agentforce_mock_server.dto.AccountsReq;
import com.agentforce_mock_server.dto.TechnologyDTO;
import com.agentforce_mock_server.utils.AgentForceMockResponse;
import lombok.val;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

import static com.agentforce_mock_server.utils.ResponseUtils.getSafeValue;

@Repository
public class AgentForceMockRepository {

    public Mono<List<TechnologyDTO>> getTechnologyFilters(){
        List<List<String>> technologyData = AgentForceMockResponse.technologyFiltersData;

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
    public Mono<List<AccountsDTO>> getAccounts(AccountsReq accountsReq) {
        val limit = accountsReq.getLimit();
        List<List<String>> accountsData = AgentForceMockResponse.accountsData;

        List<AccountsDTO> accountsDTOList = accountsData.stream()
                .limit(limit)
                .map(list -> AccountsDTO.builder()
                        .companyId(getSafeValue(list, 0))
                        .companyBusinessName(getSafeValue(list, 1))
                        .website(getSafeValue(list, 2))
                        .sector(getSafeValue(list, 3))
                        .industry(getSafeValue(list, 4))
                        .phoneNumber(getSafeValue(list, 5))
                        .address(getSafeValue(list, 6))
                        .build()
                )
                .collect(Collectors.toList());
        return Mono.just(accountsDTOList);
    }

    public Mono<List<IndustryDTO>> getIndustryFilters() {
        List<List<String>> industryData = AgentForceMockResponse.industryFilterData;

        List<IndustryDTO> industryDTOList =
                industryData.stream().map(
                        list -> {
                            return IndustryDTO.builder()
                                    .sector(list.get(0))
                                    .industry(list.get(1))
                                    .build();
                        }
                ).collect(Collectors.toList());
        return Mono.just(industryDTOList);
    }

}
