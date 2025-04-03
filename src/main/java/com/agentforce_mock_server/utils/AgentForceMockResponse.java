package com.agentforce_mock_server.utils;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@RequiredArgsConstructor
public class AgentForceMockResponse {

    public static final List< List<String>> technologyData =
            List.of(
                    List.of("Business Services","Managed Services", "Key Horizontal BPO","Key Horizontal BPO" ),
                    List.of("Business Services","Managed Services", "Key Horizontal BPO","Key Horizontal BPO" )
            );

    public static final List<List<String>> geographyFilterData =
            List.of();

    public static final List<List<String>> industryFilterData =
            List.of();


}
