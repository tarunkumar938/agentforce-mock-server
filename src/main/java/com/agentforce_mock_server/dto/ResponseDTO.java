package com.agentforce_mock_server.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ResponseDTO<T> {
    List<T> result;
}
