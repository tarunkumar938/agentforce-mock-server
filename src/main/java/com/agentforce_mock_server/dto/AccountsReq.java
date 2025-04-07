package com.agentforce_mock_server.dto;

import com.agentforce_mock_server.dto.internal.MarketFilters;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AccountsReq {
  List<MarketFilters> filters;
  Integer limit;
}
