package com.agentforce_mock_server.dto.internal;

import com.agentforce_mock_server.dto.GeographyDTO;
import com.agentforce_mock_server.dto.IndustryDTO;
import com.agentforce_mock_server.dto.TechnologyDTO;
import java.util.List;

public class MarketFilters {
  List<TechnologyDTO> technologyFilters;
  List<IndustryDTO> industryFilters;
  List<GeographyDTO> geographyFilters;
}
