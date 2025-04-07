package com.agentforce_mock_server.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IndustryDTO {
  String sector;
  String industry;
}
