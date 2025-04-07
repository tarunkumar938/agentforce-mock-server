package com.agentforce_mock_server.utils;

import java.util.List;
import java.util.Optional;

public class ResponseUtils {

  public static String getSafeValue(List<String> list, int index) {
    return Optional.ofNullable(list)
        .filter(l -> l.size() > index)
        .map(l -> l.get(index))
        .orElse("");
  }
}
