package com.agentforce_mock_server.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseDTO<T> {
  List<T> result;
}
