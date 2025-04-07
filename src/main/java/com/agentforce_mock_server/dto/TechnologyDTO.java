package com.agentforce_mock_server.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TechnologyDTO {

  String TechnologyGroup;
  String TechnologyCategory;
  String Technology;
  String TechnologyDetail;
}
