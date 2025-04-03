package com.agentforce_mock_server.dto;

import com.agentforce_mock_server.dto.internal.MarketFilters;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class AccountsReq {
    List<MarketFilters> filters;
}
