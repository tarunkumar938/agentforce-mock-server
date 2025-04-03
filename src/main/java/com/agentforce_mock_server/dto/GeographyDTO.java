package com.agentforce_mock_server.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GeographyDTO {
    String region;
    String country;
}
